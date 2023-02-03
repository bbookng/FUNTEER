import React from 'react';
import styles from './LiveTest.module.scss';
import VideoRoomComponent from '../../components/VideoRoomComponent';

export function LiveTest() {
  return (
    <div className={styles.bodyContainer}>
      <div className={styles.contentBox}>
        <VideoRoomComponent className={styles.videoComp} />
      </div>
    </div>
  );
}

export default LiveTest;
