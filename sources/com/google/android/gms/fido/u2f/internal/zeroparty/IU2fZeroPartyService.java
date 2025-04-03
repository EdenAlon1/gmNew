package com.google.android.gms.fido.u2f.internal.zeroparty;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.fido.u2f.api.IRegisterResponseHandler;
import com.google.android.gms.fido.u2f.api.ISignResponseHandler;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IU2fZeroPartyService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IU2fZeroPartyService {
        static final int TRANSACTION_headlessRegister = 2;
        static final int TRANSACTION_headlessSign = 1;
        static final int TRANSACTION_updateTransaction = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IU2fZeroPartyService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
            }

            @Override // com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService
            public void headlessRegister(IStatusCallback iStatusCallback, BrowserRegisterRequestParams browserRegisterRequestParams, IRegisterResponseHandler iRegisterResponseHandler, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, browserRegisterRequestParams);
                rve.f(obtainAndWriteInterfaceToken, iRegisterResponseHandler);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService
            public void headlessSign(IStatusCallback iStatusCallback, BrowserSignRequestParams browserSignRequestParams, ISignResponseHandler iSignResponseHandler, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, browserSignRequestParams);
                rve.f(obtainAndWriteInterfaceToken, iSignResponseHandler);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService
            public void updateTransaction(IStatusCallback iStatusCallback, StateUpdate stateUpdate, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, stateUpdate);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
        }

        public static IU2fZeroPartyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
            return queryLocalInterface instanceof IU2fZeroPartyService ? (IU2fZeroPartyService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                BrowserSignRequestParams browserSignRequestParams = (BrowserSignRequestParams) rve.a(parcel, BrowserSignRequestParams.CREATOR);
                ISignResponseHandler asInterface2 = ISignResponseHandler.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                headlessSign(asInterface, browserSignRequestParams, asInterface2, apiMetadata);
            } else if (i == 2) {
                IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                BrowserRegisterRequestParams browserRegisterRequestParams = (BrowserRegisterRequestParams) rve.a(parcel, BrowserRegisterRequestParams.CREATOR);
                IRegisterResponseHandler asInterface4 = IRegisterResponseHandler.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                headlessRegister(asInterface3, browserRegisterRequestParams, asInterface4, apiMetadata2);
            } else {
                if (i != 3) {
                    return false;
                }
                IStatusCallback asInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                StateUpdate stateUpdate = (StateUpdate) rve.a(parcel, StateUpdate.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                updateTransaction(asInterface5, stateUpdate, apiMetadata3);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void headlessRegister(IStatusCallback iStatusCallback, BrowserRegisterRequestParams browserRegisterRequestParams, IRegisterResponseHandler iRegisterResponseHandler, ApiMetadata apiMetadata);

    void headlessSign(IStatusCallback iStatusCallback, BrowserSignRequestParams browserSignRequestParams, ISignResponseHandler iSignResponseHandler, ApiMetadata apiMetadata);

    void updateTransaction(IStatusCallback iStatusCallback, StateUpdate stateUpdate, ApiMetadata apiMetadata);
}
