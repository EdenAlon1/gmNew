package com.google.android.gms.mdh.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMdhTimeSeriesFootprintsWriteResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMdhTimeSeriesFootprintsWriteResultCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMdhTimeSeriesFootprintsWriteResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdh.internal.IMdhTimeSeriesFootprintsWriteResultCallback");
            }

            @Override // com.google.android.gms.mdh.internal.IMdhTimeSeriesFootprintsWriteResultCallback
            public void onResult(Status status, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdh.internal.IMdhTimeSeriesFootprintsWriteResultCallback");
        }

        public static IMdhTimeSeriesFootprintsWriteResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdh.internal.IMdhTimeSeriesFootprintsWriteResultCallback");
            return queryLocalInterface instanceof IMdhTimeSeriesFootprintsWriteResultCallback ? (IMdhTimeSeriesFootprintsWriteResultCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            long readLong = parcel.readLong();
            enforceNoDataAvail(parcel);
            onResult(status, readLong);
            return true;
        }
    }

    void onResult(Status status, long j);
}
