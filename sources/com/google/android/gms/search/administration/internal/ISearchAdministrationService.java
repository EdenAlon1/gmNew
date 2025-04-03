package com.google.android.gms.search.administration.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Request;
import com.google.android.gms.search.administration.GetStorageStatsCall$Request;
import com.google.android.gms.search.administration.RequestAppIndexingUpdateIndexCall$Request;
import com.google.android.gms.search.administration.internal.ISearchAdministrationCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISearchAdministrationService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISearchAdministrationService {
        static final int TRANSACTION_clearDebugUiCache = 8;
        static final int TRANSACTION_clearUsageReportData = 4;
        static final int TRANSACTION_diagnostic = 3;
        static final int TRANSACTION_getAppIndexingPackageDetails = 6;
        static final int TRANSACTION_getAppIndexingPackages = 5;
        static final int TRANSACTION_getStorageStats = 2;
        static final int TRANSACTION_requestAppIndexingUpdateIndex = 7;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISearchAdministrationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.administration.internal.ISearchAdministrationService");
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void clearDebugUiCache(ClearDebugUiCacheCall$Request clearDebugUiCacheCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, clearDebugUiCacheCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void clearUsageReportData(ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void diagnostic(Bundle bundle, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.f(obtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void getAppIndexingPackageDetails(GetAppIndexingPackageDetailsCall$Request getAppIndexingPackageDetailsCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getAppIndexingPackageDetailsCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void getAppIndexingPackages(GetAppIndexingPackagesCall$Request getAppIndexingPackagesCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getAppIndexingPackagesCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void getStorageStats(GetStorageStatsCall$Request getStorageStatsCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getStorageStatsCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.administration.internal.ISearchAdministrationService
            public void requestAppIndexingUpdateIndex(RequestAppIndexingUpdateIndexCall$Request requestAppIndexingUpdateIndexCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, requestAppIndexingUpdateIndexCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iSearchAdministrationCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.administration.internal.ISearchAdministrationService");
        }

        public static ISearchAdministrationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.administration.internal.ISearchAdministrationService");
            return queryLocalInterface instanceof ISearchAdministrationService ? (ISearchAdministrationService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    GetStorageStatsCall$Request getStorageStatsCall$Request = (GetStorageStatsCall$Request) rve.a(parcel, GetStorageStatsCall$Request.CREATOR);
                    ISearchAdministrationCallbacks asInterface = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getStorageStats(getStorageStatsCall$Request, asInterface, apiMetadata);
                    break;
                case 3:
                    Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    ISearchAdministrationCallbacks asInterface2 = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    diagnostic(bundle, asInterface2, apiMetadata2);
                    break;
                case 4:
                    ISearchAdministrationCallbacks asInterface3 = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    clearUsageReportData(asInterface3, apiMetadata3);
                    break;
                case 5:
                    GetAppIndexingPackagesCall$Request getAppIndexingPackagesCall$Request = (GetAppIndexingPackagesCall$Request) rve.a(parcel, GetAppIndexingPackagesCall$Request.CREATOR);
                    ISearchAdministrationCallbacks asInterface4 = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getAppIndexingPackages(getAppIndexingPackagesCall$Request, asInterface4, apiMetadata4);
                    break;
                case 6:
                    GetAppIndexingPackageDetailsCall$Request getAppIndexingPackageDetailsCall$Request = (GetAppIndexingPackageDetailsCall$Request) rve.a(parcel, GetAppIndexingPackageDetailsCall$Request.CREATOR);
                    ISearchAdministrationCallbacks asInterface5 = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata5 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getAppIndexingPackageDetails(getAppIndexingPackageDetailsCall$Request, asInterface5, apiMetadata5);
                    break;
                case 7:
                    RequestAppIndexingUpdateIndexCall$Request requestAppIndexingUpdateIndexCall$Request = (RequestAppIndexingUpdateIndexCall$Request) rve.a(parcel, RequestAppIndexingUpdateIndexCall$Request.CREATOR);
                    ISearchAdministrationCallbacks asInterface6 = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata6 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    requestAppIndexingUpdateIndex(requestAppIndexingUpdateIndexCall$Request, asInterface6, apiMetadata6);
                    break;
                case 8:
                    ClearDebugUiCacheCall$Request clearDebugUiCacheCall$Request = (ClearDebugUiCacheCall$Request) rve.a(parcel, ClearDebugUiCacheCall$Request.CREATOR);
                    ISearchAdministrationCallbacks asInterface7 = ISearchAdministrationCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata7 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    clearDebugUiCache(clearDebugUiCacheCall$Request, asInterface7, apiMetadata7);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void clearDebugUiCache(ClearDebugUiCacheCall$Request clearDebugUiCacheCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata);

    void clearUsageReportData(ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata);

    void diagnostic(Bundle bundle, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata);

    void getAppIndexingPackageDetails(GetAppIndexingPackageDetailsCall$Request getAppIndexingPackageDetailsCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata);

    void getAppIndexingPackages(GetAppIndexingPackagesCall$Request getAppIndexingPackagesCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata);

    void getStorageStats(GetStorageStatsCall$Request getStorageStatsCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata);

    void requestAppIndexingUpdateIndex(RequestAppIndexingUpdateIndexCall$Request requestAppIndexingUpdateIndexCall$Request, ISearchAdministrationCallbacks iSearchAdministrationCallbacks, ApiMetadata apiMetadata);
}
