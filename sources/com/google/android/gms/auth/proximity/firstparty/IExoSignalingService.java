package com.google.android.gms.auth.proximity.firstparty;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IExoSignalingService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IExoSignalingService {
        static final int TRANSACTION_checkCdmAssociation = 7;
        static final int TRANSACTION_onReceivedSignalingMessage = 3;
        static final int TRANSACTION_setCallback = 2;
        static final int TRANSACTION_startCdmAssociation = 8;
        static final int TRANSACTION_terminateStream = 4;
        static final int TRANSACTION_warnTerminateStream = 6;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IExoSignalingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.proximity.firstparty.IExoSignalingService");
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingService
            public void checkCdmAssociation(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingService
            public void onReceivedSignalingMessage(String str, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingService
            public void setCallback(IExoSignalingCallback iExoSignalingCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iExoSignalingCallback);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingService
            public void startCdmAssociation(String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingService
            public void terminateStream(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingService
            public void warnTerminateStream(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.proximity.firstparty.IExoSignalingService");
        }

        public static IExoSignalingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.firstparty.IExoSignalingService");
            return queryLocalInterface instanceof IExoSignalingService ? (IExoSignalingService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                IExoSignalingCallback asInterface = IExoSignalingCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                setCallback(asInterface);
            } else if (i == 3) {
                String readString = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                onReceivedSignalingMessage(readString, createByteArray);
            } else if (i == 4) {
                String readString2 = parcel.readString();
                enforceNoDataAvail(parcel);
                terminateStream(readString2);
            } else if (i == 6) {
                String readString3 = parcel.readString();
                enforceNoDataAvail(parcel);
                warnTerminateStream(readString3);
            } else if (i == 7) {
                String readString4 = parcel.readString();
                enforceNoDataAvail(parcel);
                checkCdmAssociation(readString4);
            } else {
                if (i != 8) {
                    return false;
                }
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                enforceNoDataAvail(parcel);
                startCdmAssociation(readString5, readString6);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void checkCdmAssociation(String str);

    void onReceivedSignalingMessage(String str, byte[] bArr);

    void setCallback(IExoSignalingCallback iExoSignalingCallback);

    void startCdmAssociation(String str, String str2);

    void terminateStream(String str);

    void warnTerminateStream(String str);
}
