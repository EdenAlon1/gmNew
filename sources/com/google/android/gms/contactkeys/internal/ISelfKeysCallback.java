package com.google.android.gms.contactkeys.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.contactkeys.E2eeSelfKeyListParcelable;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISelfKeysCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISelfKeysCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISelfKeysCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.contactkeys.internal.ISelfKeysCallback");
            }

            @Override // com.google.android.gms.contactkeys.internal.ISelfKeysCallback
            public void onResult(Status status, E2eeSelfKeyListParcelable e2eeSelfKeyListParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, e2eeSelfKeyListParcelable);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.contactkeys.internal.ISelfKeysCallback");
        }

        public static ISelfKeysCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.contactkeys.internal.ISelfKeysCallback");
            return queryLocalInterface instanceof ISelfKeysCallback ? (ISelfKeysCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            E2eeSelfKeyListParcelable e2eeSelfKeyListParcelable = (E2eeSelfKeyListParcelable) rve.a(parcel, E2eeSelfKeyListParcelable.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, e2eeSelfKeyListParcelable);
            return true;
        }
    }

    void onResult(Status status, E2eeSelfKeyListParcelable e2eeSelfKeyListParcelable);
}
