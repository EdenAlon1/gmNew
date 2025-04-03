package com.google.android.gms.auth.account.data;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IHasCapabilitiesCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IHasCapabilitiesCallback {
        static final int TRANSACTION_onResponse = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IHasCapabilitiesCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.data.IHasCapabilitiesCallback");
            }

            @Override // com.google.android.gms.auth.account.data.IHasCapabilitiesCallback
            public void onResponse(Status status, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.data.IHasCapabilitiesCallback");
        }

        public static IHasCapabilitiesCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IHasCapabilitiesCallback");
            return queryLocalInterface instanceof IHasCapabilitiesCallback ? (IHasCapabilitiesCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onResponse(status, readInt);
            return true;
        }
    }

    void onResponse(Status status, int i);
}
