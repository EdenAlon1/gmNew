package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rvy;
import defpackage.ryl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISmartReplyResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISmartReplyResultWithInfoCallback {
        static final int TRANSACTION_onSmartReplyInferenceFailure = 3;
        static final int TRANSACTION_onSmartReplyInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISmartReplyResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ISmartReplyResultWithInfoCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyResultWithInfoCallback
            public void onSmartReplyInferenceFailure(rvy rvyVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvyVar);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyResultWithInfoCallback
            public void onSmartReplyInferenceSuccess(ryl rylVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rylVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ISmartReplyResultWithInfoCallback");
        }

        public static ISmartReplyResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISmartReplyResultWithInfoCallback");
            return queryLocalInterface instanceof ISmartReplyResultWithInfoCallback ? (ISmartReplyResultWithInfoCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                ryl rylVar = (ryl) rve.a(parcel, ryl.CREATOR);
                enforceNoDataAvail(parcel);
                onSmartReplyInferenceSuccess(rylVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            rvy rvyVar = (rvy) rve.a(parcel, rvy.CREATOR);
            enforceNoDataAvail(parcel);
            onSmartReplyInferenceFailure(rvyVar);
            return true;
        }
    }

    void onSmartReplyInferenceFailure(rvy rvyVar);

    void onSmartReplyInferenceSuccess(ryl rylVar);
}
