package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.GetDefaultAccountResult;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetDefaultAccountCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetDefaultAccountCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetDefaultAccountCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IGetDefaultAccountCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IGetDefaultAccountCallback
            public void onResult(Status status, GetDefaultAccountResult getDefaultAccountResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, getDefaultAccountResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IGetDefaultAccountCallback");
        }

        public static IGetDefaultAccountCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IGetDefaultAccountCallback");
            return queryLocalInterface instanceof IGetDefaultAccountCallback ? (IGetDefaultAccountCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            GetDefaultAccountResult getDefaultAccountResult = (GetDefaultAccountResult) rve.a(parcel, GetDefaultAccountResult.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, getDefaultAccountResult);
            return true;
        }
    }

    void onResult(Status status, GetDefaultAccountResult getDefaultAccountResult);
}
