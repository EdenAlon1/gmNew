package com.google.android.ims.client.calling.video;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface OutgoingVideoSharingListenerInternal extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements OutgoingVideoSharingListenerInternal {
        static final int TRANSACTION_onOutgoingVideoSharingStartFailed = 2;
        static final int TRANSACTION_onOutgoingVideoSharingStarted = 1;
        static final int TRANSACTION_onOutgoingVideoSharingStatusUpdated = 4;
        static final int TRANSACTION_onOutgoingVideoSharingStopped = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements OutgoingVideoSharingListenerInternal {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal");
            }

            @Override // com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal
            public void onOutgoingVideoSharingStartFailed(String str, int i, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal
            public void onOutgoingVideoSharingStarted(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal
            public void onOutgoingVideoSharingStatusUpdated(String str, int i, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal
            public void onOutgoingVideoSharingStopped(String str, int i, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal");
        }

        public static OutgoingVideoSharingListenerInternal asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.calling.video.OutgoingVideoSharingListenerInternal");
            return queryLocalInterface instanceof OutgoingVideoSharingListenerInternal ? (OutgoingVideoSharingListenerInternal) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String readString = parcel.readString();
                Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onOutgoingVideoSharingStarted(readString, bundle);
            } else if (i == 2) {
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                Bundle bundle2 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onOutgoingVideoSharingStartFailed(readString2, readInt, bundle2);
            } else if (i == 3) {
                String readString3 = parcel.readString();
                int readInt2 = parcel.readInt();
                Bundle bundle3 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onOutgoingVideoSharingStopped(readString3, readInt2, bundle3);
            } else {
                if (i != 4) {
                    return false;
                }
                String readString4 = parcel.readString();
                int readInt3 = parcel.readInt();
                Bundle bundle4 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onOutgoingVideoSharingStatusUpdated(readString4, readInt3, bundle4);
            }
            return true;
        }
    }

    void onOutgoingVideoSharingStartFailed(String str, int i, Bundle bundle);

    void onOutgoingVideoSharingStarted(String str, Bundle bundle);

    void onOutgoingVideoSharingStatusUpdated(String str, int i, Bundle bundle);

    void onOutgoingVideoSharingStopped(String str, int i, Bundle bundle);
}
