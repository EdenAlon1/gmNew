package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.sah;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITokenizationCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITokenizationCallback {
        static final int TRANSACTION_onTokenizationFailure = 3;
        static final int TRANSACTION_onTokenizationInfoSuccess = 4;
        static final int TRANSACTION_onTokenizationSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITokenizationCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ITokenizationCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ITokenizationCallback
            public void onTokenizationFailure(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITokenizationCallback
            public void onTokenizationInfoSuccess(sah sahVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, sahVar);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITokenizationCallback
            public void onTokenizationSuccess(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ITokenizationCallback");
        }

        public static ITokenizationCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ITokenizationCallback");
            return queryLocalInterface instanceof ITokenizationCallback ? (ITokenizationCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                onTokenizationSuccess(readInt);
                return true;
            }
            if (i == 3) {
                int readInt2 = parcel.readInt();
                enforceNoDataAvail(parcel);
                onTokenizationFailure(readInt2);
                return true;
            }
            if (i != 4) {
                return false;
            }
            sah sahVar = (sah) rve.a(parcel, sah.CREATOR);
            enforceNoDataAvail(parcel);
            onTokenizationInfoSuccess(sahVar);
            return true;
        }
    }

    void onTokenizationFailure(int i);

    void onTokenizationInfoSuccess(sah sahVar);

    @Deprecated
    void onTokenizationSuccess(int i);
}
