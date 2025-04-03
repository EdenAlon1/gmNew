package com.google.android.gms.notifications.capping.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface INotificationsCappingGetNotificationsCountCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements INotificationsCappingGetNotificationsCountCallback {
        static final int TRANSACTION_onGetNotificationImpressionsCount = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements INotificationsCappingGetNotificationsCountCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.notifications.capping.internal.INotificationsCappingGetNotificationsCountCallback");
            }

            @Override // com.google.android.gms.notifications.capping.internal.INotificationsCappingGetNotificationsCountCallback
            public void onGetNotificationImpressionsCount(Status status, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.notifications.capping.internal.INotificationsCappingGetNotificationsCountCallback");
        }

        public static INotificationsCappingGetNotificationsCountCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.notifications.capping.internal.INotificationsCappingGetNotificationsCountCallback");
            return queryLocalInterface instanceof INotificationsCappingGetNotificationsCountCallback ? (INotificationsCappingGetNotificationsCountCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onGetNotificationImpressionsCount(status, readInt);
            return true;
        }
    }

    void onGetNotificationImpressionsCount(Status status, int i);
}
