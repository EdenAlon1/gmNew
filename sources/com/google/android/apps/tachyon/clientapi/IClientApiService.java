package com.google.android.apps.tachyon.clientapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.tachyon.clientapi.IGetMeetApiAvailabilityCallback;
import com.google.android.apps.tachyon.clientapi.IGetRegisteredIdTypeCallback;
import com.google.android.apps.tachyon.clientapi.IGetRegistrationInfoCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IClientApiService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IClientApiService {
        static final int TRANSACTION_getMeetApiAvailabilityInfo = 4;
        static final int TRANSACTION_getRegisteredIdType = 3;
        static final int TRANSACTION_getRegistrationInfo = 2;
        static final int TRANSACTION_getSupportedApiFeatures = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IClientApiService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tachyon.clientapi.IClientApiService");
            }

            @Override // com.google.android.apps.tachyon.clientapi.IClientApiService
            public void getMeetApiAvailabilityInfo(IGetMeetApiAvailabilityCallback iGetMeetApiAvailabilityCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iGetMeetApiAvailabilityCallback);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tachyon.clientapi.IClientApiService
            public void getRegisteredIdType(IGetRegisteredIdTypeCallback iGetRegisteredIdTypeCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iGetRegisteredIdTypeCallback);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tachyon.clientapi.IClientApiService
            public void getRegistrationInfo(IGetRegistrationInfoCallback iGetRegistrationInfoCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iGetRegistrationInfoCallback);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tachyon.clientapi.IClientApiService
            public byte[] getSupportedApiFeatures() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                byte[] createByteArray = transactAndReadException.createByteArray();
                transactAndReadException.recycle();
                return createByteArray;
            }
        }

        public Stub() {
            super("com.google.android.apps.tachyon.clientapi.IClientApiService");
        }

        public static IClientApiService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tachyon.clientapi.IClientApiService");
            return queryLocalInterface instanceof IClientApiService ? (IClientApiService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                byte[] supportedApiFeatures = getSupportedApiFeatures();
                parcel2.writeNoException();
                parcel2.writeByteArray(supportedApiFeatures);
            } else if (i == 2) {
                IGetRegistrationInfoCallback asInterface = IGetRegistrationInfoCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getRegistrationInfo(asInterface);
                parcel2.writeNoException();
            } else if (i == 3) {
                IGetRegisteredIdTypeCallback asInterface2 = IGetRegisteredIdTypeCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getRegisteredIdType(asInterface2);
                parcel2.writeNoException();
            } else {
                if (i != 4) {
                    return false;
                }
                IGetMeetApiAvailabilityCallback asInterface3 = IGetMeetApiAvailabilityCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getMeetApiAvailabilityInfo(asInterface3);
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void getMeetApiAvailabilityInfo(IGetMeetApiAvailabilityCallback iGetMeetApiAvailabilityCallback);

    void getRegisteredIdType(IGetRegisteredIdTypeCallback iGetRegisteredIdTypeCallback);

    void getRegistrationInfo(IGetRegistrationInfoCallback iGetRegistrationInfoCallback);

    byte[] getSupportedApiFeatures();
}
