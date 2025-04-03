package com.google.android.gms.auth.account.hubmode.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.account.data.IGetStringValueCallback;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICommunalProfileProxyService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICommunalProfileProxyService {
        static final int TRANSACTION_addAccount = 1;
        static final int TRANSACTION_getAndroidId = 4;
        static final int TRANSACTION_getDeviceAccountId = 3;
        static final int TRANSACTION_removeAccount = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICommunalProfileProxyService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.hubmode.internal.ICommunalProfileProxyService");
            }

            @Override // com.google.android.gms.auth.account.hubmode.internal.ICommunalProfileProxyService
            public void addAccount(IStatusCallback iStatusCallback, Account account, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.hubmode.internal.ICommunalProfileProxyService
            public void getAndroidId(IGetStringValueCallback iGetStringValueCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iGetStringValueCallback);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.hubmode.internal.ICommunalProfileProxyService
            public void getDeviceAccountId(IGetStringValueCallback iGetStringValueCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iGetStringValueCallback);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.hubmode.internal.ICommunalProfileProxyService
            public void removeAccount(IStatusCallback iStatusCallback, Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.hubmode.internal.ICommunalProfileProxyService");
        }

        public static ICommunalProfileProxyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.hubmode.internal.ICommunalProfileProxyService");
            return queryLocalInterface instanceof ICommunalProfileProxyService ? (ICommunalProfileProxyService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                Account account = (Account) rve.a(parcel, Account.CREATOR);
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                addAccount(asInterface, account, readString);
            } else if (i == 2) {
                IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                Account account2 = (Account) rve.a(parcel, Account.CREATOR);
                enforceNoDataAvail(parcel);
                removeAccount(asInterface2, account2);
            } else if (i == 3) {
                IGetStringValueCallback asInterface3 = IGetStringValueCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getDeviceAccountId(asInterface3);
            } else {
                if (i != 4) {
                    return false;
                }
                IGetStringValueCallback asInterface4 = IGetStringValueCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getAndroidId(asInterface4);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addAccount(IStatusCallback iStatusCallback, Account account, String str);

    void getAndroidId(IGetStringValueCallback iGetStringValueCallback);

    void getDeviceAccountId(IGetStringValueCallback iGetStringValueCallback);

    void removeAccount(IStatusCallback iStatusCallback, Account account);
}
