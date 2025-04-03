package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IInfoWindowAdapter extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInfoWindowAdapter {
        static final int TRANSACTION_getInfoContents = 2;
        static final int TRANSACTION_getInfoWindow = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInfoWindowAdapter {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IInfoWindowAdapter");
            }

            @Override // com.google.android.gms.maps.internal.IInfoWindowAdapter
            public IObjectWrapper getInfoContents(IMarkerDelegate iMarkerDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMarkerDelegate);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IInfoWindowAdapter
            public IObjectWrapper getInfoWindow(IMarkerDelegate iMarkerDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMarkerDelegate);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        }

        public static IInfoWindowAdapter asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            return queryLocalInterface instanceof IInfoWindowAdapter ? (IInfoWindowAdapter) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IMarkerDelegate asInterface = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                IObjectWrapper infoWindow = getInfoWindow(asInterface);
                parcel2.writeNoException();
                rve.f(parcel2, infoWindow);
            } else {
                if (i != 2) {
                    return false;
                }
                IMarkerDelegate asInterface2 = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                IObjectWrapper infoContents = getInfoContents(asInterface2);
                parcel2.writeNoException();
                rve.f(parcel2, infoContents);
            }
            return true;
        }
    }

    IObjectWrapper getInfoContents(IMarkerDelegate iMarkerDelegate);

    IObjectWrapper getInfoWindow(IMarkerDelegate iMarkerDelegate);
}
