package com.google.android.gms.mdh.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.SyncStatus;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ILatestFootprintListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ILatestFootprintListener {
        static final int TRANSACTION_onFootprintsDeleted = 3;
        static final int TRANSACTION_onFootprintsUpdate = 2;
        static final int TRANSACTION_onSnapshot = 1;
        static final int TRANSACTION_onSyncCompleteWithStatus = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ILatestFootprintListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdh.internal.ILatestFootprintListener");
            }

            @Override // com.google.android.gms.mdh.internal.ILatestFootprintListener
            public void onFootprintsDeleted(IStatusCallback iStatusCallback, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.ILatestFootprintListener
            public void onFootprintsUpdate(IStatusCallback iStatusCallback, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, mdhFootprintListSafeParcelable);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.ILatestFootprintListener
            public void onSnapshot(IStatusCallback iStatusCallback, LatestFootprintFilter latestFootprintFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, latestFootprintFilter);
                rve.d(obtainAndWriteInterfaceToken, mdhFootprintListSafeParcelable);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.ILatestFootprintListener
            public void onSyncCompleteWithStatus(IStatusCallback iStatusCallback, SyncStatus syncStatus) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, syncStatus);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdh.internal.ILatestFootprintListener");
        }

        public static ILatestFootprintListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdh.internal.ILatestFootprintListener");
            return queryLocalInterface instanceof ILatestFootprintListener ? (ILatestFootprintListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                LatestFootprintFilter latestFootprintFilter = (LatestFootprintFilter) rve.a(parcel, LatestFootprintFilter.CREATOR);
                MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable = (MdhFootprintListSafeParcelable) rve.a(parcel, MdhFootprintListSafeParcelable.CREATOR);
                enforceNoDataAvail(parcel);
                onSnapshot(asInterface, latestFootprintFilter, mdhFootprintListSafeParcelable);
            } else if (i == 2) {
                IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable2 = (MdhFootprintListSafeParcelable) rve.a(parcel, MdhFootprintListSafeParcelable.CREATOR);
                enforceNoDataAvail(parcel);
                onFootprintsUpdate(asInterface2, mdhFootprintListSafeParcelable2);
            } else if (i == 3) {
                IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                byte[] createByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                onFootprintsDeleted(asInterface3, createByteArray);
            } else {
                if (i != 5) {
                    return false;
                }
                IStatusCallback asInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                SyncStatus syncStatus = (SyncStatus) rve.a(parcel, SyncStatus.CREATOR);
                enforceNoDataAvail(parcel);
                onSyncCompleteWithStatus(asInterface4, syncStatus);
            }
            return true;
        }
    }

    void onFootprintsDeleted(IStatusCallback iStatusCallback, byte[] bArr);

    void onFootprintsUpdate(IStatusCallback iStatusCallback, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable);

    void onSnapshot(IStatusCallback iStatusCallback, LatestFootprintFilter latestFootprintFilter, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable);

    void onSyncCompleteWithStatus(IStatusCallback iStatusCallback, SyncStatus syncStatus);
}
