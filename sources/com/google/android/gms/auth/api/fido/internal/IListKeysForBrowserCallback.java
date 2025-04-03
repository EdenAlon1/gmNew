package com.google.android.gms.auth.api.fido.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IListKeysForBrowserCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IListKeysForBrowserCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IListKeysForBrowserCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.fido.internal.IListKeysForBrowserCallback");
            }

            @Override // com.google.android.gms.auth.api.fido.internal.IListKeysForBrowserCallback
            public void onResult(Status status, List list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeList(list);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.fido.internal.IListKeysForBrowserCallback");
        }

        public static IListKeysForBrowserCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.fido.internal.IListKeysForBrowserCallback");
            return queryLocalInterface instanceof IListKeysForBrowserCallback ? (IListKeysForBrowserCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            ArrayList b = rve.b(parcel);
            enforceNoDataAvail(parcel);
            onResult(status, b);
            return true;
        }
    }

    void onResult(Status status, List list);
}
