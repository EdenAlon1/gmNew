package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnStreetViewPanoramaLongClickListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnStreetViewPanoramaLongClickListener {
        static final int TRANSACTION_onStreetViewPanoramaLongClick = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnStreetViewPanoramaLongClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener
            public void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, streetViewPanoramaOrientation);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
        }

        public static IOnStreetViewPanoramaLongClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
            return queryLocalInterface instanceof IOnStreetViewPanoramaLongClickListener ? (IOnStreetViewPanoramaLongClickListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) rve.a(parcel, StreetViewPanoramaOrientation.CREATOR);
            enforceNoDataAvail(parcel);
            onStreetViewPanoramaLongClick(streetViewPanoramaOrientation);
            parcel2.writeNoException();
            return true;
        }
    }

    void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation);
}
