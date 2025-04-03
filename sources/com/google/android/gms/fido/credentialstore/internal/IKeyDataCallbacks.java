package com.google.android.gms.fido.credentialstore.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.credentialstore.KeyData;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IKeyDataCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IKeyDataCallbacks {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IKeyDataCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.credentialstore.internal.IKeyDataCallbacks");
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.IKeyDataCallbacks
            public void onResult(Status status, KeyData keyData) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, keyData);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.credentialstore.internal.IKeyDataCallbacks");
        }

        public static IKeyDataCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.IKeyDataCallbacks");
            return queryLocalInterface instanceof IKeyDataCallbacks ? (IKeyDataCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            KeyData keyData = (KeyData) rve.a(parcel, KeyData.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, keyData);
            return true;
        }
    }

    void onResult(Status status, KeyData keyData);
}
