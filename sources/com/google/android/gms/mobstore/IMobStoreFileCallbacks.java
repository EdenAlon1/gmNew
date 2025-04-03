package com.google.android.gms.mobstore;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMobStoreFileCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMobStoreFileCallbacks {
        static final int TRANSACTION_onFileDeleted = 2;
        static final int TRANSACTION_onFileDescriptorOpened = 1;
        static final int TRANSACTION_onRenamed = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMobStoreFileCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mobstore.IMobStoreFileCallbacks");
            }

            @Override // com.google.android.gms.mobstore.IMobStoreFileCallbacks
            public void onFileDeleted(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mobstore.IMobStoreFileCallbacks
            public void onFileDescriptorOpened(Status status, OpenFileDescriptorResponse openFileDescriptorResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, openFileDescriptorResponse);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mobstore.IMobStoreFileCallbacks
            public void onRenamed(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
        }

        public static IMobStoreFileCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
            return queryLocalInterface instanceof IMobStoreFileCallbacks ? (IMobStoreFileCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) rve.a(parcel, Status.CREATOR);
                OpenFileDescriptorResponse openFileDescriptorResponse = (OpenFileDescriptorResponse) rve.a(parcel, OpenFileDescriptorResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onFileDescriptorOpened(status, openFileDescriptorResponse);
            } else if (i == 2) {
                Status status2 = (Status) rve.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onFileDeleted(status2);
            } else {
                if (i != 3) {
                    return false;
                }
                Status status3 = (Status) rve.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onRenamed(status3);
            }
            return true;
        }
    }

    void onFileDeleted(Status status);

    void onFileDescriptorOpened(Status status, OpenFileDescriptorResponse openFileDescriptorResponse);

    void onRenamed(Status status);
}
