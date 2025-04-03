package com.google.android.gms.search.queries.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.search.queries.AnnotateCall$Request;
import com.google.android.gms.search.queries.GetDocumentsCall$Request;
import com.google.android.gms.search.queries.GetPhraseAffinityCall$Request;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.gms.search.queries.QuerySuggestCall$Request;
import com.google.android.gms.search.queries.internal.ISearchQueriesCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISearchQueriesService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISearchQueriesService {
        static final int TRANSACTION_annotate = 7;
        static final int TRANSACTION_getDocument = 9;
        static final int TRANSACTION_getDocuments = 4;
        static final int TRANSACTION_getPhraseAffinity = 5;
        static final int TRANSACTION_globalQuery = 3;
        static final int TRANSACTION_logApiTraceEvents = 8;
        static final int TRANSACTION_query = 2;
        static final int TRANSACTION_querySuggest = 6;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISearchQueriesService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.queries.internal.ISearchQueriesService");
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void annotate(AnnotateCall$Request annotateCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, annotateCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void getDocument(GetDocumentsCall$Request getDocumentsCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getDocumentsCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void getDocuments(GetDocumentsCall$Request getDocumentsCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getDocumentsCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void getPhraseAffinity(GetPhraseAffinityCall$Request getPhraseAffinityCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getPhraseAffinityCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void globalQuery(GlobalQueryCall$Request globalQueryCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, globalQueryCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void logApiTraceEvents(Bundle bundle, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactOneway(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void query(QueryCall$Request queryCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, queryCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.queries.internal.ISearchQueriesService
            public void querySuggest(QuerySuggestCall$Request querySuggestCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, querySuggestCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iSearchQueriesCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.queries.internal.ISearchQueriesService");
        }

        public static ISearchQueriesService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.queries.internal.ISearchQueriesService");
            return queryLocalInterface instanceof ISearchQueriesService ? (ISearchQueriesService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    QueryCall$Request queryCall$Request = (QueryCall$Request) rve.a(parcel, QueryCall$Request.CREATOR);
                    ISearchQueriesCallbacks asInterface = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    query(queryCall$Request, asInterface, apiMetadata);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    GlobalQueryCall$Request globalQueryCall$Request = (GlobalQueryCall$Request) rve.a(parcel, GlobalQueryCall$Request.CREATOR);
                    ISearchQueriesCallbacks asInterface2 = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    globalQuery(globalQueryCall$Request, asInterface2, apiMetadata2);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    GetDocumentsCall$Request getDocumentsCall$Request = (GetDocumentsCall$Request) rve.a(parcel, GetDocumentsCall$Request.CREATOR);
                    ISearchQueriesCallbacks asInterface3 = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getDocuments(getDocumentsCall$Request, asInterface3, apiMetadata3);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    GetPhraseAffinityCall$Request getPhraseAffinityCall$Request = (GetPhraseAffinityCall$Request) rve.a(parcel, GetPhraseAffinityCall$Request.CREATOR);
                    ISearchQueriesCallbacks asInterface4 = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getPhraseAffinity(getPhraseAffinityCall$Request, asInterface4, apiMetadata4);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    QuerySuggestCall$Request querySuggestCall$Request = (QuerySuggestCall$Request) rve.a(parcel, QuerySuggestCall$Request.CREATOR);
                    ISearchQueriesCallbacks asInterface5 = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata5 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    querySuggest(querySuggestCall$Request, asInterface5, apiMetadata5);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    AnnotateCall$Request annotateCall$Request = (AnnotateCall$Request) rve.a(parcel, AnnotateCall$Request.CREATOR);
                    ISearchQueriesCallbacks asInterface6 = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata6 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    annotate(annotateCall$Request, asInterface6, apiMetadata6);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    ApiMetadata apiMetadata7 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    logApiTraceEvents(bundle, apiMetadata7);
                    return true;
                case 9:
                    GetDocumentsCall$Request getDocumentsCall$Request2 = (GetDocumentsCall$Request) rve.a(parcel, GetDocumentsCall$Request.CREATOR);
                    ISearchQueriesCallbacks asInterface7 = ISearchQueriesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata8 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getDocument(getDocumentsCall$Request2, asInterface7, apiMetadata8);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void annotate(AnnotateCall$Request annotateCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata);

    void getDocument(GetDocumentsCall$Request getDocumentsCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata);

    void getDocuments(GetDocumentsCall$Request getDocumentsCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata);

    void getPhraseAffinity(GetPhraseAffinityCall$Request getPhraseAffinityCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata);

    void globalQuery(GlobalQueryCall$Request globalQueryCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata);

    void logApiTraceEvents(Bundle bundle, ApiMetadata apiMetadata);

    void query(QueryCall$Request queryCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata);

    void querySuggest(QuerySuggestCall$Request querySuggestCall$Request, ISearchQueriesCallbacks iSearchQueriesCallbacks, ApiMetadata apiMetadata);
}
