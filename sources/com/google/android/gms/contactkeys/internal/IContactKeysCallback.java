package com.google.android.gms.contactkeys.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.contactkeys.E2eeContactKeyListParcelable;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IContactKeysCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IContactKeysCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IContactKeysCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.contactkeys.internal.IContactKeysCallback");
            }

            @Override // com.google.android.gms.contactkeys.internal.IContactKeysCallback
            public void onResult(Status status, E2eeContactKeyListParcelable e2eeContactKeyListParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, e2eeContactKeyListParcelable);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.contactkeys.internal.IContactKeysCallback");
        }

        public static IContactKeysCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contactkeys.internal.IContactKeysCallback");
            return queryLocalInterface instanceof IContactKeysCallback ? (IContactKeysCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            E2eeContactKeyListParcelable e2eeContactKeyListParcelable = (E2eeContactKeyListParcelable) rve.a(parcel, E2eeContactKeyListParcelable.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, e2eeContactKeyListParcelable);
            return true;
        }
    }

    void onResult(Status status, E2eeContactKeyListParcelable e2eeContactKeyListParcelable);
}
