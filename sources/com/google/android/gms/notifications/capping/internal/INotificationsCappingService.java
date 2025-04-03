package com.google.android.gms.notifications.capping.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.notifications.capping.internal.INotificationsCappingGetNotificationsCountCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface INotificationsCappingService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements INotificationsCappingService {
        static final int TRANSACTION_addNotificationImpression = 1;
        static final int TRANSACTION_getNotificationImpressionsCount = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements INotificationsCappingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.notifications.capping.internal.INotificationsCappingService");
            }

            @Override // com.google.android.gms.notifications.capping.internal.INotificationsCappingService
            public void addNotificationImpression(IStatusCallback iStatusCallback, long j, long j2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeLong(j);
                obtainAndWriteInterfaceToken.writeLong(j2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.notifications.capping.internal.INotificationsCappingService
            public void getNotificationImpressionsCount(INotificationsCappingGetNotificationsCountCallback iNotificationsCappingGetNotificationsCountCallback, long j, long j2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iNotificationsCappingGetNotificationsCountCallback);
                obtainAndWriteInterfaceToken.writeLong(j);
                obtainAndWriteInterfaceToken.writeLong(j2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.notifications.capping.internal.INotificationsCappingService");
        }

        public static INotificationsCappingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.notifications.capping.internal.INotificationsCappingService");
            return queryLocalInterface instanceof INotificationsCappingService ? (INotificationsCappingService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                addNotificationImpression(asInterface, readLong, readLong2, apiMetadata);
            } else {
                if (i != 2) {
                    return false;
                }
                INotificationsCappingGetNotificationsCountCallback asInterface2 = INotificationsCappingGetNotificationsCountCallback.Stub.asInterface(parcel.readStrongBinder());
                long readLong3 = parcel.readLong();
                long readLong4 = parcel.readLong();
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getNotificationImpressionsCount(asInterface2, readLong3, readLong4, apiMetadata2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addNotificationImpression(IStatusCallback iStatusCallback, long j, long j2, ApiMetadata apiMetadata);

    void getNotificationImpressionsCount(INotificationsCappingGetNotificationsCountCallback iNotificationsCappingGetNotificationsCountCallback, long j, long j2, ApiMetadata apiMetadata);
}
