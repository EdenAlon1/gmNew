package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rxn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOptimusResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOptimusResultCallback {
        static final int TRANSACTION_onOptimusInferenceFailure = 3;
        static final int TRANSACTION_onOptimusInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOptimusResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IOptimusResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IOptimusResultCallback
            public void onOptimusInferenceFailure(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IOptimusResultCallback
            public void onOptimusInferenceSuccess(rxn rxnVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rxnVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IOptimusResultCallback");
        }

        public static IOptimusResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IOptimusResultCallback");
            return queryLocalInterface instanceof IOptimusResultCallback ? (IOptimusResultCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                rxn rxnVar = (rxn) rve.a(parcel, rxn.CREATOR);
                enforceNoDataAvail(parcel);
                onOptimusInferenceSuccess(rxnVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onOptimusInferenceFailure(readInt);
            return true;
        }
    }

    void onOptimusInferenceFailure(int i);

    void onOptimusInferenceSuccess(rxn rxnVar);
}
