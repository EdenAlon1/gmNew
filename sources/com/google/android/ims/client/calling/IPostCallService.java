package com.google.android.ims.client.calling;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IPostCallService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPostCallService {
        static final int TRANSACTION_sendAudioMessage = 2;
        static final int TRANSACTION_sendNote = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPostCallService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.calling.IPostCallService");
            }

            @Override // com.google.android.ims.client.calling.IPostCallService
            public int sendAudioMessage(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.calling.IPostCallService
            public int sendNote(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }
        }

        public Stub() {
            super("com.google.android.ims.client.calling.IPostCallService");
        }

        public static IPostCallService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.calling.IPostCallService");
            return queryLocalInterface instanceof IPostCallService ? (IPostCallService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String readString = parcel.readString();
                Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                int sendNote = sendNote(readString, bundle);
                parcel2.writeNoException();
                parcel2.writeInt(sendNote);
            } else {
                if (i != 2) {
                    return false;
                }
                String readString2 = parcel.readString();
                Bundle bundle2 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                int sendAudioMessage = sendAudioMessage(readString2, bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(sendAudioMessage);
            }
            return true;
        }
    }

    int sendAudioMessage(String str, Bundle bundle);

    int sendNote(String str, Bundle bundle);
}
