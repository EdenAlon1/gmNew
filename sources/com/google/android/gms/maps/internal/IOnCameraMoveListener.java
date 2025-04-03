package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnCameraMoveListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnCameraMoveListener {
        static final int TRANSACTION_onCameraMove = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnCameraMoveListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnCameraMoveListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnCameraMoveListener
            public void onCameraMove() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnCameraMoveListener");
        }

        public static IOnCameraMoveListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnCameraMoveListener");
            return queryLocalInterface instanceof IOnCameraMoveListener ? (IOnCameraMoveListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            onCameraMove();
            parcel2.writeNoException();
            return true;
        }
    }

    void onCameraMove();
}
