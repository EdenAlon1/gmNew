package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IDownloadListener2 extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IDownloadListener2 {
        static final int TRANSACTION_onDownloadCompleted = 5;
        static final int TRANSACTION_onDownloadFailed = 4;
        static final int TRANSACTION_onDownloadProgress = 3;
        static final int TRANSACTION_onDownloadStarted = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IDownloadListener2 {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IDownloadListener2");
            }

            @Override // com.google.android.apps.aicore.aidl.IDownloadListener2
            public void onDownloadCompleted(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IDownloadListener2
            public void onDownloadFailed(String str, int i, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IDownloadListener2
            public void onDownloadProgress(String str, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IDownloadListener2
            public void onDownloadStarted(String str, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IDownloadListener2");
        }

        public static IDownloadListener2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IDownloadListener2");
            return queryLocalInterface instanceof IDownloadListener2 ? (IDownloadListener2) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                String readString = parcel.readString();
                long readLong = parcel.readLong();
                enforceNoDataAvail(parcel);
                onDownloadStarted(readString, readLong);
                return true;
            }
            if (i == 3) {
                String readString2 = parcel.readString();
                long readLong2 = parcel.readLong();
                enforceNoDataAvail(parcel);
                onDownloadProgress(readString2, readLong2);
                return true;
            }
            if (i != 4) {
                if (i != 5) {
                    return false;
                }
                String readString3 = parcel.readString();
                enforceNoDataAvail(parcel);
                onDownloadCompleted(readString3);
                return true;
            }
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            String readString5 = parcel.readString();
            enforceNoDataAvail(parcel);
            onDownloadFailed(readString4, readInt, readString5);
            return true;
        }
    }

    void onDownloadCompleted(String str);

    void onDownloadFailed(String str, int i, String str2);

    void onDownloadProgress(String str, long j);

    void onDownloadStarted(String str, long j);
}
