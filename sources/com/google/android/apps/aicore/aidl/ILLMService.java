package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.ILLMResultCallback;
import com.google.android.apps.aicore.aidl.ILLMResultWithInfoCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import defpackage.rve;
import defpackage.rwv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ILLMService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ILLMService {
        static final int TRANSACTION_getApiVersion = 4;
        static final int TRANSACTION_prepareInferenceEngine = 5;
        static final int TRANSACTION_runCancellableInference = 3;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 6;
        static final int TRANSACTION_runInference = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ILLMService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ILLMService");
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMService
            public int getApiVersion() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMService
            public ICancellationCallback runCancellableInference(rwv rwvVar, ILLMResultCallback iLLMResultCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rwvVar);
                rve.f(obtainAndWriteInterfaceToken, iLLMResultCallback);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMService
            public ICancellationCallback runCancellableInferenceWithInfo(rwv rwvVar, ILLMResultWithInfoCallback iLLMResultWithInfoCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rwvVar);
                rve.f(obtainAndWriteInterfaceToken, iLLMResultWithInfoCallback);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ILLMService
            public void runInference(rwv rwvVar, ILLMResultCallback iLLMResultCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rwvVar);
                rve.f(obtainAndWriteInterfaceToken, iLLMResultCallback);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ILLMService");
        }

        public static ILLMService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ILLMService");
            return queryLocalInterface instanceof ILLMService ? (ILLMService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                rwv rwvVar = (rwv) rve.a(parcel, rwv.CREATOR);
                ILLMResultCallback asInterface = ILLMResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                runInference(rwvVar, asInterface);
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                rwv rwvVar2 = (rwv) rve.a(parcel, rwv.CREATOR);
                ILLMResultCallback asInterface2 = ILLMResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback runCancellableInference = runCancellableInference(rwvVar2, asInterface2);
                parcel2.writeNoException();
                rve.f(parcel2, runCancellableInference);
                return true;
            }
            if (i == 4) {
                int apiVersion = getApiVersion();
                parcel2.writeNoException();
                parcel2.writeInt(apiVersion);
                return true;
            }
            if (i == 5) {
                IPrepareInferenceEngineCallback asInterface3 = IPrepareInferenceEngineCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback prepareInferenceEngine = prepareInferenceEngine(asInterface3);
                parcel2.writeNoException();
                rve.f(parcel2, prepareInferenceEngine);
                return true;
            }
            if (i != 6) {
                return false;
            }
            rwv rwvVar3 = (rwv) rve.a(parcel, rwv.CREATOR);
            ILLMResultWithInfoCallback asInterface4 = ILLMResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            ICancellationCallback runCancellableInferenceWithInfo = runCancellableInferenceWithInfo(rwvVar3, asInterface4);
            parcel2.writeNoException();
            rve.f(parcel2, runCancellableInferenceWithInfo);
            return true;
        }
    }

    int getApiVersion();

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(rwv rwvVar, ILLMResultCallback iLLMResultCallback);

    ICancellationCallback runCancellableInferenceWithInfo(rwv rwvVar, ILLMResultWithInfoCallback iLLMResultWithInfoCallback);

    @Deprecated
    void runInference(rwv rwvVar, ILLMResultCallback iLLMResultCallback);
}
