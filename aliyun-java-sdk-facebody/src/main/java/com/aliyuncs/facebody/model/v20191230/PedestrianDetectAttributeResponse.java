/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.facebody.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.facebody.transform.v20191230.PedestrianDetectAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PedestrianDetectAttributeResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer personNumber;

		private List<AttributesItem> attributes;

		private List<BoxesItem> boxes;

		public Integer getPersonNumber() {
			return this.personNumber;
		}

		public void setPersonNumber(Integer personNumber) {
			this.personNumber = personNumber;
		}

		public List<AttributesItem> getAttributes() {
			return this.attributes;
		}

		public void setAttributes(List<AttributesItem> attributes) {
			this.attributes = attributes;
		}

		public List<BoxesItem> getBoxes() {
			return this.boxes;
		}

		public void setBoxes(List<BoxesItem> boxes) {
			this.boxes = boxes;
		}

		public static class AttributesItem {

			private Age age;

			private Backpack backpack;

			private Gender gender;

			private Glasses glasses;

			private Handbag handbag;

			private Hat hat;

			private LowerColor lowerColor;

			private LowerWear lowerWear;

			private Orient orient;

			private ShoulderBag shoulderBag;

			private UpperColor upperColor;

			private UpperWear upperWear;

			public Age getAge() {
				return this.age;
			}

			public void setAge(Age age) {
				this.age = age;
			}

			public Backpack getBackpack() {
				return this.backpack;
			}

			public void setBackpack(Backpack backpack) {
				this.backpack = backpack;
			}

			public Gender getGender() {
				return this.gender;
			}

			public void setGender(Gender gender) {
				this.gender = gender;
			}

			public Glasses getGlasses() {
				return this.glasses;
			}

			public void setGlasses(Glasses glasses) {
				this.glasses = glasses;
			}

			public Handbag getHandbag() {
				return this.handbag;
			}

			public void setHandbag(Handbag handbag) {
				this.handbag = handbag;
			}

			public Hat getHat() {
				return this.hat;
			}

			public void setHat(Hat hat) {
				this.hat = hat;
			}

			public LowerColor getLowerColor() {
				return this.lowerColor;
			}

			public void setLowerColor(LowerColor lowerColor) {
				this.lowerColor = lowerColor;
			}

			public LowerWear getLowerWear() {
				return this.lowerWear;
			}

			public void setLowerWear(LowerWear lowerWear) {
				this.lowerWear = lowerWear;
			}

			public Orient getOrient() {
				return this.orient;
			}

			public void setOrient(Orient orient) {
				this.orient = orient;
			}

			public ShoulderBag getShoulderBag() {
				return this.shoulderBag;
			}

			public void setShoulderBag(ShoulderBag shoulderBag) {
				this.shoulderBag = shoulderBag;
			}

			public UpperColor getUpperColor() {
				return this.upperColor;
			}

			public void setUpperColor(UpperColor upperColor) {
				this.upperColor = upperColor;
			}

			public UpperWear getUpperWear() {
				return this.upperWear;
			}

			public void setUpperWear(UpperWear upperWear) {
				this.upperWear = upperWear;
			}

			public static class Age {

				private String name;

				private Float score;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}
			}

			public static class Backpack {

				private String name;

				private Float score;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}
			}

			public static class Gender {

				private String name;

				private Float score;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}
			}

			public static class Glasses {

				private String name;

				private Float score;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}
			}

			public static class Handbag {

				private String name;

				private Float score;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}
			}

			public static class Hat {

				private String name;

				private Float score;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}
			}

			public static class LowerColor {

				private String name;

				private Float score;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}
			}

			public static class LowerWear {

				private String name;

				private Float score;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}
			}

			public static class Orient {

				private String name;

				private Float score;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}
			}

			public static class ShoulderBag {

				private String name;

				private Float score;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}
			}

			public static class UpperColor {

				private String name;

				private Float score;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}
			}

			public static class UpperWear {

				private String name;

				private Float score;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}
			}
		}

		public static class BoxesItem {

			private Float score;

			private Float topLeftX;

			private Float topLeftY;

			private Float bottomRightX;

			private Float bottomRightY;

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public Float getTopLeftX() {
				return this.topLeftX;
			}

			public void setTopLeftX(Float topLeftX) {
				this.topLeftX = topLeftX;
			}

			public Float getTopLeftY() {
				return this.topLeftY;
			}

			public void setTopLeftY(Float topLeftY) {
				this.topLeftY = topLeftY;
			}

			public Float getBottomRightX() {
				return this.bottomRightX;
			}

			public void setBottomRightX(Float bottomRightX) {
				this.bottomRightX = bottomRightX;
			}

			public Float getBottomRightY() {
				return this.bottomRightY;
			}

			public void setBottomRightY(Float bottomRightY) {
				this.bottomRightY = bottomRightY;
			}
		}
	}

	@Override
	public PedestrianDetectAttributeResponse getInstance(UnmarshallerContext context) {
		return	PedestrianDetectAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
