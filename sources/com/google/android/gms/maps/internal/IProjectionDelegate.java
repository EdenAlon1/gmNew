package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IProjectionDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IProjectionDelegate {
        static final int TRANSACTION_fromScreenLocation = 1;
        static final int TRANSACTION_getVisibleRegion = 3;
        static final int TRANSACTION_toScreenLocation = 2;
        static final int TRANSACTION_toScreenLocationWithAltitude = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IProjectionDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
            }

            @Override // com.google.android.gms.maps.internal.IProjectionDelegate
            public LatLng fromScreenLocation(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                LatLng latLng = (LatLng) rve.a(transactAndReadException, LatLng.CREATOR);
                transactAndReadException.recycle();
                return latLng;
            }

            @Override // com.google.android.gms.maps.internal.IProjectionDelegate
            public VisibleRegion getVisibleRegion() {
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                VisibleRegion visibleRegion = (VisibleRegion) rve.a(transactAndReadException, VisibleRegion.CREATOR);
                transactAndReadException.recycle();
                return visibleRegion;
            }

            @Override // com.google.android.gms.maps.internal.IProjectionDelegate
            public IObjectWrapper toScreenLocation(LatLng latLng) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, latLng);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IProjectionDelegate
            public IObjectWrapper toScreenLocationWithAltitude(LatLng latLng, float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, latLng);
                obtainAndWriteInterfaceToken.writeFloat(f);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IProjectionDelegate");
        }

        public static IProjectionDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            return queryLocalInterface instanceof IProjectionDelegate ? (IProjectionDelegate) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                LatLng fromScreenLocation = fromScreenLocation(asInterface);
                parcel2.writeNoException();
                rve.e(parcel2, fromScreenLocation);
            } else if (i == 2) {
                LatLng latLng = (LatLng) rve.a(parcel, LatLng.CREATOR);
                enforceNoDataAvail(parcel);
                IObjectWrapper screenLocation = toScreenLocation(latLng);
                parcel2.writeNoException();
                rve.f(parcel2, screenLocation);
            } else if (i == 3) {
                VisibleRegion visibleRegion = getVisibleRegion();
                parcel2.writeNoException();
                rve.e(parcel2, visibleRegion);
            } else {
                if (i != 4) {
                    return false;
                }
                LatLng latLng2 = (LatLng) rve.a(parcel, LatLng.CREATOR);
                float readFloat = parcel.readFloat();
                enforceNoDataAvail(parcel);
                IObjectWrapper screenLocationWithAltitude = toScreenLocationWithAltitude(latLng2, readFloat);
                parcel2.writeNoException();
                rve.f(parcel2, screenLocationWithAltitude);
            }
            return true;
        }
    }

    LatLng fromScreenLocation(IObjectWrapper iObjectWrapper);

    VisibleRegion getVisibleRegion();

    IObjectWrapper toScreenLocation(LatLng latLng);

    IObjectWrapper toScreenLocationWithAltitude(LatLng latLng, float f);
}
