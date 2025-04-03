package com.google.android.libraries.assistant.appintegration.shared.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSession;
import com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IAppIntegrationService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAppIntegrationService {
        static final int TRANSACTION_startSession = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAppIntegrationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationService");
            }

            @Override // com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationService
            public IAppIntegrationSession startSession(String str, IAppIntegrationSessionCallback iAppIntegrationSessionCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.f(obtainAndWriteInterfaceToken, iAppIntegrationSessionCallback);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                IAppIntegrationSession asInterface = IAppIntegrationSession.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationService");
        }

        public static IAppIntegrationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationService");
            return queryLocalInterface instanceof IAppIntegrationService ? (IAppIntegrationService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            String readString = parcel.readString();
            IAppIntegrationSessionCallback asInterface = IAppIntegrationSessionCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            IAppIntegrationSession startSession = startSession(readString, asInterface);
            parcel2.writeNoException();
            rve.f(parcel2, startSession);
            return true;
        }
    }

    IAppIntegrationSession startSession(String str, IAppIntegrationSessionCallback iAppIntegrationSessionCallback);
}
