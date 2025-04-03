package com.google.android.gms.auth.proximity.firstparty;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IExoSignalingCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IExoSignalingCallback {
        static final int TRANSACTION_getLaunchIntentForUser = 11;
        static final int TRANSACTION_getPendingIntentForUser = 9;
        static final int TRANSACTION_onAssociationDialogShown = 10;
        static final int TRANSACTION_onAssociationResultMessage = 8;
        static final int TRANSACTION_onAssociationState = 7;
        static final int TRANSACTION_onStreamedAppChanged = 12;
        static final int TRANSACTION_sendSignalingMessage = 2;
        static final int TRANSACTION_streamStarted = 5;
        static final int TRANSACTION_streamStopped = 4;
        static final int TRANSACTION_tearDownSignaling = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IExoSignalingCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback");
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public Intent getLaunchIntentForUser(String str, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
                Intent intent = (Intent) rve.a(transactAndReadException, Intent.CREATOR);
                transactAndReadException.recycle();
                return intent;
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public PendingIntent getPendingIntentForUser(Intent intent, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, intent);
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
                PendingIntent pendingIntent = (PendingIntent) rve.a(transactAndReadException, PendingIntent.CREATOR);
                transactAndReadException.recycle();
                return pendingIntent;
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public void onAssociationDialogShown(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public void onAssociationResultMessage(boolean z, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public void onAssociationState(boolean z, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public void onStreamedAppChanged(String str, String str2, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public void sendSignalingMessage(String str, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public void streamStarted(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public void streamStopped(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback
            public void tearDownSignaling() {
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback");
        }

        public static IExoSignalingCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.proximity.firstparty.IExoSignalingCallback");
            return queryLocalInterface instanceof IExoSignalingCallback ? (IExoSignalingCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    String readString = parcel.readString();
                    byte[] createByteArray = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    sendSignalingMessage(readString, createByteArray);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    tearDownSignaling();
                    parcel2.writeNoException();
                    return true;
                case 4:
                    String readString2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    streamStopped(readString2);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    String readString3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    streamStarted(readString3);
                    parcel2.writeNoException();
                    return true;
                case 6:
                default:
                    return false;
                case 7:
                    boolean g = rve.g(parcel);
                    String readString4 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    onAssociationState(g, readString4);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    boolean g2 = rve.g(parcel);
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    onAssociationResultMessage(g2, readString5, readString6);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    Intent intent = (Intent) rve.a(parcel, Intent.CREATOR);
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    PendingIntent pendingIntentForUser = getPendingIntentForUser(intent, readInt);
                    parcel2.writeNoException();
                    rve.e(parcel2, pendingIntentForUser);
                    return true;
                case 10:
                    String readString7 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    onAssociationDialogShown(readString7);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    String readString8 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    Intent launchIntentForUser = getLaunchIntentForUser(readString8, readInt2);
                    parcel2.writeNoException();
                    rve.e(parcel2, launchIntentForUser);
                    return true;
                case 12:
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    int readInt3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    onStreamedAppChanged(readString9, readString10, readInt3);
                    parcel2.writeNoException();
                    return true;
            }
        }
    }

    Intent getLaunchIntentForUser(String str, int i);

    PendingIntent getPendingIntentForUser(Intent intent, int i);

    void onAssociationDialogShown(String str);

    void onAssociationResultMessage(boolean z, String str, String str2);

    void onAssociationState(boolean z, String str);

    void onStreamedAppChanged(String str, String str2, int i);

    void sendSignalingMessage(String str, byte[] bArr);

    void streamStarted(String str);

    void streamStopped(String str);

    void tearDownSignaling();
}
