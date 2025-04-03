package com.google.android.gms.search.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.search.internal.ISearchAuthCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISearchAuthService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISearchAuthService {
        static final int TRANSACTION_clearToken = 2;
        static final int TRANSACTION_getGoogleNowAuth = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISearchAuthService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.internal.ISearchAuthService");
            }

            @Override // com.google.android.gms.search.internal.ISearchAuthService
            public void clearToken(ISearchAuthCallbacks iSearchAuthCallbacks, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iSearchAuthCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.internal.ISearchAuthService
            public void getGoogleNowAuth(ISearchAuthCallbacks iSearchAuthCallbacks, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iSearchAuthCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.internal.ISearchAuthService");
        }

        public static ISearchAuthService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthService");
            return queryLocalInterface instanceof ISearchAuthService ? (ISearchAuthService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                ISearchAuthCallbacks asInterface = ISearchAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getGoogleNowAuth(asInterface, readString, readString2, apiMetadata);
            } else {
                if (i != 2) {
                    return false;
                }
                ISearchAuthCallbacks asInterface2 = ISearchAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                clearToken(asInterface2, readString3, readString4, apiMetadata2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void clearToken(ISearchAuthCallbacks iSearchAuthCallbacks, String str, String str2, ApiMetadata apiMetadata);

    void getGoogleNowAuth(ISearchAuthCallbacks iSearchAuthCallbacks, String str, String str2, ApiMetadata apiMetadata);
}
