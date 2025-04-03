package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rvy;
import defpackage.rwp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IInfoExtractionResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInfoExtractionResultWithInfoCallback {
        static final int TRANSACTION_onInfoExtractionInferenceFailure = 3;
        static final int TRANSACTION_onInfoExtractionInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInfoExtractionResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IInfoExtractionResultWithInfoCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IInfoExtractionResultWithInfoCallback
            public void onInfoExtractionInferenceFailure(rvy rvyVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvyVar);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IInfoExtractionResultWithInfoCallback
            public void onInfoExtractionInferenceSuccess(rwp rwpVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rwpVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IInfoExtractionResultWithInfoCallback");
        }

        public static IInfoExtractionResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IInfoExtractionResultWithInfoCallback");
            return queryLocalInterface instanceof IInfoExtractionResultWithInfoCallback ? (IInfoExtractionResultWithInfoCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                rwp rwpVar = (rwp) rve.a(parcel, rwp.CREATOR);
                enforceNoDataAvail(parcel);
                onInfoExtractionInferenceSuccess(rwpVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            rvy rvyVar = (rvy) rve.a(parcel, rvy.CREATOR);
            enforceNoDataAvail(parcel);
            onInfoExtractionInferenceFailure(rvyVar);
            return true;
        }
    }

    void onInfoExtractionInferenceFailure(rvy rvyVar);

    void onInfoExtractionInferenceSuccess(rwp rwpVar);
}
