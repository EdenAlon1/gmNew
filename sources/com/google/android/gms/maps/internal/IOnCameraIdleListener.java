package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnCameraIdleListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnCameraIdleListener {
        static final int TRANSACTION_onCameraIdle = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnCameraIdleListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnCameraIdleListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnCameraIdleListener
            public void onCameraIdle() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
        }

        public static IOnCameraIdleListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraIdleListener");
            return queryLocalInterface instanceof IOnCameraIdleListener ? (IOnCameraIdleListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            onCameraIdle();
            parcel2.writeNoException();
            return true;
        }
    }

    void onCameraIdle();
}
