package com.google.android.ims.rcsservice.locationsharing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ILocationSharing extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ILocationSharing {
        static final int TRANSACTION_pushLocation = 1;
        static final int TRANSACTION_pushLocationToGroup = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ILocationSharing {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.locationsharing.ILocationSharing");
            }

            @Override // com.google.android.ims.rcsservice.locationsharing.ILocationSharing
            public LocationSharingResult pushLocation(String str, LocationInformation locationInformation, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, locationInformation);
                obtainAndWriteInterfaceToken.writeString(str2);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                LocationSharingResult locationSharingResult = (LocationSharingResult) rve.a(transactAndReadException, LocationSharingResult.CREATOR);
                transactAndReadException.recycle();
                return locationSharingResult;
            }

            @Override // com.google.android.ims.rcsservice.locationsharing.ILocationSharing
            public LocationSharingResult[] pushLocationToGroup(long j, LocationInformation locationInformation, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                rve.d(obtainAndWriteInterfaceToken, locationInformation);
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                LocationSharingResult[] locationSharingResultArr = (LocationSharingResult[]) transactAndReadException.createTypedArray(LocationSharingResult.CREATOR);
                transactAndReadException.recycle();
                return locationSharingResultArr;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.locationsharing.ILocationSharing");
        }

        public static ILocationSharing asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.locationsharing.ILocationSharing");
            return queryLocalInterface instanceof ILocationSharing ? (ILocationSharing) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String readString = parcel.readString();
                LocationInformation locationInformation = (LocationInformation) rve.a(parcel, LocationInformation.CREATOR);
                String readString2 = parcel.readString();
                enforceNoDataAvail(parcel);
                LocationSharingResult pushLocation = pushLocation(readString, locationInformation, readString2);
                parcel2.writeNoException();
                rve.e(parcel2, pushLocation);
            } else {
                if (i != 2) {
                    return false;
                }
                long readLong = parcel.readLong();
                LocationInformation locationInformation2 = (LocationInformation) rve.a(parcel, LocationInformation.CREATOR);
                String readString3 = parcel.readString();
                enforceNoDataAvail(parcel);
                LocationSharingResult[] pushLocationToGroup = pushLocationToGroup(readLong, locationInformation2, readString3);
                parcel2.writeNoException();
                parcel2.writeTypedArray(pushLocationToGroup, 1);
            }
            return true;
        }
    }

    LocationSharingResult pushLocation(String str, LocationInformation locationInformation, String str2);

    LocationSharingResult[] pushLocationToGroup(long j, LocationInformation locationInformation, String str);
}
