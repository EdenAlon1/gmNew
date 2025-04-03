package com.google.android.gms.mdisync.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.internal.IMdiSyncCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMdiSyncService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMdiSyncService {
        static final int TRANSACTION_sync = 1;
        static final int TRANSACTION_syncWithTeleportation = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMdiSyncService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdisync.internal.IMdiSyncService");
            }

            @Override // com.google.android.gms.mdisync.internal.IMdiSyncService
            public void sync(IMdiSyncCallbacks iMdiSyncCallbacks, SyncRequest syncRequest, CallerInfo callerInfo, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMdiSyncCallbacks);
                rve.d(obtainAndWriteInterfaceToken, syncRequest);
                rve.d(obtainAndWriteInterfaceToken, callerInfo);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdisync.internal.IMdiSyncService
            public void syncWithTeleportation(IMdiSyncCallbacks iMdiSyncCallbacks, TeleportingSyncRequest teleportingSyncRequest, CallerInfo callerInfo, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMdiSyncCallbacks);
                rve.d(obtainAndWriteInterfaceToken, teleportingSyncRequest);
                rve.d(obtainAndWriteInterfaceToken, callerInfo);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdisync.internal.IMdiSyncService");
        }

        public static IMdiSyncService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncService");
            return queryLocalInterface instanceof IMdiSyncService ? (IMdiSyncService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IMdiSyncCallbacks asInterface = IMdiSyncCallbacks.Stub.asInterface(parcel.readStrongBinder());
                SyncRequest syncRequest = (SyncRequest) rve.a(parcel, SyncRequest.CREATOR);
                CallerInfo callerInfo = (CallerInfo) rve.a(parcel, CallerInfo.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                sync(asInterface, syncRequest, callerInfo, apiMetadata);
            } else {
                if (i != 2) {
                    return false;
                }
                IMdiSyncCallbacks asInterface2 = IMdiSyncCallbacks.Stub.asInterface(parcel.readStrongBinder());
                TeleportingSyncRequest teleportingSyncRequest = (TeleportingSyncRequest) rve.a(parcel, TeleportingSyncRequest.CREATOR);
                CallerInfo callerInfo2 = (CallerInfo) rve.a(parcel, CallerInfo.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                syncWithTeleportation(asInterface2, teleportingSyncRequest, callerInfo2, apiMetadata2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void sync(IMdiSyncCallbacks iMdiSyncCallbacks, SyncRequest syncRequest, CallerInfo callerInfo, ApiMetadata apiMetadata);

    void syncWithTeleportation(IMdiSyncCallbacks iMdiSyncCallbacks, TeleportingSyncRequest teleportingSyncRequest, CallerInfo callerInfo, ApiMetadata apiMetadata);
}
