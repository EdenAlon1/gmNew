package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.LatLng;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFeatureClickEventDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFeatureClickEventDelegate {
        static final int TRANSACTION_getFeatures = 2;
        static final int TRANSACTION_getLatLng = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFeatureClickEventDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IFeatureClickEventDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureClickEventDelegate
            public List<IBinder> getFeatures() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                ArrayList<IBinder> createBinderArrayList = transactAndReadException.createBinderArrayList();
                transactAndReadException.recycle();
                return createBinderArrayList;
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureClickEventDelegate
            public LatLng getLatLng() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                LatLng latLng = (LatLng) rve.a(transactAndReadException, LatLng.CREATOR);
                transactAndReadException.recycle();
                return latLng;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IFeatureClickEventDelegate");
        }

        public static IFeatureClickEventDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IFeatureClickEventDelegate");
            return queryLocalInterface instanceof IFeatureClickEventDelegate ? (IFeatureClickEventDelegate) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                LatLng latLng = getLatLng();
                parcel2.writeNoException();
                rve.e(parcel2, latLng);
            } else {
                if (i != 2) {
                    return false;
                }
                List<IBinder> features = getFeatures();
                parcel2.writeNoException();
                parcel2.writeBinderList(features);
            }
            return true;
        }
    }

    List<IBinder> getFeatures();

    LatLng getLatLng();
}
