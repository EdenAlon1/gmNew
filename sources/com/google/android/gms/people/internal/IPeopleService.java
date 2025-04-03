package com.google.android.gms.people.internal;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.people.consentprimitive.GetContactsConsentsStatusRequest;
import com.google.android.gms.people.identity.internal.AccountToken;
import com.google.android.gms.people.identity.internal.ParcelableGetOptions;
import com.google.android.gms.people.identity.internal.ParcelableListOptions;
import com.google.android.gms.people.internal.IPeopleCallbacks;
import com.google.android.gms.people.model.AvatarReference;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IPeopleService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPeopleService {
        static final int TRANSACTION_addCircle = 701;
        static final int TRANSACTION_addCircle26 = 27;
        static final int TRANSACTION_addPeopleToCircle = 28;
        static final int TRANSACTION_fetchBackUpDeviceContactInfo = 1401;
        static final int TRANSACTION_getContactsConsentsStatus = 213301;
        static final int TRANSACTION_getContactsConsentsStatus2 = 213901;
        static final int TRANSACTION_getFirstFullSyncStatus = 4201;
        static final int TRANSACTION_getGalProviderFileDescriptor = 2202;
        static final int TRANSACTION_getGalProviderType = 2201;
        static final int TRANSACTION_getMe = 1602;
        static final int TRANSACTION_getSyncStatus = 2101;
        static final int TRANSACTION_identityGetByIds = 501;
        static final int TRANSACTION_identityList = 601;
        static final int TRANSACTION_internalCall = 304;
        static final int TRANSACTION_loadAddToCircleConsent = 101;
        static final int TRANSACTION_loadAutocompleteList = 507;
        static final int TRANSACTION_loadAvatar = 502;
        static final int TRANSACTION_loadAvatarByReference = 508;
        static final int TRANSACTION_loadAvatarLegacy = 5;
        static final int TRANSACTION_loadCircles = 19;
        static final int TRANSACTION_loadContactsGaiaIds = 403;
        static final int TRANSACTION_loadContactsGaiaIds24 = 25;
        static final int TRANSACTION_loadLog = 302;
        static final int TRANSACTION_loadOwnerAvatar = 505;
        static final int TRANSACTION_loadOwnerAvatarLegacy = 29;
        static final int TRANSACTION_loadOwnerCoverPhoto = 506;
        static final int TRANSACTION_loadOwnerCoverPhotoLegacy = 301;
        static final int TRANSACTION_loadOwners = 305;
        static final int TRANSACTION_loadPeople = 404;
        static final int TRANSACTION_loadPeople400 = 401;
        static final int TRANSACTION_loadPeopleForAggregation = 402;
        static final int TRANSACTION_loadPeopleForAggregation200 = 201;
        static final int TRANSACTION_loadPeopleForAggregation201 = 202;
        static final int TRANSACTION_loadPeopleForAggregation202 = 203;
        static final int TRANSACTION_loadPeopleLive = 22;
        static final int TRANSACTION_loadPhoneNumbers = 1201;
        static final int TRANSACTION_loadRemoteImage = 504;
        static final int TRANSACTION_preliminarySync = 240501;
        static final int TRANSACTION_queryGalProvider = 2203;
        static final int TRANSACTION_registerDataChangedListener = 11;
        static final int TRANSACTION_removeCircle = 204;
        static final int TRANSACTION_requestSync = 205;
        static final int TRANSACTION_requestSyncOld = 17;
        static final int TRANSACTION_requestSyncOld19 = 20;
        static final int TRANSACTION_requestSyncOld25 = 26;
        static final int TRANSACTION_requestSyncWithStatus = 2002;
        static final int TRANSACTION_requestUploadSyncWithStatus = 2501;
        static final int TRANSACTION_restoreBackedUpDeviceContacts = 1402;
        static final int TRANSACTION_sendInteractionFeedback = 509;
        static final int TRANSACTION_setAvatar = 18;
        static final int TRANSACTION_setAvatarOld = 13;
        static final int TRANSACTION_setHasShownAddToCircleConsent = 102;
        static final int TRANSACTION_setSyncToContactsEnabled = 15;
        static final int TRANSACTION_setSyncToContactsSettings = 10;
        static final int TRANSACTION_startSync = 12;
        static final int TRANSACTION_updateCircle = 303;
        static final int TRANSACTION_updatePersonCircles = 23;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPeopleService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.people.internal.IPeopleService");
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void addCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, String str4, boolean z, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addCircle, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void addCircle26(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, String str4, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeString(str4);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void addPeopleToCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeStringList(list);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(28, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void fetchBackUpDeviceContactInfo(IPeopleCallbacks iPeopleCallbacks, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_fetchBackUpDeviceContactInfo, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getContactsConsentsStatus(IPeopleCallbacks iPeopleCallbacks, List<Account> list, int i, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getContactsConsentsStatus, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getContactsConsentsStatus2(IPeopleCallbacks iPeopleCallbacks, GetContactsConsentsStatusRequest getContactsConsentsStatusRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, getContactsConsentsStatusRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getContactsConsentsStatus2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getFirstFullSyncStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getFirstFullSyncStatus, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getGalProviderFileDescriptor(IPeopleCallbacks iPeopleCallbacks, Uri uri, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, uri);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getGalProviderFileDescriptor, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getGalProviderType(IPeopleCallbacks iPeopleCallbacks, Uri uri, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, uri);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getGalProviderType, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getMe(IPeopleCallbacks iPeopleCallbacks, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getMe, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void getSyncStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getSyncStatus, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void identityGetByIds(IPeopleCallbacks iPeopleCallbacks, AccountToken accountToken, List<String> list, ParcelableGetOptions parcelableGetOptions, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, accountToken);
                obtainAndWriteInterfaceToken.writeStringList(list);
                rve.d(obtainAndWriteInterfaceToken, parcelableGetOptions);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_identityGetByIds, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken identityList(IPeopleCallbacks iPeopleCallbacks, AccountToken accountToken, ParcelableListOptions parcelableListOptions, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, accountToken);
                rve.d(obtainAndWriteInterfaceToken, parcelableListOptions);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_identityList, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void internalCall(IPeopleCallbacks iPeopleCallbacks, Bundle bundle, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_internalCall, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadAddToCircleConsent(IPeopleCallbacks iPeopleCallbacks, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(101, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadAutocompleteList(IPeopleCallbacks iPeopleCallbacks, String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, boolean z2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeInt(i3);
                obtainAndWriteInterfaceToken.writeInt(z2 ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_loadAutocompleteList, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadAvatar(IPeopleCallbacks iPeopleCallbacks, String str, int i, int i2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_loadAvatar, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadAvatarByReference(IPeopleCallbacks iPeopleCallbacks, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, avatarReference);
                rve.d(obtainAndWriteInterfaceToken, parcelableLoadImageOptions);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_loadAvatarByReference, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadAvatarLegacy(IPeopleCallbacks iPeopleCallbacks, String str, int i, int i2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadCircles(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, String str4, boolean z, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(19, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadContactsGaiaIds(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadContactsGaiaIds, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadContactsGaiaIds24(IPeopleCallbacks iPeopleCallbacks, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(25, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadLog(IPeopleCallbacks iPeopleCallbacks, Bundle bundle, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadLog, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadOwnerAvatar(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, int i2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_loadOwnerAvatar, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadOwnerAvatarLegacy(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, int i2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(29, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadOwnerCoverPhoto(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_loadOwnerCoverPhoto, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadOwnerCoverPhotoLegacy(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadOwnerCoverPhotoLegacy, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadOwners(IPeopleCallbacks iPeopleCallbacks, boolean z, boolean z2, String str, String str2, int i, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeInt(z2 ? 1 : 0);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadOwners, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeople(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3, int i4, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeStringList(list);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeLong(j);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeInt(i3);
                obtainAndWriteInterfaceToken.writeInt(i4);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadPeople, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeople400(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeStringList(list);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeLong(j);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeInt(i3);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadPeople400, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeopleForAggregation(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, int i4, int i5, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeInt(i3);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeInt(z2 ? 1 : 0);
                obtainAndWriteInterfaceToken.writeInt(i4);
                obtainAndWriteInterfaceToken.writeInt(i5);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_loadPeopleForAggregation, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeopleForAggregation200(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, boolean z, int i, int i2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(201, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeopleForAggregation201(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeInt(i3);
                obtainAndWriteInterfaceToken.writeString(str4);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(202, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeopleForAggregation202(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeInt(i3);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeInt(z2 ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(203, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void loadPeopleLive(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, String str4, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeString(str4);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(22, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadPhoneNumbers(IPeopleCallbacks iPeopleCallbacks, String str, String str2, Bundle bundle, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_loadPhoneNumbers, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken loadRemoteImage(IPeopleCallbacks iPeopleCallbacks, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_loadRemoteImage, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void preliminarySync(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_preliminarySync, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void queryGalProvider(IPeopleCallbacks iPeopleCallbacks, Uri uri, String[] strArr, String str, String[] strArr2, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, uri);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeStringArray(strArr2);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_queryGalProvider, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public Bundle registerDataChangedListener(IPeopleCallbacks iPeopleCallbacks, boolean z, String str, String str2, int i, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) rve.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void removeCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeCircle, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public Bundle requestSync(String str, String str2, long j, boolean z, boolean z2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeLong(j);
                int i = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeInt(z2 ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_requestSync, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) rve.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public Bundle requestSyncOld(String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) rve.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public Bundle requestSyncOld19(String str, String str2, long j, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeLong(j);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) rve.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public Bundle requestSyncOld25(String str, String str2, long j, boolean z, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeLong(j);
                int i = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(26, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) rve.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void requestSyncWithStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestSyncWithStatus, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void requestUploadSyncWithStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestUploadSyncWithStatus, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void restoreBackedUpDeviceContacts(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String[] strArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_restoreBackedUpDeviceContacts, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public ICancelToken sendInteractionFeedback(IPeopleCallbacks iPeopleCallbacks, String str, int i, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_sendInteractionFeedback, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void setAvatar(IPeopleCallbacks iPeopleCallbacks, String str, String str2, Uri uri, boolean z, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, uri);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void setAvatarOld(IPeopleCallbacks iPeopleCallbacks, String str, String str2, Uri uri, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, uri);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void setHasShownAddToCircleConsent(IPeopleCallbacks iPeopleCallbacks, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setHasShownAddToCircleConsent, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void setSyncToContactsEnabled(boolean z, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void setSyncToContactsSettings(IPeopleCallbacks iPeopleCallbacks, String str, boolean z, String[] strArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public Bundle startSync(String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken);
                Bundle bundle = (Bundle) rve.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void updateCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, String str4, int i, String str5, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeString(str4);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeString(str5);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_updateCircle, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleService
            public void updatePersonCircles(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, List<String> list2, FavaDiagnosticsEntity favaDiagnosticsEntity, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPeopleCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                obtainAndWriteInterfaceToken.writeString(str3);
                obtainAndWriteInterfaceToken.writeStringList(list);
                obtainAndWriteInterfaceToken.writeStringList(list2);
                rve.d(obtainAndWriteInterfaceToken, favaDiagnosticsEntity);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(23, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.people.internal.IPeopleService");
        }

        public static IPeopleService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
            return queryLocalInterface instanceof IPeopleService ? (IPeopleService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 22) {
                IPeopleCallbacks asInterface = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                int readInt = parcel.readInt();
                String readString4 = parcel.readString();
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                loadPeopleLive(asInterface, readString, readString2, readString3, readInt, readString4, apiMetadata);
                parcel2.writeNoException();
                return true;
            }
            if (i == 23) {
                IPeopleCallbacks asInterface2 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                FavaDiagnosticsEntity favaDiagnosticsEntity = (FavaDiagnosticsEntity) rve.a(parcel, FavaDiagnosticsEntity.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                updatePersonCircles(asInterface2, readString5, readString6, readString7, createStringArrayList, createStringArrayList2, favaDiagnosticsEntity, apiMetadata2);
                parcel2.writeNoException();
                return true;
            }
            if (i == 101) {
                IPeopleCallbacks asInterface3 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                loadAddToCircleConsent(asInterface3, readString8, readString9, apiMetadata3);
                parcel2.writeNoException();
                return true;
            }
            if (i == TRANSACTION_setHasShownAddToCircleConsent) {
                IPeopleCallbacks asInterface4 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                setHasShownAddToCircleConsent(asInterface4, readString10, readString11, apiMetadata4);
                parcel2.writeNoException();
                return true;
            }
            if (i == TRANSACTION_identityGetByIds) {
                IPeopleCallbacks asInterface5 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                AccountToken accountToken = (AccountToken) rve.a(parcel, AccountToken.CREATOR);
                ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
                ParcelableGetOptions parcelableGetOptions = (ParcelableGetOptions) rve.a(parcel, ParcelableGetOptions.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                identityGetByIds(asInterface5, accountToken, createStringArrayList3, parcelableGetOptions, apiMetadata5);
                parcel2.writeNoException();
                return true;
            }
            if (i == TRANSACTION_loadAvatar) {
                IPeopleCallbacks asInterface6 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString12 = parcel.readString();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                ApiMetadata apiMetadata6 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                ICancelToken loadAvatar = loadAvatar(asInterface6, readString12, readInt2, readInt3, apiMetadata6);
                parcel2.writeNoException();
                rve.f(parcel2, loadAvatar);
                return true;
            }
            switch (i) {
                case 5:
                    IPeopleCallbacks asInterface7 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString13 = parcel.readString();
                    int readInt4 = parcel.readInt();
                    int readInt5 = parcel.readInt();
                    ApiMetadata apiMetadata7 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    loadAvatarLegacy(asInterface7, readString13, readInt4, readInt5, apiMetadata7);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    boolean g = rve.g(parcel);
                    ApiMetadata apiMetadata8 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    setSyncToContactsEnabled(g, apiMetadata8);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_loadRemoteImage /* 504 */:
                    IPeopleCallbacks asInterface8 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString14 = parcel.readString();
                    ApiMetadata apiMetadata9 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    ICancelToken loadRemoteImage = loadRemoteImage(asInterface8, readString14, apiMetadata9);
                    parcel2.writeNoException();
                    rve.f(parcel2, loadRemoteImage);
                    return true;
                case TRANSACTION_loadOwnerAvatar /* 505 */:
                    IPeopleCallbacks asInterface9 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString15 = parcel.readString();
                    String readString16 = parcel.readString();
                    int readInt6 = parcel.readInt();
                    int readInt7 = parcel.readInt();
                    ApiMetadata apiMetadata10 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    ICancelToken loadOwnerAvatar = loadOwnerAvatar(asInterface9, readString15, readString16, readInt6, readInt7, apiMetadata10);
                    parcel2.writeNoException();
                    rve.f(parcel2, loadOwnerAvatar);
                    return true;
                case TRANSACTION_loadOwnerCoverPhoto /* 506 */:
                    IPeopleCallbacks asInterface10 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString17 = parcel.readString();
                    String readString18 = parcel.readString();
                    int readInt8 = parcel.readInt();
                    ApiMetadata apiMetadata11 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    ICancelToken loadOwnerCoverPhoto = loadOwnerCoverPhoto(asInterface10, readString17, readString18, readInt8, apiMetadata11);
                    parcel2.writeNoException();
                    rve.f(parcel2, loadOwnerCoverPhoto);
                    return true;
                case TRANSACTION_loadAutocompleteList /* 507 */:
                    IPeopleCallbacks asInterface11 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString19 = parcel.readString();
                    String readString20 = parcel.readString();
                    boolean g2 = rve.g(parcel);
                    String readString21 = parcel.readString();
                    String readString22 = parcel.readString();
                    int readInt9 = parcel.readInt();
                    int readInt10 = parcel.readInt();
                    int readInt11 = parcel.readInt();
                    boolean g3 = rve.g(parcel);
                    ApiMetadata apiMetadata12 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    ICancelToken loadAutocompleteList = loadAutocompleteList(asInterface11, readString19, readString20, g2, readString21, readString22, readInt9, readInt10, readInt11, g3, apiMetadata12);
                    parcel2.writeNoException();
                    rve.f(parcel2, loadAutocompleteList);
                    return true;
                case TRANSACTION_loadAvatarByReference /* 508 */:
                    IPeopleCallbacks asInterface12 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AvatarReference avatarReference = (AvatarReference) rve.a(parcel, AvatarReference.CREATOR);
                    ParcelableLoadImageOptions parcelableLoadImageOptions = (ParcelableLoadImageOptions) rve.a(parcel, ParcelableLoadImageOptions.CREATOR);
                    ApiMetadata apiMetadata13 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    ICancelToken loadAvatarByReference = loadAvatarByReference(asInterface12, avatarReference, parcelableLoadImageOptions, apiMetadata13);
                    parcel2.writeNoException();
                    rve.f(parcel2, loadAvatarByReference);
                    return true;
                case TRANSACTION_sendInteractionFeedback /* 509 */:
                    IPeopleCallbacks asInterface13 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString23 = parcel.readString();
                    int readInt12 = parcel.readInt();
                    ApiMetadata apiMetadata14 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    ICancelToken sendInteractionFeedback = sendInteractionFeedback(asInterface13, readString23, readInt12, apiMetadata14);
                    parcel2.writeNoException();
                    rve.f(parcel2, sendInteractionFeedback);
                    return true;
                case TRANSACTION_identityList /* 601 */:
                    IPeopleCallbacks asInterface14 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AccountToken accountToken2 = (AccountToken) rve.a(parcel, AccountToken.CREATOR);
                    ParcelableListOptions parcelableListOptions = (ParcelableListOptions) rve.a(parcel, ParcelableListOptions.CREATOR);
                    ApiMetadata apiMetadata15 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    ICancelToken identityList = identityList(asInterface14, accountToken2, parcelableListOptions, apiMetadata15);
                    parcel2.writeNoException();
                    rve.f(parcel2, identityList);
                    return true;
                case TRANSACTION_addCircle /* 701 */:
                    IPeopleCallbacks asInterface15 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString24 = parcel.readString();
                    String readString25 = parcel.readString();
                    String readString26 = parcel.readString();
                    String readString27 = parcel.readString();
                    boolean g4 = rve.g(parcel);
                    ApiMetadata apiMetadata16 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    addCircle(asInterface15, readString24, readString25, readString26, readString27, g4, apiMetadata16);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_loadPhoneNumbers /* 1201 */:
                    IPeopleCallbacks asInterface16 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString28 = parcel.readString();
                    String readString29 = parcel.readString();
                    Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    ApiMetadata apiMetadata17 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    ICancelToken loadPhoneNumbers = loadPhoneNumbers(asInterface16, readString28, readString29, bundle, apiMetadata17);
                    parcel2.writeNoException();
                    rve.f(parcel2, loadPhoneNumbers);
                    return true;
                case TRANSACTION_fetchBackUpDeviceContactInfo /* 1401 */:
                    IPeopleCallbacks asInterface17 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString30 = parcel.readString();
                    String readString31 = parcel.readString();
                    ApiMetadata apiMetadata18 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fetchBackUpDeviceContactInfo(asInterface17, readString30, readString31, apiMetadata18);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_restoreBackedUpDeviceContacts /* 1402 */:
                    IPeopleCallbacks asInterface18 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString32 = parcel.readString();
                    String readString33 = parcel.readString();
                    String[] createStringArray = parcel.createStringArray();
                    ApiMetadata apiMetadata19 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    restoreBackedUpDeviceContacts(asInterface18, readString32, readString33, createStringArray, apiMetadata19);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getMe /* 1602 */:
                    IPeopleCallbacks asInterface19 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString34 = parcel.readString();
                    ApiMetadata apiMetadata20 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getMe(asInterface19, readString34, apiMetadata20);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_requestSyncWithStatus /* 2002 */:
                    IPeopleCallbacks asInterface20 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account = (Account) rve.a(parcel, Account.CREATOR);
                    String readString35 = parcel.readString();
                    ApiMetadata apiMetadata21 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    requestSyncWithStatus(asInterface20, account, readString35, apiMetadata21);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getSyncStatus /* 2101 */:
                    IPeopleCallbacks asInterface21 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account2 = (Account) rve.a(parcel, Account.CREATOR);
                    String readString36 = parcel.readString();
                    ApiMetadata apiMetadata22 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getSyncStatus(asInterface21, account2, readString36, apiMetadata22);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getGalProviderType /* 2201 */:
                    IPeopleCallbacks asInterface22 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri = (Uri) rve.a(parcel, Uri.CREATOR);
                    ApiMetadata apiMetadata23 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getGalProviderType(asInterface22, uri, apiMetadata23);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getGalProviderFileDescriptor /* 2202 */:
                    IPeopleCallbacks asInterface23 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri2 = (Uri) rve.a(parcel, Uri.CREATOR);
                    String readString37 = parcel.readString();
                    ApiMetadata apiMetadata24 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getGalProviderFileDescriptor(asInterface23, uri2, readString37, apiMetadata24);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_queryGalProvider /* 2203 */:
                    IPeopleCallbacks asInterface24 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri3 = (Uri) rve.a(parcel, Uri.CREATOR);
                    String[] createStringArray2 = parcel.createStringArray();
                    String readString38 = parcel.readString();
                    String[] createStringArray3 = parcel.createStringArray();
                    String readString39 = parcel.readString();
                    ApiMetadata apiMetadata25 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    queryGalProvider(asInterface24, uri3, createStringArray2, readString38, createStringArray3, readString39, apiMetadata25);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_requestUploadSyncWithStatus /* 2501 */:
                    IPeopleCallbacks asInterface25 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account3 = (Account) rve.a(parcel, Account.CREATOR);
                    String readString40 = parcel.readString();
                    ApiMetadata apiMetadata26 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    requestUploadSyncWithStatus(asInterface25, account3, readString40, apiMetadata26);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getFirstFullSyncStatus /* 4201 */:
                    IPeopleCallbacks asInterface26 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account4 = (Account) rve.a(parcel, Account.CREATOR);
                    String readString41 = parcel.readString();
                    ApiMetadata apiMetadata27 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getFirstFullSyncStatus(asInterface26, account4, readString41, apiMetadata27);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getContactsConsentsStatus /* 213301 */:
                    IPeopleCallbacks asInterface27 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList createTypedArrayList = parcel.createTypedArrayList(Account.CREATOR);
                    int readInt13 = parcel.readInt();
                    ApiMetadata apiMetadata28 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getContactsConsentsStatus(asInterface27, createTypedArrayList, readInt13, apiMetadata28);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getContactsConsentsStatus2 /* 213901 */:
                    IPeopleCallbacks asInterface28 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    GetContactsConsentsStatusRequest getContactsConsentsStatusRequest = (GetContactsConsentsStatusRequest) rve.a(parcel, GetContactsConsentsStatusRequest.CREATOR);
                    ApiMetadata apiMetadata29 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getContactsConsentsStatus2(asInterface28, getContactsConsentsStatusRequest, apiMetadata29);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_preliminarySync /* 240501 */:
                    IPeopleCallbacks asInterface29 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Account account5 = (Account) rve.a(parcel, Account.CREATOR);
                    String readString42 = parcel.readString();
                    ApiMetadata apiMetadata30 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    preliminarySync(asInterface29, account5, readString42, apiMetadata30);
                    parcel2.writeNoException();
                    return true;
                default:
                    switch (i) {
                        case 10:
                            IPeopleCallbacks asInterface30 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                            String readString43 = parcel.readString();
                            boolean g5 = rve.g(parcel);
                            String[] createStringArray4 = parcel.createStringArray();
                            ApiMetadata apiMetadata31 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                            enforceNoDataAvail(parcel);
                            setSyncToContactsSettings(asInterface30, readString43, g5, createStringArray4, apiMetadata31);
                            parcel2.writeNoException();
                            return true;
                        case 11:
                            IPeopleCallbacks asInterface31 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                            boolean g6 = rve.g(parcel);
                            String readString44 = parcel.readString();
                            String readString45 = parcel.readString();
                            int readInt14 = parcel.readInt();
                            ApiMetadata apiMetadata32 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                            enforceNoDataAvail(parcel);
                            Bundle registerDataChangedListener = registerDataChangedListener(asInterface31, g6, readString44, readString45, readInt14, apiMetadata32);
                            parcel2.writeNoException();
                            rve.e(parcel2, registerDataChangedListener);
                            return true;
                        case 12:
                            String readString46 = parcel.readString();
                            String readString47 = parcel.readString();
                            ApiMetadata apiMetadata33 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                            enforceNoDataAvail(parcel);
                            Bundle startSync = startSync(readString46, readString47, apiMetadata33);
                            parcel2.writeNoException();
                            rve.e(parcel2, startSync);
                            return true;
                        case 13:
                            IPeopleCallbacks asInterface32 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                            String readString48 = parcel.readString();
                            String readString49 = parcel.readString();
                            Uri uri4 = (Uri) rve.a(parcel, Uri.CREATOR);
                            ApiMetadata apiMetadata34 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                            enforceNoDataAvail(parcel);
                            setAvatarOld(asInterface32, readString48, readString49, uri4, apiMetadata34);
                            parcel2.writeNoException();
                            return true;
                        default:
                            switch (i) {
                                case 17:
                                    String readString50 = parcel.readString();
                                    String readString51 = parcel.readString();
                                    ApiMetadata apiMetadata35 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                    enforceNoDataAvail(parcel);
                                    Bundle requestSyncOld = requestSyncOld(readString50, readString51, apiMetadata35);
                                    parcel2.writeNoException();
                                    rve.e(parcel2, requestSyncOld);
                                    return true;
                                case 18:
                                    IPeopleCallbacks asInterface33 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                    String readString52 = parcel.readString();
                                    String readString53 = parcel.readString();
                                    Uri uri5 = (Uri) rve.a(parcel, Uri.CREATOR);
                                    boolean g7 = rve.g(parcel);
                                    ApiMetadata apiMetadata36 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                    enforceNoDataAvail(parcel);
                                    setAvatar(asInterface33, readString52, readString53, uri5, g7, apiMetadata36);
                                    parcel2.writeNoException();
                                    return true;
                                case 19:
                                    IPeopleCallbacks asInterface34 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                    String readString54 = parcel.readString();
                                    String readString55 = parcel.readString();
                                    String readString56 = parcel.readString();
                                    int readInt15 = parcel.readInt();
                                    String readString57 = parcel.readString();
                                    boolean g8 = rve.g(parcel);
                                    ApiMetadata apiMetadata37 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                    enforceNoDataAvail(parcel);
                                    loadCircles(asInterface34, readString54, readString55, readString56, readInt15, readString57, g8, apiMetadata37);
                                    parcel2.writeNoException();
                                    return true;
                                case 20:
                                    String readString58 = parcel.readString();
                                    String readString59 = parcel.readString();
                                    long readLong = parcel.readLong();
                                    ApiMetadata apiMetadata38 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                    enforceNoDataAvail(parcel);
                                    Bundle requestSyncOld19 = requestSyncOld19(readString58, readString59, readLong, apiMetadata38);
                                    parcel2.writeNoException();
                                    rve.e(parcel2, requestSyncOld19);
                                    return true;
                                default:
                                    switch (i) {
                                        case 25:
                                            IPeopleCallbacks asInterface35 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String readString60 = parcel.readString();
                                            String readString61 = parcel.readString();
                                            ApiMetadata apiMetadata39 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                            enforceNoDataAvail(parcel);
                                            loadContactsGaiaIds24(asInterface35, readString60, readString61, apiMetadata39);
                                            parcel2.writeNoException();
                                            return true;
                                        case 26:
                                            String readString62 = parcel.readString();
                                            String readString63 = parcel.readString();
                                            long readLong2 = parcel.readLong();
                                            boolean g9 = rve.g(parcel);
                                            ApiMetadata apiMetadata40 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                            enforceNoDataAvail(parcel);
                                            Bundle requestSyncOld25 = requestSyncOld25(readString62, readString63, readLong2, g9, apiMetadata40);
                                            parcel2.writeNoException();
                                            rve.e(parcel2, requestSyncOld25);
                                            return true;
                                        case 27:
                                            IPeopleCallbacks asInterface36 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String readString64 = parcel.readString();
                                            String readString65 = parcel.readString();
                                            String readString66 = parcel.readString();
                                            String readString67 = parcel.readString();
                                            ApiMetadata apiMetadata41 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                            enforceNoDataAvail(parcel);
                                            addCircle26(asInterface36, readString64, readString65, readString66, readString67, apiMetadata41);
                                            parcel2.writeNoException();
                                            return true;
                                        case 28:
                                            IPeopleCallbacks asInterface37 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String readString68 = parcel.readString();
                                            String readString69 = parcel.readString();
                                            String readString70 = parcel.readString();
                                            ArrayList<String> createStringArrayList4 = parcel.createStringArrayList();
                                            ApiMetadata apiMetadata42 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                            enforceNoDataAvail(parcel);
                                            addPeopleToCircle(asInterface37, readString68, readString69, readString70, createStringArrayList4, apiMetadata42);
                                            parcel2.writeNoException();
                                            return true;
                                        case 29:
                                            IPeopleCallbacks asInterface38 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            String readString71 = parcel.readString();
                                            String readString72 = parcel.readString();
                                            int readInt16 = parcel.readInt();
                                            int readInt17 = parcel.readInt();
                                            ApiMetadata apiMetadata43 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                            enforceNoDataAvail(parcel);
                                            loadOwnerAvatarLegacy(asInterface38, readString71, readString72, readInt16, readInt17, apiMetadata43);
                                            parcel2.writeNoException();
                                            return true;
                                        default:
                                            switch (i) {
                                                case 201:
                                                    IPeopleCallbacks asInterface39 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                    String readString73 = parcel.readString();
                                                    String readString74 = parcel.readString();
                                                    String readString75 = parcel.readString();
                                                    boolean g10 = rve.g(parcel);
                                                    int readInt18 = parcel.readInt();
                                                    int readInt19 = parcel.readInt();
                                                    ApiMetadata apiMetadata44 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                                    enforceNoDataAvail(parcel);
                                                    loadPeopleForAggregation200(asInterface39, readString73, readString74, readString75, g10, readInt18, readInt19, apiMetadata44);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 202:
                                                    IPeopleCallbacks asInterface40 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                    String readString76 = parcel.readString();
                                                    String readString77 = parcel.readString();
                                                    String readString78 = parcel.readString();
                                                    int readInt20 = parcel.readInt();
                                                    boolean g11 = rve.g(parcel);
                                                    int readInt21 = parcel.readInt();
                                                    int readInt22 = parcel.readInt();
                                                    String readString79 = parcel.readString();
                                                    ApiMetadata apiMetadata45 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                                    enforceNoDataAvail(parcel);
                                                    loadPeopleForAggregation201(asInterface40, readString76, readString77, readString78, readInt20, g11, readInt21, readInt22, readString79, apiMetadata45);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 203:
                                                    IPeopleCallbacks asInterface41 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                    String readString80 = parcel.readString();
                                                    String readString81 = parcel.readString();
                                                    String readString82 = parcel.readString();
                                                    int readInt23 = parcel.readInt();
                                                    boolean g12 = rve.g(parcel);
                                                    int readInt24 = parcel.readInt();
                                                    int readInt25 = parcel.readInt();
                                                    String readString83 = parcel.readString();
                                                    boolean g13 = rve.g(parcel);
                                                    ApiMetadata apiMetadata46 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                                    enforceNoDataAvail(parcel);
                                                    loadPeopleForAggregation202(asInterface41, readString80, readString81, readString82, readInt23, g12, readInt24, readInt25, readString83, g13, apiMetadata46);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case TRANSACTION_removeCircle /* 204 */:
                                                    IPeopleCallbacks asInterface42 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                    String readString84 = parcel.readString();
                                                    String readString85 = parcel.readString();
                                                    String readString86 = parcel.readString();
                                                    ApiMetadata apiMetadata47 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                                    enforceNoDataAvail(parcel);
                                                    removeCircle(asInterface42, readString84, readString85, readString86, apiMetadata47);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case TRANSACTION_requestSync /* 205 */:
                                                    String readString87 = parcel.readString();
                                                    String readString88 = parcel.readString();
                                                    long readLong3 = parcel.readLong();
                                                    boolean g14 = rve.g(parcel);
                                                    boolean g15 = rve.g(parcel);
                                                    ApiMetadata apiMetadata48 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                                    enforceNoDataAvail(parcel);
                                                    Bundle requestSync = requestSync(readString87, readString88, readLong3, g14, g15, apiMetadata48);
                                                    parcel2.writeNoException();
                                                    rve.e(parcel2, requestSync);
                                                    return true;
                                                default:
                                                    switch (i) {
                                                        case TRANSACTION_loadOwnerCoverPhotoLegacy /* 301 */:
                                                            IPeopleCallbacks asInterface43 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                            String readString89 = parcel.readString();
                                                            String readString90 = parcel.readString();
                                                            int readInt26 = parcel.readInt();
                                                            ApiMetadata apiMetadata49 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                                            enforceNoDataAvail(parcel);
                                                            loadOwnerCoverPhotoLegacy(asInterface43, readString89, readString90, readInt26, apiMetadata49);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case TRANSACTION_loadLog /* 302 */:
                                                            IPeopleCallbacks asInterface44 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                            Bundle bundle2 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                                                            ApiMetadata apiMetadata50 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                                            enforceNoDataAvail(parcel);
                                                            loadLog(asInterface44, bundle2, apiMetadata50);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case TRANSACTION_updateCircle /* 303 */:
                                                            IPeopleCallbacks asInterface45 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                            String readString91 = parcel.readString();
                                                            String readString92 = parcel.readString();
                                                            String readString93 = parcel.readString();
                                                            String readString94 = parcel.readString();
                                                            int readInt27 = parcel.readInt();
                                                            String readString95 = parcel.readString();
                                                            ApiMetadata apiMetadata51 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                                            enforceNoDataAvail(parcel);
                                                            updateCircle(asInterface45, readString91, readString92, readString93, readString94, readInt27, readString95, apiMetadata51);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case TRANSACTION_internalCall /* 304 */:
                                                            IPeopleCallbacks asInterface46 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                            Bundle bundle3 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                                                            ApiMetadata apiMetadata52 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                                            enforceNoDataAvail(parcel);
                                                            internalCall(asInterface46, bundle3, apiMetadata52);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case TRANSACTION_loadOwners /* 305 */:
                                                            IPeopleCallbacks asInterface47 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                            boolean g16 = rve.g(parcel);
                                                            boolean g17 = rve.g(parcel);
                                                            String readString96 = parcel.readString();
                                                            String readString97 = parcel.readString();
                                                            int readInt28 = parcel.readInt();
                                                            ApiMetadata apiMetadata53 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                                            enforceNoDataAvail(parcel);
                                                            loadOwners(asInterface47, g16, g17, readString96, readString97, readInt28, apiMetadata53);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        default:
                                                            switch (i) {
                                                                case TRANSACTION_loadPeople400 /* 401 */:
                                                                    IPeopleCallbacks asInterface48 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                    String readString98 = parcel.readString();
                                                                    String readString99 = parcel.readString();
                                                                    String readString100 = parcel.readString();
                                                                    ArrayList<String> createStringArrayList5 = parcel.createStringArrayList();
                                                                    int readInt29 = parcel.readInt();
                                                                    boolean g18 = rve.g(parcel);
                                                                    long readLong4 = parcel.readLong();
                                                                    String readString101 = parcel.readString();
                                                                    int readInt30 = parcel.readInt();
                                                                    int readInt31 = parcel.readInt();
                                                                    ApiMetadata apiMetadata54 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                                                    enforceNoDataAvail(parcel);
                                                                    loadPeople400(asInterface48, readString98, readString99, readString100, createStringArrayList5, readInt29, g18, readLong4, readString101, readInt30, readInt31, apiMetadata54);
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                case TRANSACTION_loadPeopleForAggregation /* 402 */:
                                                                    IPeopleCallbacks asInterface49 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                    String readString102 = parcel.readString();
                                                                    String readString103 = parcel.readString();
                                                                    String readString104 = parcel.readString();
                                                                    int readInt32 = parcel.readInt();
                                                                    boolean g19 = rve.g(parcel);
                                                                    int readInt33 = parcel.readInt();
                                                                    int readInt34 = parcel.readInt();
                                                                    String readString105 = parcel.readString();
                                                                    boolean g20 = rve.g(parcel);
                                                                    int readInt35 = parcel.readInt();
                                                                    int readInt36 = parcel.readInt();
                                                                    ApiMetadata apiMetadata55 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                                                    enforceNoDataAvail(parcel);
                                                                    loadPeopleForAggregation(asInterface49, readString102, readString103, readString104, readInt32, g19, readInt33, readInt34, readString105, g20, readInt35, readInt36, apiMetadata55);
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                case TRANSACTION_loadContactsGaiaIds /* 403 */:
                                                                    IPeopleCallbacks asInterface50 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                    String readString106 = parcel.readString();
                                                                    String readString107 = parcel.readString();
                                                                    int readInt37 = parcel.readInt();
                                                                    ApiMetadata apiMetadata56 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                                                    enforceNoDataAvail(parcel);
                                                                    loadContactsGaiaIds(asInterface50, readString106, readString107, readInt37, apiMetadata56);
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                case TRANSACTION_loadPeople /* 404 */:
                                                                    IPeopleCallbacks asInterface51 = IPeopleCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                    String readString108 = parcel.readString();
                                                                    String readString109 = parcel.readString();
                                                                    String readString110 = parcel.readString();
                                                                    ArrayList<String> createStringArrayList6 = parcel.createStringArrayList();
                                                                    int readInt38 = parcel.readInt();
                                                                    boolean g21 = rve.g(parcel);
                                                                    long readLong5 = parcel.readLong();
                                                                    String readString111 = parcel.readString();
                                                                    int readInt39 = parcel.readInt();
                                                                    int readInt40 = parcel.readInt();
                                                                    int readInt41 = parcel.readInt();
                                                                    ApiMetadata apiMetadata57 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                                                                    enforceNoDataAvail(parcel);
                                                                    loadPeople(asInterface51, readString108, readString109, readString110, createStringArrayList6, readInt38, g21, readLong5, readString111, readInt39, readInt40, readInt41, apiMetadata57);
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                default:
                                                                    return false;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
    }

    void addCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, String str4, boolean z, ApiMetadata apiMetadata);

    void addCircle26(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, String str4, ApiMetadata apiMetadata);

    void addPeopleToCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, ApiMetadata apiMetadata);

    void fetchBackUpDeviceContactInfo(IPeopleCallbacks iPeopleCallbacks, String str, String str2, ApiMetadata apiMetadata);

    void getContactsConsentsStatus(IPeopleCallbacks iPeopleCallbacks, List<Account> list, int i, ApiMetadata apiMetadata);

    void getContactsConsentsStatus2(IPeopleCallbacks iPeopleCallbacks, GetContactsConsentsStatusRequest getContactsConsentsStatusRequest, ApiMetadata apiMetadata);

    void getFirstFullSyncStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata);

    void getGalProviderFileDescriptor(IPeopleCallbacks iPeopleCallbacks, Uri uri, String str, ApiMetadata apiMetadata);

    void getGalProviderType(IPeopleCallbacks iPeopleCallbacks, Uri uri, ApiMetadata apiMetadata);

    void getMe(IPeopleCallbacks iPeopleCallbacks, String str, ApiMetadata apiMetadata);

    void getSyncStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata);

    void identityGetByIds(IPeopleCallbacks iPeopleCallbacks, AccountToken accountToken, List<String> list, ParcelableGetOptions parcelableGetOptions, ApiMetadata apiMetadata);

    ICancelToken identityList(IPeopleCallbacks iPeopleCallbacks, AccountToken accountToken, ParcelableListOptions parcelableListOptions, ApiMetadata apiMetadata);

    void internalCall(IPeopleCallbacks iPeopleCallbacks, Bundle bundle, ApiMetadata apiMetadata);

    void loadAddToCircleConsent(IPeopleCallbacks iPeopleCallbacks, String str, String str2, ApiMetadata apiMetadata);

    ICancelToken loadAutocompleteList(IPeopleCallbacks iPeopleCallbacks, String str, String str2, boolean z, String str3, String str4, int i, int i2, int i3, boolean z2, ApiMetadata apiMetadata);

    ICancelToken loadAvatar(IPeopleCallbacks iPeopleCallbacks, String str, int i, int i2, ApiMetadata apiMetadata);

    ICancelToken loadAvatarByReference(IPeopleCallbacks iPeopleCallbacks, AvatarReference avatarReference, ParcelableLoadImageOptions parcelableLoadImageOptions, ApiMetadata apiMetadata);

    void loadAvatarLegacy(IPeopleCallbacks iPeopleCallbacks, String str, int i, int i2, ApiMetadata apiMetadata);

    void loadCircles(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, String str4, boolean z, ApiMetadata apiMetadata);

    void loadContactsGaiaIds(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, ApiMetadata apiMetadata);

    void loadContactsGaiaIds24(IPeopleCallbacks iPeopleCallbacks, String str, String str2, ApiMetadata apiMetadata);

    void loadLog(IPeopleCallbacks iPeopleCallbacks, Bundle bundle, ApiMetadata apiMetadata);

    ICancelToken loadOwnerAvatar(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, int i2, ApiMetadata apiMetadata);

    void loadOwnerAvatarLegacy(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, int i2, ApiMetadata apiMetadata);

    ICancelToken loadOwnerCoverPhoto(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, ApiMetadata apiMetadata);

    void loadOwnerCoverPhotoLegacy(IPeopleCallbacks iPeopleCallbacks, String str, String str2, int i, ApiMetadata apiMetadata);

    void loadOwners(IPeopleCallbacks iPeopleCallbacks, boolean z, boolean z2, String str, String str2, int i, ApiMetadata apiMetadata);

    void loadPeople(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3, int i4, ApiMetadata apiMetadata);

    void loadPeople400(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, int i, boolean z, long j, String str4, int i2, int i3, ApiMetadata apiMetadata);

    void loadPeopleForAggregation(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, int i4, int i5, ApiMetadata apiMetadata);

    void loadPeopleForAggregation200(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, boolean z, int i, int i2, ApiMetadata apiMetadata);

    void loadPeopleForAggregation201(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, ApiMetadata apiMetadata);

    void loadPeopleForAggregation202(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, boolean z, int i2, int i3, String str4, boolean z2, ApiMetadata apiMetadata);

    void loadPeopleLive(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, int i, String str4, ApiMetadata apiMetadata);

    ICancelToken loadPhoneNumbers(IPeopleCallbacks iPeopleCallbacks, String str, String str2, Bundle bundle, ApiMetadata apiMetadata);

    ICancelToken loadRemoteImage(IPeopleCallbacks iPeopleCallbacks, String str, ApiMetadata apiMetadata);

    void preliminarySync(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata);

    void queryGalProvider(IPeopleCallbacks iPeopleCallbacks, Uri uri, String[] strArr, String str, String[] strArr2, String str2, ApiMetadata apiMetadata);

    Bundle registerDataChangedListener(IPeopleCallbacks iPeopleCallbacks, boolean z, String str, String str2, int i, ApiMetadata apiMetadata);

    void removeCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, ApiMetadata apiMetadata);

    Bundle requestSync(String str, String str2, long j, boolean z, boolean z2, ApiMetadata apiMetadata);

    Bundle requestSyncOld(String str, String str2, ApiMetadata apiMetadata);

    Bundle requestSyncOld19(String str, String str2, long j, ApiMetadata apiMetadata);

    Bundle requestSyncOld25(String str, String str2, long j, boolean z, ApiMetadata apiMetadata);

    void requestSyncWithStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata);

    void requestUploadSyncWithStatus(IPeopleCallbacks iPeopleCallbacks, Account account, String str, ApiMetadata apiMetadata);

    void restoreBackedUpDeviceContacts(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String[] strArr, ApiMetadata apiMetadata);

    ICancelToken sendInteractionFeedback(IPeopleCallbacks iPeopleCallbacks, String str, int i, ApiMetadata apiMetadata);

    void setAvatar(IPeopleCallbacks iPeopleCallbacks, String str, String str2, Uri uri, boolean z, ApiMetadata apiMetadata);

    void setAvatarOld(IPeopleCallbacks iPeopleCallbacks, String str, String str2, Uri uri, ApiMetadata apiMetadata);

    void setHasShownAddToCircleConsent(IPeopleCallbacks iPeopleCallbacks, String str, String str2, ApiMetadata apiMetadata);

    void setSyncToContactsEnabled(boolean z, ApiMetadata apiMetadata);

    void setSyncToContactsSettings(IPeopleCallbacks iPeopleCallbacks, String str, boolean z, String[] strArr, ApiMetadata apiMetadata);

    Bundle startSync(String str, String str2, ApiMetadata apiMetadata);

    void updateCircle(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, String str4, int i, String str5, ApiMetadata apiMetadata);

    void updatePersonCircles(IPeopleCallbacks iPeopleCallbacks, String str, String str2, String str3, List<String> list, List<String> list2, FavaDiagnosticsEntity favaDiagnosticsEntity, ApiMetadata apiMetadata);
}
