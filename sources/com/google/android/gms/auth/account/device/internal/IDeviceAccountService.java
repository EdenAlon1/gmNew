package com.google.android.gms.auth.account.device.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.account.device.AddCastCertificateToDeviceAccountRequest;
import com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IDeviceAccountService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IDeviceAccountService {
        static final int TRANSACTION_addCastCertificateToDeviceAccount = 1;
        static final int TRANSACTION_getDeviceAccountJwt = 3;
        static final int TRANSACTION_getIddid = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IDeviceAccountService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.device.internal.IDeviceAccountService");
            }

            @Override // com.google.android.gms.auth.account.device.internal.IDeviceAccountService
            public void addCastCertificateToDeviceAccount(IDeviceAccountCallbacks iDeviceAccountCallbacks, AddCastCertificateToDeviceAccountRequest addCastCertificateToDeviceAccountRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iDeviceAccountCallbacks);
                rve.d(obtainAndWriteInterfaceToken, addCastCertificateToDeviceAccountRequest);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.device.internal.IDeviceAccountService
            public void getDeviceAccountJwt(IDeviceAccountCallbacks iDeviceAccountCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iDeviceAccountCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.device.internal.IDeviceAccountService
            public void getIddid(IDeviceAccountCallbacks iDeviceAccountCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iDeviceAccountCallbacks);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.device.internal.IDeviceAccountService");
        }

        public static IDeviceAccountService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.device.internal.IDeviceAccountService");
            return queryLocalInterface instanceof IDeviceAccountService ? (IDeviceAccountService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IDeviceAccountCallbacks asInterface = IDeviceAccountCallbacks.Stub.asInterface(parcel.readStrongBinder());
                AddCastCertificateToDeviceAccountRequest addCastCertificateToDeviceAccountRequest = (AddCastCertificateToDeviceAccountRequest) rve.a(parcel, AddCastCertificateToDeviceAccountRequest.CREATOR);
                enforceNoDataAvail(parcel);
                addCastCertificateToDeviceAccount(asInterface, addCastCertificateToDeviceAccountRequest);
            } else if (i == 2) {
                IDeviceAccountCallbacks asInterface2 = IDeviceAccountCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getIddid(asInterface2);
            } else {
                if (i != 3) {
                    return false;
                }
                IDeviceAccountCallbacks asInterface3 = IDeviceAccountCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                getDeviceAccountJwt(asInterface3, readString);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addCastCertificateToDeviceAccount(IDeviceAccountCallbacks iDeviceAccountCallbacks, AddCastCertificateToDeviceAccountRequest addCastCertificateToDeviceAccountRequest);

    void getDeviceAccountJwt(IDeviceAccountCallbacks iDeviceAccountCallbacks, String str);

    void getIddid(IDeviceAccountCallbacks iDeviceAccountCallbacks);
}
