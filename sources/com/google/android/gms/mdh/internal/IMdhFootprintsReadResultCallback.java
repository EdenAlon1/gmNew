package com.google.android.gms.mdh.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.MdhFootprintsReadResult;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMdhFootprintsReadResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMdhFootprintsReadResultCallback {
        static final int TRANSACTION_onResultRetrieved = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMdhFootprintsReadResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdh.internal.IMdhFootprintsReadResultCallback");
            }

            @Override // com.google.android.gms.mdh.internal.IMdhFootprintsReadResultCallback
            public void onResultRetrieved(Status status, MdhFootprintsReadResult mdhFootprintsReadResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, mdhFootprintsReadResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdh.internal.IMdhFootprintsReadResultCallback");
        }

        public static IMdhFootprintsReadResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdh.internal.IMdhFootprintsReadResultCallback");
            return queryLocalInterface instanceof IMdhFootprintsReadResultCallback ? (IMdhFootprintsReadResultCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            MdhFootprintsReadResult mdhFootprintsReadResult = (MdhFootprintsReadResult) rve.a(parcel, MdhFootprintsReadResult.CREATOR);
            enforceNoDataAvail(parcel);
            onResultRetrieved(status, mdhFootprintsReadResult);
            return true;
        }
    }

    void onResultRetrieved(Status status, MdhFootprintsReadResult mdhFootprintsReadResult);
}
