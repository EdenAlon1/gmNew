package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rvy;
import defpackage.rwe;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IImageDescriptionResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IImageDescriptionResultWithInfoCallback {
        static final int TRANSACTION_onImageDescriptionFailure = 3;
        static final int TRANSACTION_onImageDescriptionSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IImageDescriptionResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IImageDescriptionResultWithInfoCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionResultWithInfoCallback
            public void onImageDescriptionFailure(rvy rvyVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvyVar);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionResultWithInfoCallback
            public void onImageDescriptionSuccess(rwe rweVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rweVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IImageDescriptionResultWithInfoCallback");
        }

        public static IImageDescriptionResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IImageDescriptionResultWithInfoCallback");
            return queryLocalInterface instanceof IImageDescriptionResultWithInfoCallback ? (IImageDescriptionResultWithInfoCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                rwe rweVar = (rwe) rve.a(parcel, rwe.CREATOR);
                enforceNoDataAvail(parcel);
                onImageDescriptionSuccess(rweVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            rvy rvyVar = (rvy) rve.a(parcel, rvy.CREATOR);
            enforceNoDataAvail(parcel);
            onImageDescriptionFailure(rvyVar);
            return true;
        }
    }

    void onImageDescriptionFailure(rvy rvyVar);

    void onImageDescriptionSuccess(rwe rweVar);
}
