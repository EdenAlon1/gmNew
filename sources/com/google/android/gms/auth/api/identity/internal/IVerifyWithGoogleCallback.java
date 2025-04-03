package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.VerifyWithGoogleResult;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IVerifyWithGoogleCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IVerifyWithGoogleCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IVerifyWithGoogleCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IVerifyWithGoogleCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IVerifyWithGoogleCallback
            public void onResult(Status status, VerifyWithGoogleResult verifyWithGoogleResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, verifyWithGoogleResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IVerifyWithGoogleCallback");
        }

        public static IVerifyWithGoogleCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IVerifyWithGoogleCallback");
            return queryLocalInterface instanceof IVerifyWithGoogleCallback ? (IVerifyWithGoogleCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            VerifyWithGoogleResult verifyWithGoogleResult = (VerifyWithGoogleResult) rve.a(parcel, VerifyWithGoogleResult.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, verifyWithGoogleResult);
            return true;
        }
    }

    void onResult(Status status, VerifyWithGoogleResult verifyWithGoogleResult);
}
