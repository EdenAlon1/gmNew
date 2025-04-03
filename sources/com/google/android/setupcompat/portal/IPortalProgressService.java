package com.google.android.setupcompat.portal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.setupcompat.portal.IPortalProgressCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IPortalProgressService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPortalProgressService {
        static final int TRANSACTION_onAllowMobileData = 4;
        static final int TRANSACTION_onGetRemainingValues = 5;
        static final int TRANSACTION_onPortalSessionStart = 1;
        static final int TRANSACTION_onSetCallback = 2;
        static final int TRANSACTION_onSuspend = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPortalProgressService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.setupcompat.portal.IPortalProgressService");
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressService
            public void onAllowMobileData(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressService
            public Bundle onGetRemainingValues() {
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                Bundle bundle = (Bundle) rve.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressService
            public void onPortalSessionStart() {
                transactOneway(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressService
            public void onSetCallback(IPortalProgressCallback iPortalProgressCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPortalProgressCallback);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressService
            public void onSuspend() {
                transactOneway(3, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.setupcompat.portal.IPortalProgressService");
        }

        public static IPortalProgressService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.setupcompat.portal.IPortalProgressService");
            return queryLocalInterface instanceof IPortalProgressService ? (IPortalProgressService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                onPortalSessionStart();
            } else if (i == 2) {
                IPortalProgressCallback asInterface = IPortalProgressCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onSetCallback(asInterface);
            } else if (i == 3) {
                onSuspend();
            } else if (i == 4) {
                boolean g = rve.g(parcel);
                enforceNoDataAvail(parcel);
                onAllowMobileData(g);
            } else {
                if (i != 5) {
                    return false;
                }
                Bundle onGetRemainingValues = onGetRemainingValues();
                parcel2.writeNoException();
                rve.e(parcel2, onGetRemainingValues);
            }
            return true;
        }
    }

    void onAllowMobileData(boolean z);

    Bundle onGetRemainingValues();

    void onPortalSessionStart();

    void onSetCallback(IPortalProgressCallback iPortalProgressCallback);

    void onSuspend();
}
