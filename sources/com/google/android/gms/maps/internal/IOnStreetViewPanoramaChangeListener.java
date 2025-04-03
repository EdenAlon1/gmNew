package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnStreetViewPanoramaChangeListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnStreetViewPanoramaChangeListener {
        static final int TRANSACTION_onStreetViewPanoramaChange = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnStreetViewPanoramaChangeListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener
            public void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetViewPanoramaLocation) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, streetViewPanoramaLocation);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
        }

        public static IOnStreetViewPanoramaChangeListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
            return queryLocalInterface instanceof IOnStreetViewPanoramaChangeListener ? (IOnStreetViewPanoramaChangeListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) rve.a(parcel, StreetViewPanoramaLocation.CREATOR);
            enforceNoDataAvail(parcel);
            onStreetViewPanoramaChange(streetViewPanoramaLocation);
            parcel2.writeNoException();
            return true;
        }
    }

    void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetViewPanoramaLocation);
}
