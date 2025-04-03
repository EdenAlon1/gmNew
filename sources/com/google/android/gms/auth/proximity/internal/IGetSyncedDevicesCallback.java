package com.google.android.gms.auth.proximity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.common.api.Status;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetSyncedDevicesCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetSyncedDevicesCallback {
        static final int TRANSACTION_onFetchedDevices = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetSyncedDevicesCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.proximity.internal.IGetSyncedDevicesCallback");
            }

            @Override // com.google.android.gms.auth.proximity.internal.IGetSyncedDevicesCallback
            public void onFetchedDevices(Status status, List<SyncedCryptauthDevice> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.proximity.internal.IGetSyncedDevicesCallback");
        }

        public static IGetSyncedDevicesCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IGetSyncedDevicesCallback");
            return queryLocalInterface instanceof IGetSyncedDevicesCallback ? (IGetSyncedDevicesCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            ArrayList createTypedArrayList = parcel.createTypedArrayList(SyncedCryptauthDevice.CREATOR);
            enforceNoDataAvail(parcel);
            onFetchedDevices(status, createTypedArrayList);
            return true;
        }
    }

    void onFetchedDevices(Status status, List<SyncedCryptauthDevice> list);
}
