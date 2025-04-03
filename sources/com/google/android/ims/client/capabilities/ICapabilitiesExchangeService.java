package com.google.android.ims.client.capabilities;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.ims.client.capabilities.CapabilitiesListenerInternal;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ICapabilitiesExchangeService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICapabilitiesExchangeService {
        static final int TRANSACTION_registerCapabilitiesListener = 1;
        static final int TRANSACTION_requestCapabilities = 3;
        static final int TRANSACTION_requestMultipleCapabilities = 4;
        static final int TRANSACTION_unregisterCapabilitiesListener = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICapabilitiesExchangeService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.capabilities.ICapabilitiesExchangeService");
            }

            @Override // com.google.android.ims.client.capabilities.ICapabilitiesExchangeService
            public boolean registerCapabilitiesListener(CapabilitiesListenerInternal capabilitiesListenerInternal, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, capabilitiesListenerInternal);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.ims.client.capabilities.ICapabilitiesExchangeService
            public int requestCapabilities(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.capabilities.ICapabilitiesExchangeService
            public int requestMultipleCapabilities(String[] strArr, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.capabilities.ICapabilitiesExchangeService
            public boolean unregisterCapabilitiesListener(CapabilitiesListenerInternal capabilitiesListenerInternal, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, capabilitiesListenerInternal);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }
        }

        public Stub() {
            super("com.google.android.ims.client.capabilities.ICapabilitiesExchangeService");
        }

        public static ICapabilitiesExchangeService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.capabilities.ICapabilitiesExchangeService");
            return queryLocalInterface instanceof ICapabilitiesExchangeService ? (ICapabilitiesExchangeService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                CapabilitiesListenerInternal asInterface = CapabilitiesListenerInternal.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                boolean registerCapabilitiesListener = registerCapabilitiesListener(asInterface, bundle);
                parcel2.writeNoException();
                parcel2.writeInt(registerCapabilitiesListener ? 1 : 0);
            } else if (i == 2) {
                CapabilitiesListenerInternal asInterface2 = CapabilitiesListenerInternal.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle2 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                boolean unregisterCapabilitiesListener = unregisterCapabilitiesListener(asInterface2, bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(unregisterCapabilitiesListener ? 1 : 0);
            } else if (i == 3) {
                String readString = parcel.readString();
                Bundle bundle3 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                int requestCapabilities = requestCapabilities(readString, bundle3);
                parcel2.writeNoException();
                parcel2.writeInt(requestCapabilities);
            } else {
                if (i != 4) {
                    return false;
                }
                String[] createStringArray = parcel.createStringArray();
                Bundle bundle4 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                int requestMultipleCapabilities = requestMultipleCapabilities(createStringArray, bundle4);
                parcel2.writeNoException();
                parcel2.writeInt(requestMultipleCapabilities);
            }
            return true;
        }
    }

    boolean registerCapabilitiesListener(CapabilitiesListenerInternal capabilitiesListenerInternal, Bundle bundle);

    int requestCapabilities(String str, Bundle bundle);

    int requestMultipleCapabilities(String[] strArr, Bundle bundle);

    boolean unregisterCapabilitiesListener(CapabilitiesListenerInternal capabilitiesListenerInternal, Bundle bundle);
}
