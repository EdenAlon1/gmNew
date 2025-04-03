package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.aicore.aidl.IAiCoreServiceProviderCallback;
import defpackage.rve;
import defpackage.rvu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IAiCoreServiceProvider extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAiCoreServiceProvider {
        static final int TRANSACTION_get = 2;
        static final int TRANSACTION_getWithCallerInfo = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAiCoreServiceProvider {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IAiCoreServiceProvider");
            }

            @Override // com.google.android.apps.aicore.aidl.IAiCoreServiceProvider
            public void get(IAiCoreServiceProviderCallback iAiCoreServiceProviderCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAiCoreServiceProviderCallback);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IAiCoreServiceProvider
            public void getWithCallerInfo(rvu rvuVar, IAiCoreServiceProviderCallback iAiCoreServiceProviderCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvuVar);
                rve.f(obtainAndWriteInterfaceToken, iAiCoreServiceProviderCallback);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IAiCoreServiceProvider");
        }

        public static IAiCoreServiceProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAiCoreServiceProvider");
            return queryLocalInterface instanceof IAiCoreServiceProvider ? (IAiCoreServiceProvider) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                IAiCoreServiceProviderCallback asInterface = IAiCoreServiceProviderCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                get(asInterface);
                return true;
            }
            if (i != 3) {
                return false;
            }
            rvu rvuVar = (rvu) rve.a(parcel, rvu.CREATOR);
            IAiCoreServiceProviderCallback asInterface2 = IAiCoreServiceProviderCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            getWithCallerInfo(rvuVar, asInterface2);
            return true;
        }
    }

    void get(IAiCoreServiceProviderCallback iAiCoreServiceProviderCallback);

    void getWithCallerInfo(rvu rvuVar, IAiCoreServiceProviderCallback iAiCoreServiceProviderCallback);
}
