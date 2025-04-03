package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rvy;
import defpackage.rxb;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMagicRewriteResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMagicRewriteResultWithInfoCallback {
        static final int TRANSACTION_onMagicRewriteInferenceFailure = 3;
        static final int TRANSACTION_onMagicRewriteInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMagicRewriteResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IMagicRewriteResultWithInfoCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IMagicRewriteResultWithInfoCallback
            public void onMagicRewriteInferenceFailure(rvy rvyVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvyVar);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IMagicRewriteResultWithInfoCallback
            public void onMagicRewriteInferenceSuccess(rxb rxbVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rxbVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IMagicRewriteResultWithInfoCallback");
        }

        public static IMagicRewriteResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IMagicRewriteResultWithInfoCallback");
            return queryLocalInterface instanceof IMagicRewriteResultWithInfoCallback ? (IMagicRewriteResultWithInfoCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                rxb rxbVar = (rxb) rve.a(parcel, rxb.CREATOR);
                enforceNoDataAvail(parcel);
                onMagicRewriteInferenceSuccess(rxbVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            rvy rvyVar = (rvy) rve.a(parcel, rvy.CREATOR);
            enforceNoDataAvail(parcel);
            onMagicRewriteInferenceFailure(rvyVar);
            return true;
        }
    }

    void onMagicRewriteInferenceFailure(rvy rvyVar);

    void onMagicRewriteInferenceSuccess(rxb rxbVar);
}
