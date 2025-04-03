package com.google.android.gms.clearcut.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IBootCountCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBootCountCallbacks {
        static final int TRANSACTION_onGetBootCount = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBootCountCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.clearcut.internal.IBootCountCallbacks");
            }

            @Override // com.google.android.gms.clearcut.internal.IBootCountCallbacks
            public void onGetBootCount(Status status, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.clearcut.internal.IBootCountCallbacks");
        }

        public static IBootCountCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IBootCountCallbacks");
            return queryLocalInterface instanceof IBootCountCallbacks ? (IBootCountCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onGetBootCount(status, readInt);
            return true;
        }
    }

    void onGetBootCount(Status status, int i);
}
