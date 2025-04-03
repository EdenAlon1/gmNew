package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAuthorizationCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAuthorizationCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAuthorizationCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback
            public void onResult(Status status, AuthorizationResult authorizationResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, authorizationResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
        }

        public static IAuthorizationCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
            return queryLocalInterface instanceof IAuthorizationCallback ? (IAuthorizationCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            AuthorizationResult authorizationResult = (AuthorizationResult) rve.a(parcel, AuthorizationResult.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, authorizationResult);
            return true;
        }
    }

    void onResult(Status status, AuthorizationResult authorizationResult);
}
