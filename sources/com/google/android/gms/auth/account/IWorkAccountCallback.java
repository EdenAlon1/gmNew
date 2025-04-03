package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IWorkAccountCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IWorkAccountCallback {
        static final int TRANSACTION_onAccountAdded = 1;
        static final int TRANSACTION_onAccountRemoved = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IWorkAccountCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.IWorkAccountCallback");
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountCallback
            public void onAccountAdded(Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, account);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.IWorkAccountCallback
            public void onAccountRemoved(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.IWorkAccountCallback");
        }

        public static IWorkAccountCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountCallback");
            return queryLocalInterface instanceof IWorkAccountCallback ? (IWorkAccountCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Account account = (Account) rve.a(parcel, Account.CREATOR);
                enforceNoDataAvail(parcel);
                onAccountAdded(account);
            } else {
                if (i != 2) {
                    return false;
                }
                boolean g = rve.g(parcel);
                enforceNoDataAvail(parcel);
                onAccountRemoved(g);
            }
            return true;
        }
    }

    void onAccountAdded(Account account);

    void onAccountRemoved(boolean z);
}
