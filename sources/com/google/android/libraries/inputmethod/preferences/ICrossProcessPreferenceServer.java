package com.google.android.libraries.inputmethod.preferences;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ICrossProcessPreferenceServer extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICrossProcessPreferenceServer {
        static final int TRANSACTION_register = 2;
        static final int TRANSACTION_unregister = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICrossProcessPreferenceServer {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceServer");
            }

            @Override // com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceServer
            public boolean register(ICrossProcessPreferenceClient iCrossProcessPreferenceClient) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iCrossProcessPreferenceClient);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceServer
            public boolean unregister(ICrossProcessPreferenceClient iCrossProcessPreferenceClient) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iCrossProcessPreferenceClient);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }
        }

        public Stub() {
            super("com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceServer");
        }

        public static ICrossProcessPreferenceServer asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceServer");
            return queryLocalInterface instanceof ICrossProcessPreferenceServer ? (ICrossProcessPreferenceServer) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                ICrossProcessPreferenceClient asInterface = ICrossProcessPreferenceClient.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                boolean register = register(asInterface);
                parcel2.writeNoException();
                int i3 = rve.a;
                parcel2.writeInt(register ? 1 : 0);
                return true;
            }
            if (i != 3) {
                return false;
            }
            ICrossProcessPreferenceClient asInterface2 = ICrossProcessPreferenceClient.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            boolean unregister = unregister(asInterface2);
            parcel2.writeNoException();
            int i4 = rve.a;
            parcel2.writeInt(unregister ? 1 : 0);
            return true;
        }
    }

    boolean register(ICrossProcessPreferenceClient iCrossProcessPreferenceClient);

    boolean unregister(ICrossProcessPreferenceClient iCrossProcessPreferenceClient);
}
