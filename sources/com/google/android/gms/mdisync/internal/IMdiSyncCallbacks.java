package com.google.android.gms.mdisync.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMdiSyncCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMdiSyncCallbacks {
        static final int TRANSACTION_onSyncComplete = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMdiSyncCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
            }

            @Override // com.google.android.gms.mdisync.internal.IMdiSyncCallbacks
            public void onSyncComplete(Status status, SyncResult syncResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, syncResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
        }

        public static IMdiSyncCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
            return queryLocalInterface instanceof IMdiSyncCallbacks ? (IMdiSyncCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            SyncResult syncResult = (SyncResult) rve.a(parcel, SyncResult.CREATOR);
            enforceNoDataAvail(parcel);
            onSyncComplete(status, syncResult);
            return true;
        }
    }

    void onSyncComplete(Status status, SyncResult syncResult);
}
