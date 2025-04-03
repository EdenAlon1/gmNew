package com.google.android.search.verification.api;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface ISearchActionVerificationService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISearchActionVerificationService {
        static final int TRANSACTION_getVersion = 2;
        static final int TRANSACTION_isSearchAction = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISearchActionVerificationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.search.verification.api.ISearchActionVerificationService");
            }

            @Override // com.google.android.search.verification.api.ISearchActionVerificationService
            public int getVersion() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.search.verification.api.ISearchActionVerificationService
            public boolean isSearchAction(Intent intent, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, intent);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }
        }

        public Stub() {
            super("com.google.android.search.verification.api.ISearchActionVerificationService");
        }

        public static ISearchActionVerificationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.ISearchActionVerificationService");
            return queryLocalInterface instanceof ISearchActionVerificationService ? (ISearchActionVerificationService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Intent intent = (Intent) rve.a(parcel, Intent.CREATOR);
                Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                boolean isSearchAction = isSearchAction(intent, bundle);
                parcel2.writeNoException();
                parcel2.writeInt(isSearchAction ? 1 : 0);
            } else {
                if (i != 2) {
                    return false;
                }
                int version = getVersion();
                parcel2.writeNoException();
                parcel2.writeInt(version);
            }
            return true;
        }
    }

    int getVersion();

    boolean isSearchAction(Intent intent, Bundle bundle);
}
