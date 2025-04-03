package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rzz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITextEmbeddingResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITextEmbeddingResultCallback {
        static final int TRANSACTION_onTextEmbeddingInferenceFailure = 3;
        static final int TRANSACTION_onTextEmbeddingInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITextEmbeddingResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ITextEmbeddingResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ITextEmbeddingResultCallback
            public void onTextEmbeddingInferenceFailure(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITextEmbeddingResultCallback
            public void onTextEmbeddingInferenceSuccess(rzz rzzVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rzzVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ITextEmbeddingResultCallback");
        }

        public static ITextEmbeddingResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ITextEmbeddingResultCallback");
            return queryLocalInterface instanceof ITextEmbeddingResultCallback ? (ITextEmbeddingResultCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                rzz rzzVar = (rzz) rve.a(parcel, rzz.CREATOR);
                enforceNoDataAvail(parcel);
                onTextEmbeddingInferenceSuccess(rzzVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onTextEmbeddingInferenceFailure(readInt);
            return true;
        }
    }

    void onTextEmbeddingInferenceFailure(int i);

    void onTextEmbeddingInferenceSuccess(rzz rzzVar);
}
