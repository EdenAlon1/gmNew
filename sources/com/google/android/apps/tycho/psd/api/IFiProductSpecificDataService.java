package com.google.android.apps.tycho.psd.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.tycho.psd.api.IFiProductSpecificBinaryDataCallback;
import com.google.android.apps.tycho.psd.api.IFiProductSpecificDataCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFiProductSpecificDataService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFiProductSpecificDataService {
        static final int TRANSACTION_getFiProductSpecificBinaryData = 2;
        static final int TRANSACTION_getFiProductSpecificData = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFiProductSpecificDataService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tycho.psd.api.IFiProductSpecificDataService");
            }

            @Override // com.google.android.apps.tycho.psd.api.IFiProductSpecificDataService
            public void getFiProductSpecificBinaryData(String str, IFiProductSpecificBinaryDataCallback iFiProductSpecificBinaryDataCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.f(obtainAndWriteInterfaceToken, iFiProductSpecificBinaryDataCallback);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tycho.psd.api.IFiProductSpecificDataService
            public void getFiProductSpecificData(String str, IFiProductSpecificDataCallback iFiProductSpecificDataCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.f(obtainAndWriteInterfaceToken, iFiProductSpecificDataCallback);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.tycho.psd.api.IFiProductSpecificDataService");
        }

        public static IFiProductSpecificDataService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tycho.psd.api.IFiProductSpecificDataService");
            return queryLocalInterface instanceof IFiProductSpecificDataService ? (IFiProductSpecificDataService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String readString = parcel.readString();
                IFiProductSpecificDataCallback asInterface = IFiProductSpecificDataCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getFiProductSpecificData(readString, asInterface);
            } else {
                if (i != 2) {
                    return false;
                }
                String readString2 = parcel.readString();
                IFiProductSpecificBinaryDataCallback asInterface2 = IFiProductSpecificBinaryDataCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getFiProductSpecificBinaryData(readString2, asInterface2);
            }
            return true;
        }
    }

    void getFiProductSpecificBinaryData(String str, IFiProductSpecificBinaryDataCallback iFiProductSpecificBinaryDataCallback);

    void getFiProductSpecificData(String str, IFiProductSpecificDataCallback iFiProductSpecificDataCallback);
}
