package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ILocationListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ILocationListener {
        static final int TRANSACTION_onLocationChanged = 1;
        static final int TRANSACTION_onRemoved = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ILocationListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.ILocationListener");
            }

            @Override // com.google.android.gms.location.ILocationListener
            public void onLocationChanged(Location location) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, location);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.ILocationListener
            public void onRemoved() {
                transactOneway(2, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.location.ILocationListener");
        }

        public static ILocationListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            return queryLocalInterface instanceof ILocationListener ? (ILocationListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Location location = (Location) rve.a(parcel, Location.CREATOR);
                enforceNoDataAvail(parcel);
                onLocationChanged(location);
            } else {
                if (i != 2) {
                    return false;
                }
                onRemoved();
            }
            return true;
        }
    }

    void onLocationChanged(Location location);

    void onRemoved();
}
