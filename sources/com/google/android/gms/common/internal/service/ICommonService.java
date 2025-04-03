package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.internal.service.ICommonCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICommonService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICommonService {
        static final int TRANSACTION_clearDefaultAccount = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICommonService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
            }

            @Override // com.google.android.gms.common.internal.service.ICommonService
            public void clearDefaultAccount(ICommonCallbacks iCommonCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iCommonCallbacks);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.internal.service.ICommonService");
        }

        public static ICommonService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
            return queryLocalInterface instanceof ICommonService ? (ICommonService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            ICommonCallbacks asInterface = ICommonCallbacks.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            clearDefaultAccount(asInterface);
            return true;
        }
    }

    void clearDefaultAccount(ICommonCallbacks iCommonCallbacks);
}
