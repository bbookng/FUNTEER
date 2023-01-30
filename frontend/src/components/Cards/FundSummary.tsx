import React from 'react';
import styles from './FundSummary.module.scss';
import thumbNail from '../../assets/images/funding/funding_thumbnail.png';

export function FundSummary() {
  return (
    <div className={styles.cardContainer}>
      <div className={styles.blogCard}>
        <img className={styles.cardImage} src={thumbNail} alt="altImg" />
        <div className={styles.cardDetail}>
          <h4 className={styles.fundGroup}>펀딩 단체명</h4>
          <div className={styles.fundInfo}>
            <p className={styles.fundTitle}>펀딩 제목</p>
            <p className={styles.fundPeriod}>2023-01-06 ~ 2023-01-21</p>
          </div>
          <div className={styles.fundGauge}>
            <p className={styles.fundLevel}>진행중 (1단계 달성)</p>
          </div>
          <div className={styles.barWrapper}>
            <div className={styles.progressBar}>
              <div className={styles.status} />
            </div>
            <p className={styles.funStatusNum}>40%</p>
          </div>
        </div>
      </div>
    </div>
  );
}

export default FundSummary;
