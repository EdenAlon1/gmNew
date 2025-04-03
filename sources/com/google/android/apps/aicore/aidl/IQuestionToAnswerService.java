package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.IPrepareInferenceEngineCallback;
import com.google.android.apps.aicore.aidl.IQuestionToAnswerResultWithInfoCallback;
import defpackage.rve;
import defpackage.rxt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IQuestionToAnswerService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IQuestionToAnswerService {
        static final int TRANSACTION_getApiVersion = 4;
        static final int TRANSACTION_prepareInferenceEngine = 3;
        static final int TRANSACTION_runCancellableInferenceWithInfo = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IQuestionToAnswerService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IQuestionToAnswerService");
            }

            @Override // com.google.android.apps.aicore.aidl.IQuestionToAnswerService
            public int getApiVersion() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.apps.aicore.aidl.IQuestionToAnswerService
            public ICancellationCallback prepareInferenceEngine(IPrepareInferenceEngineCallback iPrepareInferenceEngineCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPrepareInferenceEngineCallback);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.apps.aicore.aidl.IQuestionToAnswerService
            public ICancellationCallback runCancellableInferenceWithInfo(rxt rxtVar, IQuestionToAnswerResultWithInfoCallback iQuestionToAnswerResultWithInfoCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rxtVar);
                rve.f(obtainAndWriteInterfaceToken, iQuestionToAnswerResultWithInfoCallback);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                ICancellationCallback asInterface = ICancellationCallback.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IQuestionToAnswerService");
        }

        public static IQuestionToAnswerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IQuestionToAnswerService");
            return queryLocalInterface instanceof IQuestionToAnswerService ? (IQuestionToAnswerService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                rxt rxtVar = (rxt) rve.a(parcel, rxt.CREATOR);
                IQuestionToAnswerResultWithInfoCallback asInterface = IQuestionToAnswerResultWithInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                ICancellationCallback runCancellableInferenceWithInfo = runCancellableInferenceWithInfo(rxtVar, asInterface);
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

    ICancellationCallback runCancellableInferenceWithInfo(rxt rxtVar, IQuestionToAnswerResultWithInfoCallback iQuestionToAnswerResultWithInfoCallback);
}
