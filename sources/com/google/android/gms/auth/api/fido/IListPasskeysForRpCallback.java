package com.google.android.gms.auth.api.fido;

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
public interface IListPasskeysForRpCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IListPasskeysForRpCallback {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IListPasskeysForRpCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.fido.IListPasskeysForRpCallback");
            }

            @Override // com.google.android.gms.auth.api.fido.IListPasskeysForRpCallback
            public void onError(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.fido.IListPasskeysForRpCallback
            public void onSuccess(List list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeList(list);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.fido.IListPasskeysForRpCallback");
        }

        public static IListPasskeysForRpCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.fido.IListPasskeysForRpCallback");
            return queryLocalInterface instanceof IListPasskeysForRpCallback ? (IListPasskeysForRpCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ArrayList b = rve.b(parcel);
                enforceNoDataAvail(parcel);
                onSuccess(b);
            } else {
                if (i != 2) {
                    return false;
                }
                Status status = (Status) rve.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onError(status);
            }
            return true;
        }
    }

    void onError(Status status);

    void onSuccess(List list);
}
