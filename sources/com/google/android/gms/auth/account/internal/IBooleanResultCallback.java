package com.google.android.gms.auth.account.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IBooleanResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBooleanResultCallback {
        static final int TRANSACTION_onResult = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBooleanResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.internal.IBooleanResultCallback");
            }

            @Override // com.google.android.gms.auth.account.internal.IBooleanResultCallback
            public void onResult(int i, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                int i2 = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.internal.IBooleanResultCallback");
        }

        public static IBooleanResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.internal.IBooleanResultCallback");
            return queryLocalInterface instanceof IBooleanResultCallback ? (IBooleanResultCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            int readInt = parcel.readInt();
            boolean g = rve.g(parcel);
            enforceNoDataAvail(parcel);
            onResult(readInt, g);
            return true;
        }
    }

    void onResult(int i, boolean z);
}
