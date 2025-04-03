package com.google.android.gms.auth.proximity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IProximityAuthCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IProximityAuthCallbacks {
        static final int TRANSACTION_onConnectionStatusChanged = 1;
        static final int TRANSACTION_onMessageReceived = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IProximityAuthCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks");
            }

            @Override // com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks
            public void onConnectionStatusChanged(String str, int i, int i2, int i3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeInt(i3);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks
            public void onMessageReceived(String str, String str2, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks");
        }

        public static IProximityAuthCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.internal.IProximityAuthCallbacks");
            return queryLocalInterface instanceof IProximityAuthCallbacks ? (IProximityAuthCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                onConnectionStatusChanged(readString, readInt, readInt2, readInt3);
            } else {
                if (i != 2) {
                    return false;
                }
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                onMessageReceived(readString2, readString3, createByteArray);
            }
            return true;
        }
    }

    void onConnectionStatusChanged(String str, int i, int i2, int i3);

    void onMessageReceived(String str, String str2, byte[] bArr);
}
