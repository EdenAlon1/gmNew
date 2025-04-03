package com.google.android.play.core.appupdate.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IAppUpdateServiceCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAppUpdateServiceCallback {
        static final int TRANSACTION_onCompleteUpdate = 3;
        static final int TRANSACTION_onRequestInfo = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAppUpdateServiceCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
            }

            @Override // com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback
            public void onCompleteUpdate(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback
            public void onRequestInfo(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        }

        public static IAppUpdateServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
            return queryLocalInterface instanceof IAppUpdateServiceCallback ? (IAppUpdateServiceCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onRequestInfo(bundle);
                return true;
            }
            if (i != 3) {
                return false;
            }
            Bundle bundle2 = (Bundle) rve.a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            onCompleteUpdate(bundle2);
            return true;
        }
    }

    void onCompleteUpdate(Bundle bundle);

    void onRequestInfo(Bundle bundle);
}
