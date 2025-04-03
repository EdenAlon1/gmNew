package com.google.android.gms.search.global.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Request;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Request;
import com.google.android.gms.search.global.SetExperimentIdsCall$Request;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request;
import com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGlobalSearchAdminService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGlobalSearchAdminService {
        static final int TRANSACTION_getCurrentExperimentIds = 4;
        static final int TRANSACTION_getGlobalSearchSources = 2;
        static final int TRANSACTION_getPendingExperimentIds = 5;
        static final int TRANSACTION_setExperimentIds = 3;
        static final int TRANSACTION_setIncludeInGlobalSearch = 8;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGlobalSearchAdminService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.global.internal.IGlobalSearchAdminService");
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminService
            public void getCurrentExperimentIds(GetCurrentExperimentIdsCall$Request getCurrentExperimentIdsCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getCurrentExperimentIdsCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iGlobalSearchAdminCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminService
            public void getGlobalSearchSources(GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getGlobalSearchSourcesCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iGlobalSearchAdminCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminService
            public void getPendingExperimentIds(GetPendingExperimentIdsCall$Request getPendingExperimentIdsCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getPendingExperimentIdsCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iGlobalSearchAdminCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminService
            public void setExperimentIds(SetExperimentIdsCall$Request setExperimentIdsCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, setExperimentIdsCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iGlobalSearchAdminCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.global.internal.IGlobalSearchAdminService
            public void setIncludeInGlobalSearch(SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, setIncludeInGlobalSearchCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iGlobalSearchAdminCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.global.internal.IGlobalSearchAdminService");
        }

        public static IGlobalSearchAdminService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.global.internal.IGlobalSearchAdminService");
            return queryLocalInterface instanceof IGlobalSearchAdminService ? (IGlobalSearchAdminService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request = (GetGlobalSearchSourcesCall$Request) rve.a(parcel, GetGlobalSearchSourcesCall$Request.CREATOR);
                IGlobalSearchAdminCallbacks asInterface = IGlobalSearchAdminCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getGlobalSearchSources(getGlobalSearchSourcesCall$Request, asInterface, apiMetadata);
            } else if (i == 3) {
                SetExperimentIdsCall$Request setExperimentIdsCall$Request = (SetExperimentIdsCall$Request) rve.a(parcel, SetExperimentIdsCall$Request.CREATOR);
                IGlobalSearchAdminCallbacks asInterface2 = IGlobalSearchAdminCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                setExperimentIds(setExperimentIdsCall$Request, asInterface2, apiMetadata2);
            } else if (i == 4) {
                GetCurrentExperimentIdsCall$Request getCurrentExperimentIdsCall$Request = (GetCurrentExperimentIdsCall$Request) rve.a(parcel, GetCurrentExperimentIdsCall$Request.CREATOR);
                IGlobalSearchAdminCallbacks asInterface3 = IGlobalSearchAdminCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getCurrentExperimentIds(getCurrentExperimentIdsCall$Request, asInterface3, apiMetadata3);
            } else if (i == 5) {
                GetPendingExperimentIdsCall$Request getPendingExperimentIdsCall$Request = (GetPendingExperimentIdsCall$Request) rve.a(parcel, GetPendingExperimentIdsCall$Request.CREATOR);
                IGlobalSearchAdminCallbacks asInterface4 = IGlobalSearchAdminCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getPendingExperimentIds(getPendingExperimentIdsCall$Request, asInterface4, apiMetadata4);
            } else {
                if (i != 8) {
                    return false;
                }
                SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request = (SetIncludeInGlobalSearchCall$Request) rve.a(parcel, SetIncludeInGlobalSearchCall$Request.CREATOR);
                IGlobalSearchAdminCallbacks asInterface5 = IGlobalSearchAdminCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata5 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                setIncludeInGlobalSearch(setIncludeInGlobalSearchCall$Request, asInterface5, apiMetadata5);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getCurrentExperimentIds(GetCurrentExperimentIdsCall$Request getCurrentExperimentIdsCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata);

    void getGlobalSearchSources(GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata);

    void getPendingExperimentIds(GetPendingExperimentIdsCall$Request getPendingExperimentIdsCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata);

    void setExperimentIds(SetExperimentIdsCall$Request setExperimentIdsCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata);

    void setIncludeInGlobalSearch(SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request, IGlobalSearchAdminCallbacks iGlobalSearchAdminCallbacks, ApiMetadata apiMetadata);
}
