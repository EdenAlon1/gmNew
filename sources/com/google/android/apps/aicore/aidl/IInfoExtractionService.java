package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IInfoExtractionResultWithInfoCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import defpackage.rve;
import defpackage.rwn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IInfoExtractionService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInfoExtractionService {
        static final int TRANSACTION_getApiVersion = 4;
        static final int TRANSACTION_prepareInferenceEngine = 3;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInfoExtractionService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IInfoExtractionService");
            }

            @Override // com.google.android.apps.aicore.aidl.IInfoExtractionService
            public int getApiVersion() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.apps.aicore.aidl.IInfoExtractionService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IInfoExtractionService
            public ICancellationCallback runCancellableInferenceWithInfo(rwn rwnVar, IInfoExtractionResultWithInfoCallback iInfoExtractionResultWithInfoCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rwnVar);
                rve.f(obtainAndWriteInterfaceToken, iInfoExtractionResultWithInfoCallback);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IInfoExtractionService");
        }

        public static IInfoExtractionService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IInfoExtractionService");
            return queryLocalInterface instanceof IInfoExtractionService ? (IInfoExtractionService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                rwn rwnVar = (rwn) rve.a(parcel, rwn.CREATOR);
                IInfoExtractionResultWithInfoCallback asInterface = IInfoExtractionResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback runCancellableInferenceWithInfo = runCancellableInferenceWithInfo(rwnVar, asInterface);
                parcel2.writeNoException();
                rve.f(parcel2, runCancellableInferenceWithInfo);
                return true;
            }
            if (i != 3) {
                if (i != 4) {
                    return false;
                }
                int apiVersion = getApiVersion();
                parcel2.writeNoException();
                parcel2.writeInt(apiVersion);
                return true;
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

    ICancellationCallback runCancellableInferenceWithInfo(rwn rwnVar, IInfoExtractionResultWithInfoCallback iInfoExtractionResultWithInfoCallback);
}
