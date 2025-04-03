package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rvs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IBaymaxResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBaymaxResultCallback {
        static final int TRANSACTION_onBaymaxInferenceFailure = 3;
        static final int TRANSACTION_onBaymaxInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBaymaxResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IBaymaxResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IBaymaxResultCallback
            public void onBaymaxInferenceFailure(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IBaymaxResultCallback
            public void onBaymaxInferenceSuccess(rvs rvsVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvsVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IBaymaxResultCallback");
        }

        public static IBaymaxResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IBaymaxResultCallback");
            return queryLocalInterface instanceof IBaymaxResultCallback ? (IBaymaxResultCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                rvs rvsVar = (rvs) rve.a(parcel, rvs.CREATOR);
                enforceNoDataAvail(parcel);
                onBaymaxInferenceSuccess(rvsVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onBaymaxInferenceFailure(readInt);
            return true;
        }
    }

    void onBaymaxInferenceFailure(int i);

    void onBaymaxInferenceSuccess(rvs rvsVar);
}
