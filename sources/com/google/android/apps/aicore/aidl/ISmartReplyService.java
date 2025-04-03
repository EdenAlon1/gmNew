package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.ISmartReplyResultCallback;
import com.google.android.apps.aicore.aidl.ISmartReplyResultWithInfoCallback;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import defpackage.rve;
import defpackage.ryj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISmartReplyService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISmartReplyService {
        static final int TRANSACTION_getApiVersion = 4;
        static final int TRANSACTION_getTokenCount = 7;
        static final int TRANSACTION_getTokenInfo = 8;
        static final int TRANSACTION_prepareInferenceEngine = 5;
        static final int TRANSACTION_runCancellableInference = 3;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 6;
        static final int TRANSACTION_runInference = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISmartReplyService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ISmartReplyService");
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public int getApiVersion() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public ICancellationCallback getTokenCount(String str, ITokenizationCallback iTokenizationCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.f(obtainAndWriteInterfaceToken, iTokenizationCallback);
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public ICancellationCallback getTokenInfo(ryj ryjVar, boolean z, ITokenizationCallback iTokenizationCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, ryjVar);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.f(obtainAndWriteInterfaceToken, iTokenizationCallback);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public ICancellationCallback runCancellableInference(ryj ryjVar, ISmartReplyResultCallback iSmartReplyResultCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, ryjVar);
                rve.f(obtainAndWriteInterfaceToken, iSmartReplyResultCallback);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public ICancellationCallback runCancellableInferenceWithInfo(ryj ryjVar, ISmartReplyResultWithInfoCallback iSmartReplyResultWithInfoCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, ryjVar);
                rve.f(obtainAndWriteInterfaceToken, iSmartReplyResultWithInfoCallback);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyService
            public void runInference(ryj ryjVar, ISmartReplyResultCallback iSmartReplyResultCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, ryjVar);
                rve.f(obtainAndWriteInterfaceToken, iSmartReplyResultCallback);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ISmartReplyService");
        }

        public static ISmartReplyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISmartReplyService");
            return queryLocalInterface instanceof ISmartReplyService ? (ISmartReplyService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    ryj ryjVar = (ryj) rve.a(parcel, ryj.CREATOR);
                    ISmartReplyResultCallback asInterface = ISmartReplyResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    runInference(ryjVar, asInterface);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    ryj ryjVar2 = (ryj) rve.a(parcel, ryj.CREATOR);
                    ISmartReplyResultCallback asInterface2 = ISmartReplyResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback runCancellableInference = runCancellableInference(ryjVar2, asInterface2);
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
                    ryj ryjVar3 = (ryj) rve.a(parcel, ryj.CREATOR);
                    ISmartReplyResultWithInfoCallback asInterface4 = ISmartReplyResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback runCancellableInferenceWithInfo = runCancellableInferenceWithInfo(ryjVar3, asInterface4);
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
                    ryj ryjVar4 = (ryj) rve.a(parcel, ryj.CREATOR);
                    boolean g = rve.g(parcel);
                    ITokenizationCallback asInterface6 = ITokenizationCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    ICancellationCallback tokenInfo = getTokenInfo(ryjVar4, g, asInterface6);
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

    ICancellationCallback getTokenInfo(ryj ryjVar, boolean z, ITokenizationCallback iTokenizationCallback);

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(ryj ryjVar, ISmartReplyResultCallback iSmartReplyResultCallback);

    ICancellationCallback runCancellableInferenceWithInfo(ryj ryjVar, ISmartReplyResultWithInfoCallback iSmartReplyResultWithInfoCallback);

    @Deprecated
    void runInference(ryj ryjVar, ISmartReplyResultCallback iSmartReplyResultCallback);
}
