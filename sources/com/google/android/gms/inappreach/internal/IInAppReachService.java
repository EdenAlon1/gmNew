package com.google.android.gms.inappreach.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.inappreach.internal.IOnAccountHealthAlertsListener;
import com.google.android.gms.inappreach.internal.IOnAccountMessagesListener;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IInAppReachService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInAppReachService {
        static final int TRANSACTION_fetchAccountMessages = 10;
        static final int TRANSACTION_fetchLatestThreads = 6;
        static final int TRANSACTION_markAlertAsSeen = 4;
        static final int TRANSACTION_refreshAccountHealthAlerts = 3;
        static final int TRANSACTION_registerAccountHealthAlertsListener = 1;
        static final int TRANSACTION_registerAccountMessagesListener = 7;
        static final int TRANSACTION_unregisterAccountHealthAlertsListener = 2;
        static final int TRANSACTION_unregisterAccountMessagesListener = 8;
        static final int TRANSACTION_updateAccountHealthAlerts = 5;
        static final int TRANSACTION_updateAccountMessages = 9;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInAppReachService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.inappreach.internal.IInAppReachService");
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void fetchAccountMessages(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void fetchLatestThreads(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void markAlertAsSeen(IStatusCallback iStatusCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void refreshAccountHealthAlerts(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void registerAccountHealthAlertsListener(IStatusCallback iStatusCallback, String str, IOnAccountHealthAlertsListener iOnAccountHealthAlertsListener, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.f(obtainAndWriteInterfaceToken, iOnAccountHealthAlertsListener);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void registerAccountMessagesListener(IStatusCallback iStatusCallback, String str, IOnAccountMessagesListener iOnAccountMessagesListener, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.f(obtainAndWriteInterfaceToken, iOnAccountMessagesListener);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void unregisterAccountHealthAlertsListener(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void unregisterAccountMessagesListener(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void updateAccountHealthAlerts(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.inappreach.internal.IInAppReachService
            public void updateAccountMessages(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.inappreach.internal.IInAppReachService");
        }

        public static IInAppReachService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.inappreach.internal.IInAppReachService");
            return queryLocalInterface instanceof IInAppReachService ? (IInAppReachService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    IOnAccountHealthAlertsListener asInterface2 = IOnAccountHealthAlertsListener.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerAccountHealthAlertsListener(asInterface, readString, asInterface2, apiMetadata);
                    break;
                case 2:
                    IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterAccountHealthAlertsListener(asInterface3, readString2, apiMetadata2);
                    break;
                case 3:
                    IStatusCallback asInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    refreshAccountHealthAlerts(asInterface4, apiMetadata3);
                    break;
                case 4:
                    IStatusCallback asInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    markAlertAsSeen(asInterface5, readString3, readString4, apiMetadata4);
                    break;
                case 5:
                    IStatusCallback asInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    byte[] createByteArray = parcel.createByteArray();
                    ApiMetadata apiMetadata5 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateAccountHealthAlerts(asInterface6, createByteArray, apiMetadata5);
                    break;
                case 6:
                    IStatusCallback asInterface7 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString5 = parcel.readString();
                    ApiMetadata apiMetadata6 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchLatestThreads(asInterface7, readString5, apiMetadata6);
                    break;
                case 7:
                    IStatusCallback asInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString6 = parcel.readString();
                    IOnAccountMessagesListener asInterface9 = IOnAccountMessagesListener.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata7 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerAccountMessagesListener(asInterface8, readString6, asInterface9, apiMetadata7);
                    break;
                case 8:
                    IStatusCallback asInterface10 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString7 = parcel.readString();
                    ApiMetadata apiMetadata8 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterAccountMessagesListener(asInterface10, readString7, apiMetadata8);
                    break;
                case 9:
                    IStatusCallback asInterface11 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    byte[] createByteArray2 = parcel.createByteArray();
                    ApiMetadata apiMetadata9 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateAccountMessages(asInterface11, createByteArray2, apiMetadata9);
                    break;
                case 10:
                    IStatusCallback asInterface12 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    byte[] createByteArray3 = parcel.createByteArray();
                    ApiMetadata apiMetadata10 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchAccountMessages(asInterface12, createByteArray3, apiMetadata10);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void fetchAccountMessages(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata);

    void fetchLatestThreads(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void markAlertAsSeen(IStatusCallback iStatusCallback, String str, String str2, ApiMetadata apiMetadata);

    void refreshAccountHealthAlerts(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void registerAccountHealthAlertsListener(IStatusCallback iStatusCallback, String str, IOnAccountHealthAlertsListener iOnAccountHealthAlertsListener, ApiMetadata apiMetadata);

    void registerAccountMessagesListener(IStatusCallback iStatusCallback, String str, IOnAccountMessagesListener iOnAccountMessagesListener, ApiMetadata apiMetadata);

    void unregisterAccountHealthAlertsListener(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void unregisterAccountMessagesListener(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void updateAccountHealthAlerts(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata);

    void updateAccountMessages(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata);
}
