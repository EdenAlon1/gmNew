package com.google.android.gms.mdd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.mdd.IMddFileGroupCallback;
import com.google.android.gms.mdd.IMddFileGroupWithDownloadStatusCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMobileDataDownloadService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMobileDataDownloadService {
        static final int TRANSACTION_activateFileGroup = 12;
        static final int TRANSACTION_addConfigsForDownload = 2;
        static final int TRANSACTION_addOverrideFileGroup = 6;
        static final int TRANSACTION_clearAllState = 7;
        static final int TRANSACTION_deactivateFileGroup = 13;
        static final int TRANSACTION_downloadFileGroup = 11;
        static final int TRANSACTION_downloadPendingGroups = 3;
        static final int TRANSACTION_getFileGroup = 1;
        static final int TRANSACTION_getFileGroupListForDebugUI = 10;
        static final int TRANSACTION_handleFlagChange = 8;
        static final int TRANSACTION_maintenance = 4;
        static final int TRANSACTION_resetTesting = 5;
        static final int TRANSACTION_verifyPendingGroups = 9;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMobileDataDownloadService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdd.IMobileDataDownloadService");
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void activateFileGroup(IStatusCallback iStatusCallback, FileGroupRequest fileGroupRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, fileGroupRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void addConfigsForDownload(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void addOverrideFileGroup(IStatusCallback iStatusCallback, OverrideFileGroupRequest overrideFileGroupRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, overrideFileGroupRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void clearAllState(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void deactivateFileGroup(IStatusCallback iStatusCallback, FileGroupRequest fileGroupRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, fileGroupRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void downloadFileGroup(IMddFileGroupCallback iMddFileGroupCallback, FileGroupRequest fileGroupRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMddFileGroupCallback);
                rve.d(obtainAndWriteInterfaceToken, fileGroupRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void downloadPendingGroups(boolean z, IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void getFileGroup(IMddFileGroupCallback iMddFileGroupCallback, FileGroupRequest fileGroupRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMddFileGroupCallback);
                rve.d(obtainAndWriteInterfaceToken, fileGroupRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void getFileGroupListForDebugUI(IMddFileGroupWithDownloadStatusCallback iMddFileGroupWithDownloadStatusCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMddFileGroupWithDownloadStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void handleFlagChange(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void maintenance(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void resetTesting(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void verifyPendingGroups(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdd.IMobileDataDownloadService");
        }

        public static IMobileDataDownloadService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdd.IMobileDataDownloadService");
            return queryLocalInterface instanceof IMobileDataDownloadService ? (IMobileDataDownloadService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IMddFileGroupCallback asInterface = IMddFileGroupCallback.Stub.asInterface(parcel.readStrongBinder());
                    FileGroupRequest fileGroupRequest = (FileGroupRequest) rve.a(parcel, FileGroupRequest.CREATOR);
                    ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getFileGroup(asInterface, fileGroupRequest, apiMetadata);
                    break;
                case 2:
                    IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    addConfigsForDownload(asInterface2, apiMetadata2);
                    break;
                case 3:
                    boolean g = rve.g(parcel);
                    IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    downloadPendingGroups(g, asInterface3, apiMetadata3);
                    break;
                case 4:
                    IStatusCallback asInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    maintenance(asInterface4, apiMetadata4);
                    break;
                case 5:
                    IStatusCallback asInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata5 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    resetTesting(asInterface5, apiMetadata5);
                    break;
                case 6:
                    IStatusCallback asInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    OverrideFileGroupRequest overrideFileGroupRequest = (OverrideFileGroupRequest) rve.a(parcel, OverrideFileGroupRequest.CREATOR);
                    ApiMetadata apiMetadata6 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    addOverrideFileGroup(asInterface6, overrideFileGroupRequest, apiMetadata6);
                    break;
                case 7:
                    IStatusCallback asInterface7 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata7 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    clearAllState(asInterface7, apiMetadata7);
                    break;
                case 8:
                    IStatusCallback asInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata8 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    handleFlagChange(asInterface8, apiMetadata8);
                    break;
                case 9:
                    IStatusCallback asInterface9 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata9 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    verifyPendingGroups(asInterface9, apiMetadata9);
                    break;
                case 10:
                    IMddFileGroupWithDownloadStatusCallback asInterface10 = IMddFileGroupWithDownloadStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata10 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getFileGroupListForDebugUI(asInterface10, apiMetadata10);
                    break;
                case 11:
                    IMddFileGroupCallback asInterface11 = IMddFileGroupCallback.Stub.asInterface(parcel.readStrongBinder());
                    FileGroupRequest fileGroupRequest2 = (FileGroupRequest) rve.a(parcel, FileGroupRequest.CREATOR);
                    ApiMetadata apiMetadata11 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    downloadFileGroup(asInterface11, fileGroupRequest2, apiMetadata11);
                    break;
                case 12:
                    IStatusCallback asInterface12 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    FileGroupRequest fileGroupRequest3 = (FileGroupRequest) rve.a(parcel, FileGroupRequest.CREATOR);
                    ApiMetadata apiMetadata12 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    activateFileGroup(asInterface12, fileGroupRequest3, apiMetadata12);
                    break;
                case 13:
                    IStatusCallback asInterface13 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    FileGroupRequest fileGroupRequest4 = (FileGroupRequest) rve.a(parcel, FileGroupRequest.CREATOR);
                    ApiMetadata apiMetadata13 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    deactivateFileGroup(asInterface13, fileGroupRequest4, apiMetadata13);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void activateFileGroup(IStatusCallback iStatusCallback, FileGroupRequest fileGroupRequest, ApiMetadata apiMetadata);

    void addConfigsForDownload(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void addOverrideFileGroup(IStatusCallback iStatusCallback, OverrideFileGroupRequest overrideFileGroupRequest, ApiMetadata apiMetadata);

    void clearAllState(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void deactivateFileGroup(IStatusCallback iStatusCallback, FileGroupRequest fileGroupRequest, ApiMetadata apiMetadata);

    void downloadFileGroup(IMddFileGroupCallback iMddFileGroupCallback, FileGroupRequest fileGroupRequest, ApiMetadata apiMetadata);

    void downloadPendingGroups(boolean z, IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void getFileGroup(IMddFileGroupCallback iMddFileGroupCallback, FileGroupRequest fileGroupRequest, ApiMetadata apiMetadata);

    void getFileGroupListForDebugUI(IMddFileGroupWithDownloadStatusCallback iMddFileGroupWithDownloadStatusCallback, ApiMetadata apiMetadata);

    void handleFlagChange(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void maintenance(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void resetTesting(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void verifyPendingGroups(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);
}
