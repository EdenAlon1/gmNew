package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ILocationCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ILocationCallback {
        static final int TRANSACTION_onLocationAvailability = 2;
        static final int TRANSACTION_onLocationResult = 1;
        static final int TRANSACTION_onRemoved = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ILocationCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.ILocationCallback");
            }

            @Override // com.google.android.gms.location.ILocationCallback
            public void onLocationAvailability(LocationAvailability locationAvailability) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, locationAvailability);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.ILocationCallback
            public void onLocationResult(LocationResult locationResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, locationResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.ILocationCallback
            public void onRemoved() {
                transactOneway(3, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.location.ILocationCallback");
        }

        public static ILocationCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            return queryLocalInterface instanceof ILocationCallback ? (ILocationCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                LocationResult locationResult = (LocationResult) rve.a(parcel, LocationResult.CREATOR);
                enforceNoDataAvail(parcel);
                onLocationResult(locationResult);
            } else if (i == 2) {
                LocationAvailability locationAvailability = (LocationAvailability) rve.a(parcel, LocationAvailability.CREATOR);
                enforceNoDataAvail(parcel);
                onLocationAvailability(locationAvailability);
            } else {
                if (i != 3) {
                    return false;
                }
                onRemoved();
            }
            return true;
        }
    }

    void onLocationAvailability(LocationAvailability locationAvailability);

    void onLocationResult(LocationResult locationResult);

    void onRemoved();
}
