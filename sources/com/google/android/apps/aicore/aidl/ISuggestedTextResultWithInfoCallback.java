package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rvy;
import defpackage.ryx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISuggestedTextResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISuggestedTextResultWithInfoCallback {
        static final int TRANSACTION_onSuggestedTextInferenceFailure = 3;
        static final int TRANSACTION_onSuggestedTextInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISuggestedTextResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ISuggestedTextResultWithInfoCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextResultWithInfoCallback
            public void onSuggestedTextInferenceFailure(rvy rvyVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvyVar);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextResultWithInfoCallback
            public void onSuggestedTextInferenceSuccess(ryx ryxVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, ryxVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ISuggestedTextResultWithInfoCallback");
        }

        public static ISuggestedTextResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISuggestedTextResultWithInfoCallback");
            return queryLocalInterface instanceof ISuggestedTextResultWithInfoCallback ? (ISuggestedTextResultWithInfoCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                ryx ryxVar = (ryx) rve.a(parcel, ryx.CREATOR);
                enforceNoDataAvail(parcel);
                onSuggestedTextInferenceSuccess(ryxVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            rvy rvyVar = (rvy) rve.a(parcel, rvy.CREATOR);
            enforceNoDataAvail(parcel);
            onSuggestedTextInferenceFailure(rvyVar);
            return true;
        }
    }

    void onSuggestedTextInferenceFailure(rvy rvyVar);

    void onSuggestedTextInferenceSuccess(ryx ryxVar);
}
