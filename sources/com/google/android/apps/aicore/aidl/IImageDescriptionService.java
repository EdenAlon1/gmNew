package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IImageDescriptionResultCallback;
import com.google.android.apps.aicore.aidl.IImageDescriptionResultWithInfoCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import defpackage.rve;
import defpackage.rwc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IImageDescriptionService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IImageDescriptionService {
        static final int TRANSACTION_getApiVersion = 4;
        static final int TRANSACTION_prepareInferenceEngine = 3;
        static final int TRANSACTION_runCancellableInference = 2;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IImageDescriptionService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IImageDescriptionService");
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionService
            public int getApiVersion() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionService
            public ICancellationCallback runCancellableInference(rwc rwcVar, IImageDescriptionResultCallback iImageDescriptionResultCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rwcVar);
                rve.f(obtainAndWriteInterfaceToken, iImageDescriptionResultCallback);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionService
            public ICancellationCallback runCancellableInferenceWithInfo(rwc rwcVar, IImageDescriptionResultWithInfoCallback iImageDescriptionResultWithInfoCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rwcVar);
                rve.f(obtainAndWriteInterfaceToken, iImageDescriptionResultWithInfoCallback);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IImageDescriptionService");
        }

        public static IImageDescriptionService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IImageDescriptionService");
            return queryLocalInterface instanceof IImageDescriptionService ? (IImageDescriptionService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                rwc rwcVar = (rwc) rve.a(parcel, rwc.CREATOR);
                IImageDescriptionResultCallback asInterface = IImageDescriptionResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback runCancellableInference = runCancellableInference(rwcVar, asInterface);
                parcel2.writeNoException();
                rve.f(parcel2, runCancellableInference);
                return true;
            }
            if (i == 3) {
                IPrepareInferenceEngineCallback asInterface2 = IPrepareInferenceEngineCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback prepareInferenceEngine = prepareInferenceEngine(asInterface2);
                parcel2.writeNoException();
                rve.f(parcel2, prepareInferenceEngine);
                return true;
            }
            if (i == 4) {
                int apiVersion = getApiVersion();
                parcel2.writeNoException();
                parcel2.writeInt(apiVersion);
                return true;
            }
            if (i != 5) {
                return false;
            }
            rwc rwcVar2 = (rwc) rve.a(parcel, rwc.CREATOR);
            IImageDescriptionResultWithInfoCallback asInterface3 = IImageDescriptionResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            ICancellationCallback runCancellableInferenceWithInfo = runCancellableInferenceWithInfo(rwcVar2, asInterface3);
            parcel2.writeNoException();
            rve.f(parcel2, runCancellableInferenceWithInfo);
            return true;
        }
    }

    int getApiVersion();

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(rwc rwcVar, IImageDescriptionResultCallback iImageDescriptionResultCallback);

    ICancellationCallback runCancellableInferenceWithInfo(rwc rwcVar, IImageDescriptionResultWithInfoCallback iImageDescriptionResultWithInfoCallback);
}
