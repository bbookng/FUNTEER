import React from 'react';
import styles from './MyPageContainer.module.scss';
import SideBarList from '../../components/MyPageSideBar/SideBarList';
import Tom from '../../assets/images/teamProfile/Tom.png';

export function MyPageContainer() {
  return (
    <div className={styles.bodyContainer}>
      <SideBarList />
      <div className={styles.contentContainer}>
        <div className={styles.contentBox}>
          <img className={styles.profileImg} src={Tom} alt="profileImg" />
        </div>
      </div>
    </div>
  );
}

export default MyPageContainer;
