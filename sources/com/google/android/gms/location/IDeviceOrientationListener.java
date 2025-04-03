package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IDeviceOrientationListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IDeviceOrientationListener {
        static final int TRANSACTION_onDeviceOrientationChanged = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IDeviceOrientationListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.IDeviceOrientationListener");
            }

            @Override // com.google.android.gms.location.IDeviceOrientationListener
            public void onDeviceOrientationChanged(DeviceOrientation deviceOrientation) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, deviceOrientation);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.location.IDeviceOrientationListener");
        }

        public static IDeviceOrientationListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            return queryLocalInterface instanceof IDeviceOrientationListener ? (IDeviceOrientationListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            DeviceOrientation deviceOrientation = (DeviceOrientation) rve.a(parcel, DeviceOrientation.CREATOR);
            enforceNoDataAvail(parcel);
            onDeviceOrientationChanged(deviceOrientation);
            return true;
        }
    }

    void onDeviceOrientationChanged(DeviceOrientation deviceOrientation);
}
