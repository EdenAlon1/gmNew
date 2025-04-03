package com.google.android.gms.people.contactssync.internal;

import android.accounts.Account;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeRequest;
import com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks;
import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInOptions;
import com.google.android.gms.people.contactssync.model.BackupSyncUserAction;
import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionRequest;
import com.google.android.gms.people.contactssync.model.GetImportSimContactsSuggestionsRequest;
import com.google.android.gms.people.contactssync.model.ImportSimContactsRequest;
import com.google.android.gms.people.cpg.CpgDocument;
import com.google.android.gms.people.cpg.CpgDocumentRequest;
import com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier;
import com.google.android.gms.people.cpg.callingcard.CreateCallingCardRequest;
import com.google.android.gms.people.cpg.callingcard.UpdateCallingCardRequest;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IContactsSyncService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IContactsSyncService {
        static final int TRANSACTION_addAccountCategoryToBackupAndSync = 192803;
        static final int TRANSACTION_addDeviceContactsSyncSettingChangedListener = 223601;
        static final int TRANSACTION_classifyAccountTypes = 201202;
        static final int TRANSACTION_cleanupSyncedGoogleContacts = 223902;
        static final int TRANSACTION_createCallingCard = 250201;
        static final int TRANSACTION_deleteCallingCards = 250204;
        static final int TRANSACTION_fsaUpdateSyncStatus = 203902;
        static final int TRANSACTION_getBackupAndSyncOptInState = 192806;
        static final int TRANSACTION_getBackupAndSyncOptInStateOld = 192403;
        static final int TRANSACTION_getBackupAndSyncSuggestion = 192807;
        static final int TRANSACTION_getBackupSyncSuggestion = 201602;
        static final int TRANSACTION_getCallingCards = 250202;
        static final int TRANSACTION_getDeviceContactsSyncSettingAction = 223903;
        static final int TRANSACTION_getImportSimContactsProgress = 213902;
        static final int TRANSACTION_getImportSimContactsSuggestions = 213302;
        static final int TRANSACTION_importSimContacts = 212502;
        static final int TRANSACTION_migrateContacts = 202604;
        static final int TRANSACTION_optInBackupAndSync = 214201;
        static final int TRANSACTION_optInBackupAndSyncInternalOld = 192402;
        static final int TRANSACTION_optInBackupAndSyncPreY2021w42 = 192802;
        static final int TRANSACTION_optInBackupAndSyncWithoutValidation = 203302;
        static final int TRANSACTION_optOutBackupAndSync = 192805;
        static final int TRANSACTION_readCpgDocuments = 242001;
        static final int TRANSACTION_recordBackupSyncUserAction = 201603;
        static final int TRANSACTION_registerSyncStatusListener = 203901;
        static final int TRANSACTION_registerSyncStatusListenerWithChannel = 234202;
        static final int TRANSACTION_removeAccountCategoryFromBackupAndSync = 192804;
        static final int TRANSACTION_removeDeviceContactsSyncSettingChangedListener = 223602;
        static final int TRANSACTION_syncHighResPhoto = 194202;
        static final int TRANSACTION_updateCallingCard = 250203;
        static final int TRANSACTION_upsertCpgDocuments = 231501;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IContactsSyncService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.people.contactssync.internal.IContactsSyncService");
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void addAccountCategoryToBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, int[] iArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeIntArray(iArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addAccountCategoryToBackupAndSync, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void addDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addDeviceContactsSyncSettingChangedListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void classifyAccountTypes(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<ClassifyAccountTypeRequest> list, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_classifyAccountTypes, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void cleanupSyncedGoogleContacts(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_cleanupSyncedGoogleContacts, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void createCallingCard(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, CreateCallingCardRequest createCallingCardRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                rve.d(obtainAndWriteInterfaceToken, createCallingCardRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_createCallingCard, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void deleteCallingCards(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CallingCardIdentifier> list, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_deleteCallingCards, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void fsaUpdateSyncStatus(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ExtendedSyncStatus extendedSyncStatus, Account account, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                rve.d(obtainAndWriteInterfaceToken, extendedSyncStatus);
                rve.d(obtainAndWriteInterfaceToken, account);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_fsaUpdateSyncStatus, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getBackupAndSyncOptInState(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getBackupAndSyncOptInState, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getBackupAndSyncOptInStateOld(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getBackupAndSyncOptInStateOld, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getBackupAndSyncSuggestion(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getBackupAndSyncSuggestion, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getBackupSyncSuggestion(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                rve.d(obtainAndWriteInterfaceToken, getBackupSyncSuggestionRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getBackupSyncSuggestion, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getCallingCards(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CallingCardIdentifier> list, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getCallingCards, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getDeviceContactsSyncSettingAction(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getDeviceContactsSyncSettingAction, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public int getImportSimContactsProgress(ImportSimContactsRequest importSimContactsRequest, int i, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, importSimContactsRequest);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_getImportSimContactsProgress, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void getImportSimContactsSuggestions(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, GetImportSimContactsSuggestionsRequest getImportSimContactsSuggestionsRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                rve.d(obtainAndWriteInterfaceToken, getImportSimContactsSuggestionsRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getImportSimContactsSuggestions, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void importSimContacts(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ImportSimContactsRequest importSimContactsRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                rve.d(obtainAndWriteInterfaceToken, importSimContactsRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_importSimContacts, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void migrateContacts(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, AccountWithDataSet accountWithDataSet, AccountWithDataSet accountWithDataSet2, List<Long> list, int i, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                rve.d(obtainAndWriteInterfaceToken, accountWithDataSet);
                rve.d(obtainAndWriteInterfaceToken, accountWithDataSet2);
                obtainAndWriteInterfaceToken.writeList(list);
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_migrateContacts, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void optInBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, BackupAndSyncOptInOptions backupAndSyncOptInOptions, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, backupAndSyncOptInOptions);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_optInBackupAndSync, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void optInBackupAndSyncInternalOld(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, int[] iArr, String str, boolean z, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeIntArray(iArr);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_optInBackupAndSyncInternalOld, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void optInBackupAndSyncPreY2021w42(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_optInBackupAndSyncPreY2021w42, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void optInBackupAndSyncWithoutValidation(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_optInBackupAndSyncWithoutValidation, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void optOutBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_optOutBackupAndSync, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void readCpgDocuments(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CpgDocumentRequest> list, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_readCpgDocuments, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void recordBackupSyncUserAction(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, BackupSyncUserAction backupSyncUserAction, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                rve.d(obtainAndWriteInterfaceToken, backupSyncUserAction);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_recordBackupSyncUserAction, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void registerSyncStatusListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, boolean z, Account account, String str, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_registerSyncStatusListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void registerSyncStatusListenerWithChannel(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, boolean z, Account account, String str, String str2, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                rve.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_registerSyncStatusListenerWithChannel, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void removeAccountCategoryFromBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, int[] iArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeIntArray(iArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeAccountCategoryFromBackupAndSync, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void removeDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeDeviceContactsSyncSettingChangedListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void syncHighResPhoto(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, Uri uri, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                rve.d(obtainAndWriteInterfaceToken, uri);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_syncHighResPhoto, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void updateCallingCard(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, UpdateCallingCardRequest updateCallingCardRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                rve.d(obtainAndWriteInterfaceToken, updateCallingCardRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_updateCallingCard, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncService
            public void upsertCpgDocuments(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CpgDocument> list, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_upsertCpgDocuments, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.people.contactssync.internal.IContactsSyncService");
        }

        public static IContactsSyncService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncService");
            return queryLocalInterface instanceof IContactsSyncService ? (IContactsSyncService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case TRANSACTION_optInBackupAndSyncInternalOld /* 192402 */:
                    IContactsSyncServiceCallbacks asInterface = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int[] createIntArray = parcel.createIntArray();
                    String readString = parcel.readString();
                    boolean g = rve.g(parcel);
                    ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    optInBackupAndSyncInternalOld(asInterface, createIntArray, readString, g, apiMetadata);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getBackupAndSyncOptInStateOld /* 192403 */:
                    IContactsSyncServiceCallbacks asInterface2 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getBackupAndSyncOptInStateOld(asInterface2, readString2, apiMetadata2);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_optInBackupAndSyncPreY2021w42 /* 192802 */:
                    IContactsSyncServiceCallbacks asInterface3 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString3 = parcel.readString();
                    ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    optInBackupAndSyncPreY2021w42(asInterface3, readString3, apiMetadata3);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_addAccountCategoryToBackupAndSync /* 192803 */:
                    IContactsSyncServiceCallbacks asInterface4 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int[] createIntArray2 = parcel.createIntArray();
                    ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    addAccountCategoryToBackupAndSync(asInterface4, createIntArray2, apiMetadata4);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_removeAccountCategoryFromBackupAndSync /* 192804 */:
                    IContactsSyncServiceCallbacks asInterface5 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    int[] createIntArray3 = parcel.createIntArray();
                    ApiMetadata apiMetadata5 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    removeAccountCategoryFromBackupAndSync(asInterface5, createIntArray3, apiMetadata5);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_optOutBackupAndSync /* 192805 */:
                    IContactsSyncServiceCallbacks asInterface6 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata6 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    optOutBackupAndSync(asInterface6, apiMetadata6);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getBackupAndSyncOptInState /* 192806 */:
                    IContactsSyncServiceCallbacks asInterface7 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata7 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getBackupAndSyncOptInState(asInterface7, apiMetadata7);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getBackupAndSyncSuggestion /* 192807 */:
                    IContactsSyncServiceCallbacks asInterface8 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata8 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getBackupAndSyncSuggestion(asInterface8, apiMetadata8);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_syncHighResPhoto /* 194202 */:
                    IContactsSyncServiceCallbacks asInterface9 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    Uri uri = (Uri) rve.a(parcel, Uri.CREATOR);
                    ApiMetadata apiMetadata9 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    syncHighResPhoto(asInterface9, uri, apiMetadata9);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_classifyAccountTypes /* 201202 */:
                    IContactsSyncServiceCallbacks asInterface10 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList createTypedArrayList = parcel.createTypedArrayList(ClassifyAccountTypeRequest.CREATOR);
                    String readString4 = parcel.readString();
                    ApiMetadata apiMetadata10 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    classifyAccountTypes(asInterface10, createTypedArrayList, readString4, apiMetadata10);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getBackupSyncSuggestion /* 201602 */:
                    IContactsSyncServiceCallbacks asInterface11 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest = (GetBackupSyncSuggestionRequest) rve.a(parcel, GetBackupSyncSuggestionRequest.CREATOR);
                    ApiMetadata apiMetadata11 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getBackupSyncSuggestion(asInterface11, getBackupSyncSuggestionRequest, apiMetadata11);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_recordBackupSyncUserAction /* 201603 */:
                    IContactsSyncServiceCallbacks asInterface12 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    BackupSyncUserAction backupSyncUserAction = (BackupSyncUserAction) rve.a(parcel, BackupSyncUserAction.CREATOR);
                    ApiMetadata apiMetadata12 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    recordBackupSyncUserAction(asInterface12, backupSyncUserAction, apiMetadata12);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_migrateContacts /* 202604 */:
                    IContactsSyncServiceCallbacks asInterface13 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    AccountWithDataSet accountWithDataSet = (AccountWithDataSet) rve.a(parcel, AccountWithDataSet.CREATOR);
                    AccountWithDataSet accountWithDataSet2 = (AccountWithDataSet) rve.a(parcel, AccountWithDataSet.CREATOR);
                    ArrayList b = rve.b(parcel);
                    int readInt = parcel.readInt();
                    ApiMetadata apiMetadata13 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    migrateContacts(asInterface13, accountWithDataSet, accountWithDataSet2, b, readInt, apiMetadata13);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_optInBackupAndSyncWithoutValidation /* 203302 */:
                    IContactsSyncServiceCallbacks asInterface14 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString5 = parcel.readString();
                    ApiMetadata apiMetadata14 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    optInBackupAndSyncWithoutValidation(asInterface14, readString5, apiMetadata14);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_registerSyncStatusListener /* 203901 */:
                    IContactsSyncServiceCallbacks asInterface15 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    boolean g2 = rve.g(parcel);
                    Account account = (Account) rve.a(parcel, Account.CREATOR);
                    String readString6 = parcel.readString();
                    ApiMetadata apiMetadata15 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerSyncStatusListener(asInterface15, g2, account, readString6, apiMetadata15);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_fsaUpdateSyncStatus /* 203902 */:
                    IContactsSyncServiceCallbacks asInterface16 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ExtendedSyncStatus extendedSyncStatus = (ExtendedSyncStatus) rve.a(parcel, ExtendedSyncStatus.CREATOR);
                    Account account2 = (Account) rve.a(parcel, Account.CREATOR);
                    ApiMetadata apiMetadata16 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    fsaUpdateSyncStatus(asInterface16, extendedSyncStatus, account2, apiMetadata16);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_importSimContacts /* 212502 */:
                    IContactsSyncServiceCallbacks asInterface17 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ImportSimContactsRequest importSimContactsRequest = (ImportSimContactsRequest) rve.a(parcel, ImportSimContactsRequest.CREATOR);
                    ApiMetadata apiMetadata17 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    importSimContacts(asInterface17, importSimContactsRequest, apiMetadata17);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getImportSimContactsSuggestions /* 213302 */:
                    IContactsSyncServiceCallbacks asInterface18 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    GetImportSimContactsSuggestionsRequest getImportSimContactsSuggestionsRequest = (GetImportSimContactsSuggestionsRequest) rve.a(parcel, GetImportSimContactsSuggestionsRequest.CREATOR);
                    ApiMetadata apiMetadata18 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getImportSimContactsSuggestions(asInterface18, getImportSimContactsSuggestionsRequest, apiMetadata18);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getImportSimContactsProgress /* 213902 */:
                    ImportSimContactsRequest importSimContactsRequest2 = (ImportSimContactsRequest) rve.a(parcel, ImportSimContactsRequest.CREATOR);
                    int readInt2 = parcel.readInt();
                    ApiMetadata apiMetadata19 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    int importSimContactsProgress = getImportSimContactsProgress(importSimContactsRequest2, readInt2, apiMetadata19);
                    parcel2.writeNoException();
                    parcel2.writeInt(importSimContactsProgress);
                    return true;
                case TRANSACTION_optInBackupAndSync /* 214201 */:
                    IContactsSyncServiceCallbacks asInterface19 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString7 = parcel.readString();
                    BackupAndSyncOptInOptions backupAndSyncOptInOptions = (BackupAndSyncOptInOptions) rve.a(parcel, BackupAndSyncOptInOptions.CREATOR);
                    ApiMetadata apiMetadata20 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    optInBackupAndSync(asInterface19, readString7, backupAndSyncOptInOptions, apiMetadata20);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_addDeviceContactsSyncSettingChangedListener /* 223601 */:
                    IContactsSyncServiceCallbacks asInterface20 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata21 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    addDeviceContactsSyncSettingChangedListener(asInterface20, apiMetadata21);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_removeDeviceContactsSyncSettingChangedListener /* 223602 */:
                    IContactsSyncServiceCallbacks asInterface21 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata22 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    removeDeviceContactsSyncSettingChangedListener(asInterface21, apiMetadata22);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_cleanupSyncedGoogleContacts /* 223902 */:
                    IContactsSyncServiceCallbacks asInterface22 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString8 = parcel.readString();
                    ApiMetadata apiMetadata23 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    cleanupSyncedGoogleContacts(asInterface22, readString8, apiMetadata23);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getDeviceContactsSyncSettingAction /* 223903 */:
                    IContactsSyncServiceCallbacks asInterface23 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata24 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getDeviceContactsSyncSettingAction(asInterface23, apiMetadata24);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_upsertCpgDocuments /* 231501 */:
                    IContactsSyncServiceCallbacks asInterface24 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList createTypedArrayList2 = parcel.createTypedArrayList(CpgDocument.CREATOR);
                    ApiMetadata apiMetadata25 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    upsertCpgDocuments(asInterface24, createTypedArrayList2, apiMetadata25);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_registerSyncStatusListenerWithChannel /* 234202 */:
                    IContactsSyncServiceCallbacks asInterface25 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    boolean g3 = rve.g(parcel);
                    Account account3 = (Account) rve.a(parcel, Account.CREATOR);
                    String readString9 = parcel.readString();
                    String readString10 = parcel.readString();
                    ApiMetadata apiMetadata26 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerSyncStatusListenerWithChannel(asInterface25, g3, account3, readString9, readString10, apiMetadata26);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_readCpgDocuments /* 242001 */:
                    IContactsSyncServiceCallbacks asInterface26 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList createTypedArrayList3 = parcel.createTypedArrayList(CpgDocumentRequest.CREATOR);
                    ApiMetadata apiMetadata27 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    readCpgDocuments(asInterface26, createTypedArrayList3, apiMetadata27);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_createCallingCard /* 250201 */:
                    IContactsSyncServiceCallbacks asInterface27 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    CreateCallingCardRequest createCallingCardRequest = (CreateCallingCardRequest) rve.a(parcel, CreateCallingCardRequest.CREATOR);
                    ApiMetadata apiMetadata28 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    createCallingCard(asInterface27, createCallingCardRequest, apiMetadata28);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getCallingCards /* 250202 */:
                    IContactsSyncServiceCallbacks asInterface28 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList createTypedArrayList4 = parcel.createTypedArrayList(CallingCardIdentifier.CREATOR);
                    ApiMetadata apiMetadata29 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getCallingCards(asInterface28, createTypedArrayList4, apiMetadata29);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_updateCallingCard /* 250203 */:
                    IContactsSyncServiceCallbacks asInterface29 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    UpdateCallingCardRequest updateCallingCardRequest = (UpdateCallingCardRequest) rve.a(parcel, UpdateCallingCardRequest.CREATOR);
                    ApiMetadata apiMetadata30 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateCallingCard(asInterface29, updateCallingCardRequest, apiMetadata30);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_deleteCallingCards /* 250204 */:
                    IContactsSyncServiceCallbacks asInterface30 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ArrayList createTypedArrayList5 = parcel.createTypedArrayList(CallingCardIdentifier.CREATOR);
                    ApiMetadata apiMetadata31 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    deleteCallingCards(asInterface30, createTypedArrayList5, apiMetadata31);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void addAccountCategoryToBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, int[] iArr, ApiMetadata apiMetadata);

    void addDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata);

    void classifyAccountTypes(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<ClassifyAccountTypeRequest> list, String str, ApiMetadata apiMetadata);

    void cleanupSyncedGoogleContacts(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, ApiMetadata apiMetadata);

    void createCallingCard(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, CreateCallingCardRequest createCallingCardRequest, ApiMetadata apiMetadata);

    void deleteCallingCards(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CallingCardIdentifier> list, ApiMetadata apiMetadata);

    void fsaUpdateSyncStatus(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ExtendedSyncStatus extendedSyncStatus, Account account, ApiMetadata apiMetadata);

    void getBackupAndSyncOptInState(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata);

    void getBackupAndSyncOptInStateOld(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, ApiMetadata apiMetadata);

    void getBackupAndSyncSuggestion(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata);

    void getBackupSyncSuggestion(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, GetBackupSyncSuggestionRequest getBackupSyncSuggestionRequest, ApiMetadata apiMetadata);

    void getCallingCards(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CallingCardIdentifier> list, ApiMetadata apiMetadata);

    void getDeviceContactsSyncSettingAction(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata);

    int getImportSimContactsProgress(ImportSimContactsRequest importSimContactsRequest, int i, ApiMetadata apiMetadata);

    void getImportSimContactsSuggestions(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, GetImportSimContactsSuggestionsRequest getImportSimContactsSuggestionsRequest, ApiMetadata apiMetadata);

    void importSimContacts(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ImportSimContactsRequest importSimContactsRequest, ApiMetadata apiMetadata);

    void migrateContacts(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, AccountWithDataSet accountWithDataSet, AccountWithDataSet accountWithDataSet2, List<Long> list, int i, ApiMetadata apiMetadata);

    void optInBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, BackupAndSyncOptInOptions backupAndSyncOptInOptions, ApiMetadata apiMetadata);

    void optInBackupAndSyncInternalOld(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, int[] iArr, String str, boolean z, ApiMetadata apiMetadata);

    void optInBackupAndSyncPreY2021w42(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, ApiMetadata apiMetadata);

    void optInBackupAndSyncWithoutValidation(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, String str, ApiMetadata apiMetadata);

    void optOutBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata);

    void readCpgDocuments(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CpgDocumentRequest> list, ApiMetadata apiMetadata);

    void recordBackupSyncUserAction(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, BackupSyncUserAction backupSyncUserAction, ApiMetadata apiMetadata);

    void registerSyncStatusListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, boolean z, Account account, String str, ApiMetadata apiMetadata);

    void registerSyncStatusListenerWithChannel(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, boolean z, Account account, String str, String str2, ApiMetadata apiMetadata);

    void removeAccountCategoryFromBackupAndSync(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, int[] iArr, ApiMetadata apiMetadata);

    void removeDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, ApiMetadata apiMetadata);

    void syncHighResPhoto(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, Uri uri, ApiMetadata apiMetadata);

    void updateCallingCard(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, UpdateCallingCardRequest updateCallingCardRequest, ApiMetadata apiMetadata);

    void upsertCpgDocuments(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks, List<CpgDocument> list, ApiMetadata apiMetadata);
}
