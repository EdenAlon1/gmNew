package com.google.android.gms.fido.u2f.internal.privileged;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IU2fPrivilegedService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IU2fPrivilegedService {
        static final int TRANSACTION_getRegisterIntent = 1;
        static final int TRANSACTION_getSignIntent = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IU2fPrivilegedService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedService");
            }

            @Override // com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedService
            public void getRegisterIntent(IU2fPrivilegedCallbacks iU2fPrivilegedCallbacks, BrowserRegisterRequestParams browserRegisterRequestParams, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iU2fPrivilegedCallbacks);
                rve.d(obtainAndWriteInterfaceToken, browserRegisterRequestParams);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedService
            public void getSignIntent(IU2fPrivilegedCallbacks iU2fPrivilegedCallbacks, BrowserSignRequestParams browserSignRequestParams, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iU2fPrivilegedCallbacks);
                rve.d(obtainAndWriteInterfaceToken, browserSignRequestParams);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedService");
        }

        public static IU2fPrivilegedService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.privileged.IU2fPrivilegedService");
            return queryLocalInterface instanceof IU2fPrivilegedService ? (IU2fPrivilegedService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IU2fPrivilegedCallbacks asInterface = IU2fPrivilegedCallbacks.Stub.asInterface(parcel.readStrongBinder());
                BrowserRegisterRequestParams browserRegisterRequestParams = (BrowserRegisterRequestParams) rve.a(parcel, BrowserRegisterRequestParams.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getRegisterIntent(asInterface, browserRegisterRequestParams, apiMetadata);
            } else {
                if (i != 2) {
                    return false;
                }
                IU2fPrivilegedCallbacks asInterface2 = IU2fPrivilegedCallbacks.Stub.asInterface(parcel.readStrongBinder());
                BrowserSignRequestParams browserSignRequestParams = (BrowserSignRequestParams) rve.a(parcel, BrowserSignRequestParams.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getSignIntent(asInterface2, browserSignRequestParams, apiMetadata2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getRegisterIntent(IU2fPrivilegedCallbacks iU2fPrivilegedCallbacks, BrowserRegisterRequestParams browserRegisterRequestParams, ApiMetadata apiMetadata);

    void getSignIntent(IU2fPrivilegedCallbacks iU2fPrivilegedCallbacks, BrowserSignRequestParams browserSignRequestParams, ApiMetadata apiMetadata);
}
