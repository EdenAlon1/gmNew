package com.google.android.gms.search.corpora.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.search.corpora.ClearCorpusCall$Request;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Request;
import com.google.android.gms.search.corpora.GetCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.GetCorpusStatusCall$Request;
import com.google.android.gms.search.corpora.RegisterCorpusInfoCall$Request;
import com.google.android.gms.search.corpora.RequestIndexingCall$Request;
import com.google.android.gms.search.corpora.internal.ISearchCorporaCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISearchCorporaService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISearchCorporaService {
        static final int TRANSACTION_clearCorpus = 3;
        static final int TRANSACTION_deleteUsageReport = 6;
        static final int TRANSACTION_getCorpusInfo = 5;
        static final int TRANSACTION_getCorpusStatus = 4;
        static final int TRANSACTION_registerCorpusInfo = 7;
        static final int TRANSACTION_requestIndexing = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISearchCorporaService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.corpora.internal.ISearchCorporaService");
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaService
            public void clearCorpus(ClearCorpusCall$Request clearCorpusCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, clearCorpusCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iSearchCorporaCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaService
            public void deleteUsageReport(DeleteUsageReportCall$Request deleteUsageReportCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, deleteUsageReportCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iSearchCorporaCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaService
            public void getCorpusInfo(GetCorpusInfoCall$Request getCorpusInfoCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getCorpusInfoCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iSearchCorporaCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaService
            public void getCorpusStatus(GetCorpusStatusCall$Request getCorpusStatusCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getCorpusStatusCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iSearchCorporaCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaService
            public void registerCorpusInfo(RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, registerCorpusInfoCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iSearchCorporaCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.corpora.internal.ISearchCorporaService
            public void requestIndexing(RequestIndexingCall$Request requestIndexingCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, requestIndexingCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iSearchCorporaCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.corpora.internal.ISearchCorporaService");
        }

        public static ISearchCorporaService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.corpora.internal.ISearchCorporaService");
            return queryLocalInterface instanceof ISearchCorporaService ? (ISearchCorporaService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    RequestIndexingCall$Request requestIndexingCall$Request = (RequestIndexingCall$Request) rve.a(parcel, RequestIndexingCall$Request.CREATOR);
                    ISearchCorporaCallbacks asInterface = ISearchCorporaCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    requestIndexing(requestIndexingCall$Request, asInterface, apiMetadata);
                    break;
                case 3:
                    ClearCorpusCall$Request clearCorpusCall$Request = (ClearCorpusCall$Request) rve.a(parcel, ClearCorpusCall$Request.CREATOR);
                    ISearchCorporaCallbacks asInterface2 = ISearchCorporaCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    clearCorpus(clearCorpusCall$Request, asInterface2, apiMetadata2);
                    break;
                case 4:
                    GetCorpusStatusCall$Request getCorpusStatusCall$Request = (GetCorpusStatusCall$Request) rve.a(parcel, GetCorpusStatusCall$Request.CREATOR);
                    ISearchCorporaCallbacks asInterface3 = ISearchCorporaCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getCorpusStatus(getCorpusStatusCall$Request, asInterface3, apiMetadata3);
                    break;
                case 5:
                    GetCorpusInfoCall$Request getCorpusInfoCall$Request = (GetCorpusInfoCall$Request) rve.a(parcel, GetCorpusInfoCall$Request.CREATOR);
                    ISearchCorporaCallbacks asInterface4 = ISearchCorporaCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getCorpusInfo(getCorpusInfoCall$Request, asInterface4, apiMetadata4);
                    break;
                case 6:
                    DeleteUsageReportCall$Request deleteUsageReportCall$Request = (DeleteUsageReportCall$Request) rve.a(parcel, DeleteUsageReportCall$Request.CREATOR);
                    ISearchCorporaCallbacks asInterface5 = ISearchCorporaCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata5 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    deleteUsageReport(deleteUsageReportCall$Request, asInterface5, apiMetadata5);
                    break;
                case 7:
                    RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request = (RegisterCorpusInfoCall$Request) rve.a(parcel, RegisterCorpusInfoCall$Request.CREATOR);
                    ISearchCorporaCallbacks asInterface6 = ISearchCorporaCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata6 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerCorpusInfo(registerCorpusInfoCall$Request, asInterface6, apiMetadata6);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void clearCorpus(ClearCorpusCall$Request clearCorpusCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata);

    void deleteUsageReport(DeleteUsageReportCall$Request deleteUsageReportCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata);

    void getCorpusInfo(GetCorpusInfoCall$Request getCorpusInfoCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata);

    void getCorpusStatus(GetCorpusStatusCall$Request getCorpusStatusCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata);

    void registerCorpusInfo(RegisterCorpusInfoCall$Request registerCorpusInfoCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata);

    void requestIndexing(RequestIndexingCall$Request requestIndexingCall$Request, ISearchCorporaCallbacks iSearchCorporaCallbacks, ApiMetadata apiMetadata);
}
