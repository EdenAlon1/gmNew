package com.google.android.gms.clearcut.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.clearcut.internal.IBootCountCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IBootCountService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBootCountService {
        static final int TRANSACTION_getBootCount = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBootCountService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.clearcut.internal.IBootCountService");
            }

            @Override // com.google.android.gms.clearcut.internal.IBootCountService
            public void getBootCount(IBootCountCallbacks iBootCountCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iBootCountCallbacks);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.clearcut.internal.IBootCountService");
        }

        public static IBootCountService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IBootCountService");
            return queryLocalInterface instanceof IBootCountService ? (IBootCountService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IBootCountCallbacks asInterface = IBootCountCallbacks.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            getBootCount(asInterface);
            return true;
        }
    }

    void getBootCount(IBootCountCallbacks iBootCountCallbacks);
}
