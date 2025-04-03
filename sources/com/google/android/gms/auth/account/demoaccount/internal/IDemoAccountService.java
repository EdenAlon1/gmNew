package com.google.android.gms.auth.account.demoaccount.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.account.demoaccount.SetUpDemoAccountRequest;
import com.google.android.gms.auth.account.demoaccount.internal.ISetUpDemoAccountResponseCallback;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IDemoAccountService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IDemoAccountService {
        static final int TRANSACTION_cleanUpDemoAccount = 2;
        static final int TRANSACTION_setUpDemoAccount = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IDemoAccountService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.demoaccount.internal.IDemoAccountService");
            }

            @Override // com.google.android.gms.auth.account.demoaccount.internal.IDemoAccountService
            public void cleanUpDemoAccount(IStatusCallback iStatusCallback, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.demoaccount.internal.IDemoAccountService
            public void setUpDemoAccount(ISetUpDemoAccountResponseCallback iSetUpDemoAccountResponseCallback, SetUpDemoAccountRequest setUpDemoAccountRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iSetUpDemoAccountResponseCallback);
                rve.d(obtainAndWriteInterfaceToken, setUpDemoAccountRequest);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.demoaccount.internal.IDemoAccountService");
        }

        public static IDemoAccountService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.demoaccount.internal.IDemoAccountService");
            return queryLocalInterface instanceof IDemoAccountService ? (IDemoAccountService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ISetUpDemoAccountResponseCallback asInterface = ISetUpDemoAccountResponseCallback.Stub.asInterface(parcel.readStrongBinder());
                SetUpDemoAccountRequest setUpDemoAccountRequest = (SetUpDemoAccountRequest) rve.a(parcel, SetUpDemoAccountRequest.CREATOR);
                enforceNoDataAvail(parcel);
                setUpDemoAccount(asInterface, setUpDemoAccountRequest);
            } else {
                if (i != 2) {
                    return false;
                }
                IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                cleanUpDemoAccount(asInterface2, readString);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void cleanUpDemoAccount(IStatusCallback iStatusCallback, String str);

    void setUpDemoAccount(ISetUpDemoAccountResponseCallback iSetUpDemoAccountResponseCallback, SetUpDemoAccountRequest setUpDemoAccountRequest);
}
