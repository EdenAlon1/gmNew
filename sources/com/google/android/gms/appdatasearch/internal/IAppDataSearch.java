package com.google.android.gms.appdatasearch.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.appdatasearch.DocumentResults;
import com.google.android.gms.appdatasearch.GlobalSearchApplication;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.NativeApiInfo;
import com.google.android.gms.appdatasearch.PIMEUpdateResponse;
import com.google.android.gms.appdatasearch.PhraseAffinityResponse;
import com.google.android.gms.appdatasearch.PhraseAffinitySpecification;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RequestIndexingSpecification;
import com.google.android.gms.appdatasearch.ResultClickInfo;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.gms.appdatasearch.StorageStats;
import com.google.android.gms.appdatasearch.SuggestSpecification;
import com.google.android.gms.appdatasearch.SuggestionResults;
import com.google.android.gms.common.api.ApiMetadata;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAppDataSearch extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAppDataSearch {
        static final int TRANSACTION_blockPackages = 16;
        static final int TRANSACTION_clearUsageReportData = 33;
        static final int TRANSACTION_diagnostic = 9;
        static final int TRANSACTION_getAllCorpusNames = 27;
        static final int TRANSACTION_getCorpusHandlesRegisteredForIME = 22;
        static final int TRANSACTION_getCorpusInfo = 25;
        static final int TRANSACTION_getCorpusNames = 6;
        static final int TRANSACTION_getCorpusStatus = 5;
        static final int TRANSACTION_getCurrentExperimentIds = 31;
        static final int TRANSACTION_getDocuments = 3;
        static final int TRANSACTION_getGlobalSearchApps = 29;
        static final int TRANSACTION_getIMEUpdates = 23;
        static final int TRANSACTION_getNativeApiInfo = 34;
        static final int TRANSACTION_getPendingExperimentIds = 32;
        static final int TRANSACTION_getPhraseAffinity = 24;
        static final int TRANSACTION_getStorageStatistics = 28;
        static final int TRANSACTION_getUniversalSearchableApps = 13;
        static final int TRANSACTION_query = 1;
        static final int TRANSACTION_queryUniversal = 10;
        static final int TRANSACTION_registerCorpusInfo = 7;
        static final int TRANSACTION_registerCorpusInfo2 = 14;
        static final int TRANSACTION_registerIME = 20;
        static final int TRANSACTION_registerUniversalSearchableApp = 11;
        static final int TRANSACTION_reportResultClick = 19;
        static final int TRANSACTION_requestIndexing = 4;
        static final int TRANSACTION_setExperimentIds = 30;
        static final int TRANSACTION_setIncludeInGlobalSearch = 36;
        static final int TRANSACTION_suggest = 2;
        static final int TRANSACTION_triggerCompaction = 18;
        static final int TRANSACTION_unblockPackages = 17;
        static final int TRANSACTION_unregister = 8;
        static final int TRANSACTION_unregisterIME = 21;
        static final int TRANSACTION_unregisterUniversalSearchableApp = 12;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAppDataSearch {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.appdatasearch.internal.IAppDataSearch");
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void blockPackages(String[] strArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public boolean clearUsageReportData(ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(33, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public Bundle diagnostic(Bundle bundle, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
                Bundle bundle2 = (Bundle) rve.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle2;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public String[] getAllCorpusNames(String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(27, obtainAndWriteInterfaceToken);
                String[] createStringArray = transactAndReadException.createStringArray();
                transactAndReadException.recycle();
                return createStringArray;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public String[] getCorpusHandlesRegisteredForIME(String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(22, obtainAndWriteInterfaceToken);
                String[] createStringArray = transactAndReadException.createStringArray();
                transactAndReadException.recycle();
                return createStringArray;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public RegisterCorpusInfo getCorpusInfo(String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(25, obtainAndWriteInterfaceToken);
                RegisterCorpusInfo registerCorpusInfo = (RegisterCorpusInfo) rve.a(transactAndReadException, RegisterCorpusInfo.CREATOR);
                transactAndReadException.recycle();
                return registerCorpusInfo;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public String[] getCorpusNames(String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                String[] createStringArray = transactAndReadException.createStringArray();
                transactAndReadException.recycle();
                return createStringArray;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public CorpusStatus getCorpusStatus(String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                CorpusStatus corpusStatus = (CorpusStatus) rve.a(transactAndReadException, CorpusStatus.CREATOR);
                transactAndReadException.recycle();
                return corpusStatus;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public int[] getCurrentExperimentIds(ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(31, obtainAndWriteInterfaceToken);
                int[] createIntArray = transactAndReadException.createIntArray();
                transactAndReadException.recycle();
                return createIntArray;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public DocumentResults getDocuments(String[] strArr, String str, String str2, QuerySpecification querySpecification, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, querySpecification);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                DocumentResults documentResults = (DocumentResults) rve.a(transactAndReadException, DocumentResults.CREATOR);
                transactAndReadException.recycle();
                return documentResults;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public GlobalSearchApplication[] getGlobalSearchApps(ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(29, obtainAndWriteInterfaceToken);
                GlobalSearchApplication[] globalSearchApplicationArr = (GlobalSearchApplication[]) transactAndReadException.createTypedArray(GlobalSearchApplication.CREATOR);
                transactAndReadException.recycle();
                return globalSearchApplicationArr;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public PIMEUpdateResponse getIMEUpdates(String str, int i, byte[] bArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(23, obtainAndWriteInterfaceToken);
                PIMEUpdateResponse pIMEUpdateResponse = (PIMEUpdateResponse) rve.a(transactAndReadException, PIMEUpdateResponse.CREATOR);
                transactAndReadException.recycle();
                return pIMEUpdateResponse;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public NativeApiInfo getNativeApiInfo(ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(34, obtainAndWriteInterfaceToken);
                NativeApiInfo nativeApiInfo = (NativeApiInfo) rve.a(transactAndReadException, NativeApiInfo.CREATOR);
                transactAndReadException.recycle();
                return nativeApiInfo;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public int[] getPendingExperimentIds(ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(32, obtainAndWriteInterfaceToken);
                int[] createIntArray = transactAndReadException.createIntArray();
                transactAndReadException.recycle();
                return createIntArray;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public PhraseAffinityResponse getPhraseAffinity(String[] strArr, PhraseAffinitySpecification phraseAffinitySpecification, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                rve.d(obtainAndWriteInterfaceToken, phraseAffinitySpecification);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(24, obtainAndWriteInterfaceToken);
                PhraseAffinityResponse phraseAffinityResponse = (PhraseAffinityResponse) rve.a(transactAndReadException, PhraseAffinityResponse.CREATOR);
                transactAndReadException.recycle();
                return phraseAffinityResponse;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public StorageStats getStorageStatistics(ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(28, obtainAndWriteInterfaceToken);
                StorageStats storageStats = (StorageStats) rve.a(transactAndReadException, StorageStats.CREATOR);
                transactAndReadException.recycle();
                return storageStats;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public GlobalSearchApplicationInfo[] getUniversalSearchableApps(ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken);
                GlobalSearchApplicationInfo[] globalSearchApplicationInfoArr = (GlobalSearchApplicationInfo[]) transactAndReadException.createTypedArray(GlobalSearchApplicationInfo.CREATOR);
                transactAndReadException.recycle();
                return globalSearchApplicationInfoArr;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public SearchResults query(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                rve.d(obtainAndWriteInterfaceToken, querySpecification);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                SearchResults searchResults = (SearchResults) rve.a(transactAndReadException, SearchResults.CREATOR);
                transactAndReadException.recycle();
                return searchResults;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public SearchResults queryUniversal(String str, int i, int i2, GlobalSearchQuerySpecification globalSearchQuerySpecification, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                rve.d(obtainAndWriteInterfaceToken, globalSearchQuerySpecification);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
                SearchResults searchResults = (SearchResults) rve.a(transactAndReadException, SearchResults.CREATOR);
                transactAndReadException.recycle();
                return searchResults;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void registerCorpusInfo(String str, RegisterCorpusInfo registerCorpusInfo, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, registerCorpusInfo);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public boolean registerCorpusInfo2(String str, RegisterCorpusInfo registerCorpusInfo, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, registerCorpusInfo);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public boolean registerIME(String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void registerUniversalSearchableApp(GlobalSearchApplicationInfo globalSearchApplicationInfo, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, globalSearchApplicationInfo);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public boolean reportResultClick(ResultClickInfo resultClickInfo, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, resultClickInfo);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public boolean requestIndexing(String str, String str2, long j, RequestIndexingSpecification requestIndexingSpecification, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeLong(j);
                rve.d(obtainAndWriteInterfaceToken, requestIndexingSpecification);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public boolean setExperimentIds(byte[] bArr, boolean z, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                int i = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(30, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void setIncludeInGlobalSearch(String str, boolean z, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                int i = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(36, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public SuggestionResults suggest(String str, String str2, String[] strArr, int i, SuggestSpecification suggestSpecification, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, suggestSpecification);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                SuggestionResults suggestionResults = (SuggestionResults) rve.a(transactAndReadException, SuggestionResults.CREATOR);
                transactAndReadException.recycle();
                return suggestionResults;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void triggerCompaction(ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void unblockPackages(String[] strArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public Bundle unregister(String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) rve.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void unregisterIME(String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.IAppDataSearch
            public void unregisterUniversalSearchableApp(String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.appdatasearch.internal.IAppDataSearch");
        }

        public static IAppDataSearch asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.IAppDataSearch");
            return queryLocalInterface instanceof IAppDataSearch ? (IAppDataSearch) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String[] createStringArray = parcel.createStringArray();
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    QuerySpecification querySpecification = (QuerySpecification) rve.a(parcel, QuerySpecification.CREATOR);
                    ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    SearchResults query = query(readString, readString2, createStringArray, readInt, readInt2, querySpecification, apiMetadata);
                    parcel2.writeNoException();
                    rve.e(parcel2, query);
                    return true;
                case 2:
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String[] createStringArray2 = parcel.createStringArray();
                    int readInt3 = parcel.readInt();
                    SuggestSpecification suggestSpecification = (SuggestSpecification) rve.a(parcel, SuggestSpecification.CREATOR);
                    ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    SuggestionResults suggest = suggest(readString3, readString4, createStringArray2, readInt3, suggestSpecification, apiMetadata2);
                    parcel2.writeNoException();
                    rve.e(parcel2, suggest);
                    return true;
                case 3:
                    String[] createStringArray3 = parcel.createStringArray();
                    String readString5 = parcel.readString();
                    String readString6 = parcel.readString();
                    QuerySpecification querySpecification2 = (QuerySpecification) rve.a(parcel, QuerySpecification.CREATOR);
                    ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    DocumentResults documents = getDocuments(createStringArray3, readString5, readString6, querySpecification2, apiMetadata3);
                    parcel2.writeNoException();
                    rve.e(parcel2, documents);
                    return true;
                case 4:
                    String readString7 = parcel.readString();
                    String readString8 = parcel.readString();
                    long readLong = parcel.readLong();
                    RequestIndexingSpecification requestIndexingSpecification = (RequestIndexingSpecification) rve.a(parcel, RequestIndexingSpecification.CREATOR);
                    ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean requestIndexing = requestIndexing(readString7, readString8, readLong, requestIndexingSpecification, apiMetadata4);
                    parcel2.writeNoException();
                    parcel2.writeInt(requestIndexing ? 1 : 0);
                    return true;
                case 5:
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    ApiMetadata apiMetadata5 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    CorpusStatus corpusStatus = getCorpusStatus(readString9, readString10, apiMetadata5);
                    parcel2.writeNoException();
                    rve.e(parcel2, corpusStatus);
                    return true;
                case 6:
                    String readString11 = parcel.readString();
                    ApiMetadata apiMetadata6 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    String[] corpusNames = getCorpusNames(readString11, apiMetadata6);
                    parcel2.writeNoException();
                    parcel2.writeStringArray(corpusNames);
                    return true;
                case 7:
                    String readString12 = parcel.readString();
                    RegisterCorpusInfo registerCorpusInfo = (RegisterCorpusInfo) rve.a(parcel, RegisterCorpusInfo.CREATOR);
                    ApiMetadata apiMetadata7 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerCorpusInfo(readString12, registerCorpusInfo, apiMetadata7);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    String readString13 = parcel.readString();
                    String readString14 = parcel.readString();
                    ApiMetadata apiMetadata8 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    Bundle unregister = unregister(readString13, readString14, apiMetadata8);
                    parcel2.writeNoException();
                    rve.e(parcel2, unregister);
                    return true;
                case 9:
                    Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    ApiMetadata apiMetadata9 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    Bundle diagnostic = diagnostic(bundle, apiMetadata9);
                    parcel2.writeNoException();
                    rve.e(parcel2, diagnostic);
                    return true;
                case 10:
                    String readString15 = parcel.readString();
                    int readInt4 = parcel.readInt();
                    int readInt5 = parcel.readInt();
                    GlobalSearchQuerySpecification globalSearchQuerySpecification = (GlobalSearchQuerySpecification) rve.a(parcel, GlobalSearchQuerySpecification.CREATOR);
                    ApiMetadata apiMetadata10 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    SearchResults queryUniversal = queryUniversal(readString15, readInt4, readInt5, globalSearchQuerySpecification, apiMetadata10);
                    parcel2.writeNoException();
                    rve.e(parcel2, queryUniversal);
                    return true;
                case 11:
                    GlobalSearchApplicationInfo globalSearchApplicationInfo = (GlobalSearchApplicationInfo) rve.a(parcel, GlobalSearchApplicationInfo.CREATOR);
                    ApiMetadata apiMetadata11 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerUniversalSearchableApp(globalSearchApplicationInfo, apiMetadata11);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    String readString16 = parcel.readString();
                    ApiMetadata apiMetadata12 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterUniversalSearchableApp(readString16, apiMetadata12);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    ApiMetadata apiMetadata13 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    GlobalSearchApplicationInfo[] universalSearchableApps = getUniversalSearchableApps(apiMetadata13);
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(universalSearchableApps, 1);
                    return true;
                case 14:
                    String readString17 = parcel.readString();
                    RegisterCorpusInfo registerCorpusInfo2 = (RegisterCorpusInfo) rve.a(parcel, RegisterCorpusInfo.CREATOR);
                    ApiMetadata apiMetadata14 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean registerCorpusInfo22 = registerCorpusInfo2(readString17, registerCorpusInfo2, apiMetadata14);
                    parcel2.writeNoException();
                    parcel2.writeInt(registerCorpusInfo22 ? 1 : 0);
                    return true;
                case 15:
                case 26:
                case 35:
                default:
                    return false;
                case 16:
                    String[] createStringArray4 = parcel.createStringArray();
                    ApiMetadata apiMetadata15 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    blockPackages(createStringArray4, apiMetadata15);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    String[] createStringArray5 = parcel.createStringArray();
                    ApiMetadata apiMetadata16 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    unblockPackages(createStringArray5, apiMetadata16);
                    parcel2.writeNoException();
                    return true;
                case 18:
                    ApiMetadata apiMetadata17 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    triggerCompaction(apiMetadata17);
                    parcel2.writeNoException();
                    return true;
                case 19:
                    ResultClickInfo resultClickInfo = (ResultClickInfo) rve.a(parcel, ResultClickInfo.CREATOR);
                    ApiMetadata apiMetadata18 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean reportResultClick = reportResultClick(resultClickInfo, apiMetadata18);
                    parcel2.writeNoException();
                    parcel2.writeInt(reportResultClick ? 1 : 0);
                    return true;
                case 20:
                    String readString18 = parcel.readString();
                    ApiMetadata apiMetadata19 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean registerIME = registerIME(readString18, apiMetadata19);
                    parcel2.writeNoException();
                    parcel2.writeInt(registerIME ? 1 : 0);
                    return true;
                case 21:
                    String readString19 = parcel.readString();
                    ApiMetadata apiMetadata20 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterIME(readString19, apiMetadata20);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    String readString20 = parcel.readString();
                    ApiMetadata apiMetadata21 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    String[] corpusHandlesRegisteredForIME = getCorpusHandlesRegisteredForIME(readString20, apiMetadata21);
                    parcel2.writeNoException();
                    parcel2.writeStringArray(corpusHandlesRegisteredForIME);
                    return true;
                case 23:
                    String readString21 = parcel.readString();
                    int readInt6 = parcel.readInt();
                    byte[] createByteArray = parcel.createByteArray();
                    ApiMetadata apiMetadata22 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    PIMEUpdateResponse iMEUpdates = getIMEUpdates(readString21, readInt6, createByteArray, apiMetadata22);
                    parcel2.writeNoException();
                    rve.e(parcel2, iMEUpdates);
                    return true;
                case 24:
                    String[] createStringArray6 = parcel.createStringArray();
                    PhraseAffinitySpecification phraseAffinitySpecification = (PhraseAffinitySpecification) rve.a(parcel, PhraseAffinitySpecification.CREATOR);
                    ApiMetadata apiMetadata23 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    PhraseAffinityResponse phraseAffinity = getPhraseAffinity(createStringArray6, phraseAffinitySpecification, apiMetadata23);
                    parcel2.writeNoException();
                    rve.e(parcel2, phraseAffinity);
                    return true;
                case 25:
                    String readString22 = parcel.readString();
                    String readString23 = parcel.readString();
                    ApiMetadata apiMetadata24 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    RegisterCorpusInfo corpusInfo = getCorpusInfo(readString22, readString23, apiMetadata24);
                    parcel2.writeNoException();
                    rve.e(parcel2, corpusInfo);
                    return true;
                case 27:
                    String readString24 = parcel.readString();
                    ApiMetadata apiMetadata25 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    String[] allCorpusNames = getAllCorpusNames(readString24, apiMetadata25);
                    parcel2.writeNoException();
                    parcel2.writeStringArray(allCorpusNames);
                    return true;
                case 28:
                    ApiMetadata apiMetadata26 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    StorageStats storageStatistics = getStorageStatistics(apiMetadata26);
                    parcel2.writeNoException();
                    rve.e(parcel2, storageStatistics);
                    return true;
                case 29:
                    ApiMetadata apiMetadata27 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    GlobalSearchApplication[] globalSearchApps = getGlobalSearchApps(apiMetadata27);
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(globalSearchApps, 1);
                    return true;
                case 30:
                    byte[] createByteArray2 = parcel.createByteArray();
                    boolean g = rve.g(parcel);
                    ApiMetadata apiMetadata28 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean experimentIds = setExperimentIds(createByteArray2, g, apiMetadata28);
                    parcel2.writeNoException();
                    parcel2.writeInt(experimentIds ? 1 : 0);
                    return true;
                case 31:
                    ApiMetadata apiMetadata29 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    int[] currentExperimentIds = getCurrentExperimentIds(apiMetadata29);
                    parcel2.writeNoException();
                    parcel2.writeIntArray(currentExperimentIds);
                    return true;
                case 32:
                    ApiMetadata apiMetadata30 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    int[] pendingExperimentIds = getPendingExperimentIds(apiMetadata30);
                    parcel2.writeNoException();
                    parcel2.writeIntArray(pendingExperimentIds);
                    return true;
                case 33:
                    ApiMetadata apiMetadata31 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean clearUsageReportData = clearUsageReportData(apiMetadata31);
                    parcel2.writeNoException();
                    parcel2.writeInt(clearUsageReportData ? 1 : 0);
                    return true;
                case 34:
                    ApiMetadata apiMetadata32 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    NativeApiInfo nativeApiInfo = getNativeApiInfo(apiMetadata32);
                    parcel2.writeNoException();
                    rve.e(parcel2, nativeApiInfo);
                    return true;
                case 36:
                    String readString25 = parcel.readString();
                    boolean g2 = rve.g(parcel);
                    ApiMetadata apiMetadata33 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setIncludeInGlobalSearch(readString25, g2, apiMetadata33);
                    parcel2.writeNoException();
                    return true;
            }
        }
    }

    void blockPackages(String[] strArr, ApiMetadata apiMetadata);

    boolean clearUsageReportData(ApiMetadata apiMetadata);

    Bundle diagnostic(Bundle bundle, ApiMetadata apiMetadata);

    String[] getAllCorpusNames(String str, ApiMetadata apiMetadata);

    String[] getCorpusHandlesRegisteredForIME(String str, ApiMetadata apiMetadata);

    RegisterCorpusInfo getCorpusInfo(String str, String str2, ApiMetadata apiMetadata);

    String[] getCorpusNames(String str, ApiMetadata apiMetadata);

    CorpusStatus getCorpusStatus(String str, String str2, ApiMetadata apiMetadata);

    int[] getCurrentExperimentIds(ApiMetadata apiMetadata);

    DocumentResults getDocuments(String[] strArr, String str, String str2, QuerySpecification querySpecification, ApiMetadata apiMetadata);

    GlobalSearchApplication[] getGlobalSearchApps(ApiMetadata apiMetadata);

    PIMEUpdateResponse getIMEUpdates(String str, int i, byte[] bArr, ApiMetadata apiMetadata);

    NativeApiInfo getNativeApiInfo(ApiMetadata apiMetadata);

    int[] getPendingExperimentIds(ApiMetadata apiMetadata);

    PhraseAffinityResponse getPhraseAffinity(String[] strArr, PhraseAffinitySpecification phraseAffinitySpecification, ApiMetadata apiMetadata);

    StorageStats getStorageStatistics(ApiMetadata apiMetadata);

    GlobalSearchApplicationInfo[] getUniversalSearchableApps(ApiMetadata apiMetadata);

    SearchResults query(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification, ApiMetadata apiMetadata);

    SearchResults queryUniversal(String str, int i, int i2, GlobalSearchQuerySpecification globalSearchQuerySpecification, ApiMetadata apiMetadata);

    void registerCorpusInfo(String str, RegisterCorpusInfo registerCorpusInfo, ApiMetadata apiMetadata);

    boolean registerCorpusInfo2(String str, RegisterCorpusInfo registerCorpusInfo, ApiMetadata apiMetadata);

    boolean registerIME(String str, ApiMetadata apiMetadata);

    void registerUniversalSearchableApp(GlobalSearchApplicationInfo globalSearchApplicationInfo, ApiMetadata apiMetadata);

    boolean reportResultClick(ResultClickInfo resultClickInfo, ApiMetadata apiMetadata);

    boolean requestIndexing(String str, String str2, long j, RequestIndexingSpecification requestIndexingSpecification, ApiMetadata apiMetadata);

    boolean setExperimentIds(byte[] bArr, boolean z, ApiMetadata apiMetadata);

    void setIncludeInGlobalSearch(String str, boolean z, ApiMetadata apiMetadata);

    SuggestionResults suggest(String str, String str2, String[] strArr, int i, SuggestSpecification suggestSpecification, ApiMetadata apiMetadata);

    void triggerCompaction(ApiMetadata apiMetadata);

    void unblockPackages(String[] strArr, ApiMetadata apiMetadata);

    Bundle unregister(String str, String str2, ApiMetadata apiMetadata);

    void unregisterIME(String str, ApiMetadata apiMetadata);

    void unregisterUniversalSearchableApp(String str, ApiMetadata apiMetadata);
}
