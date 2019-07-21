package com.vz.VerizonTest.contoller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerizonTestController {
	
	@GetMapping(value="/myList")
	public RecommendationRes getList()
	{
		RecommendationRes res = new RecommendationRes();

		try {

			Recommendation recomm = new Recommendation();
			InProgress inprog = new InProgress();
			InHold hold=new InHold();
			List<GenericValues> criticalList = new ArrayList<>();
			List<GenericValues> hig = new ArrayList<>();
			List<GenericValues> holdcriticalList = new ArrayList<>();
			List<GenericValues> holdhigh = new ArrayList<>();

			Map<String, Map<String, Map<String, Long>>> vv = TestList.getList().stream().collect(
					Collectors.groupingBy(MyBean::getAugmentStatus, Collectors.groupingBy(MyBean::getThresholdLevel,
							Collectors.groupingBy(MyBean::getNeType, Collectors.counting()))));
			for (Entry<String, Map<String, Map<String, Long>>> hy : vv.entrySet()) {

				if (hy.getKey().equals("DRAFT")) {
					Map<String, Map<String, Long>> loc = hy.getValue();
					for (Entry<String, Map<String, Long>> seco : loc.entrySet()) {

						if (seco.getKey().equals("HIGH")) {
							for (Entry<String, Long> iso : seco.getValue().entrySet()) {
								hig.add(new GenericValues(iso.getKey(), iso.getValue()));
							}

						} else if (seco.getKey().equals("CRITICAL")) {
							for (Entry<String, Long> iso : seco.getValue().entrySet()) {
								criticalList.add(new GenericValues(iso.getKey(), iso.getValue()));

							}
						}

					}

				}
				else if (hy.getKey().equals("ON_HOLD")) {
					Map<String, Map<String, Long>> loc = hy.getValue();
					for (Entry<String, Map<String, Long>> seco : loc.entrySet()) {

						if (seco.getKey().equals("HIGH")) {
							for (Entry<String, Long> iso : seco.getValue().entrySet()) {
								holdhigh.add(new GenericValues(iso.getKey(), iso.getValue()));
							}

						} else if (seco.getKey().equals("CRITICAL")) {
							for (Entry<String, Long> iso : seco.getValue().entrySet()) {
								holdcriticalList.add(new GenericValues(iso.getKey(), iso.getValue()));

							}
						}

					}

				}
				inprog.setCritical(criticalList);
				inprog.setHigh(hig);
				hold.setCritical(holdcriticalList);
				hold.setHigh(holdhigh);
				recomm.setInProgress(inprog);
				recomm.setInHold(hold);
				res.setRecommendation(recomm);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return res;

	}

}
