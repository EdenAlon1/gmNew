package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ILocationAvailabilityStatusCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ILocationAvailabilityStatusCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ILocationAvailabilityStatusCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
            }

            @Override // com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback
            public void onResult(Status status, LocationAvailability locationAvailability) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, locationAvailability);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
        }

        public static ILocationAvailabilityStatusCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.ILocationAvailabilityStatusCallback");
            return queryLocalInterface instanceof ILocationAvailabilityStatusCallback ? (ILocationAvailabilityStatusCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            LocationAvailability locationAvailability = (LocationAvailability) rve.a(parcel, LocationAvailability.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, locationAvailability);
            return true;
        }
    }

    void onResult(Status status, LocationAvailability locationAvailability);
}
