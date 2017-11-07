package tn.esprit.cga.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ClaimSimFields
 *
 */
@Entity

public class ClaimSimFields implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	private String driverFirstName;
	private String driverLastName;
	private String driverAddress;
	private int driverLicenseNumber;
	private Date DeliveredIn;
	
	private String apparentDamage;
	
	private boolean parked;
	private boolean wasLeavingAParkingLot;
	private boolean wasTakingAParkingLot;
	private boolean cameOutOfAParkingOrPrivatePlaceOrLand;
	private boolean engagedInAParkingOrPrivatePlaceOrLand;
	private boolean trafficStop;
	private boolean frictionWithoutChangingLanes;
	private boolean hitIntoTheBackWhileDrivingInTheSameDirectionAndOnTheSameLanes;
	private boolean drivingInTheSameDirectionAndOnDifferentLanes;
	private boolean wasChangingLanes;
	private boolean wasDoubling;
	private boolean wasTurningRight;
	private boolean wasTurningLeft;
	private boolean wasRetreating;
	private boolean encroachedOnThePartOfThePavReservedForTrafInTheOppositeDir;
	private boolean wasComingFromRightInACrossroads;
	private boolean hadNotObservedTheSignalOfPriority;
	private int numberOfCheckedBox;
	private String initialShockPoint;
	private String Observations;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDriverFirstName() {
		return driverFirstName;
	}
	public void setDriverFirstName(String driverFirstName) {
		this.driverFirstName = driverFirstName;
	}
	public String getDriverLastName() {
		return driverLastName;
	}
	public void setDriverLastName(String driverLastName) {
		this.driverLastName = driverLastName;
	}
	public String getDriverAddress() {
		return driverAddress;
	}
	public void setDriverAddress(String driverAddress) {
		this.driverAddress = driverAddress;
	}
	public int getDriverLicenseNumber() {
		return driverLicenseNumber;
	}
	public void setDriverLicenseNumber(int driverLicenseNumber) {
		this.driverLicenseNumber = driverLicenseNumber;
	}
	public Date getDeliveredIn() {
		return DeliveredIn;
	}
	public void setDeliveredIn(Date deliveredIn) {
		DeliveredIn = deliveredIn;
	}
	public String getApparentDamage() {
		return apparentDamage;
	}
	public void setApparentDamage(String apparentDamage) {
		this.apparentDamage = apparentDamage;
	}
	public boolean isParked() {
		return parked;
	}
	public void setParked(boolean parked) {
		this.parked = parked;
	}
	public boolean isWasLeavingAParkingLot() {
		return wasLeavingAParkingLot;
	}
	public void setWasLeavingAParkingLot(boolean wasLeavingAParkingLot) {
		this.wasLeavingAParkingLot = wasLeavingAParkingLot;
	}
	public boolean isWasTakingAParkingLot() {
		return wasTakingAParkingLot;
	}
	public void setWasTakingAParkingLot(boolean wasTakingAParkingLot) {
		this.wasTakingAParkingLot = wasTakingAParkingLot;
	}
	public boolean isCameOutOfAParkingOrPrivatePlaceOrLand() {
		return cameOutOfAParkingOrPrivatePlaceOrLand;
	}
	public void setCameOutOfAParkingOrPrivatePlaceOrLand(boolean cameOutOfAParkingOrPrivatePlaceOrLand) {
		this.cameOutOfAParkingOrPrivatePlaceOrLand = cameOutOfAParkingOrPrivatePlaceOrLand;
	}
	public boolean isEngagedInAParkingOrPrivatePlaceOrLand() {
		return engagedInAParkingOrPrivatePlaceOrLand;
	}
	public void setEngagedInAParkingOrPrivatePlaceOrLand(boolean engagedInAParkingOrPrivatePlaceOrLand) {
		this.engagedInAParkingOrPrivatePlaceOrLand = engagedInAParkingOrPrivatePlaceOrLand;
	}
	public boolean isTrafficStop() {
		return trafficStop;
	}
	public void setTrafficStop(boolean trafficStop) {
		this.trafficStop = trafficStop;
	}
	public boolean isFrictionWithoutChangingLanes() {
		return frictionWithoutChangingLanes;
	}
	public void setFrictionWithoutChangingLanes(boolean frictionWithoutChangingLanes) {
		this.frictionWithoutChangingLanes = frictionWithoutChangingLanes;
	}
	public boolean isHitIntoTheBackWhileDrivingInTheSameDirectionAndOnTheSameLanes() {
		return hitIntoTheBackWhileDrivingInTheSameDirectionAndOnTheSameLanes;
	}
	public void setHitIntoTheBackWhileDrivingInTheSameDirectionAndOnTheSameLanes(
			boolean hitIntoTheBackWhileDrivingInTheSameDirectionAndOnTheSameLanes) {
		this.hitIntoTheBackWhileDrivingInTheSameDirectionAndOnTheSameLanes = hitIntoTheBackWhileDrivingInTheSameDirectionAndOnTheSameLanes;
	}
	public boolean isDrivingInTheSameDirectionAndOnDifferentLanes() {
		return drivingInTheSameDirectionAndOnDifferentLanes;
	}
	public void setDrivingInTheSameDirectionAndOnDifferentLanes(boolean drivingInTheSameDirectionAndOnDifferentLanes) {
		this.drivingInTheSameDirectionAndOnDifferentLanes = drivingInTheSameDirectionAndOnDifferentLanes;
	}
	public boolean isWasChangingLanes() {
		return wasChangingLanes;
	}
	public void setWasChangingLanes(boolean wasChangingLanes) {
		this.wasChangingLanes = wasChangingLanes;
	}
	public boolean isWasDoubling() {
		return wasDoubling;
	}
	public void setWasDoubling(boolean wasDoubling) {
		this.wasDoubling = wasDoubling;
	}
	public boolean isWasTurningRight() {
		return wasTurningRight;
	}
	public void setWasTurningRight(boolean wasTurningRight) {
		this.wasTurningRight = wasTurningRight;
	}
	public boolean isWasTurningLeft() {
		return wasTurningLeft;
	}
	public void setWasTurningLeft(boolean wasTurningLeft) {
		this.wasTurningLeft = wasTurningLeft;
	}
	public boolean isWasRetreating() {
		return wasRetreating;
	}
	public void setWasRetreating(boolean wasRetreating) {
		this.wasRetreating = wasRetreating;
	}
	
	public boolean isEncroachedOnThePartOfThePavReservedForTrafInTheOppositeDir() {
		return encroachedOnThePartOfThePavReservedForTrafInTheOppositeDir;
	}
	public void setEncroachedOnThePartOfThePavReservedForTrafInTheOppositeDir(
			boolean encroachedOnThePartOfThePavReservedForTrafInTheOppositeDir) {
		this.encroachedOnThePartOfThePavReservedForTrafInTheOppositeDir = encroachedOnThePartOfThePavReservedForTrafInTheOppositeDir;
	}
	public boolean isWasComingFromRightInACrossroads() {
		return wasComingFromRightInACrossroads;
	}
	public void setWasComingFromRightInACrossroads(boolean wasComingFromRightInACrossroads) {
		this.wasComingFromRightInACrossroads = wasComingFromRightInACrossroads;
	}
	public boolean isHadNotObservedTheSignalOfPriority() {
		return hadNotObservedTheSignalOfPriority;
	}
	public void setHadNotObservedTheSignalOfPriority(boolean hadNotObservedTheSignalOfPriority) {
		this.hadNotObservedTheSignalOfPriority = hadNotObservedTheSignalOfPriority;
	}
	public int getNumberOfCheckedBox() {
		return numberOfCheckedBox;
	}
	public void setNumberOfCheckedBox(int numberOfCheckedBox) {
		this.numberOfCheckedBox = numberOfCheckedBox;
	}
	public String getInitialShockPoint() {
		return initialShockPoint;
	}
	public void setInitialShockPoint(String initialShockPoint) {
		this.initialShockPoint = initialShockPoint;
	}
	public String getObservations() {
		return Observations;
	}
	public void setObservations(String observations) {
		Observations = observations;
	}
	
   
}
