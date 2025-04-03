package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.CompleteSignInResult;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICompleteSignInCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICompleteSignInCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICompleteSignInCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback
            public void onResult(Status status, CompleteSignInResult completeSignInResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, completeSignInResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback");
        }

        public static ICompleteSignInCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback");
            return queryLocalInterface instanceof ICompleteSignInCallback ? (ICompleteSignInCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            CompleteSignInResult completeSignInResult = (CompleteSignInResult) rve.a(parcel, CompleteSignInResult.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, completeSignInResult);
            return true;
        }
    }

    void onResult(Status status, CompleteSignInResult completeSignInResult);
}
