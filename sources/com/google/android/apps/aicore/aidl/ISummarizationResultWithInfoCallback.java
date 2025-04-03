package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rvy;
import defpackage.rzf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISummarizationResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISummarizationResultWithInfoCallback {
        static final int TRANSACTION_onSummarizationInferenceFailure = 3;
        static final int TRANSACTION_onSummarizationInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISummarizationResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ISummarizationResultWithInfoCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationResultWithInfoCallback
            public void onSummarizationInferenceFailure(rvy rvyVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvyVar);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ISummarizationResultWithInfoCallback
            public void onSummarizationInferenceSuccess(rzf rzfVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rzfVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ISummarizationResultWithInfoCallback");
        }

        public static ISummarizationResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISummarizationResultWithInfoCallback");
            return queryLocalInterface instanceof ISummarizationResultWithInfoCallback ? (ISummarizationResultWithInfoCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                rzf rzfVar = (rzf) rve.a(parcel, rzf.CREATOR);
                enforceNoDataAvail(parcel);
                onSummarizationInferenceSuccess(rzfVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            rvy rvyVar = (rvy) rve.a(parcel, rvy.CREATOR);
            enforceNoDataAvail(parcel);
            onSummarizationInferenceFailure(rvyVar);
            return true;
        }
    }

    void onSummarizationInferenceFailure(rvy rvyVar);

    void onSummarizationInferenceSuccess(rzf rzfVar);
}
