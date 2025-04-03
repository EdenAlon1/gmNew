package com.google.android.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.GetHubTokenInternalResponse;
import com.google.android.gms.auth.GetHubTokenRequest;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAuthManagerService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAuthManagerService {
        static final int TRANSACTION_clearToken = 2;
        static final int TRANSACTION_getAccountChangeEvents = 3;
        static final int TRANSACTION_getAccounts = 6;
        static final int TRANSACTION_getHubToken = 10;
        static final int TRANSACTION_getToken = 1;
        static final int TRANSACTION_getTokenByAccount = 5;
        static final int TRANSACTION_hasCapabilities = 9;
        static final int TRANSACTION_removeAccount = 7;
        static final int TRANSACTION_requestGoogleAccountsAccess = 8;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAuthManagerService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.auth.IAuthManagerService");
            }

            @Override // com.google.android.auth.IAuthManagerService
            public Bundle clearToken(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                Bundle bundle2 = (Bundle) rve.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle2;
            }

            @Override // com.google.android.auth.IAuthManagerService
            public AccountChangeEventsResponse getAccountChangeEvents(AccountChangeEventsRequest accountChangeEventsRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, accountChangeEventsRequest);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) rve.a(transactAndReadException, AccountChangeEventsResponse.CREATOR);
                transactAndReadException.recycle();
                return accountChangeEventsResponse;
            }

            @Override // com.google.android.auth.IAuthManagerService
            public Bundle getAccounts(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                Bundle bundle2 = (Bundle) rve.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle2;
            }

            @Override // com.google.android.auth.IAuthManagerService
            public GetHubTokenInternalResponse getHubToken(GetHubTokenRequest getHubTokenRequest, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getHubTokenRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
                GetHubTokenInternalResponse getHubTokenInternalResponse = (GetHubTokenInternalResponse) rve.a(transactAndReadException, GetHubTokenInternalResponse.CREATOR);
                transactAndReadException.recycle();
                return getHubTokenInternalResponse;
            }

            @Override // com.google.android.auth.IAuthManagerService
            public Bundle getToken(String str, String str2, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                Bundle bundle2 = (Bundle) rve.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle2;
            }

            @Override // com.google.android.auth.IAuthManagerService
            public Bundle getTokenByAccount(Account account, String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                Bundle bundle2 = (Bundle) rve.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle2;
            }

            @Override // com.google.android.auth.IAuthManagerService
            public int hasCapabilities(HasCapabilitiesRequest hasCapabilitiesRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, hasCapabilitiesRequest);
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.auth.IAuthManagerService
            public Bundle removeAccount(Account account) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, account);
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) rve.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.auth.IAuthManagerService
            public Bundle requestGoogleAccountsAccess(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) rve.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }
        }

        public Stub() {
            super("com.google.android.auth.IAuthManagerService");
        }

        public static IAuthManagerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            return queryLocalInterface instanceof IAuthManagerService ? (IAuthManagerService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    Bundle token = getToken(readString, readString2, bundle);
                    parcel2.writeNoException();
                    rve.e(parcel2, token);
                    return true;
                case 2:
                    String readString3 = parcel.readString();
                    Bundle bundle2 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    Bundle clearToken = clearToken(readString3, bundle2);
                    parcel2.writeNoException();
                    rve.e(parcel2, clearToken);
                    return true;
                case 3:
                    AccountChangeEventsRequest accountChangeEventsRequest = (AccountChangeEventsRequest) rve.a(parcel, AccountChangeEventsRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    AccountChangeEventsResponse accountChangeEvents = getAccountChangeEvents(accountChangeEventsRequest);
                    parcel2.writeNoException();
                    rve.e(parcel2, accountChangeEvents);
                    return true;
                case 4:
                default:
                    return false;
                case 5:
                    Account account = (Account) rve.a(parcel, Account.CREATOR);
                    String readString4 = parcel.readString();
                    Bundle bundle3 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    Bundle tokenByAccount = getTokenByAccount(account, readString4, bundle3);
                    parcel2.writeNoException();
                    rve.e(parcel2, tokenByAccount);
                    return true;
                case 6:
                    Bundle bundle4 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    Bundle accounts = getAccounts(bundle4);
                    parcel2.writeNoException();
                    rve.e(parcel2, accounts);
                    return true;
                case 7:
                    Account account2 = (Account) rve.a(parcel, Account.CREATOR);
                    enforceNoDataAvail(parcel);
                    Bundle removeAccount = removeAccount(account2);
                    parcel2.writeNoException();
                    rve.e(parcel2, removeAccount);
                    return true;
                case 8:
                    String readString5 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    Bundle requestGoogleAccountsAccess = requestGoogleAccountsAccess(readString5);
                    parcel2.writeNoException();
                    rve.e(parcel2, requestGoogleAccountsAccess);
                    return true;
                case 9:
                    HasCapabilitiesRequest hasCapabilitiesRequest = (HasCapabilitiesRequest) rve.a(parcel, HasCapabilitiesRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    int hasCapabilities = hasCapabilities(hasCapabilitiesRequest);
                    parcel2.writeNoException();
                    parcel2.writeInt(hasCapabilities);
                    return true;
                case 10:
                    GetHubTokenRequest getHubTokenRequest = (GetHubTokenRequest) rve.a(parcel, GetHubTokenRequest.CREATOR);
                    Bundle bundle5 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    GetHubTokenInternalResponse hubToken = getHubToken(getHubTokenRequest, bundle5);
                    parcel2.writeNoException();
                    rve.e(parcel2, hubToken);
                    return true;
            }
        }
    }

    Bundle clearToken(String str, Bundle bundle);

    AccountChangeEventsResponse getAccountChangeEvents(AccountChangeEventsRequest accountChangeEventsRequest);

    Bundle getAccounts(Bundle bundle);

    GetHubTokenInternalResponse getHubToken(GetHubTokenRequest getHubTokenRequest, Bundle bundle);

    Bundle getToken(String str, String str2, Bundle bundle);

    Bundle getTokenByAccount(Account account, String str, Bundle bundle);

    int hasCapabilities(HasCapabilitiesRequest hasCapabilitiesRequest);

    Bundle removeAccount(Account account);

    Bundle requestGoogleAccountsAccess(String str);
}
