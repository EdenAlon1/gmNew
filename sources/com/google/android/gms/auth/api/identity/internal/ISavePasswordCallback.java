package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISavePasswordCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISavePasswordCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISavePasswordCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback
            public void onResult(Status status, SavePasswordResult savePasswordResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, savePasswordResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
        }

        public static ISavePasswordCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
            return queryLocalInterface instanceof ISavePasswordCallback ? (ISavePasswordCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            SavePasswordResult savePasswordResult = (SavePasswordResult) rve.a(parcel, SavePasswordResult.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, savePasswordResult);
            return true;
        }
    }

    void onResult(Status status, SavePasswordResult savePasswordResult);
}
