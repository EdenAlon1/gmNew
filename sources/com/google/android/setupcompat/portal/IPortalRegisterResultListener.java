package com.google.android.setupcompat.portal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IPortalRegisterResultListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPortalRegisterResultListener {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPortalRegisterResultListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.setupcompat.portal.IPortalRegisterResultListener");
            }

            @Override // com.google.android.setupcompat.portal.IPortalRegisterResultListener
            public void onResult(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.setupcompat.portal.IPortalRegisterResultListener");
        }

        public static IPortalRegisterResultListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.setupcompat.portal.IPortalRegisterResultListener");
            return queryLocalInterface instanceof IPortalRegisterResultListener ? (IPortalRegisterResultListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(bundle);
            parcel2.writeNoException();
            return true;
        }
    }

    void onResult(Bundle bundle);
}
