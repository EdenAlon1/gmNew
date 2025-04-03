package com.google.android.gms.auth.folsom.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IKeyRetrievalSyncStatusCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IKeyRetrievalSyncStatusCallback {
        static final int TRANSACTION_onSyncStatusResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IKeyRetrievalSyncStatusCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback");
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback
            public void onSyncStatusResult(Status status, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback");
        }

        public static IKeyRetrievalSyncStatusCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalSyncStatusCallback");
            return queryLocalInterface instanceof IKeyRetrievalSyncStatusCallback ? (IKeyRetrievalSyncStatusCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onSyncStatusResult(status, readInt);
            return true;
        }
    }

    void onSyncStatusResult(Status status, int i);
}
