package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rvy;
import defpackage.rxx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IQuestionToAnswerResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IQuestionToAnswerResultWithInfoCallback {
        static final int TRANSACTION_onQuestionToAnswerInferenceFailure = 3;
        static final int TRANSACTION_onQuestionToAnswerInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IQuestionToAnswerResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IQuestionToAnswerResultWithInfoCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IQuestionToAnswerResultWithInfoCallback
            public void onQuestionToAnswerInferenceFailure(rvy rvyVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvyVar);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IQuestionToAnswerResultWithInfoCallback
            public void onQuestionToAnswerInferenceSuccess(rxx rxxVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rxxVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IQuestionToAnswerResultWithInfoCallback");
        }

        public static IQuestionToAnswerResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IQuestionToAnswerResultWithInfoCallback");
            return queryLocalInterface instanceof IQuestionToAnswerResultWithInfoCallback ? (IQuestionToAnswerResultWithInfoCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                rxx rxxVar = (rxx) rve.a(parcel, rxx.CREATOR);
                enforceNoDataAvail(parcel);
                onQuestionToAnswerInferenceSuccess(rxxVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            rvy rvyVar = (rvy) rve.a(parcel, rvy.CREATOR);
            enforceNoDataAvail(parcel);
            onQuestionToAnswerInferenceFailure(rvyVar);
            return true;
        }
    }

    void onQuestionToAnswerInferenceFailure(rvy rvyVar);

    void onQuestionToAnswerInferenceSuccess(rxx rxxVar);
}
