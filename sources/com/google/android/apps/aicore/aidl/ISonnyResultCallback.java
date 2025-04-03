package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.ryp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISonnyResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISonnyResultCallback {
        static final int TRANSACTION_onSonnyFailure = 3;
        static final int TRANSACTION_onSonnySuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISonnyResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ISonnyResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ISonnyResultCallback
            public void onSonnyFailure(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ISonnyResultCallback
            public void onSonnySuccess(ryp rypVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rypVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ISonnyResultCallback");
        }

        public static ISonnyResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISonnyResultCallback");
            return queryLocalInterface instanceof ISonnyResultCallback ? (ISonnyResultCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                ryp rypVar = (ryp) rve.a(parcel, ryp.CREATOR);
                enforceNoDataAvail(parcel);
                onSonnySuccess(rypVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onSonnyFailure(readInt);
            return true;
        }
    }

    void onSonnyFailure(int i);

    void onSonnySuccess(ryp rypVar);
}
