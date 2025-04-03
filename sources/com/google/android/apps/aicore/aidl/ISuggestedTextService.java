package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback;
import com.google.android.apps.aicore.aidl.ISuggestedTextResultWithInfoCallback;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import defpackage.rve;
import defpackage.ryv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISuggestedTextService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISuggestedTextService {
        static final int TRANSACTION_getApiVersion = 3;
        static final int TRANSACTION_getTokenInfo = 6;
        static final int TRANSACTION_prepareInferenceEngine = 4;
        static final int TRANSACTION_runCancellableInference = 2;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISuggestedTextService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ISuggestedTextService");
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextService
            public int getApiVersion() {
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextService
            public ICancellationCallback getTokenInfo(ryv ryvVar, boolean z, ITokenizationCallback iTokenizationCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, ryvVar);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.f(obtainAndWriteInterfaceToken, iTokenizationCallback);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextService
            public ICancellationCallback runCancellableInference(ryv ryvVar, ISuggestedTextResultCallback iSuggestedTextResultCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, ryvVar);
                rve.f(obtainAndWriteInterfaceToken, iSuggestedTextResultCallback);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextService
            public ICancellationCallback runCancellableInferenceWithInfo(ryv ryvVar, ISuggestedTextResultWithInfoCallback iSuggestedTextResultWithInfoCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, ryvVar);
                rve.f(obtainAndWriteInterfaceToken, iSuggestedTextResultWithInfoCallback);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ISuggestedTextService");
        }

        public static ISuggestedTextService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISuggestedTextService");
            return queryLocalInterface instanceof ISuggestedTextService ? (ISuggestedTextService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                ryv ryvVar = (ryv) rve.a(parcel, ryv.CREATOR);
                ISuggestedTextResultCallback asInterface = ISuggestedTextResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback runCancellableInference = runCancellableInference(ryvVar, asInterface);
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
            if (i == 4) {
                IPrepareInferenceEngineCallback asInterface2 = IPrepareInferenceEngineCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback prepareInferenceEngine = prepareInferenceEngine(asInterface2);
                parcel2.writeNoException();
                rve.f(parcel2, prepareInferenceEngine);
                return true;
            }
            if (i == 5) {
                ryv ryvVar2 = (ryv) rve.a(parcel, ryv.CREATOR);
                ISuggestedTextResultWithInfoCallback asInterface3 = ISuggestedTextResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback runCancellableInferenceWithInfo = runCancellableInferenceWithInfo(ryvVar2, asInterface3);
                parcel2.writeNoException();
                rve.f(parcel2, runCancellableInferenceWithInfo);
                return true;
            }
            if (i != 6) {
                return false;
            }
            ryv ryvVar3 = (ryv) rve.a(parcel, ryv.CREATOR);
            boolean g = rve.g(parcel);
            ITokenizationCallback asInterface4 = ITokenizationCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            ICancellationCallback tokenInfo = getTokenInfo(ryvVar3, g, asInterface4);
            parcel2.writeNoException();
            rve.f(parcel2, tokenInfo);
            return true;
        }
    }

    int getApiVersion();

    ICancellationCallback getTokenInfo(ryv ryvVar, boolean z, ITokenizationCallback iTokenizationCallback);

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(ryv ryvVar, ISuggestedTextResultCallback iSuggestedTextResultCallback);

    ICancellationCallback runCancellableInferenceWithInfo(ryv ryvVar, ISuggestedTextResultWithInfoCallback iSuggestedTextResultWithInfoCallback);
}
