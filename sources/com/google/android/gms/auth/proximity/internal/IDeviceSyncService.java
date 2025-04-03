package com.google.android.gms.auth.proximity.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.proximity.firstparty.DeviceFilter;
import com.google.android.gms.auth.proximity.internal.IGetFeatureEnabledStateCallback;
import com.google.android.gms.auth.proximity.internal.IGetMyPublicKeyCallback;
import com.google.android.gms.auth.proximity.internal.IGetMySyncedMetadataCallback;
import com.google.android.gms.auth.proximity.internal.IGetSyncedDevicesCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IDeviceSyncService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IDeviceSyncService {
        static final int TRANSACTION_forceDeviceSync = 11;
        static final int TRANSACTION_getFeatureEnabledState = 10;
        static final int TRANSACTION_getMyPublicKey = 4;
        static final int TRANSACTION_getMySyncedMetadata = 5;
        static final int TRANSACTION_getSyncedDevices = 1;
        static final int TRANSACTION_registerForSyncedDevicesUpdates = 2;
        static final int TRANSACTION_registerSetupRequestedListener = 8;
        static final int TRANSACTION_setFeatureEnabled = 7;
        static final int TRANSACTION_setFeatureSupported = 6;
        static final int TRANSACTION_setFeatureSupportedScheduled = 12;
        static final int TRANSACTION_unregisterForSyncedDevicesUpdates = 3;
        static final int TRANSACTION_unregisterSetupRequestedListener = 9;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IDeviceSyncService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.proximity.internal.IDeviceSyncService");
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void forceDeviceSync(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void getFeatureEnabledState(IGetFeatureEnabledStateCallback iGetFeatureEnabledStateCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iGetFeatureEnabledStateCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void getMyPublicKey(IGetMyPublicKeyCallback iGetMyPublicKeyCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iGetMyPublicKeyCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void getMySyncedMetadata(IGetMySyncedMetadataCallback iGetMySyncedMetadataCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iGetMySyncedMetadataCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void getSyncedDevices(IGetSyncedDevicesCallback iGetSyncedDevicesCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iGetSyncedDevicesCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void registerForSyncedDevicesUpdates(IStatusCallback iStatusCallback, PendingIntent pendingIntent, DeviceFilter deviceFilter, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                rve.d(obtainAndWriteInterfaceToken, deviceFilter);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void registerSetupRequestedListener(IStatusCallback iStatusCallback, PendingIntent pendingIntent, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void setFeatureEnabled(IStatusCallback iStatusCallback, String str, boolean z, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void setFeatureSupported(IStatusCallback iStatusCallback, String str, boolean z, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void setFeatureSupportedScheduled(IStatusCallback iStatusCallback, String str, boolean z, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void unregisterForSyncedDevicesUpdates(IStatusCallback iStatusCallback, PendingIntent pendingIntent, DeviceFilter deviceFilter, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                rve.d(obtainAndWriteInterfaceToken, deviceFilter);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IDeviceSyncService
            public void unregisterSetupRequestedListener(IStatusCallback iStatusCallback, PendingIntent pendingIntent, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, pendingIntent);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.proximity.internal.IDeviceSyncService");
        }

        public static IDeviceSyncService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IDeviceSyncService");
            return queryLocalInterface instanceof IDeviceSyncService ? (IDeviceSyncService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IGetSyncedDevicesCallback asInterface = IGetSyncedDevicesCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getSyncedDevices(asInterface, apiMetadata);
                    break;
                case 2:
                    IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    PendingIntent pendingIntent = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                    DeviceFilter deviceFilter = (DeviceFilter) rve.a(parcel, DeviceFilter.CREATOR);
                    ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerForSyncedDevicesUpdates(asInterface2, pendingIntent, deviceFilter, apiMetadata2);
                    break;
                case 3:
                    IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    PendingIntent pendingIntent2 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                    DeviceFilter deviceFilter2 = (DeviceFilter) rve.a(parcel, DeviceFilter.CREATOR);
                    ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterForSyncedDevicesUpdates(asInterface3, pendingIntent2, deviceFilter2, apiMetadata3);
                    break;
                case 4:
                    IGetMyPublicKeyCallback asInterface4 = IGetMyPublicKeyCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getMyPublicKey(asInterface4, readString, apiMetadata4);
                    break;
                case 5:
                    IGetMySyncedMetadataCallback asInterface5 = IGetMySyncedMetadataCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    ApiMetadata apiMetadata5 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getMySyncedMetadata(asInterface5, readString2, apiMetadata5);
                    break;
                case 6:
                    IStatusCallback asInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString3 = parcel.readString();
                    boolean g = rve.g(parcel);
                    String readString4 = parcel.readString();
                    ApiMetadata apiMetadata6 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setFeatureSupported(asInterface6, readString3, g, readString4, apiMetadata6);
                    break;
                case 7:
                    IStatusCallback asInterface7 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString5 = parcel.readString();
                    boolean g2 = rve.g(parcel);
                    String readString6 = parcel.readString();
                    ApiMetadata apiMetadata7 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setFeatureEnabled(asInterface7, readString5, g2, readString6, apiMetadata7);
                    break;
                case 8:
                    IStatusCallback asInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    PendingIntent pendingIntent3 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                    String readString7 = parcel.readString();
                    ApiMetadata apiMetadata8 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerSetupRequestedListener(asInterface8, pendingIntent3, readString7, apiMetadata8);
                    break;
                case 9:
                    IStatusCallback asInterface9 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    PendingIntent pendingIntent4 = (PendingIntent) rve.a(parcel, PendingIntent.CREATOR);
                    String readString8 = parcel.readString();
                    ApiMetadata apiMetadata9 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterSetupRequestedListener(asInterface9, pendingIntent4, readString8, apiMetadata9);
                    break;
                case 10:
                    IGetFeatureEnabledStateCallback asInterface10 = IGetFeatureEnabledStateCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    ApiMetadata apiMetadata10 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getFeatureEnabledState(asInterface10, readString9, readString10, apiMetadata10);
                    break;
                case 11:
                    IStatusCallback asInterface11 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString11 = parcel.readString();
                    ApiMetadata apiMetadata11 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    forceDeviceSync(asInterface11, readString11, apiMetadata11);
                    break;
                case 12:
                    IStatusCallback asInterface12 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString12 = parcel.readString();
                    boolean g3 = rve.g(parcel);
                    String readString13 = parcel.readString();
                    ApiMetadata apiMetadata12 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setFeatureSupportedScheduled(asInterface12, readString12, g3, readString13, apiMetadata12);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void forceDeviceSync(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void getFeatureEnabledState(IGetFeatureEnabledStateCallback iGetFeatureEnabledStateCallback, String str, String str2, ApiMetadata apiMetadata);

    void getMyPublicKey(IGetMyPublicKeyCallback iGetMyPublicKeyCallback, String str, ApiMetadata apiMetadata);

    void getMySyncedMetadata(IGetMySyncedMetadataCallback iGetMySyncedMetadataCallback, String str, ApiMetadata apiMetadata);

    void getSyncedDevices(IGetSyncedDevicesCallback iGetSyncedDevicesCallback, ApiMetadata apiMetadata);

    void registerForSyncedDevicesUpdates(IStatusCallback iStatusCallback, PendingIntent pendingIntent, DeviceFilter deviceFilter, ApiMetadata apiMetadata);

    void registerSetupRequestedListener(IStatusCallback iStatusCallback, PendingIntent pendingIntent, String str, ApiMetadata apiMetadata);

    void setFeatureEnabled(IStatusCallback iStatusCallback, String str, boolean z, String str2, ApiMetadata apiMetadata);

    void setFeatureSupported(IStatusCallback iStatusCallback, String str, boolean z, String str2, ApiMetadata apiMetadata);

    void setFeatureSupportedScheduled(IStatusCallback iStatusCallback, String str, boolean z, String str2, ApiMetadata apiMetadata);

    void unregisterForSyncedDevicesUpdates(IStatusCallback iStatusCallback, PendingIntent pendingIntent, DeviceFilter deviceFilter, ApiMetadata apiMetadata);

    void unregisterSetupRequestedListener(IStatusCallback iStatusCallback, PendingIntent pendingIntent, String str, ApiMetadata apiMetadata);
}
