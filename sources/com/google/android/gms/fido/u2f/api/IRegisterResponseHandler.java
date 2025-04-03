package com.google.android.gms.fido.u2f.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.fido.common.nfc.INfcReaderCallback;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IRegisterResponseHandler extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IRegisterResponseHandler {
        static final int TRANSACTION_onDisableNfcReaderMode = 5;
        static final int TRANSACTION_onEnableNfcReaderMode = 4;
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 3;
        static final int TRANSACTION_onViewSelected = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IRegisterResponseHandler {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.u2f.api.IRegisterResponseHandler");
            }

            @Override // com.google.android.gms.fido.u2f.api.IRegisterResponseHandler
            public void onDisableNfcReaderMode() {
                transactOneway(5, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.fido.u2f.api.IRegisterResponseHandler
            public void onEnableNfcReaderMode(INfcReaderCallback iNfcReaderCallback, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iNfcReaderCallback);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.api.IRegisterResponseHandler
            public void onFailure(ErrorResponseData errorResponseData) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, errorResponseData);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.api.IRegisterResponseHandler
            public void onSuccess(RegisterResponseData registerResponseData) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, registerResponseData);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.u2f.api.IRegisterResponseHandler
            public void onViewSelected(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.u2f.api.IRegisterResponseHandler");
        }

        public static IRegisterResponseHandler asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.api.IRegisterResponseHandler");
            return queryLocalInterface instanceof IRegisterResponseHandler ? (IRegisterResponseHandler) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                onViewSelected(readString);
            } else if (i == 2) {
                ErrorResponseData errorResponseData = (ErrorResponseData) rve.a(parcel, ErrorResponseData.CREATOR);
                enforceNoDataAvail(parcel);
                onFailure(errorResponseData);
            } else if (i == 3) {
                RegisterResponseData registerResponseData = (RegisterResponseData) rve.a(parcel, RegisterResponseData.CREATOR);
                enforceNoDataAvail(parcel);
                onSuccess(registerResponseData);
            } else if (i == 4) {
                INfcReaderCallback asInterface = INfcReaderCallback.Stub.asInterface(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                onEnableNfcReaderMode(asInterface, readInt);
            } else {
                if (i != 5) {
                    return false;
                }
                onDisableNfcReaderMode();
            }
            return true;
        }
    }

    void onDisableNfcReaderMode();

    void onEnableNfcReaderMode(INfcReaderCallback iNfcReaderCallback, int i);

    void onFailure(ErrorResponseData errorResponseData);

    void onSuccess(RegisterResponseData registerResponseData);

    void onViewSelected(String str);
}
