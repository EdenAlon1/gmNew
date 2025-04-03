package com.google.android.play.core.appupdate.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IAppUpdateService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAppUpdateService {
        static final int TRANSACTION_completeUpdate = 3;
        static final int TRANSACTION_requestInfo = 2;
        static final int TRANSACTION_zzz = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAppUpdateService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            }

            @Override // com.google.android.play.core.appupdate.protocol.IAppUpdateService
            public void completeUpdate(String str, Bundle bundle, IAppUpdateServiceCallback iAppUpdateServiceCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iAppUpdateServiceCallback);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.play.core.appupdate.protocol.IAppUpdateService
            public void requestInfo(String str, Bundle bundle, IAppUpdateServiceCallback iAppUpdateServiceCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iAppUpdateServiceCallback);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.play.core.appupdate.protocol.IAppUpdateService
            public void zzz(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        }

        public static IAppUpdateService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            return queryLocalInterface instanceof IAppUpdateService ? (IAppUpdateService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                String readString = parcel.readString();
                Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                IAppUpdateServiceCallback asInterface = IAppUpdateServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                requestInfo(readString, bundle, asInterface);
                return true;
            }
            if (i != 3) {
                if (i != 4) {
                    return false;
                }
                Bundle bundle2 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                zzz(bundle2);
                return true;
            }
            String readString2 = parcel.readString();
            Bundle bundle3 = (Bundle) rve.a(parcel, Bundle.CREATOR);
            IAppUpdateServiceCallback asInterface2 = IAppUpdateServiceCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            completeUpdate(readString2, bundle3, asInterface2);
            return true;
        }
    }

    void completeUpdate(String str, Bundle bundle, IAppUpdateServiceCallback iAppUpdateServiceCallback);

    void requestInfo(String str, Bundle bundle, IAppUpdateServiceCallback iAppUpdateServiceCallback);

    void zzz(Bundle bundle);
}
