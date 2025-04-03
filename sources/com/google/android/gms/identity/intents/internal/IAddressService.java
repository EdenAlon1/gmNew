package com.google.android.gms.identity.intents.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.identity.intents.UserAddressRequest;
import com.google.android.gms.identity.intents.internal.IAddressCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAddressService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAddressService {
        static final int TRANSACTION_getAddress = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAddressService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.identity.intents.internal.IAddressService");
            }

            @Override // com.google.android.gms.identity.intents.internal.IAddressService
            public void getAddress(IAddressCallbacks iAddressCallbacks, UserAddressRequest userAddressRequest, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAddressCallbacks);
                rve.d(obtainAndWriteInterfaceToken, userAddressRequest);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.identity.intents.internal.IAddressService");
        }

        public static IAddressService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
            return queryLocalInterface instanceof IAddressService ? (IAddressService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            IAddressCallbacks asInterface = IAddressCallbacks.Stub.asInterface(parcel.readStrongBinder());
            UserAddressRequest userAddressRequest = (UserAddressRequest) rve.a(parcel, UserAddressRequest.CREATOR);
            Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            getAddress(asInterface, userAddressRequest, bundle);
            parcel2.writeNoException();
            return true;
        }
    }

    void getAddress(IAddressCallbacks iAddressCallbacks, UserAddressRequest userAddressRequest, Bundle bundle);
}
