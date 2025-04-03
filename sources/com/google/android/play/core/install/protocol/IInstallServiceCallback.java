package com.google.android.play.core.install.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IInstallServiceCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInstallServiceCallback {
        static final int TRANSACTION_onCompleteUpdate = 3;
        static final int TRANSACTION_onRequestInfo = 2;
        static final int TRANSACTION_onRequestInstall = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInstallServiceCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.play.core.install.protocol.IInstallServiceCallback");
            }

            @Override // com.google.android.play.core.install.protocol.IInstallServiceCallback
            public void onCompleteUpdate(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.play.core.install.protocol.IInstallServiceCallback
            public void onRequestInfo(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.play.core.install.protocol.IInstallServiceCallback
            public void onRequestInstall(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.play.core.install.protocol.IInstallServiceCallback");
        }

        public static IInstallServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.install.protocol.IInstallServiceCallback");
            return queryLocalInterface instanceof IInstallServiceCallback ? (IInstallServiceCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onRequestInstall(bundle);
            } else if (i == 2) {
                Bundle bundle2 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onRequestInfo(bundle2);
            } else {
                if (i != 3) {
                    return false;
                }
                Bundle bundle3 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onCompleteUpdate(bundle3);
            }
            return true;
        }
    }

    void onCompleteUpdate(Bundle bundle);

    void onRequestInfo(Bundle bundle);

    void onRequestInstall(Bundle bundle);
}
