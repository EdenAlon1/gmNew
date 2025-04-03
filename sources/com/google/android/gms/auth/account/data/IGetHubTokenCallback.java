package com.google.android.gms.auth.account.data;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.GetHubTokenInternalResponse;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetHubTokenCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetHubTokenCallback {
        static final int TRANSACTION_onResponse = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetHubTokenCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IGetHubTokenCallback");
            }

            @Override // com.google.android.gms.auth.account.data.IGetHubTokenCallback
            public void onResponse(Status status, GetHubTokenInternalResponse getHubTokenInternalResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, getHubTokenInternalResponse);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IGetHubTokenCallback");
        }

        public static IGetHubTokenCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGetHubTokenCallback");
            return queryLocalInterface instanceof IGetHubTokenCallback ? (IGetHubTokenCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            GetHubTokenInternalResponse getHubTokenInternalResponse = (GetHubTokenInternalResponse) rve.a(parcel, GetHubTokenInternalResponse.CREATOR);
            enforceNoDataAvail(parcel);
            onResponse(status, getHubTokenInternalResponse);
            return true;
        }
    }

    void onResponse(Status status, GetHubTokenInternalResponse getHubTokenInternalResponse);
}
