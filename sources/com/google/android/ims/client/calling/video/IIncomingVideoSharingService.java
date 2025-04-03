package com.google.android.ims.client.calling.video;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.ims.client.calling.video.IncomingVideoSharingListenerInternal;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IIncomingVideoSharingService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IIncomingVideoSharingService {
        static final int TRANSACTION_acceptVideo = 3;
        static final int TRANSACTION_registerIncomingVideoSharingListener = 1;
        static final int TRANSACTION_rejectVideo = 2;
        static final int TRANSACTION_stopVideo = 4;
        static final int TRANSACTION_updateParameters = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IIncomingVideoSharingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.calling.video.IIncomingVideoSharingService");
            }

            @Override // com.google.android.ims.client.calling.video.IIncomingVideoSharingService
            public int acceptVideo(String str, IncomingVideoSharingListenerInternal incomingVideoSharingListenerInternal, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.f(obtainAndWriteInterfaceToken, incomingVideoSharingListenerInternal);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.calling.video.IIncomingVideoSharingService
            public void registerIncomingVideoSharingListener(IncomingVideoSharingListenerInternal incomingVideoSharingListenerInternal, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, incomingVideoSharingListenerInternal);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.IIncomingVideoSharingService
            public int rejectVideo(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.calling.video.IIncomingVideoSharingService
            public int stopVideo(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.calling.video.IIncomingVideoSharingService
            public int updateParameters(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }
        }

        public Stub() {
            super("com.google.android.ims.client.calling.video.IIncomingVideoSharingService");
        }

        public static IIncomingVideoSharingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.calling.video.IIncomingVideoSharingService");
            return queryLocalInterface instanceof IIncomingVideoSharingService ? (IIncomingVideoSharingService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IncomingVideoSharingListenerInternal asInterface = IncomingVideoSharingListenerInternal.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                registerIncomingVideoSharingListener(asInterface, bundle);
                parcel2.writeNoException();
            } else if (i == 2) {
                String readString = parcel.readString();
                Bundle bundle2 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                int rejectVideo = rejectVideo(readString, bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(rejectVideo);
            } else if (i == 3) {
                String readString2 = parcel.readString();
                IncomingVideoSharingListenerInternal asInterface2 = IncomingVideoSharingListenerInternal.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle3 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                int acceptVideo = acceptVideo(readString2, asInterface2, bundle3);
                parcel2.writeNoException();
                parcel2.writeInt(acceptVideo);
            } else if (i == 4) {
                String readString3 = parcel.readString();
                Bundle bundle4 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                int stopVideo = stopVideo(readString3, bundle4);
                parcel2.writeNoException();
                parcel2.writeInt(stopVideo);
            } else {
                if (i != 5) {
                    return false;
                }
                String readString4 = parcel.readString();
                Bundle bundle5 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                int updateParameters = updateParameters(readString4, bundle5);
                parcel2.writeNoException();
                parcel2.writeInt(updateParameters);
            }
            return true;
        }
    }

    int acceptVideo(String str, IncomingVideoSharingListenerInternal incomingVideoSharingListenerInternal, Bundle bundle);

    void registerIncomingVideoSharingListener(IncomingVideoSharingListenerInternal incomingVideoSharingListenerInternal, Bundle bundle);

    int rejectVideo(String str, Bundle bundle);

    int stopVideo(String str, Bundle bundle);

    int updateParameters(String str, Bundle bundle);
}
