package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IPrepareInferenceEngineCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPrepareInferenceEngineCallback {
        static final int TRANSACTION_onPreparationFailure = 3;
        static final int TRANSACTION_onPreparationSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPrepareInferenceEngineCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback
            public void onPreparationFailure(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback
            public void onPreparationSuccess() {
                transactOneway(2, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback");
        }

        public static IPrepareInferenceEngineCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback");
            return queryLocalInterface instanceof IPrepareInferenceEngineCallback ? (IPrepareInferenceEngineCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                onPreparationSuccess();
                return true;
            }
            if (i != 3) {
                return false;
            }
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onPreparationFailure(readInt);
            return true;
        }
    }

    void onPreparationFailure(int i);

    void onPreparationSuccess();
}
