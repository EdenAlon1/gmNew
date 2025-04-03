package com.google.android.gms.auth.account.data;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountData;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetGoogleAccountDataCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetGoogleAccountDataCallback {
        static final int TRANSACTION_onResponse = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetGoogleAccountDataCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IGetGoogleAccountDataCallback");
            }

            @Override // com.google.android.gms.auth.account.data.IGetGoogleAccountDataCallback
            public void onResponse(Status status, GoogleAccountData googleAccountData) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, googleAccountData);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IGetGoogleAccountDataCallback");
        }

        public static IGetGoogleAccountDataCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGetGoogleAccountDataCallback");
            return queryLocalInterface instanceof IGetGoogleAccountDataCallback ? (IGetGoogleAccountDataCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            GoogleAccountData googleAccountData = (GoogleAccountData) rve.a(parcel, GoogleAccountData.CREATOR);
            enforceNoDataAvail(parcel);
            onResponse(status, googleAccountData);
            return true;
        }
    }

    void onResponse(Status status, GoogleAccountData googleAccountData);
}
