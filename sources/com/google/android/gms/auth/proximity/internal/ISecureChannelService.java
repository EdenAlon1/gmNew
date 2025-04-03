package com.google.android.gms.auth.proximity.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISecureChannelService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISecureChannelService {
        static final int TRANSACTION_addChannelCallback = 5;
        static final int TRANSACTION_registerDevicesForRole = 2;
        static final int TRANSACTION_removeChannelCallback = 6;
        static final int TRANSACTION_sendMessage = 4;
        static final int TRANSACTION_unregisterDevicesForRole = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISecureChannelService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.proximity.internal.ISecureChannelService");
            }

            @Override // com.google.android.gms.auth.proximity.internal.ISecureChannelService
            public void addChannelCallback(IStatusCallback iStatusCallback, String str, Role role, IProximityAuthCallbacks iProximityAuthCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, role);
                rve.f(obtainAndWriteInterfaceToken, iProximityAuthCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.ISecureChannelService
            public void registerDevicesForRole(IStatusCallback iStatusCallback, Role role, List<RemoteDevice> list, PendingIntent pendingIntent, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, role);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.ISecureChannelService
            public void removeChannelCallback(IStatusCallback iStatusCallback, IProximityAuthCallbacks iProximityAuthCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.f(obtainAndWriteInterfaceToken, iProximityAuthCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.ISecureChannelService
            public void sendMessage(IStatusCallback iStatusCallback, String str, Role role, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, role);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.ISecureChannelService
            public void unregisterDevicesForRole(IStatusCallback iStatusCallback, Role role, List<RemoteDevice> list, PendingIntent pendingIntent, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, role);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.proximity.internal.ISecureChannelService");
        }

        public static ISecureChannelService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.internal.ISecureChannelService");
            return queryLocalInterface instanceof ISecureChannelService ? (ISecureChannelService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                Role role = (Role) rve.a(parcel, Role.CREATOR);
                ArrayList createTypedArrayList = parcel.createTypedArrayList(RemoteDevice.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                registerDevicesForRole(asInterface, role, createTypedArrayList, pendingIntent, apiMetadata);
            } else if (i == 3) {
                IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                Role role2 = (Role) rve.a(parcel, Role.CREATOR);
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(RemoteDevice.CREATOR);
                PendingIntent pendingIntent2 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                unregisterDevicesForRole(asInterface2, role2, createTypedArrayList2, pendingIntent2, apiMetadata2);
            } else if (i == 4) {
                IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                Role role3 = (Role) rve.a(parcel, Role.CREATOR);
                byte[] createByteArray = parcel.createByteArray();
                ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                sendMessage(asInterface3, readString, role3, createByteArray, apiMetadata3);
            } else if (i == 5) {
                IStatusCallback asInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                Role role4 = (Role) rve.a(parcel, Role.CREATOR);
                IProximityAuthCallbacks asInterface5 = IProximityAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                addChannelCallback(asInterface4, readString2, role4, asInterface5, apiMetadata4);
            } else {
                if (i != 6) {
                    return false;
                }
                IStatusCallback asInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                IProximityAuthCallbacks asInterface7 = IProximityAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata5 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                removeChannelCallback(asInterface6, asInterface7, apiMetadata5);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addChannelCallback(IStatusCallback iStatusCallback, String str, Role role, IProximityAuthCallbacks iProximityAuthCallbacks, ApiMetadata apiMetadata);

    void registerDevicesForRole(IStatusCallback iStatusCallback, Role role, List<RemoteDevice> list, PendingIntent pendingIntent, ApiMetadata apiMetadata);

    void removeChannelCallback(IStatusCallback iStatusCallback, IProximityAuthCallbacks iProximityAuthCallbacks, ApiMetadata apiMetadata);

    void sendMessage(IStatusCallback iStatusCallback, String str, Role role, byte[] bArr, ApiMetadata apiMetadata);

    void unregisterDevicesForRole(IStatusCallback iStatusCallback, Role role, List<RemoteDevice> list, PendingIntent pendingIntent, ApiMetadata apiMetadata);
}
