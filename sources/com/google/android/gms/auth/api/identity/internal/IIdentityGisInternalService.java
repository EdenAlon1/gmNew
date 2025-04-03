package com.google.android.gms.auth.api.identity.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.internal.IAggregateOneTapZuulOptOutStateCallback;
import com.google.android.gms.auth.api.identity.internal.ICompleteSignInCallback;
import com.google.android.gms.auth.api.identity.internal.IFetchAccountLinkingConsentPageUrlCallback;
import com.google.android.gms.auth.api.identity.internal.IFetchAccountsWithZuulKeyRetrievalIntentsCallback;
import com.google.android.gms.auth.api.identity.internal.IFetchChromeOptionsCallback;
import com.google.android.gms.auth.api.identity.internal.IFetchGoogleIdTokenCredentialCallback;
import com.google.android.gms.auth.api.identity.internal.IFetchVerifiedPhoneNumbersForAccountCallback;
import com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback;
import com.google.android.gms.auth.api.identity.internal.IGetDefaultAccountCallback;
import com.google.android.gms.auth.api.identity.internal.IGetPasswordAndPasskeyCallback;
import com.google.android.gms.auth.api.identity.internal.IHasDisplayedWarmWelcomeCallback;
import com.google.android.gms.auth.api.identity.internal.IIsAutoSelectEnabledForAppCallback;
import com.google.android.gms.auth.api.identity.internal.IIsOptedInForAutoSelectCallback;
import com.google.android.gms.auth.api.identity.internal.IListPasskeyCredentialsCallback;
import com.google.android.gms.auth.api.identity.internal.IListSignInCredentialsCallback;
import com.google.android.gms.auth.api.identity.internal.IMatchPasswordCallback;
import com.google.android.gms.auth.api.identity.internal.ISortAccountsByLastUsedForCreatePasswordPasskeyCallback;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IIdentityGisInternalService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IIdentityGisInternalService {
        static final int TRANSACTION_aggregateOneTapZuulOptOutState = 25;
        static final int TRANSACTION_completeSaveAccountLinkingToken = 10;
        static final int TRANSACTION_completeSignIn = 2;
        static final int TRANSACTION_depositIdToken = 13;
        static final int TRANSACTION_fetchAccountLinkingConsentPageUrl = 17;
        static final int TRANSACTION_fetchAccountsWithZuulKeyRetrievalIntents = 23;
        static final int TRANSACTION_fetchAccountsWithZuulKeyRetrievalIntentsOptedInForOneTap = 24;
        static final int TRANSACTION_fetchChromeOptions = 33;
        static final int TRANSACTION_fetchGoogleIdTokenCredential = 27;
        static final int TRANSACTION_fetchVerifiedPhoneNumbersForAccount = 21;
        static final int TRANSACTION_getCachedSaveAccountLinkingTokenRequest = 11;
        static final int TRANSACTION_getDefaultAccount = 9;
        static final int TRANSACTION_getPasswordAndPasskey = 29;
        static final int TRANSACTION_hasDisplayedWarmWelcome = 19;
        static final int TRANSACTION_isAutoSelectEnabledForApp = 14;
        static final int TRANSACTION_isOptedInForAutoSelect = 12;
        static final int TRANSACTION_listPasskeyCredentials = 28;
        static final int TRANSACTION_listSignInCredentials = 1;
        static final int TRANSACTION_matchPassword = 7;
        static final int TRANSACTION_recordCancelledSignIn = 5;
        static final int TRANSACTION_recordCreatePasswordPasskey = 31;
        static final int TRANSACTION_recordGrants = 3;
        static final int TRANSACTION_resetSignInCancellationCounter = 6;
        static final int TRANSACTION_resetWarmWelcomeDisplayed = 20;
        static final int TRANSACTION_savePassword = 8;
        static final int TRANSACTION_setAutoSelectEnabledForApp = 15;
        static final int TRANSACTION_setNeverSaveForApp = 16;
        static final int TRANSACTION_setWarmWelcomeDisplayed = 18;
        static final int TRANSACTION_sortAccountsByLastUsedForCreatePasswordPasskey = 32;
        static final int TRANSACTION_updateDefaultAccount = 4;
        static final int TRANSACTION_updateOneTapZuulOptOutState = 26;
        static final int TRANSACTION_updatePasswordLastUsedTime = 30;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IIdentityGisInternalService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void aggregateOneTapZuulOptOutState(IAggregateOneTapZuulOptOutStateCallback iAggregateOneTapZuulOptOutStateCallback, List<Account> list, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAggregateOneTapZuulOptOutStateCallback);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(25, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void completeSaveAccountLinkingToken(IStatusCallback iStatusCallback, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, String str, String str2, Account account, String str3, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, saveAccountLinkingTokenRequest);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str3);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void completeSignIn(ICompleteSignInCallback iCompleteSignInCallback, String str, String str2, String str3, String str4, InternalSignInCredentialWrapper internalSignInCredentialWrapper, String str5, String str6, int i, ApiMetadata apiMetadata, String str7) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iCompleteSignInCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeString(str4);
                rve.d(obtainAndWriteInterfaceToken, internalSignInCredentialWrapper);
                obtainAndWriteInterfaceToken.writeString(str5);
                obtainAndWriteInterfaceToken.writeString(str6);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                obtainAndWriteInterfaceToken.writeString(str7);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void depositIdToken(IStatusCallback iStatusCallback, Account account, List<Scope> list, String str, BeginSignInRequest beginSignInRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, beginSignInRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void fetchAccountLinkingConsentPageUrl(IFetchAccountLinkingConsentPageUrlCallback iFetchAccountLinkingConsentPageUrlCallback, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, Account account, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iFetchAccountLinkingConsentPageUrlCallback);
                rve.d(obtainAndWriteInterfaceToken, saveAccountLinkingTokenRequest);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void fetchAccountsWithZuulKeyRetrievalIntents(IFetchAccountsWithZuulKeyRetrievalIntentsCallback iFetchAccountsWithZuulKeyRetrievalIntentsCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iFetchAccountsWithZuulKeyRetrievalIntentsCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(23, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void fetchAccountsWithZuulKeyRetrievalIntentsOptedInForOneTap(IFetchAccountsWithZuulKeyRetrievalIntentsCallback iFetchAccountsWithZuulKeyRetrievalIntentsCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iFetchAccountsWithZuulKeyRetrievalIntentsCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(24, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void fetchChromeOptions(IFetchChromeOptionsCallback iFetchChromeOptionsCallback, Bundle bundle, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iFetchChromeOptionsCallback);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(33, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void fetchGoogleIdTokenCredential(IFetchGoogleIdTokenCredentialCallback iFetchGoogleIdTokenCredentialCallback, Account account, String str, String str2, int i, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iFetchGoogleIdTokenCredentialCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void fetchVerifiedPhoneNumbersForAccount(IFetchVerifiedPhoneNumbersForAccountCallback iFetchVerifiedPhoneNumbersForAccountCallback, Account account, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iFetchVerifiedPhoneNumbersForAccountCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void getCachedSaveAccountLinkingTokenRequest(IGetCachedSaveAccountLinkingTokenRequestCallback iGetCachedSaveAccountLinkingTokenRequestCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iGetCachedSaveAccountLinkingTokenRequestCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void getDefaultAccount(IGetDefaultAccountCallback iGetDefaultAccountCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iGetDefaultAccountCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void getPasswordAndPasskey(IGetPasswordAndPasskeyCallback iGetPasswordAndPasskeyCallback, Bundle bundle, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iGetPasswordAndPasskeyCallback);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(29, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void hasDisplayedWarmWelcome(IHasDisplayedWarmWelcomeCallback iHasDisplayedWarmWelcomeCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iHasDisplayedWarmWelcomeCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(19, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void isAutoSelectEnabledForApp(IIsAutoSelectEnabledForAppCallback iIsAutoSelectEnabledForAppCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iIsAutoSelectEnabledForAppCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void isOptedInForAutoSelect(IIsOptedInForAutoSelectCallback iIsOptedInForAutoSelectCallback, Account account, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iIsOptedInForAutoSelectCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void listPasskeyCredentials(IListPasskeyCredentialsCallback iListPasskeyCredentialsCallback, String str, String str2, String str3, List<PublicKeyCredentialDescriptor> list, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iListPasskeyCredentialsCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeList(list);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(28, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void listSignInCredentials(IListSignInCredentialsCallback iListSignInCredentialsCallback, String str, BeginSignInRequest beginSignInRequest, boolean z, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iListSignInCredentialsCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, beginSignInRequest);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void matchPassword(IMatchPasswordCallback iMatchPasswordCallback, SavePasswordRequest savePasswordRequest, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMatchPasswordCallback);
                rve.d(obtainAndWriteInterfaceToken, savePasswordRequest);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void recordCancelledSignIn(IStatusCallback iStatusCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void recordCreatePasswordPasskey(IStatusCallback iStatusCallback, Account account, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(31, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void recordGrants(IStatusCallback iStatusCallback, String str, String str2, Account account, int i, ApiMetadata apiMetadata, String str3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                obtainAndWriteInterfaceToken.writeString(str3);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void resetSignInCancellationCounter(IStatusCallback iStatusCallback, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void resetWarmWelcomeDisplayed(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void savePassword(IStatusCallback iStatusCallback, SavePasswordRequest savePasswordRequest, List<Account> list, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, savePasswordRequest);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void setAutoSelectEnabledForApp(IStatusCallback iStatusCallback, String str, boolean z, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void setNeverSaveForApp(IStatusCallback iStatusCallback, Account account, String str, boolean z, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void setWarmWelcomeDisplayed(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void sortAccountsByLastUsedForCreatePasswordPasskey(ISortAccountsByLastUsedForCreatePasswordPasskeyCallback iSortAccountsByLastUsedForCreatePasswordPasskeyCallback, List<Account> list, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iSortAccountsByLastUsedForCreatePasswordPasskeyCallback);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(32, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void updateDefaultAccount(IStatusCallback iStatusCallback, String str, String str2, Account account, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, account);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void updateOneTapZuulOptOutState(IStatusCallback iStatusCallback, List<Account> list, int i, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(26, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService
            public void updatePasswordLastUsedTime(IStatusCallback iStatusCallback, InternalSignInCredentialWrapper internalSignInCredentialWrapper, CallingAppInfoCompat callingAppInfoCompat, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, internalSignInCredentialWrapper);
                rve.d(obtainAndWriteInterfaceToken, callingAppInfoCompat);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(30, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService");
        }

        public static IIdentityGisInternalService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IIdentityGisInternalService");
            return queryLocalInterface instanceof IIdentityGisInternalService ? (IIdentityGisInternalService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IListSignInCredentialsCallback asInterface = IListSignInCredentialsCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    BeginSignInRequest beginSignInRequest = (BeginSignInRequest) rve.a(parcel, BeginSignInRequest.CREATOR);
                    boolean g = rve.g(parcel);
                    ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    listSignInCredentials(asInterface, readString, beginSignInRequest, g, apiMetadata);
                    break;
                case 2:
                    ICompleteSignInCallback asInterface2 = ICompleteSignInCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    InternalSignInCredentialWrapper internalSignInCredentialWrapper = (InternalSignInCredentialWrapper) rve.a(parcel, InternalSignInCredentialWrapper.CREATOR);
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    int readInt = parcel.readInt();
                    ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    String readString8 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    completeSignIn(asInterface2, readString2, readString3, readString4, readString5, internalSignInCredentialWrapper, readString6, readString7, readInt, apiMetadata2, readString8);
                    break;
                case 3:
                    IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    Account account = (Account) rve.a(parcel, Account.CREATOR);
                    int readInt2 = parcel.readInt();
                    ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    String readString11 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    recordGrants(asInterface3, readString9, readString10, account, readInt2, apiMetadata3, readString11);
                    break;
                case 4:
                    IStatusCallback asInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString12 = parcel.readString();
                    String readString13 = parcel.readString();
                    Account account2 = (Account) rve.a(parcel, Account.CREATOR);
                    ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateDefaultAccount(asInterface4, readString12, readString13, account2, apiMetadata4);
                    break;
                case 5:
                    IStatusCallback asInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString14 = parcel.readString();
                    String readString15 = parcel.readString();
                    ApiMetadata apiMetadata5 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    recordCancelledSignIn(asInterface5, readString14, readString15, apiMetadata5);
                    break;
                case 6:
                    IStatusCallback asInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString16 = parcel.readString();
                    String readString17 = parcel.readString();
                    ApiMetadata apiMetadata6 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    resetSignInCancellationCounter(asInterface6, readString16, readString17, apiMetadata6);
                    break;
                case 7:
                    IMatchPasswordCallback asInterface7 = IMatchPasswordCallback.Stub.asInterface(parcel.readStrongBinder());
                    SavePasswordRequest savePasswordRequest = (SavePasswordRequest) rve.a(parcel, SavePasswordRequest.CREATOR);
                    String readString18 = parcel.readString();
                    String readString19 = parcel.readString();
                    ApiMetadata apiMetadata7 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    matchPassword(asInterface7, savePasswordRequest, readString18, readString19, apiMetadata7);
                    break;
                case 8:
                    IStatusCallback asInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    SavePasswordRequest savePasswordRequest2 = (SavePasswordRequest) rve.a(parcel, SavePasswordRequest.CREATOR);
                    ArrayList createTypedArrayList = parcel.createTypedArrayList(Account.CREATOR);
                    String readString20 = parcel.readString();
                    ApiMetadata apiMetadata8 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    savePassword(asInterface8, savePasswordRequest2, createTypedArrayList, readString20, apiMetadata8);
                    break;
                case 9:
                    IGetDefaultAccountCallback asInterface9 = IGetDefaultAccountCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString21 = parcel.readString();
                    String readString22 = parcel.readString();
                    ApiMetadata apiMetadata9 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getDefaultAccount(asInterface9, readString21, readString22, apiMetadata9);
                    break;
                case 10:
                    IStatusCallback asInterface10 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) rve.a(parcel, SaveAccountLinkingTokenRequest.CREATOR);
                    String readString23 = parcel.readString();
                    String readString24 = parcel.readString();
                    Account account3 = (Account) rve.a(parcel, Account.CREATOR);
                    String readString25 = parcel.readString();
                    ApiMetadata apiMetadata10 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    completeSaveAccountLinkingToken(asInterface10, saveAccountLinkingTokenRequest, readString23, readString24, account3, readString25, apiMetadata10);
                    break;
                case 11:
                    IGetCachedSaveAccountLinkingTokenRequestCallback asInterface11 = IGetCachedSaveAccountLinkingTokenRequestCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString26 = parcel.readString();
                    String readString27 = parcel.readString();
                    ApiMetadata apiMetadata11 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getCachedSaveAccountLinkingTokenRequest(asInterface11, readString26, readString27, apiMetadata11);
                    break;
                case 12:
                    IIsOptedInForAutoSelectCallback asInterface12 = IIsOptedInForAutoSelectCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account4 = (Account) rve.a(parcel, Account.CREATOR);
                    String readString28 = parcel.readString();
                    ApiMetadata apiMetadata12 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    isOptedInForAutoSelect(asInterface12, account4, readString28, apiMetadata12);
                    break;
                case 13:
                    IStatusCallback asInterface13 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account5 = (Account) rve.a(parcel, Account.CREATOR);
                    ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Scope.CREATOR);
                    String readString29 = parcel.readString();
                    BeginSignInRequest beginSignInRequest2 = (BeginSignInRequest) rve.a(parcel, BeginSignInRequest.CREATOR);
                    ApiMetadata apiMetadata13 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    depositIdToken(asInterface13, account5, createTypedArrayList2, readString29, beginSignInRequest2, apiMetadata13);
                    break;
                case 14:
                    IIsAutoSelectEnabledForAppCallback asInterface14 = IIsAutoSelectEnabledForAppCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString30 = parcel.readString();
                    String readString31 = parcel.readString();
                    ApiMetadata apiMetadata14 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    isAutoSelectEnabledForApp(asInterface14, readString30, readString31, apiMetadata14);
                    break;
                case 15:
                    IStatusCallback asInterface15 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString32 = parcel.readString();
                    boolean g2 = rve.g(parcel);
                    String readString33 = parcel.readString();
                    ApiMetadata apiMetadata15 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setAutoSelectEnabledForApp(asInterface15, readString32, g2, readString33, apiMetadata15);
                    break;
                case 16:
                    IStatusCallback asInterface16 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account6 = (Account) rve.a(parcel, Account.CREATOR);
                    String readString34 = parcel.readString();
                    boolean g3 = rve.g(parcel);
                    String readString35 = parcel.readString();
                    ApiMetadata apiMetadata16 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setNeverSaveForApp(asInterface16, account6, readString34, g3, readString35, apiMetadata16);
                    break;
                case 17:
                    IFetchAccountLinkingConsentPageUrlCallback asInterface17 = IFetchAccountLinkingConsentPageUrlCallback.Stub.asInterface(parcel.readStrongBinder());
                    SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = (SaveAccountLinkingTokenRequest) rve.a(parcel, SaveAccountLinkingTokenRequest.CREATOR);
                    Account account7 = (Account) rve.a(parcel, Account.CREATOR);
                    String readString36 = parcel.readString();
                    ApiMetadata apiMetadata17 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchAccountLinkingConsentPageUrl(asInterface17, saveAccountLinkingTokenRequest2, account7, readString36, apiMetadata17);
                    break;
                case 18:
                    IStatusCallback asInterface18 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString37 = parcel.readString();
                    ApiMetadata apiMetadata18 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setWarmWelcomeDisplayed(asInterface18, readString37, apiMetadata18);
                    break;
                case 19:
                    IHasDisplayedWarmWelcomeCallback asInterface19 = IHasDisplayedWarmWelcomeCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString38 = parcel.readString();
                    ApiMetadata apiMetadata19 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    hasDisplayedWarmWelcome(asInterface19, readString38, apiMetadata19);
                    break;
                case 20:
                    IStatusCallback asInterface20 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString39 = parcel.readString();
                    ApiMetadata apiMetadata20 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    resetWarmWelcomeDisplayed(asInterface20, readString39, apiMetadata20);
                    break;
                case 21:
                    IFetchVerifiedPhoneNumbersForAccountCallback asInterface21 = IFetchVerifiedPhoneNumbersForAccountCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account8 = (Account) rve.a(parcel, Account.CREATOR);
                    String readString40 = parcel.readString();
                    String readString41 = parcel.readString();
                    ApiMetadata apiMetadata21 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchVerifiedPhoneNumbersForAccount(asInterface21, account8, readString40, readString41, apiMetadata21);
                    break;
                case 22:
                default:
                    return false;
                case 23:
                    IFetchAccountsWithZuulKeyRetrievalIntentsCallback asInterface22 = IFetchAccountsWithZuulKeyRetrievalIntentsCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString42 = parcel.readString();
                    String readString43 = parcel.readString();
                    ApiMetadata apiMetadata22 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchAccountsWithZuulKeyRetrievalIntents(asInterface22, readString42, readString43, apiMetadata22);
                    break;
                case 24:
                    IFetchAccountsWithZuulKeyRetrievalIntentsCallback asInterface23 = IFetchAccountsWithZuulKeyRetrievalIntentsCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString44 = parcel.readString();
                    String readString45 = parcel.readString();
                    ApiMetadata apiMetadata23 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchAccountsWithZuulKeyRetrievalIntentsOptedInForOneTap(asInterface23, readString44, readString45, apiMetadata23);
                    break;
                case 25:
                    IAggregateOneTapZuulOptOutStateCallback asInterface24 = IAggregateOneTapZuulOptOutStateCallback.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Account.CREATOR);
                    String readString46 = parcel.readString();
                    ApiMetadata apiMetadata24 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    aggregateOneTapZuulOptOutState(asInterface24, createTypedArrayList3, readString46, apiMetadata24);
                    break;
                case 26:
                    IStatusCallback asInterface25 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Account.CREATOR);
                    int readInt3 = parcel.readInt();
                    String readString47 = parcel.readString();
                    ApiMetadata apiMetadata25 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateOneTapZuulOptOutState(asInterface25, createTypedArrayList4, readInt3, readString47, apiMetadata25);
                    break;
                case 27:
                    IFetchGoogleIdTokenCredentialCallback asInterface26 = IFetchGoogleIdTokenCredentialCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account9 = (Account) rve.a(parcel, Account.CREATOR);
                    String readString48 = parcel.readString();
                    String readString49 = parcel.readString();
                    int readInt4 = parcel.readInt();
                    ApiMetadata apiMetadata26 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchGoogleIdTokenCredential(asInterface26, account9, readString48, readString49, readInt4, apiMetadata26);
                    break;
                case 28:
                    IListPasskeyCredentialsCallback asInterface27 = IListPasskeyCredentialsCallback.Stub.asInterface(parcel.readStrongBinder());
                    String readString50 = parcel.readString();
                    String readString51 = parcel.readString();
                    String readString52 = parcel.readString();
                    ArrayList b = rve.b(parcel);
                    ApiMetadata apiMetadata27 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    listPasskeyCredentials(asInterface27, readString50, readString51, readString52, b, apiMetadata27);
                    break;
                case 29:
                    IGetPasswordAndPasskeyCallback asInterface28 = IGetPasswordAndPasskeyCallback.Stub.asInterface(parcel.readStrongBinder());
                    Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    String readString53 = parcel.readString();
                    ApiMetadata apiMetadata28 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getPasswordAndPasskey(asInterface28, bundle, readString53, apiMetadata28);
                    break;
                case 30:
                    IStatusCallback asInterface29 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    InternalSignInCredentialWrapper internalSignInCredentialWrapper2 = (InternalSignInCredentialWrapper) rve.a(parcel, InternalSignInCredentialWrapper.CREATOR);
                    CallingAppInfoCompat callingAppInfoCompat = (CallingAppInfoCompat) rve.a(parcel, CallingAppInfoCompat.CREATOR);
                    String readString54 = parcel.readString();
                    ApiMetadata apiMetadata29 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    updatePasswordLastUsedTime(asInterface29, internalSignInCredentialWrapper2, callingAppInfoCompat, readString54, apiMetadata29);
                    break;
                case 31:
                    IStatusCallback asInterface30 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account10 = (Account) rve.a(parcel, Account.CREATOR);
                    ApiMetadata apiMetadata30 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    recordCreatePasswordPasskey(asInterface30, account10, apiMetadata30);
                    break;
                case 32:
                    ISortAccountsByLastUsedForCreatePasswordPasskeyCallback asInterface31 = ISortAccountsByLastUsedForCreatePasswordPasskeyCallback.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList createTypedArrayList5 = parcel.createTypedArrayList(Account.CREATOR);
                    String readString55 = parcel.readString();
                    ApiMetadata apiMetadata31 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    sortAccountsByLastUsedForCreatePasswordPasskey(asInterface31, createTypedArrayList5, readString55, apiMetadata31);
                    break;
                case 33:
                    IFetchChromeOptionsCallback asInterface32 = IFetchChromeOptionsCallback.Stub.asInterface(parcel.readStrongBinder());
                    Bundle bundle2 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    ApiMetadata apiMetadata32 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchChromeOptions(asInterface32, bundle2, apiMetadata32);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void aggregateOneTapZuulOptOutState(IAggregateOneTapZuulOptOutStateCallback iAggregateOneTapZuulOptOutStateCallback, List<Account> list, String str, ApiMetadata apiMetadata);

    void completeSaveAccountLinkingToken(IStatusCallback iStatusCallback, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, String str, String str2, Account account, String str3, ApiMetadata apiMetadata);

    void completeSignIn(ICompleteSignInCallback iCompleteSignInCallback, String str, String str2, String str3, String str4, InternalSignInCredentialWrapper internalSignInCredentialWrapper, String str5, String str6, int i, ApiMetadata apiMetadata, String str7);

    void depositIdToken(IStatusCallback iStatusCallback, Account account, List<Scope> list, String str, BeginSignInRequest beginSignInRequest, ApiMetadata apiMetadata);

    void fetchAccountLinkingConsentPageUrl(IFetchAccountLinkingConsentPageUrlCallback iFetchAccountLinkingConsentPageUrlCallback, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, Account account, String str, ApiMetadata apiMetadata);

    void fetchAccountsWithZuulKeyRetrievalIntents(IFetchAccountsWithZuulKeyRetrievalIntentsCallback iFetchAccountsWithZuulKeyRetrievalIntentsCallback, String str, String str2, ApiMetadata apiMetadata);

    void fetchAccountsWithZuulKeyRetrievalIntentsOptedInForOneTap(IFetchAccountsWithZuulKeyRetrievalIntentsCallback iFetchAccountsWithZuulKeyRetrievalIntentsCallback, String str, String str2, ApiMetadata apiMetadata);

    void fetchChromeOptions(IFetchChromeOptionsCallback iFetchChromeOptionsCallback, Bundle bundle, ApiMetadata apiMetadata);

    void fetchGoogleIdTokenCredential(IFetchGoogleIdTokenCredentialCallback iFetchGoogleIdTokenCredentialCallback, Account account, String str, String str2, int i, ApiMetadata apiMetadata);

    void fetchVerifiedPhoneNumbersForAccount(IFetchVerifiedPhoneNumbersForAccountCallback iFetchVerifiedPhoneNumbersForAccountCallback, Account account, String str, String str2, ApiMetadata apiMetadata);

    void getCachedSaveAccountLinkingTokenRequest(IGetCachedSaveAccountLinkingTokenRequestCallback iGetCachedSaveAccountLinkingTokenRequestCallback, String str, String str2, ApiMetadata apiMetadata);

    void getDefaultAccount(IGetDefaultAccountCallback iGetDefaultAccountCallback, String str, String str2, ApiMetadata apiMetadata);

    void getPasswordAndPasskey(IGetPasswordAndPasskeyCallback iGetPasswordAndPasskeyCallback, Bundle bundle, String str, ApiMetadata apiMetadata);

    void hasDisplayedWarmWelcome(IHasDisplayedWarmWelcomeCallback iHasDisplayedWarmWelcomeCallback, String str, ApiMetadata apiMetadata);

    void isAutoSelectEnabledForApp(IIsAutoSelectEnabledForAppCallback iIsAutoSelectEnabledForAppCallback, String str, String str2, ApiMetadata apiMetadata);

    void isOptedInForAutoSelect(IIsOptedInForAutoSelectCallback iIsOptedInForAutoSelectCallback, Account account, String str, ApiMetadata apiMetadata);

    void listPasskeyCredentials(IListPasskeyCredentialsCallback iListPasskeyCredentialsCallback, String str, String str2, String str3, List<PublicKeyCredentialDescriptor> list, ApiMetadata apiMetadata);

    void listSignInCredentials(IListSignInCredentialsCallback iListSignInCredentialsCallback, String str, BeginSignInRequest beginSignInRequest, boolean z, ApiMetadata apiMetadata);

    void matchPassword(IMatchPasswordCallback iMatchPasswordCallback, SavePasswordRequest savePasswordRequest, String str, String str2, ApiMetadata apiMetadata);

    void recordCancelledSignIn(IStatusCallback iStatusCallback, String str, String str2, ApiMetadata apiMetadata);

    void recordCreatePasswordPasskey(IStatusCallback iStatusCallback, Account account, ApiMetadata apiMetadata);

    void recordGrants(IStatusCallback iStatusCallback, String str, String str2, Account account, int i, ApiMetadata apiMetadata, String str3);

    void resetSignInCancellationCounter(IStatusCallback iStatusCallback, String str, String str2, ApiMetadata apiMetadata);

    void resetWarmWelcomeDisplayed(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void savePassword(IStatusCallback iStatusCallback, SavePasswordRequest savePasswordRequest, List<Account> list, String str, ApiMetadata apiMetadata);

    void setAutoSelectEnabledForApp(IStatusCallback iStatusCallback, String str, boolean z, String str2, ApiMetadata apiMetadata);

    void setNeverSaveForApp(IStatusCallback iStatusCallback, Account account, String str, boolean z, String str2, ApiMetadata apiMetadata);

    void setWarmWelcomeDisplayed(IStatusCallback iStatusCallback, String str, ApiMetadata apiMetadata);

    void sortAccountsByLastUsedForCreatePasswordPasskey(ISortAccountsByLastUsedForCreatePasswordPasskeyCallback iSortAccountsByLastUsedForCreatePasswordPasskeyCallback, List<Account> list, String str, ApiMetadata apiMetadata);

    void updateDefaultAccount(IStatusCallback iStatusCallback, String str, String str2, Account account, ApiMetadata apiMetadata);

    void updateOneTapZuulOptOutState(IStatusCallback iStatusCallback, List<Account> list, int i, String str, ApiMetadata apiMetadata);

    void updatePasswordLastUsedTime(IStatusCallback iStatusCallback, InternalSignInCredentialWrapper internalSignInCredentialWrapper, CallingAppInfoCompat callingAppInfoCompat, String str, ApiMetadata apiMetadata);
}
