package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.IBaymaxResultCallback;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import defpackage.rve;
import defpackage.rvq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IBaymaxService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBaymaxService {
        static final int TRANSACTION_getApiVersion = 3;
        static final int TRANSACTION_prepareInferenceEngine = 4;
        static final int TRANSACTION_runCancellableInference = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBaymaxService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IBaymaxService");
            }

            @Override // com.google.android.apps.aicore.aidl.IBaymaxService
            public int getApiVersion() {
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.apps.aicore.aidl.IBaymaxService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IBaymaxService
            public ICancellationCallback runCancellableInference(rvq rvqVar, IBaymaxResultCallback iBaymaxResultCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvqVar);
                rve.f(obtainAndWriteInterfaceToken, iBaymaxResultCallback);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IBaymaxService");
        }

        public static IBaymaxService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IBaymaxService");
            return queryLocalInterface instanceof IBaymaxService ? (IBaymaxService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                rvq rvqVar = (rvq) rve.a(parcel, rvq.CREATOR);
                IBaymaxResultCallback asInterface = IBaymaxResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback runCancellableInference = runCancellableInference(rvqVar, asInterface);
                parcel2.writeNoException();
                rve.f(parcel2, runCancellableInference);
                return true;
            }
            if (i == 3) {
                int apiVersion = getApiVersion();
                parcel2.writeNoException();
                parcel2.writeInt(apiVersion);
                return true;
            }
            if (i != 4) {
                return false;
            }
            IPrepareInferenceEngineCallback asInterface2 = IPrepareInferenceEngineCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            ICancellationCallback prepareInferenceEngine = prepareInferenceEngine(asInterface2);
            parcel2.writeNoException();
            rve.f(parcel2, prepareInferenceEngine);
            return true;
        }
    }

    int getApiVersion();

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(rvq rvqVar, IBaymaxResultCallback iBaymaxResultCallback);
}
