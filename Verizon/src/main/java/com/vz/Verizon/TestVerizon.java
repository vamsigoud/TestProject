package com.vz.Verizon;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.vz.pojos.GenericValues;
import com.vz.pojos.InProgress;
import com.vz.pojos.Recommendation;
import com.vz.pojos.RecommendationRes;
import com.vz.pojos.TestList;

public class TestVerizon {
	
	public static RecommendationRes getApiRes(List<com.vz.Verizon.MyBean> lis)
	{
		RecommendationRes res=new RecommendationRes();

        try {
        	
        	
        	Recommendation recomm=new Recommendation();
        	InProgress inprog=new InProgress();
        	List<GenericValues> criticalList=new ArrayList<>();
        	List<GenericValues> hig=new ArrayList<>();
        
            
        	Map<String,Map<String,Map<String,Long>>> vv =lis.stream().collect(Collectors.groupingBy(MyBean::getAugmentStatus,Collectors.groupingBy(MyBean::getThresholdLevel,Collectors.groupingBy(MyBean::getNeType,Collectors.counting()))));
       for(Entry<String, Map<String, Map<String, Long>>> hy:vv.entrySet()){
    	   
    	   if(hy.getKey().equals("DRAFT"))
    	   {
    		    Map<String, Map<String, Long>> loc=  hy.getValue();
    		   for(Entry<String, Map<String, Long>> seco:loc.entrySet())
    		   {
    			   
    			   
    			   if(seco.getKey().equals("HIGH"))
    			   {
    				   for(Entry<String, Long> iso:seco.getValue().entrySet())
    				   {
    					   GenericValues gs=new GenericValues();
    					   gs.setNeType(iso.getKey());
    					   gs.setValue(iso.getValue());
    					   hig.add(gs);    					   
    					   
    				   }
    				   
    			   }
    			   else if(seco.getKey().equals("CRITICAL"))
    			   {
    				   for(Entry<String, Long> iso:seco.getValue().entrySet())
    				   {
    					   GenericValues ctri=new GenericValues();
    					   ctri.setNeType(iso.getKey());
    					   ctri.setValue(iso.getValue());
    					   criticalList.add(ctri);
    					   
    				   }
    			   }
    			
    		   }
    		
    		   
    	   }
    	   inprog.setCritical(criticalList);
		   inprog.setHigh(hig);
		   recomm.setInProgress(inprog);
		   res.setRecommendation(recomm);
       }
            
            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    


		return res;
		
	}

	public static void main(String[] args) {
		
    	List<com.vz.Verizon.MyBean> bb = new ArrayList<>();
    	bb = TestList.getList();
    	RecommendationRes ss= TestVerizon.getApiRes(bb);
		List<GenericValues> genCri=ss.getRecommendation().getInProgress().getCritical();
		genCri.stream().forEach(e -> System.out.println(e.getNeType()+", "+e.getValue()));
		/*for(GenericValues dd:genCri)
			System.out.println(" "+dd.getNeType()+" , "+dd.getValue());*/
	}

}
