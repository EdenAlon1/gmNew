package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.LatLng;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnMapLongClickListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnMapLongClickListener {
        static final int TRANSACTION_onMapLongClick = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnMapLongClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnMapLongClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnMapLongClickListener
            public void onMapLongClick(LatLng latLng) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, latLng);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnMapLongClickListener");
        }

        public static IOnMapLongClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
            return queryLocalInterface instanceof IOnMapLongClickListener ? (IOnMapLongClickListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            LatLng latLng = (LatLng) rve.a(parcel, LatLng.CREATOR);
            enforceNoDataAvail(parcel);
            onMapLongClick(latLng);
            parcel2.writeNoException();
            return true;
        }
    }

    void onMapLongClick(LatLng latLng);
}
