package com.google.android.gms.auth.proximity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetMyPublicKeyCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetMyPublicKeyCallback {
        static final int TRANSACTION_onFetchedPublicKey = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetMyPublicKeyCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.proximity.internal.IGetMyPublicKeyCallback");
            }

            @Override // com.google.android.gms.auth.proximity.internal.IGetMyPublicKeyCallback
            public void onFetchedPublicKey(Status status, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.proximity.internal.IGetMyPublicKeyCallback");
        }

        public static IGetMyPublicKeyCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IGetMyPublicKeyCallback");
            return queryLocalInterface instanceof IGetMyPublicKeyCallback ? (IGetMyPublicKeyCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            byte[] createByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            onFetchedPublicKey(status, createByteArray);
            return true;
        }
    }

    void onFetchedPublicKey(Status status, byte[] bArr);
}
