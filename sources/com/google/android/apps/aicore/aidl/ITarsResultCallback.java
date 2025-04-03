package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rzn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITarsResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITarsResultCallback {
        static final int TRANSACTION_onTarsFailure = 3;
        static final int TRANSACTION_onTarsSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITarsResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ITarsResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ITarsResultCallback
            public void onTarsFailure(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITarsResultCallback
            public void onTarsSuccess(rzn rznVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rznVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ITarsResultCallback");
        }

        public static ITarsResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ITarsResultCallback");
            return queryLocalInterface instanceof ITarsResultCallback ? (ITarsResultCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                rzn rznVar = (rzn) rve.a(parcel, rzn.CREATOR);
                enforceNoDataAvail(parcel);
                onTarsSuccess(rznVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onTarsFailure(readInt);
            return true;
        }
    }

    void onTarsFailure(int i);

    void onTarsSuccess(rzn rznVar);
}
