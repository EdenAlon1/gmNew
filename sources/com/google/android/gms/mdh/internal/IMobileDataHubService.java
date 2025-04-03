package com.google.android.gms.mdh.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhBroadcastListenerKey;
import com.google.android.gms.mdh.MdhBroadcastListenerParams;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.TimeSeriesFootprintsReadFilter;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import com.google.android.gms.mdh.internal.IByteArrayCallback;
import com.google.android.gms.mdh.internal.IMdhFootprintsListCallback;
import com.google.android.gms.mdh.internal.IMdhFootprintsReadResultCallback;
import com.google.android.gms.mdh.internal.IMdhFootprintsRecordingSettingCallback;
import com.google.android.gms.mdh.internal.IMdhTimeSeriesFootprintsWriteResultCallback;
import com.google.android.gms.mdh.internal.ITrivialBigtableKeyValueCallback;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMobileDataHubService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMobileDataHubService {
        static final int TRANSACTION_deleteTrivialBigtableCell = 4;
        static final int TRANSACTION_getChannelConfigListForTesting = 7;
        static final int TRANSACTION_injectChannelConfigListForTesting = 6;
        static final int TRANSACTION_readFootprintsRecordingSettings = 18;
        static final int TRANSACTION_readLatestFootprint = 9;
        static final int TRANSACTION_readLatestFootprintWithSyncStatus = 19;
        static final int TRANSACTION_readTimeSeriesFootprints = 15;
        static final int TRANSACTION_readTimeSeriesFootprintsWithSyncStatus = 20;
        static final int TRANSACTION_readTrivialBigtableCell = 1;
        static final int TRANSACTION_readTrivialBigtableRange = 2;
        static final int TRANSACTION_refreshChannelConfigList = 27;
        static final int TRANSACTION_registerBroadcastListener = 22;
        static final int TRANSACTION_resetData = 8;
        static final int TRANSACTION_resetTesting = 5;
        static final int TRANSACTION_startImmediateTask = 26;
        static final int TRANSACTION_subscribeFootprintsRecordingSettings = 17;
        static final int TRANSACTION_subscribeLatestFootprint = 11;
        static final int TRANSACTION_subscribeTimeSeriesFootprints = 14;
        static final int TRANSACTION_unregisterBroadcastListener = 23;
        static final int TRANSACTION_writeLatestFootprint = 10;
        static final int TRANSACTION_writeLatestOnlyChannelSyncStatus = 25;
        static final int TRANSACTION_writeTimeSeriesChannel = 16;
        static final int TRANSACTION_writeTimeSeriesChannelSyncStatus = 24;
        static final int TRANSACTION_writeTimeSeriesFootprint = 21;
        static final int TRANSACTION_writeTrivialBigtableCell = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMobileDataHubService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdh.internal.IMobileDataHubService");
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void deleteTrivialBigtableCell(IStatusCallback iStatusCallback, String str, byte[] bArr, byte[] bArr2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                obtainAndWriteInterfaceToken.writeByteArray(bArr2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void getChannelConfigListForTesting(IByteArrayCallback iByteArrayCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iByteArrayCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void injectChannelConfigListForTesting(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void readFootprintsRecordingSettings(IMdhFootprintsRecordingSettingCallback iMdhFootprintsRecordingSettingCallback, Account account, int i, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMdhFootprintsRecordingSettingCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void readLatestFootprint(IMdhFootprintsListCallback iMdhFootprintsListCallback, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMdhFootprintsListCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                rve.d(obtainAndWriteInterfaceToken, latestFootprintFilter);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void readLatestFootprintWithSyncStatus(IMdhFootprintsReadResultCallback iMdhFootprintsReadResultCallback, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMdhFootprintsReadResultCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                rve.d(obtainAndWriteInterfaceToken, latestFootprintFilter);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(19, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void readTimeSeriesFootprints(IMdhFootprintsListCallback iMdhFootprintsListCallback, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMdhFootprintsListCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                rve.d(obtainAndWriteInterfaceToken, timeSeriesFootprintsReadFilter);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void readTimeSeriesFootprintsWithSyncStatus(IMdhFootprintsReadResultCallback iMdhFootprintsReadResultCallback, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMdhFootprintsReadResultCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                rve.d(obtainAndWriteInterfaceToken, timeSeriesFootprintsReadFilter);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void readTrivialBigtableCell(IByteArrayCallback iByteArrayCallback, String str, byte[] bArr, byte[] bArr2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iByteArrayCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                obtainAndWriteInterfaceToken.writeByteArray(bArr2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void readTrivialBigtableRange(ITrivialBigtableKeyValueCallback iTrivialBigtableKeyValueCallback, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iTrivialBigtableKeyValueCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                obtainAndWriteInterfaceToken.writeByteArray(bArr2);
                obtainAndWriteInterfaceToken.writeByteArray(bArr3);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void refreshChannelConfigList(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void registerBroadcastListener(IStatusCallback iStatusCallback, MdhBroadcastListenerKey mdhBroadcastListenerKey, MdhBroadcastListenerParams mdhBroadcastListenerParams, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, mdhBroadcastListenerKey);
                rve.d(obtainAndWriteInterfaceToken, mdhBroadcastListenerParams);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(22, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void resetData(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void resetTesting(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void startImmediateTask(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(26, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void subscribeFootprintsRecordingSettings(IStatusCallback iStatusCallback, Account account, List<Integer> list, SyncPolicy syncPolicy, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeList(list);
                rve.d(obtainAndWriteInterfaceToken, syncPolicy);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void subscribeLatestFootprint(IStatusCallback iStatusCallback, Account account, int i, int i2, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                rve.d(obtainAndWriteInterfaceToken, syncPolicy);
                rve.d(obtainAndWriteInterfaceToken, latestFootprintFilter);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void subscribeTimeSeriesFootprints(IStatusCallback iStatusCallback, Account account, int i, int i2, SyncPolicy syncPolicy, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                rve.d(obtainAndWriteInterfaceToken, syncPolicy);
                rve.d(obtainAndWriteInterfaceToken, timeSeriesFootprintsSubscriptionFilter);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void unregisterBroadcastListener(IStatusCallback iStatusCallback, MdhBroadcastListenerKey mdhBroadcastListenerKey, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, mdhBroadcastListenerKey);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(23, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void writeLatestFootprint(IStatusCallback iStatusCallback, Account account, int i, int i2, byte[] bArr, ByteArraySafeParcelable byteArraySafeParcelable, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                rve.d(obtainAndWriteInterfaceToken, byteArraySafeParcelable);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void writeLatestOnlyChannelSyncStatus(IStatusCallback iStatusCallback, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, SyncStatus syncStatus, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                rve.d(obtainAndWriteInterfaceToken, latestFootprintFilter);
                rve.d(obtainAndWriteInterfaceToken, syncStatus);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(25, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void writeTimeSeriesChannel(IStatusCallback iStatusCallback, Account account, int i, int i2, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                rve.d(obtainAndWriteInterfaceToken, mdhFootprintListSafeParcelable);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void writeTimeSeriesChannelSyncStatus(IStatusCallback iStatusCallback, Account account, int i, int i2, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, SyncStatus syncStatus, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                rve.d(obtainAndWriteInterfaceToken, timeSeriesFootprintsSubscriptionFilter);
                rve.d(obtainAndWriteInterfaceToken, syncStatus);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(24, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void writeTimeSeriesFootprint(IMdhTimeSeriesFootprintsWriteResultCallback iMdhTimeSeriesFootprintsWriteResultCallback, Account account, int i, int i2, ByteArraySafeParcelable byteArraySafeParcelable, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMdhTimeSeriesFootprintsWriteResultCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                rve.d(obtainAndWriteInterfaceToken, byteArraySafeParcelable);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubService
            public void writeTrivialBigtableCell(IStatusCallback iStatusCallback, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                obtainAndWriteInterfaceToken.writeByteArray(bArr2);
                obtainAndWriteInterfaceToken.writeByteArray(bArr3);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdh.internal.IMobileDataHubService");
        }

        public static IMobileDataHubService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdh.internal.IMobileDataHubService");
            return queryLocalInterface instanceof IMobileDataHubService ? (IMobileDataHubService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IByteArrayCallback asInterface = IByteArrayCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    byte[] createByteArray = parcel.createByteArray();
                    byte[] createByteArray2 = parcel.createByteArray();
                    ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    readTrivialBigtableCell(asInterface, readString, createByteArray, createByteArray2, apiMetadata);
                    break;
                case 2:
                    ITrivialBigtableKeyValueCallback asInterface2 = ITrivialBigtableKeyValueCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    byte[] createByteArray3 = parcel.createByteArray();
                    byte[] createByteArray4 = parcel.createByteArray();
                    byte[] createByteArray5 = parcel.createByteArray();
                    ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    readTrivialBigtableRange(asInterface2, readString2, createByteArray3, createByteArray4, createByteArray5, apiMetadata2);
                    break;
                case 3:
                    IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString3 = parcel.readString();
                    byte[] createByteArray6 = parcel.createByteArray();
                    byte[] createByteArray7 = parcel.createByteArray();
                    byte[] createByteArray8 = parcel.createByteArray();
                    ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    writeTrivialBigtableCell(asInterface3, readString3, createByteArray6, createByteArray7, createByteArray8, apiMetadata3);
                    break;
                case 4:
                    IStatusCallback asInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString4 = parcel.readString();
                    byte[] createByteArray9 = parcel.createByteArray();
                    byte[] createByteArray10 = parcel.createByteArray();
                    ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    deleteTrivialBigtableCell(asInterface4, readString4, createByteArray9, createByteArray10, apiMetadata4);
                    break;
                case 5:
                    IStatusCallback asInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata5 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    resetTesting(asInterface5, apiMetadata5);
                    break;
                case 6:
                    IStatusCallback asInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    byte[] createByteArray11 = parcel.createByteArray();
                    ApiMetadata apiMetadata6 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    injectChannelConfigListForTesting(asInterface6, createByteArray11, apiMetadata6);
                    break;
                case 7:
                    IByteArrayCallback asInterface7 = IByteArrayCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata7 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getChannelConfigListForTesting(asInterface7, apiMetadata7);
                    break;
                case 8:
                    IStatusCallback asInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata8 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    resetData(asInterface8, apiMetadata8);
                    break;
                case 9:
                    IMdhFootprintsListCallback asInterface9 = IMdhFootprintsListCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account = (Account) rve.a(parcel, Account.CREATOR);
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    LatestFootprintFilter latestFootprintFilter = (LatestFootprintFilter) rve.a(parcel, LatestFootprintFilter.CREATOR);
                    ApiMetadata apiMetadata9 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    readLatestFootprint(asInterface9, account, readInt, readInt2, latestFootprintFilter, apiMetadata9);
                    break;
                case 10:
                    IStatusCallback asInterface10 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account2 = (Account) rve.a(parcel, Account.CREATOR);
                    int readInt3 = parcel.readInt();
                    int readInt4 = parcel.readInt();
                    byte[] createByteArray12 = parcel.createByteArray();
                    ByteArraySafeParcelable byteArraySafeParcelable = (ByteArraySafeParcelable) rve.a(parcel, ByteArraySafeParcelable.CREATOR);
                    ApiMetadata apiMetadata10 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    writeLatestFootprint(asInterface10, account2, readInt3, readInt4, createByteArray12, byteArraySafeParcelable, apiMetadata10);
                    break;
                case 11:
                    IStatusCallback asInterface11 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account3 = (Account) rve.a(parcel, Account.CREATOR);
                    int readInt5 = parcel.readInt();
                    int readInt6 = parcel.readInt();
                    SyncPolicy syncPolicy = (SyncPolicy) rve.a(parcel, SyncPolicy.CREATOR);
                    LatestFootprintFilter latestFootprintFilter2 = (LatestFootprintFilter) rve.a(parcel, LatestFootprintFilter.CREATOR);
                    ApiMetadata apiMetadata11 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    subscribeLatestFootprint(asInterface11, account3, readInt5, readInt6, syncPolicy, latestFootprintFilter2, apiMetadata11);
                    break;
                case 12:
                case 13:
                default:
                    return false;
                case 14:
                    IStatusCallback asInterface12 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account4 = (Account) rve.a(parcel, Account.CREATOR);
                    int readInt7 = parcel.readInt();
                    int readInt8 = parcel.readInt();
                    SyncPolicy syncPolicy2 = (SyncPolicy) rve.a(parcel, SyncPolicy.CREATOR);
                    TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter = (TimeSeriesFootprintsSubscriptionFilter) rve.a(parcel, TimeSeriesFootprintsSubscriptionFilter.CREATOR);
                    ApiMetadata apiMetadata12 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    subscribeTimeSeriesFootprints(asInterface12, account4, readInt7, readInt8, syncPolicy2, timeSeriesFootprintsSubscriptionFilter, apiMetadata12);
                    break;
                case 15:
                    IMdhFootprintsListCallback asInterface13 = IMdhFootprintsListCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account5 = (Account) rve.a(parcel, Account.CREATOR);
                    int readInt9 = parcel.readInt();
                    int readInt10 = parcel.readInt();
                    TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter = (TimeSeriesFootprintsReadFilter) rve.a(parcel, TimeSeriesFootprintsReadFilter.CREATOR);
                    ApiMetadata apiMetadata13 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    readTimeSeriesFootprints(asInterface13, account5, readInt9, readInt10, timeSeriesFootprintsReadFilter, apiMetadata13);
                    break;
                case 16:
                    IStatusCallback asInterface14 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account6 = (Account) rve.a(parcel, Account.CREATOR);
                    int readInt11 = parcel.readInt();
                    int readInt12 = parcel.readInt();
                    MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable = (MdhFootprintListSafeParcelable) rve.a(parcel, MdhFootprintListSafeParcelable.CREATOR);
                    ApiMetadata apiMetadata14 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    writeTimeSeriesChannel(asInterface14, account6, readInt11, readInt12, mdhFootprintListSafeParcelable, apiMetadata14);
                    break;
                case 17:
                    IStatusCallback asInterface15 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account7 = (Account) rve.a(parcel, Account.CREATOR);
                    ArrayList b = rve.b(parcel);
                    SyncPolicy syncPolicy3 = (SyncPolicy) rve.a(parcel, SyncPolicy.CREATOR);
                    ApiMetadata apiMetadata15 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    subscribeFootprintsRecordingSettings(asInterface15, account7, b, syncPolicy3, apiMetadata15);
                    break;
                case 18:
                    IMdhFootprintsRecordingSettingCallback asInterface16 = IMdhFootprintsRecordingSettingCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account8 = (Account) rve.a(parcel, Account.CREATOR);
                    int readInt13 = parcel.readInt();
                    ApiMetadata apiMetadata16 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    readFootprintsRecordingSettings(asInterface16, account8, readInt13, apiMetadata16);
                    break;
                case 19:
                    IMdhFootprintsReadResultCallback asInterface17 = IMdhFootprintsReadResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account9 = (Account) rve.a(parcel, Account.CREATOR);
                    int readInt14 = parcel.readInt();
                    int readInt15 = parcel.readInt();
                    LatestFootprintFilter latestFootprintFilter3 = (LatestFootprintFilter) rve.a(parcel, LatestFootprintFilter.CREATOR);
                    ApiMetadata apiMetadata17 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    readLatestFootprintWithSyncStatus(asInterface17, account9, readInt14, readInt15, latestFootprintFilter3, apiMetadata17);
                    break;
                case 20:
                    IMdhFootprintsReadResultCallback asInterface18 = IMdhFootprintsReadResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account10 = (Account) rve.a(parcel, Account.CREATOR);
                    int readInt16 = parcel.readInt();
                    int readInt17 = parcel.readInt();
                    TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter2 = (TimeSeriesFootprintsReadFilter) rve.a(parcel, TimeSeriesFootprintsReadFilter.CREATOR);
                    ApiMetadata apiMetadata18 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    readTimeSeriesFootprintsWithSyncStatus(asInterface18, account10, readInt16, readInt17, timeSeriesFootprintsReadFilter2, apiMetadata18);
                    break;
                case 21:
                    IMdhTimeSeriesFootprintsWriteResultCallback asInterface19 = IMdhTimeSeriesFootprintsWriteResultCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account11 = (Account) rve.a(parcel, Account.CREATOR);
                    int readInt18 = parcel.readInt();
                    int readInt19 = parcel.readInt();
                    ByteArraySafeParcelable byteArraySafeParcelable2 = (ByteArraySafeParcelable) rve.a(parcel, ByteArraySafeParcelable.CREATOR);
                    ApiMetadata apiMetadata19 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    writeTimeSeriesFootprint(asInterface19, account11, readInt18, readInt19, byteArraySafeParcelable2, apiMetadata19);
                    break;
                case 22:
                    IStatusCallback asInterface20 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    MdhBroadcastListenerKey mdhBroadcastListenerKey = (MdhBroadcastListenerKey) rve.a(parcel, MdhBroadcastListenerKey.CREATOR);
                    MdhBroadcastListenerParams mdhBroadcastListenerParams = (MdhBroadcastListenerParams) rve.a(parcel, MdhBroadcastListenerParams.CREATOR);
                    ApiMetadata apiMetadata20 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerBroadcastListener(asInterface20, mdhBroadcastListenerKey, mdhBroadcastListenerParams, apiMetadata20);
                    break;
                case 23:
                    IStatusCallback asInterface21 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    MdhBroadcastListenerKey mdhBroadcastListenerKey2 = (MdhBroadcastListenerKey) rve.a(parcel, MdhBroadcastListenerKey.CREATOR);
                    ApiMetadata apiMetadata21 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterBroadcastListener(asInterface21, mdhBroadcastListenerKey2, apiMetadata21);
                    break;
                case 24:
                    IStatusCallback asInterface22 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account12 = (Account) rve.a(parcel, Account.CREATOR);
                    int readInt20 = parcel.readInt();
                    int readInt21 = parcel.readInt();
                    TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter2 = (TimeSeriesFootprintsSubscriptionFilter) rve.a(parcel, TimeSeriesFootprintsSubscriptionFilter.CREATOR);
                    SyncStatus syncStatus = (SyncStatus) rve.a(parcel, SyncStatus.CREATOR);
                    ApiMetadata apiMetadata22 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    writeTimeSeriesChannelSyncStatus(asInterface22, account12, readInt20, readInt21, timeSeriesFootprintsSubscriptionFilter2, syncStatus, apiMetadata22);
                    break;
                case 25:
                    IStatusCallback asInterface23 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account13 = (Account) rve.a(parcel, Account.CREATOR);
                    int readInt22 = parcel.readInt();
                    int readInt23 = parcel.readInt();
                    LatestFootprintFilter latestFootprintFilter4 = (LatestFootprintFilter) rve.a(parcel, LatestFootprintFilter.CREATOR);
                    SyncStatus syncStatus2 = (SyncStatus) rve.a(parcel, SyncStatus.CREATOR);
                    ApiMetadata apiMetadata23 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    writeLatestOnlyChannelSyncStatus(asInterface23, account13, readInt22, readInt23, latestFootprintFilter4, syncStatus2, apiMetadata23);
                    break;
                case 26:
                    IStatusCallback asInterface24 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString5 = parcel.readString();
                    ApiMetadata apiMetadata24 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    startImmediateTask(asInterface24, readString5, apiMetadata24);
                    break;
                case 27:
                    IStatusCallback asInterface25 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata25 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    refreshChannelConfigList(asInterface25, apiMetadata25);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void deleteTrivialBigtableCell(IStatusCallback iStatusCallback, String str, byte[] bArr, byte[] bArr2, ApiMetadata apiMetadata);

    void getChannelConfigListForTesting(IByteArrayCallback iByteArrayCallback, ApiMetadata apiMetadata);

    void injectChannelConfigListForTesting(IStatusCallback iStatusCallback, byte[] bArr, ApiMetadata apiMetadata);

    void readFootprintsRecordingSettings(IMdhFootprintsRecordingSettingCallback iMdhFootprintsRecordingSettingCallback, Account account, int i, ApiMetadata apiMetadata);

    void readLatestFootprint(IMdhFootprintsListCallback iMdhFootprintsListCallback, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, ApiMetadata apiMetadata);

    void readLatestFootprintWithSyncStatus(IMdhFootprintsReadResultCallback iMdhFootprintsReadResultCallback, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, ApiMetadata apiMetadata);

    void readTimeSeriesFootprints(IMdhFootprintsListCallback iMdhFootprintsListCallback, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter, ApiMetadata apiMetadata);

    void readTimeSeriesFootprintsWithSyncStatus(IMdhFootprintsReadResultCallback iMdhFootprintsReadResultCallback, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter, ApiMetadata apiMetadata);

    void readTrivialBigtableCell(IByteArrayCallback iByteArrayCallback, String str, byte[] bArr, byte[] bArr2, ApiMetadata apiMetadata);

    void readTrivialBigtableRange(ITrivialBigtableKeyValueCallback iTrivialBigtableKeyValueCallback, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, ApiMetadata apiMetadata);

    void refreshChannelConfigList(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void registerBroadcastListener(IStatusCallback iStatusCallback, MdhBroadcastListenerKey mdhBroadcastListenerKey, MdhBroadcastListenerParams mdhBroadcastListenerParams, ApiMetadata apiMetadata);

    void resetData(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void resetTesting(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void startImmediateTask(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void subscribeFootprintsRecordingSettings(IStatusCallback iStatusCallback, Account account, List<Integer> list, SyncPolicy syncPolicy, ApiMetadata apiMetadata);

    void subscribeLatestFootprint(IStatusCallback iStatusCallback, Account account, int i, int i2, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter, ApiMetadata apiMetadata);

    void subscribeTimeSeriesFootprints(IStatusCallback iStatusCallback, Account account, int i, int i2, SyncPolicy syncPolicy, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, ApiMetadata apiMetadata);

    void unregisterBroadcastListener(IStatusCallback iStatusCallback, MdhBroadcastListenerKey mdhBroadcastListenerKey, ApiMetadata apiMetadata);

    void writeLatestFootprint(IStatusCallback iStatusCallback, Account account, int i, int i2, byte[] bArr, ByteArraySafeParcelable byteArraySafeParcelable, ApiMetadata apiMetadata);

    void writeLatestOnlyChannelSyncStatus(IStatusCallback iStatusCallback, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, SyncStatus syncStatus, ApiMetadata apiMetadata);

    void writeTimeSeriesChannel(IStatusCallback iStatusCallback, Account account, int i, int i2, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable, ApiMetadata apiMetadata);

    void writeTimeSeriesChannelSyncStatus(IStatusCallback iStatusCallback, Account account, int i, int i2, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, SyncStatus syncStatus, ApiMetadata apiMetadata);

    void writeTimeSeriesFootprint(IMdhTimeSeriesFootprintsWriteResultCallback iMdhTimeSeriesFootprintsWriteResultCallback, Account account, int i, int i2, ByteArraySafeParcelable byteArraySafeParcelable, ApiMetadata apiMetadata);

    void writeTrivialBigtableCell(IStatusCallback iStatusCallback, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, ApiMetadata apiMetadata);
}
