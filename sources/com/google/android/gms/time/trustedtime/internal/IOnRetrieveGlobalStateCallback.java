package com.google.android.gms.time.trustedtime.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.time.trustedtime.dto.GlobalState;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnRetrieveGlobalStateCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnRetrieveGlobalStateCallback {
        static final int TRANSACTION_onRetrieveGlobalState = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnRetrieveGlobalStateCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.time.trustedtime.internal.IOnRetrieveGlobalStateCallback");
            }

            @Override // com.google.android.gms.time.trustedtime.internal.IOnRetrieveGlobalStateCallback
            public void onRetrieveGlobalState(Status status, GlobalState globalState) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, globalState);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.time.trustedtime.internal.IOnRetrieveGlobalStateCallback");
        }

        public static IOnRetrieveGlobalStateCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.time.trustedtime.internal.IOnRetrieveGlobalStateCallback");
            return queryLocalInterface instanceof IOnRetrieveGlobalStateCallback ? (IOnRetrieveGlobalStateCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            GlobalState globalState = (GlobalState) rve.a(parcel, GlobalState.CREATOR);
            enforceNoDataAvail(parcel);
            onRetrieveGlobalState(status, globalState);
            return true;
        }
    }

    void onRetrieveGlobalState(Status status, GlobalState globalState);
}
