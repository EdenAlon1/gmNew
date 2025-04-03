package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IBeginSignInCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBeginSignInCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBeginSignInCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback
            public void onResult(Status status, BeginSignInResult beginSignInResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, beginSignInResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
        }

        public static IBeginSignInCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
            return queryLocalInterface instanceof IBeginSignInCallback ? (IBeginSignInCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            BeginSignInResult beginSignInResult = (BeginSignInResult) rve.a(parcel, BeginSignInResult.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, beginSignInResult);
            return true;
        }
    }

    void onResult(Status status, BeginSignInResult beginSignInResult);
}
