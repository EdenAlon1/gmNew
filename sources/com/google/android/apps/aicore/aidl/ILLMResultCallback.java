package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rwx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ILLMResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ILLMResultCallback {
        static final int TRANSACTION_onLLMInferenceFailure = 3;
        static final int TRANSACTION_onLLMInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ILLMResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ILLMResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMResultCallback
            public void onLLMInferenceFailure(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMResultCallback
            public void onLLMInferenceSuccess(rwx rwxVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rwxVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ILLMResultCallback");
        }

        public static ILLMResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ILLMResultCallback");
            return queryLocalInterface instanceof ILLMResultCallback ? (ILLMResultCallback) queryLocalInterface : new Proxy(iBinder);
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
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onLLMInferenceFailure(readInt);
            return true;
        }
    }

    void onLLMInferenceFailure(int i);

    void onLLMInferenceSuccess(rwx rwxVar);
}
