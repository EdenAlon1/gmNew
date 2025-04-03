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
public interface IMdhFootprintsListCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMdhFootprintsListCallback {
        static final int TRANSACTION_onListRetrieved = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMdhFootprintsListCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdh.internal.IMdhFootprintsListCallback");
            }

            @Override // com.google.android.gms.mdh.internal.IMdhFootprintsListCallback
            public void onListRetrieved(Status status, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, mdhFootprintListSafeParcelable);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdh.internal.IMdhFootprintsListCallback");
        }

        public static IMdhFootprintsListCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdh.internal.IMdhFootprintsListCallback");
            return queryLocalInterface instanceof IMdhFootprintsListCallback ? (IMdhFootprintsListCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable = (MdhFootprintListSafeParcelable) rve.a(parcel, MdhFootprintListSafeParcelable.CREATOR);
            enforceNoDataAvail(parcel);
            onListRetrieved(status, mdhFootprintListSafeParcelable);
            return true;
        }
    }

    void onListRetrieved(Status status, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable);
}
