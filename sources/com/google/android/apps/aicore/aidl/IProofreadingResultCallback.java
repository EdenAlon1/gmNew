package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rxr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IProofreadingResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IProofreadingResultCallback {
        static final int TRANSACTION_onProofreadingInferenceFailure = 3;
        static final int TRANSACTION_onProofreadingInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IProofreadingResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IProofreadingResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IProofreadingResultCallback
            public void onProofreadingInferenceFailure(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IProofreadingResultCallback
            public void onProofreadingInferenceSuccess(rxr rxrVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rxrVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IProofreadingResultCallback");
        }

        public static IProofreadingResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IProofreadingResultCallback");
            return queryLocalInterface instanceof IProofreadingResultCallback ? (IProofreadingResultCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                rxr rxrVar = (rxr) rve.a(parcel, rxr.CREATOR);
                enforceNoDataAvail(parcel);
                onProofreadingInferenceSuccess(rxrVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onProofreadingInferenceFailure(readInt);
            return true;
        }
    }

    void onProofreadingInferenceFailure(int i);

    void onProofreadingInferenceSuccess(rxr rxrVar);
}
