package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IHintCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.IRosieRobotResultCallback;
import com.google.android.apps.aicore.aidl.IRosieRobotResultWithInfoCallback;
import defpackage.rve;
import defpackage.rwa;
import defpackage.ryd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IRosieRobotService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IRosieRobotService {
        static final int TRANSACTION_getApiVersion = 3;
        static final int TRANSACTION_hint = 7;
        static final int TRANSACTION_prepareInferenceEngine = 4;
        static final int TRANSACTION_runCancellableInference = 2;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 6;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IRosieRobotService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IRosieRobotService");
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotService
            public int getApiVersion() {
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotService
            public ICancellationCallback hint(rwa rwaVar, IHintCallback iHintCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rwaVar);
                rve.f(obtainAndWriteInterfaceToken, iHintCallback);
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotService
            public ICancellationCallback runCancellableInference(ryd rydVar, IRosieRobotResultCallback iRosieRobotResultCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rydVar);
                rve.f(obtainAndWriteInterfaceToken, iRosieRobotResultCallback);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotService
            public ICancellationCallback runCancellableInferenceWithInfo(ryd rydVar, IRosieRobotResultWithInfoCallback iRosieRobotResultWithInfoCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rydVar);
                rve.f(obtainAndWriteInterfaceToken, iRosieRobotResultWithInfoCallback);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IRosieRobotService");
        }

        public static IRosieRobotService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IRosieRobotService");
            return queryLocalInterface instanceof IRosieRobotService ? (IRosieRobotService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                ryd rydVar = (ryd) rve.a(parcel, ryd.CREATOR);
                IRosieRobotResultCallback asInterface = IRosieRobotResultCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback runCancellableInference = runCancellableInference(rydVar, asInterface);
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
            if (i == 6) {
                ryd rydVar2 = (ryd) rve.a(parcel, ryd.CREATOR);
                IRosieRobotResultWithInfoCallback asInterface3 = IRosieRobotResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback runCancellableInferenceWithInfo = runCancellableInferenceWithInfo(rydVar2, asInterface3);
                parcel2.writeNoException();
                rve.f(parcel2, runCancellableInferenceWithInfo);
                return true;
            }
            if (i != 7) {
                return false;
            }
            rwa rwaVar = (rwa) rve.a(parcel, rwa.CREATOR);
            IHintCallback asInterface4 = IHintCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            ICancellationCallback hint = hint(rwaVar, asInterface4);
            parcel2.writeNoException();
            rve.f(parcel2, hint);
            return true;
        }
    }

    int getApiVersion();

    ICancellationCallback hint(rwa rwaVar, IHintCallback iHintCallback);

    ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback);

    ICancellationCallback runCancellableInference(ryd rydVar, IRosieRobotResultCallback iRosieRobotResultCallback);

    ICancellationCallback runCancellableInferenceWithInfo(ryd rydVar, IRosieRobotResultWithInfoCallback iRosieRobotResultWithInfoCallback);
}
