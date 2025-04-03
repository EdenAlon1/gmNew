package com.google.android.gms.auth.proximity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.FileParams;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.WireMessageParams;
import com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IProximityAuthService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IProximityAuthService {
        static final int TRANSACTION_addCallbacks = 2;
        static final int TRANSACTION_beforeClientDisconnect = 1;
        static final int TRANSACTION_getAllConnectionInfosForRole = 5;
        static final int TRANSACTION_registerDeviceForRole = 3;
        static final int TRANSACTION_sendFile = 7;
        static final int TRANSACTION_unregisterDeviceForRole = 4;
        static final int TRANSACTION_write = 6;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IProximityAuthService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.proximity.internal.IProximityAuthService");
            }

            @Override // com.google.android.gms.auth.proximity.internal.IProximityAuthService
            public void addCallbacks(IProximityAuthCallbacks iProximityAuthCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iProximityAuthCallbacks);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IProximityAuthService
            public void beforeClientDisconnect() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.auth.proximity.internal.IProximityAuthService
            public List<ConnectionInfo> getAllConnectionInfosForRole(Role role) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, role);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(ConnectionInfo.CREATOR);
                transactAndReadException.recycle();
                return createTypedArrayList;
            }

            @Override // com.google.android.gms.auth.proximity.internal.IProximityAuthService
            public void registerDeviceForRole(RemoteDevice remoteDevice, Role role) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, remoteDevice);
                rve.d(obtainAndWriteInterfaceToken, role);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IProximityAuthService
            public void sendFile(FileParams fileParams) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, fileParams);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IProximityAuthService
            public void unregisterDeviceForRole(String str, Role role) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, role);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IProximityAuthService
            public void write(WireMessageParams wireMessageParams) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, wireMessageParams);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.proximity.internal.IProximityAuthService");
        }

        public static IProximityAuthService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IProximityAuthService");
            return queryLocalInterface instanceof IProximityAuthService ? (IProximityAuthService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    beforeClientDisconnect();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    IProximityAuthCallbacks asInterface = IProximityAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    addCallbacks(asInterface);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    RemoteDevice remoteDevice = (RemoteDevice) rve.a(parcel, RemoteDevice.CREATOR);
                    Role role = (Role) rve.a(parcel, Role.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerDeviceForRole(remoteDevice, role);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    String readString = parcel.readString();
                    Role role2 = (Role) rve.a(parcel, Role.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterDeviceForRole(readString, role2);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    Role role3 = (Role) rve.a(parcel, Role.CREATOR);
                    enforceNoDataAvail(parcel);
                    List<ConnectionInfo> allConnectionInfosForRole = getAllConnectionInfosForRole(role3);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(allConnectionInfosForRole);
                    return true;
                case 6:
                    WireMessageParams wireMessageParams = (WireMessageParams) rve.a(parcel, WireMessageParams.CREATOR);
                    enforceNoDataAvail(parcel);
                    write(wireMessageParams);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    FileParams fileParams = (FileParams) rve.a(parcel, FileParams.CREATOR);
                    enforceNoDataAvail(parcel);
                    sendFile(fileParams);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void addCallbacks(IProximityAuthCallbacks iProximityAuthCallbacks);

    void beforeClientDisconnect();

    List<ConnectionInfo> getAllConnectionInfosForRole(Role role);

    void registerDeviceForRole(RemoteDevice remoteDevice, Role role);

    void sendFile(FileParams fileParams);

    void unregisterDeviceForRole(String str, Role role);

    void write(WireMessageParams wireMessageParams);
}
