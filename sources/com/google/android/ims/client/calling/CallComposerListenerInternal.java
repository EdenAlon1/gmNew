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
public interface CallComposerListenerInternal extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements CallComposerListenerInternal {
        static final int TRANSACTION_onCallComposerPrepareFailed = 2;
        static final int TRANSACTION_onCallComposerPrepared = 1;
        static final int TRANSACTION_onCallComposerSessionTerminated = 5;
        static final int TRANSACTION_onComposerContentTransferFailure = 4;
        static final int TRANSACTION_onComposerContentTransferSuccess = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements CallComposerListenerInternal {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.calling.CallComposerListenerInternal");
            }

            @Override // com.google.android.ims.client.calling.CallComposerListenerInternal
            public void onCallComposerPrepareFailed(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.CallComposerListenerInternal
            public void onCallComposerPrepared(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.CallComposerListenerInternal
            public void onCallComposerSessionTerminated(String str, int i, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.CallComposerListenerInternal
            public void onComposerContentTransferFailure(String str, int i, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.CallComposerListenerInternal
            public void onComposerContentTransferSuccess(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.client.calling.CallComposerListenerInternal");
        }

        public static CallComposerListenerInternal asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.calling.CallComposerListenerInternal");
            return queryLocalInterface instanceof CallComposerListenerInternal ? (CallComposerListenerInternal) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String readString = parcel.readString();
                Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onCallComposerPrepared(readString, bundle);
            } else if (i == 2) {
                String readString2 = parcel.readString();
                Bundle bundle2 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onCallComposerPrepareFailed(readString2, bundle2);
            } else if (i == 3) {
                String readString3 = parcel.readString();
                Bundle bundle3 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onComposerContentTransferSuccess(readString3, bundle3);
            } else if (i == 4) {
                String readString4 = parcel.readString();
                int readInt = parcel.readInt();
                Bundle bundle4 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onComposerContentTransferFailure(readString4, readInt, bundle4);
            } else {
                if (i != 5) {
                    return false;
                }
                String readString5 = parcel.readString();
                int readInt2 = parcel.readInt();
                Bundle bundle5 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onCallComposerSessionTerminated(readString5, readInt2, bundle5);
            }
            return true;
        }
    }

    void onCallComposerPrepareFailed(String str, Bundle bundle);

    void onCallComposerPrepared(String str, Bundle bundle);

    void onCallComposerSessionTerminated(String str, int i, Bundle bundle);

    void onComposerContentTransferFailure(String str, int i, Bundle bundle);

    void onComposerContentTransferSuccess(String str, Bundle bundle);
}
