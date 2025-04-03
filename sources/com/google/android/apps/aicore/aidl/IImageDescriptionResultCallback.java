package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rwe;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IImageDescriptionResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IImageDescriptionResultCallback {
        static final int TRANSACTION_onImageDescriptionFailure = 3;
        static final int TRANSACTION_onImageDescriptionSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IImageDescriptionResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IImageDescriptionResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionResultCallback
            public void onImageDescriptionFailure(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IImageDescriptionResultCallback
            public void onImageDescriptionSuccess(rwe rweVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rweVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IImageDescriptionResultCallback");
        }

        public static IImageDescriptionResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IImageDescriptionResultCallback");
            return queryLocalInterface instanceof IImageDescriptionResultCallback ? (IImageDescriptionResultCallback) queryLocalInterface : new Proxy(iBinder);
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
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onImageDescriptionFailure(readInt);
            return true;
        }
    }

    void onImageDescriptionFailure(int i);

    void onImageDescriptionSuccess(rwe rweVar);
}
