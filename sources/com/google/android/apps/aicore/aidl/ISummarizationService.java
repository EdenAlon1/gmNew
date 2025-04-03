package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.ISummarizationResultCallback;
import com.google.android.apps.aicore.aidl.ISummarizationResultWithInfoCallback;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import defpackage.rve;
import defpackage.rzd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISummarizationService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISummarizationService {
        static final int TRANSACTION_getApiVersion = 4;
        static final int TRANSACTION_getTokenCount = 7;
        static final int TRANSACTION_getTokenInfo = 8;
        static final int TRANSACTION_prepareInferenceEngine = 5;
        static final int TRANSACTION_runCancellableInference = 3;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 6;
        static final int TRANSACTION_runInference = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISummarizationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ISummarizationService");
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public int getApiVersion() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public ICancellationCallback getTokenCount(String str, ITokenizationCallback iTokenizationCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.f(obtainAndWriteInterfaceToken, iTokenizationCallback);
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public ICancellationCallback getTokenInfo(rzd rzdVar, boolean z, ITokenizationCallback iTokenizationCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rzdVar);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.f(obtainAndWriteInterfaceToken, iTokenizationCallback);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public ICancellationCallback runCancellableInference(rzd rzdVar, ISummarizationResultCallback iSummarizationResultCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rzdVar);
                rve.f(obtainAndWriteInterfaceToken, iSummarizationResultCallback);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public ICancellationCallback runCancellableInferenceWithInfo(rzd rzdVar, ISummarizationResultWithInfoCallback iSummarizationResultWithInfoCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rzdVar);
                rve.f(obtainAndWriteInterfaceToken, iSummarizationResultWithInfoCallback);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationService
            public void runInference(rzd rzdVar, ISummarizationResultCallback iSummarizationResultCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rzdVar);
                rve.f(obtainAndWriteInterfaceToken, iSummarizationResultCallback);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ISummarizationService");
        }

        public static ISummarizationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISummarizationService");
            return queryLocalInterface instanceof ISummarizationService ? (ISummarizationService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    rzd rzdVar = (rzd) rve.a(parcel, rzd.CREATOR);
                    ISummarizationResultCallback asInterface = ISummarizationResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    runInference(rzdVar, asInterface);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    rzd rzdVar2 = (rzd) rve.a(parcel, rzd.CREATOR);
                    ISummarizationResultCallback asInterface2 = ISummarizationResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback runCancellableInference = runCancellableInference(rzdVar2, asInterface2);
                    parcel2.writeNoException();
                    rve.f(parcel2, runCancellableInference);
                    return true;
                case 4:
                    int apiVersion = getApiVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(apiVersion);
                    return true;
                case 5:
                    IPrepareInferenceEngineCallback asInterface3 = IPrepareInferenceEngineCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback prepareInferenceEngine = prepareInferenceEngine(asInterface3);
                    parcel2.writeNoException();
                    rve.f(parcel2, prepareInferenceEngine);
                    return true;
                case 6:
                    rzd rzdVar3 = (rzd) rve.a(parcel, rzd.CREATOR);
                    ISummarizationResultWithInfoCallback asInterface4 = ISummarizationResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback runCancellableInferenceWithInfo = runCancellableInferenceWithInfo(rzdVar3, asInterface4);
                    parcel2.writeNoException();
                    rve.f(parcel2, runCancellableInferenceWithInfo);
                    return true;
                case 7:
                    String readString = parcel.readString();
                    ITokenizationCallback asInterface5 = ITokenizationCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback tokenCount = getTokenCount(readString, asInterface5);
                    parcel2.writeNoException();
                    rve.f(parcel2, tokenCount);
                    return true;
                case 8:
                    rzd rzdVar4 = (rzd) rve.a(parcel, rzd.CREATOR);
                    boolean g = rve.g(parcel);
                    ITokenizationCallback asInterface6 = ITokenizationCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback tokenInfo = getTokenInfo(rzdVar4, g, asInterface6);
                    parcel2.writeNoException();
                    rve.f(parcel2, tokenInfo);
                    return true;
                default:
                    return false;
            }
        }
    }

    int getApiVersion();

    @Deprecated
    ICancellationCallback getTokenCount(String str, ITokenizationCallback iTokenizationCallback);

    ICancellationCallback getTokenInfo(rzd rzdVar, boolean z, ITokenizationCallback iTokenizationCallback);

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(rzd rzdVar, ISummarizationResultCallback iSummarizationResultCallback);

    ICancellationCallback runCancellableInferenceWithInfo(rzd rzdVar, ISummarizationResultWithInfoCallback iSummarizationResultWithInfoCallback);

    @Deprecated
    void runInference(rzd rzdVar, ISummarizationResultCallback iSummarizationResultCallback);
}
