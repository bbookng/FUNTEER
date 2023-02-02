package com.yam.funteer.donation.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.yam.funteer.post.entity.Post;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name="donation")
@Getter @SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Donation extends Post {
	private @NotNull Long amount;
	private Long currentAmount;

	public void currentAmountUpdate(Long payAmount){
		this.currentAmount+=payAmount;
	}
}
