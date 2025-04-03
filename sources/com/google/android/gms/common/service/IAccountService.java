package com.google.android.gms.common.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAccountService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAccountService {
        static final int TRANSACTION_clearSelectedAccount = 2;
        static final int TRANSACTION_resolveAccountName = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAccountService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.service.IAccountService");
            }

            @Override // com.google.android.gms.common.service.IAccountService
            public void clearSelectedAccount(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.service.IAccountService
            public String resolveAccountName(String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }
        }

        public Stub() {
            super("com.google.android.gms.common.service.IAccountService");
        }

        public static IAccountService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.service.IAccountService");
            return queryLocalInterface instanceof IAccountService ? (IAccountService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                enforceNoDataAvail(parcel);
                String resolveAccountName = resolveAccountName(readString, readString2);
                parcel2.writeNoException();
                parcel2.writeString(resolveAccountName);
            } else {
                if (i != 2) {
                    return false;
                }
                String readString3 = parcel.readString();
                enforceNoDataAvail(parcel);
                clearSelectedAccount(readString3);
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void clearSelectedAccount(String str);

    String resolveAccountName(String str, String str2);
}
