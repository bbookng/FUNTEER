import { OpenVidu } from 'openvidu-browser';
import React from 'react';
import VideoRoomComponent from '../../components/VideoRoomComponent';
import styles from './LiveTest.module.scss';

export function LiveTest() {
  return (
    <div className={styles.bodyContainer}>
      <div className={styles.contentBox}>
        <VideoRoomComponent />
      </div>
    </div>
  );
}

export default LiveTest;
