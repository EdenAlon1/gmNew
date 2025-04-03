package com.google.android.gms.contactkeys.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.contactkeys.E2eeContactKeyParcelable;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IContactKeyCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IContactKeyCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IContactKeyCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.contactkeys.internal.IContactKeyCallback");
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeyCallback
            public void onResult(Status status, E2eeContactKeyParcelable e2eeContactKeyParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, e2eeContactKeyParcelable);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.contactkeys.internal.IContactKeyCallback");
        }

        public static IContactKeyCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contactkeys.internal.IContactKeyCallback");
            return queryLocalInterface instanceof IContactKeyCallback ? (IContactKeyCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            E2eeContactKeyParcelable e2eeContactKeyParcelable = (E2eeContactKeyParcelable) rve.a(parcel, E2eeContactKeyParcelable.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, e2eeContactKeyParcelable);
            return true;
        }
    }

    void onResult(Status status, E2eeContactKeyParcelable e2eeContactKeyParcelable);
}
