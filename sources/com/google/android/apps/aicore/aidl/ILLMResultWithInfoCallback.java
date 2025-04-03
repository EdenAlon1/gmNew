package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rvy;
import defpackage.rwx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ILLMResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ILLMResultWithInfoCallback {
        static final int TRANSACTION_onLLMInferenceFailure = 3;
        static final int TRANSACTION_onLLMInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ILLMResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ILLMResultWithInfoCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMResultWithInfoCallback
            public void onLLMInferenceFailure(rvy rvyVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvyVar);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMResultWithInfoCallback
            public void onLLMInferenceSuccess(rwx rwxVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rwxVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ILLMResultWithInfoCallback");
        }

        public static ILLMResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ILLMResultWithInfoCallback");
            return queryLocalInterface instanceof ILLMResultWithInfoCallback ? (ILLMResultWithInfoCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                rwx rwxVar = (rwx) rve.a(parcel, rwx.CREATOR);
                enforceNoDataAvail(parcel);
                onLLMInferenceSuccess(rwxVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            rvy rvyVar = (rvy) rve.a(parcel, rvy.CREATOR);
            enforceNoDataAvail(parcel);
            onLLMInferenceFailure(rvyVar);
            return true;
        }
    }

    void onLLMInferenceFailure(rvy rvyVar);

    void onLLMInferenceSuccess(rwx rwxVar);
}
