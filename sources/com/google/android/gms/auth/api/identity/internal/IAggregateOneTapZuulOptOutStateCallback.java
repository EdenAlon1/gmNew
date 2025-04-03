package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAggregateOneTapZuulOptOutStateCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAggregateOneTapZuulOptOutStateCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAggregateOneTapZuulOptOutStateCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAggregateOneTapZuulOptOutStateCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IAggregateOneTapZuulOptOutStateCallback
            public void onResult(Status status, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IAggregateOneTapZuulOptOutStateCallback");
        }

        public static IAggregateOneTapZuulOptOutStateCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAggregateOneTapZuulOptOutStateCallback");
            return queryLocalInterface instanceof IAggregateOneTapZuulOptOutStateCallback ? (IAggregateOneTapZuulOptOutStateCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onResult(status, readInt);
            return true;
        }
    }

    void onResult(Status status, int i);
}
