package com.yam.funteer.funding.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.multipart.MultipartFile;

import com.yam.funteer.funding.dto.request.FundingCommentRequest;
import com.yam.funteer.funding.dto.response.FundingDetailResponse;
import com.yam.funteer.funding.dto.response.FundingListPageResponse;
import com.yam.funteer.funding.dto.response.FundingListResponse;
import com.yam.funteer.funding.dto.request.FundingReportRequest;
import com.yam.funteer.funding.dto.response.FundingReportResponse;
import com.yam.funteer.funding.dto.request.FundingRequest;
import com.yam.funteer.funding.dto.request.TakeFundingRequest;
import com.yam.funteer.funding.exception.CommentNotFoundException;
import com.yam.funteer.funding.exception.FundingNotFoundException;
import com.yam.funteer.funding.exception.NotAuthenticatedMemberException;
import com.yam.funteer.funding.exception.NotAuthenticatedTeamException;

public interface FundingService {
	Page<FundingListResponse> findFundingByCategory(Long categoryId, Pageable pageable);

	FundingDetailResponse createFunding( FundingRequest data);

	FundingDetailResponse findFundingById(Long id, Pageable pageable);

	FundingDetailResponse updateFunding(Long fundingId, FundingRequest data);

	void deleteFunding(Long fundingId);

	FundingReportResponse createFundingReport(Long fundingId, FundingReportRequest data);

	FundingReportResponse findFundingReportById(Long fundingId);

	FundingReportResponse updateFundingReport(Long fundingId, FundingReportRequest data);

	void createFundingComment(Long fundingId, FundingCommentRequest data);

	void deleteFundingComment(Long commentId);

	FundingListPageResponse findAllFunding(Pageable pageable);

	void takeFunding(Long fundingId, TakeFundingRequest data);

	Page<FundingListResponse> findFundingByKeyword(String keyword, Pageable pageable);

	Page<FundingListResponse> findFundingByHashtag(String hashtag, Pageable pageable);

	int updateHit(Long fundingId, HttpServletRequest request, HttpServletResponse response);


}
