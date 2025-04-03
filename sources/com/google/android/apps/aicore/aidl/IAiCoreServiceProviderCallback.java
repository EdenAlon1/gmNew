package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.IAICoreService;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IAiCoreServiceProviderCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAiCoreServiceProviderCallback {
        static final int TRANSACTION_onServiceProviderFailure = 3;
        static final int TRANSACTION_onServiceProviderSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAiCoreServiceProviderCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback
            public void onServiceProviderFailure(int i, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback
            public void onServiceProviderSuccess(IAICoreService iAICoreService) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAICoreService);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback");
        }

        public static IAiCoreServiceProviderCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback");
            return queryLocalInterface instanceof IAiCoreServiceProviderCallback ? (IAiCoreServiceProviderCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                IAICoreService asInterface = IAICoreService.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onServiceProviderSuccess(asInterface);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            enforceNoDataAvail(parcel);
            onServiceProviderFailure(readInt, readString);
            return true;
        }
    }

    void onServiceProviderFailure(int i, String str);

    void onServiceProviderSuccess(IAICoreService iAICoreService);
}
