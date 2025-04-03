package com.google.android.gms.mdh.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ITimeSeriesFootprintsListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITimeSeriesFootprintsListener {
        static final int TRANSACTION_onFootprintsDeleted = 3;
        static final int TRANSACTION_onFootprintsUpdate = 2;
        static final int TRANSACTION_onSnapshot = 1;
        static final int TRANSACTION_onSyncComplete = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITimeSeriesFootprintsListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener");
            }

            @Override // com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener
            public void onFootprintsDeleted(IStatusCallback iStatusCallback, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener
            public void onFootprintsUpdate(IStatusCallback iStatusCallback, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, mdhFootprintListSafeParcelable);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener
            public void onSnapshot(IStatusCallback iStatusCallback, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, timeSeriesFootprintsSubscriptionFilter);
                rve.d(obtainAndWriteInterfaceToken, mdhFootprintListSafeParcelable);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener
            public void onSyncComplete(IStatusCallback iStatusCallback, SyncStatus syncStatus) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, syncStatus);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener");
        }

        public static ITimeSeriesFootprintsListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener");
            return queryLocalInterface instanceof ITimeSeriesFootprintsListener ? (ITimeSeriesFootprintsListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter = (TimeSeriesFootprintsSubscriptionFilter) rve.a(parcel, TimeSeriesFootprintsSubscriptionFilter.CREATOR);
                MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable = (MdhFootprintListSafeParcelable) rve.a(parcel, MdhFootprintListSafeParcelable.CREATOR);
                enforceNoDataAvail(parcel);
                onSnapshot(asInterface, timeSeriesFootprintsSubscriptionFilter, mdhFootprintListSafeParcelable);
            } else if (i == 2) {
                IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable2 = (MdhFootprintListSafeParcelable) rve.a(parcel, MdhFootprintListSafeParcelable.CREATOR);
                enforceNoDataAvail(parcel);
                onFootprintsUpdate(asInterface2, mdhFootprintListSafeParcelable2);
            } else if (i == 3) {
                IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                long readLong = parcel.readLong();
                enforceNoDataAvail(parcel);
                onFootprintsDeleted(asInterface3, readLong);
            } else {
                if (i != 4) {
                    return false;
                }
                IStatusCallback asInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                SyncStatus syncStatus = (SyncStatus) rve.a(parcel, SyncStatus.CREATOR);
                enforceNoDataAvail(parcel);
                onSyncComplete(asInterface4, syncStatus);
            }
            return true;
        }
    }

    void onFootprintsDeleted(IStatusCallback iStatusCallback, long j);

    void onFootprintsUpdate(IStatusCallback iStatusCallback, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable);

    void onSnapshot(IStatusCallback iStatusCallback, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable);

    void onSyncComplete(IStatusCallback iStatusCallback, SyncStatus syncStatus);
}
