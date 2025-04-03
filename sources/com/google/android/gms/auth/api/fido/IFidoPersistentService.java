package com.google.android.gms.auth.api.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.fido.IListPasskeysForRpCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFidoPersistentService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFidoPersistentService {
        static final int TRANSACTION_listPasskeysForRp = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFidoPersistentService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.fido.IFidoPersistentService");
            }

            @Override // com.google.android.gms.auth.api.fido.IFidoPersistentService
            public void listPasskeysForRp(IListPasskeysForRpCallback iListPasskeysForRpCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iListPasskeysForRpCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.fido.IFidoPersistentService");
        }

        public static IFidoPersistentService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.fido.IFidoPersistentService");
            return queryLocalInterface instanceof IFidoPersistentService ? (IFidoPersistentService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IListPasskeysForRpCallback asInterface = IListPasskeysForRpCallback.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            enforceNoDataAvail(parcel);
            listPasskeysForRp(asInterface, readString);
            return true;
        }
    }

    void listPasskeysForRp(IListPasskeysForRpCallback iListPasskeysForRpCallback, String str);
}
