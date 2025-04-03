package com.google.android.setupcompat.portal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.UserHandle;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.setupcompat.portal.IPortalRegisterResultListener;
import defpackage.eiov;
import defpackage.eiox;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface ISetupNotificationService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISetupNotificationService {
        static final int TRANSACTION_isPortalAvailable = 5;
        static final int TRANSACTION_isPortalReady = 6;
        static final int TRANSACTION_isProgressServiceAlive = 4;
        static final int TRANSACTION_registerNotification = 1;
        static final int TRANSACTION_registerProgressService = 3;
        static final int TRANSACTION_unregisterNotification = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISetupNotificationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.setupcompat.portal.ISetupNotificationService");
            }

            @Override // com.google.android.setupcompat.portal.ISetupNotificationService
            public boolean isPortalAvailable() {
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.setupcompat.portal.ISetupNotificationService
            public boolean isPortalReady() {
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.setupcompat.portal.ISetupNotificationService
            public boolean isProgressServiceAlive(eiox eioxVar, UserHandle userHandle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, eioxVar);
                rve.d(obtainAndWriteInterfaceToken, userHandle);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.setupcompat.portal.ISetupNotificationService
            public boolean registerNotification(eiov eiovVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, eiovVar);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.setupcompat.portal.ISetupNotificationService
            public void registerProgressService(eiox eioxVar, UserHandle userHandle, IPortalRegisterResultListener iPortalRegisterResultListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, eioxVar);
                rve.d(obtainAndWriteInterfaceToken, userHandle);
                rve.f(obtainAndWriteInterfaceToken, iPortalRegisterResultListener);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.setupcompat.portal.ISetupNotificationService
            public void unregisterNotification(eiov eiovVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, eiovVar);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.setupcompat.portal.ISetupNotificationService");
        }

        public static ISetupNotificationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.setupcompat.portal.ISetupNotificationService");
            return queryLocalInterface instanceof ISetupNotificationService ? (ISetupNotificationService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    eiov eiovVar = (eiov) rve.a(parcel, eiov.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean registerNotification = registerNotification(eiovVar);
                    parcel2.writeNoException();
                    parcel2.writeInt(registerNotification ? 1 : 0);
                    return true;
                case 2:
                    eiov eiovVar2 = (eiov) rve.a(parcel, eiov.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterNotification(eiovVar2);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    eiox eioxVar = (eiox) rve.a(parcel, eiox.CREATOR);
                    UserHandle userHandle = (UserHandle) rve.a(parcel, UserHandle.CREATOR);
                    IPortalRegisterResultListener asInterface = IPortalRegisterResultListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    registerProgressService(eioxVar, userHandle, asInterface);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    eiox eioxVar2 = (eiox) rve.a(parcel, eiox.CREATOR);
                    UserHandle userHandle2 = (UserHandle) rve.a(parcel, UserHandle.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean isProgressServiceAlive = isProgressServiceAlive(eioxVar2, userHandle2);
                    parcel2.writeNoException();
                    parcel2.writeInt(isProgressServiceAlive ? 1 : 0);
                    return true;
                case 5:
                    boolean isPortalAvailable = isPortalAvailable();
                    parcel2.writeNoException();
                    int i3 = rve.a;
                    parcel2.writeInt(isPortalAvailable ? 1 : 0);
                    return true;
                case 6:
                    boolean isPortalReady = isPortalReady();
                    parcel2.writeNoException();
                    int i4 = rve.a;
                    parcel2.writeInt(isPortalReady ? 1 : 0);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean isPortalAvailable();

    boolean isPortalReady();

    boolean isProgressServiceAlive(eiox eioxVar, UserHandle userHandle);

    boolean registerNotification(eiov eiovVar);

    void registerProgressService(eiox eioxVar, UserHandle userHandle, IPortalRegisterResultListener iPortalRegisterResultListener);

    void unregisterNotification(eiov eiovVar);
}
