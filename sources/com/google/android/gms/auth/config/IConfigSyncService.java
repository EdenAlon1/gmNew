package com.google.android.gms.auth.config;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IConfigSyncService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IConfigSyncService {
        static final int TRANSACTION_doInitialConfigSync = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IConfigSyncService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.config.IConfigSyncService");
            }

            @Override // com.google.android.gms.auth.config.IConfigSyncService
            public void doInitialConfigSync(IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.config.IConfigSyncService");
        }

        public static IConfigSyncService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.config.IConfigSyncService");
            return queryLocalInterface instanceof IConfigSyncService ? (IConfigSyncService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            doInitialConfigSync(asInterface);
            parcel2.writeNoException();
            return true;
        }
    }

    void doInitialConfigSync(IStatusCallback iStatusCallback);
}
