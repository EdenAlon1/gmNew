package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnStreetViewPanoramaReadyCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnStreetViewPanoramaReadyCallback {
        static final int TRANSACTION_onStreetViewPanoramaReady = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnStreetViewPanoramaReadyCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
            }

            @Override // com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback
            public void onStreetViewPanoramaReady(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStreetViewPanoramaDelegate);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
        }

        public static IOnStreetViewPanoramaReadyCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
            return queryLocalInterface instanceof IOnStreetViewPanoramaReadyCallback ? (IOnStreetViewPanoramaReadyCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IStreetViewPanoramaDelegate asInterface = IStreetViewPanoramaDelegate.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            onStreetViewPanoramaReady(asInterface);
            parcel2.writeNoException();
            return true;
        }
    }

    void onStreetViewPanoramaReady(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate);
}
