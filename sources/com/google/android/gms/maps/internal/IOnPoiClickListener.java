package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.PointOfInterest;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnPoiClickListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnPoiClickListener {
        static final int TRANSACTION_onTap = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnPoiClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnPoiClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnPoiClickListener
            public void onTap(PointOfInterest pointOfInterest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, pointOfInterest);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnPoiClickListener");
        }

        public static IOnPoiClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnPoiClickListener");
            return queryLocalInterface instanceof IOnPoiClickListener ? (IOnPoiClickListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            PointOfInterest pointOfInterest = (PointOfInterest) rve.a(parcel, PointOfInterest.CREATOR);
            enforceNoDataAvail(parcel);
            onTap(pointOfInterest);
            parcel2.writeNoException();
            return true;
        }
    }

    void onTap(PointOfInterest pointOfInterest);
}
