package com.google.android.gms.mdd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMddFileGroupWithDownloadStatusCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMddFileGroupWithDownloadStatusCallback {
        static final int TRANSACTION_onFileGroupListRetrieved = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMddFileGroupWithDownloadStatusCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdd.IMddFileGroupWithDownloadStatusCallback");
            }

            @Override // com.google.android.gms.mdd.IMddFileGroupWithDownloadStatusCallback
            public void onFileGroupListRetrieved(Status status, List<FileGroupWithDownloadStatus> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdd.IMddFileGroupWithDownloadStatusCallback");
        }

        public static IMddFileGroupWithDownloadStatusCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdd.IMddFileGroupWithDownloadStatusCallback");
            return queryLocalInterface instanceof IMddFileGroupWithDownloadStatusCallback ? (IMddFileGroupWithDownloadStatusCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            ArrayList createTypedArrayList = parcel.createTypedArrayList(FileGroupWithDownloadStatus.CREATOR);
            enforceNoDataAvail(parcel);
            onFileGroupListRetrieved(status, createTypedArrayList);
            return true;
        }
    }

    void onFileGroupListRetrieved(Status status, List<FileGroupWithDownloadStatus> list);
}
