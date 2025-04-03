package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rzr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITextClassificationResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITextClassificationResultCallback {
        static final int TRANSACTION_onTextClassificationInferenceFailure = 3;
        static final int TRANSACTION_onTextClassificationInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITextClassificationResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ITextClassificationResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ITextClassificationResultCallback
            public void onTextClassificationInferenceFailure(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITextClassificationResultCallback
            public void onTextClassificationInferenceSuccess(rzr rzrVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rzrVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ITextClassificationResultCallback");
        }

        public static ITextClassificationResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ITextClassificationResultCallback");
            return queryLocalInterface instanceof ITextClassificationResultCallback ? (ITextClassificationResultCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                rzr rzrVar = (rzr) rve.a(parcel, rzr.CREATOR);
                enforceNoDataAvail(parcel);
                onTextClassificationInferenceSuccess(rzrVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onTextClassificationInferenceFailure(readInt);
            return true;
        }
    }

    void onTextClassificationInferenceFailure(int i);

    void onTextClassificationInferenceSuccess(rzr rzrVar);
}
