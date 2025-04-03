package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFeatureDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFeatureDelegate {
        static final int TRANSACTION_getDatasetAttributes = 5;
        static final int TRANSACTION_getDatasetId = 4;
        static final int TRANSACTION_getFeatureType = 2;
        static final int TRANSACTION_getPlaceId = 3;
        static final int TRANSACTION_getSubfeatureType = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFeatureDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IFeatureDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureDelegate
            public Map getDatasetAttributes() {
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                HashMap c = rve.c(transactAndReadException);
                transactAndReadException.recycle();
                return c;
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureDelegate
            public String getDatasetId() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureDelegate
            public String getFeatureType() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureDelegate
            public String getPlaceId() {
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureDelegate
            public int getSubfeatureType() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IFeatureDelegate");
        }

        public static IFeatureDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IFeatureDelegate");
            return queryLocalInterface instanceof IFeatureDelegate ? (IFeatureDelegate) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                int subfeatureType = getSubfeatureType();
                parcel2.writeNoException();
                parcel2.writeInt(subfeatureType);
            } else if (i == 2) {
                String featureType = getFeatureType();
                parcel2.writeNoException();
                parcel2.writeString(featureType);
            } else if (i == 3) {
                String placeId = getPlaceId();
                parcel2.writeNoException();
                parcel2.writeString(placeId);
            } else if (i == 4) {
                String datasetId = getDatasetId();
                parcel2.writeNoException();
                parcel2.writeString(datasetId);
            } else {
                if (i != 5) {
                    return false;
                }
                Map datasetAttributes = getDatasetAttributes();
                parcel2.writeNoException();
                parcel2.writeMap(datasetAttributes);
            }
            return true;
        }
    }

    Map getDatasetAttributes();

    String getDatasetId();

    String getFeatureType();

    String getPlaceId();

    int getSubfeatureType();
}
