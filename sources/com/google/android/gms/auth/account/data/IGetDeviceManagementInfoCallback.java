package com.google.android.gms.auth.account.data;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetDeviceManagementInfoCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetDeviceManagementInfoCallback {
        static final int TRANSACTION_onResponse = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetDeviceManagementInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback");
            }

            @Override // com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback
            public void onResponse(Status status, DeviceManagementInfoResponse deviceManagementInfoResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, deviceManagementInfoResponse);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback");
        }

        public static IGetDeviceManagementInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGetDeviceManagementInfoCallback");
            return queryLocalInterface instanceof IGetDeviceManagementInfoCallback ? (IGetDeviceManagementInfoCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            DeviceManagementInfoResponse deviceManagementInfoResponse = (DeviceManagementInfoResponse) rve.a(parcel, DeviceManagementInfoResponse.CREATOR);
            enforceNoDataAvail(parcel);
            onResponse(status, deviceManagementInfoResponse);
            return true;
        }
    }

    void onResponse(Status status, DeviceManagementInfoResponse deviceManagementInfoResponse);
}
