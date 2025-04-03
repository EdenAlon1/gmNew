package com.google.android.gms.people.contactssync.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeResult;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.BackupAndSyncSuggestion;
import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionResponse;
import com.google.android.gms.people.contactssync.model.RecordBackupSyncUserActionResponse;
import com.google.android.gms.people.cpg.CpgDocument;
import com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus;
import com.google.android.gms.people.cpg.callingcard.CreateCallingCardResponse;
import com.google.android.gms.people.cpg.callingcard.GetCallingCardResponse;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IContactsSyncServiceCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IContactsSyncServiceCallbacks {
        static final int TRANSACTION_onAddAccountCategoryToBackupAndSync = 4;
        static final int TRANSACTION_onClassifyAccountTypesResult = 10;
        static final int TRANSACTION_onCleanupSyncedGoogleContacts = 20;
        static final int TRANSACTION_onCpgAppSearchRead = 23;
        static final int TRANSACTION_onCpgAppSearchUpsert = 22;
        static final int TRANSACTION_onCreateCallingCard = 24;
        static final int TRANSACTION_onDeleteCallingCards = 27;
        static final int TRANSACTION_onDeviceContactsSyncSettingChanged = 18;
        static final int TRANSACTION_onGetBackupAndSyncOptInState = 7;
        static final int TRANSACTION_onGetBackupAndSyncOptInStateOld = 2;
        static final int TRANSACTION_onGetBackupAndSyncSuggestion = 8;
        static final int TRANSACTION_onGetBackupSyncSuggestion = 11;
        static final int TRANSACTION_onGetCallingCards = 25;
        static final int TRANSACTION_onGetDeviceContactsSyncSettingAction = 21;
        static final int TRANSACTION_onGetImportSimContactsSuggestions = 17;
        static final int TRANSACTION_onImportSimContacts = 16;
        static final int TRANSACTION_onMigrateContacts = 13;
        static final int TRANSACTION_onOptInBackupAndSync = 3;
        static final int TRANSACTION_onOptInBackupAndSyncInternalOld = 1;
        static final int TRANSACTION_onOptOutBackupAndSync = 6;
        static final int TRANSACTION_onRecordBackupSyncUserAction = 12;
        static final int TRANSACTION_onRemoveAccountCategoryFromBackupAndSync = 5;
        static final int TRANSACTION_onStatus = 19;
        static final int TRANSACTION_onSyncHighResPhoto = 9;
        static final int TRANSACTION_onSyncStatusUpdate = 14;
        static final int TRANSACTION_onUpdateCallingCard = 26;
        static final int TRANSACTION_updateSyncStatusDone = 15;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IContactsSyncServiceCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onAddAccountCategoryToBackupAndSync(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onClassifyAccountTypesResult(Status status, List<ClassifyAccountTypeResult> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onCleanupSyncedGoogleContacts(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactOneway(20, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onCpgAppSearchRead(Status status, List<CpgDocument> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(23, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onCpgAppSearchUpsert(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactOneway(22, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onCreateCallingCard(Status status, CreateCallingCardResponse createCallingCardResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, createCallingCardResponse);
                transactOneway(24, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onDeleteCallingCards(Status status, List<CallingCardRequestStatus> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(27, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onDeviceContactsSyncSettingChanged() {
                transactOneway(18, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onGetBackupAndSyncOptInState(Status status, BackupAndSyncOptInState backupAndSyncOptInState) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, backupAndSyncOptInState);
                transactOneway(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onGetBackupAndSyncOptInStateOld(Status status, BackupAndSyncOptInState backupAndSyncOptInState) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, backupAndSyncOptInState);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onGetBackupAndSyncSuggestion(Status status, BackupAndSyncSuggestion backupAndSyncSuggestion) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, backupAndSyncSuggestion);
                transactOneway(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onGetBackupSyncSuggestion(Status status, GetBackupSyncSuggestionResponse getBackupSyncSuggestionResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, getBackupSyncSuggestionResponse);
                transactOneway(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onGetCallingCards(Status status, List<GetCallingCardResponse> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(25, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onGetDeviceContactsSyncSettingAction(Status status, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(21, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onGetImportSimContactsSuggestions(Status status, List list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeList(list);
                transactOneway(17, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onImportSimContacts(Status status, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onMigrateContacts(Status status, List<Long> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeList(list);
                transactOneway(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onOptInBackupAndSync(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onOptInBackupAndSyncInternalOld(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onOptOutBackupAndSync(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactOneway(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onRecordBackupSyncUserAction(Status status, RecordBackupSyncUserActionResponse recordBackupSyncUserActionResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, recordBackupSyncUserActionResponse);
                transactOneway(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onRemoveAccountCategoryFromBackupAndSync(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onStatus(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactOneway(19, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onSyncHighResPhoto(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactOneway(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onSyncStatusUpdate(Status status, ExtendedSyncStatus extendedSyncStatus) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, extendedSyncStatus);
                transactOneway(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void onUpdateCallingCard(Status status, CallingCardRequestStatus callingCardRequestStatus) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, callingCardRequestStatus);
                transactOneway(26, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
            public void updateSyncStatusDone(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactOneway(15, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
        }

        public static IContactsSyncServiceCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
            return queryLocalInterface instanceof IContactsSyncServiceCallbacks ? (IContactsSyncServiceCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    Status status = (Status) rve.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onOptInBackupAndSyncInternalOld(status);
                    return true;
                case 2:
                    Status status2 = (Status) rve.a(parcel, Status.CREATOR);
                    BackupAndSyncOptInState backupAndSyncOptInState = (BackupAndSyncOptInState) rve.a(parcel, BackupAndSyncOptInState.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetBackupAndSyncOptInStateOld(status2, backupAndSyncOptInState);
                    return true;
                case 3:
                    Status status3 = (Status) rve.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onOptInBackupAndSync(status3);
                    return true;
                case 4:
                    Status status4 = (Status) rve.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onAddAccountCategoryToBackupAndSync(status4);
                    return true;
                case 5:
                    Status status5 = (Status) rve.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRemoveAccountCategoryFromBackupAndSync(status5);
                    return true;
                case 6:
                    Status status6 = (Status) rve.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onOptOutBackupAndSync(status6);
                    return true;
                case 7:
                    Status status7 = (Status) rve.a(parcel, Status.CREATOR);
                    BackupAndSyncOptInState backupAndSyncOptInState2 = (BackupAndSyncOptInState) rve.a(parcel, BackupAndSyncOptInState.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetBackupAndSyncOptInState(status7, backupAndSyncOptInState2);
                    return true;
                case 8:
                    Status status8 = (Status) rve.a(parcel, Status.CREATOR);
                    BackupAndSyncSuggestion backupAndSyncSuggestion = (BackupAndSyncSuggestion) rve.a(parcel, BackupAndSyncSuggestion.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetBackupAndSyncSuggestion(status8, backupAndSyncSuggestion);
                    return true;
                case 9:
                    Status status9 = (Status) rve.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSyncHighResPhoto(status9);
                    return true;
                case 10:
                    Status status10 = (Status) rve.a(parcel, Status.CREATOR);
                    ArrayList createTypedArrayList = parcel.createTypedArrayList(ClassifyAccountTypeResult.CREATOR);
                    enforceNoDataAvail(parcel);
                    onClassifyAccountTypesResult(status10, createTypedArrayList);
                    return true;
                case 11:
                    Status status11 = (Status) rve.a(parcel, Status.CREATOR);
                    GetBackupSyncSuggestionResponse getBackupSyncSuggestionResponse = (GetBackupSyncSuggestionResponse) rve.a(parcel, GetBackupSyncSuggestionResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetBackupSyncSuggestion(status11, getBackupSyncSuggestionResponse);
                    return true;
                case 12:
                    Status status12 = (Status) rve.a(parcel, Status.CREATOR);
                    RecordBackupSyncUserActionResponse recordBackupSyncUserActionResponse = (RecordBackupSyncUserActionResponse) rve.a(parcel, RecordBackupSyncUserActionResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRecordBackupSyncUserAction(status12, recordBackupSyncUserActionResponse);
                    return true;
                case 13:
                    Status status13 = (Status) rve.a(parcel, Status.CREATOR);
                    ArrayList b = rve.b(parcel);
                    enforceNoDataAvail(parcel);
                    onMigrateContacts(status13, b);
                    return true;
                case 14:
                    Status status14 = (Status) rve.a(parcel, Status.CREATOR);
                    ExtendedSyncStatus extendedSyncStatus = (ExtendedSyncStatus) rve.a(parcel, ExtendedSyncStatus.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSyncStatusUpdate(status14, extendedSyncStatus);
                    return true;
                case 15:
                    Status status15 = (Status) rve.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateSyncStatusDone(status15);
                    return true;
                case 16:
                    Status status16 = (Status) rve.a(parcel, Status.CREATOR);
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    onImportSimContacts(status16, readInt);
                    return true;
                case 17:
                    Status status17 = (Status) rve.a(parcel, Status.CREATOR);
                    ArrayList b2 = rve.b(parcel);
                    enforceNoDataAvail(parcel);
                    onGetImportSimContactsSuggestions(status17, b2);
                    return true;
                case 18:
                    onDeviceContactsSyncSettingChanged();
                    return true;
                case 19:
                    Status status18 = (Status) rve.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onStatus(status18);
                    return true;
                case 20:
                    Status status19 = (Status) rve.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCleanupSyncedGoogleContacts(status19);
                    return true;
                case 21:
                    Status status20 = (Status) rve.a(parcel, Status.CREATOR);
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    onGetDeviceContactsSyncSettingAction(status20, readString);
                    return true;
                case 22:
                    Status status21 = (Status) rve.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCpgAppSearchUpsert(status21);
                    return true;
                case 23:
                    Status status22 = (Status) rve.a(parcel, Status.CREATOR);
                    ArrayList createTypedArrayList2 = parcel.createTypedArrayList(CpgDocument.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCpgAppSearchRead(status22, createTypedArrayList2);
                    return true;
                case 24:
                    Status status23 = (Status) rve.a(parcel, Status.CREATOR);
                    CreateCallingCardResponse createCallingCardResponse = (CreateCallingCardResponse) rve.a(parcel, CreateCallingCardResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCreateCallingCard(status23, createCallingCardResponse);
                    return true;
                case 25:
                    Status status24 = (Status) rve.a(parcel, Status.CREATOR);
                    ArrayList createTypedArrayList3 = parcel.createTypedArrayList(GetCallingCardResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCallingCards(status24, createTypedArrayList3);
                    return true;
                case 26:
                    Status status25 = (Status) rve.a(parcel, Status.CREATOR);
                    CallingCardRequestStatus callingCardRequestStatus = (CallingCardRequestStatus) rve.a(parcel, CallingCardRequestStatus.CREATOR);
                    enforceNoDataAvail(parcel);
                    onUpdateCallingCard(status25, callingCardRequestStatus);
                    return true;
                case 27:
                    Status status26 = (Status) rve.a(parcel, Status.CREATOR);
                    ArrayList createTypedArrayList4 = parcel.createTypedArrayList(CallingCardRequestStatus.CREATOR);
                    enforceNoDataAvail(parcel);
                    onDeleteCallingCards(status26, createTypedArrayList4);
                    return true;
                default:
                    return false;
            }
        }
    }

    void onAddAccountCategoryToBackupAndSync(Status status);

    void onClassifyAccountTypesResult(Status status, List<ClassifyAccountTypeResult> list);

    void onCleanupSyncedGoogleContacts(Status status);

    void onCpgAppSearchRead(Status status, List<CpgDocument> list);

    void onCpgAppSearchUpsert(Status status);

    void onCreateCallingCard(Status status, CreateCallingCardResponse createCallingCardResponse);

    void onDeleteCallingCards(Status status, List<CallingCardRequestStatus> list);

    void onDeviceContactsSyncSettingChanged();

    void onGetBackupAndSyncOptInState(Status status, BackupAndSyncOptInState backupAndSyncOptInState);

    void onGetBackupAndSyncOptInStateOld(Status status, BackupAndSyncOptInState backupAndSyncOptInState);

    void onGetBackupAndSyncSuggestion(Status status, BackupAndSyncSuggestion backupAndSyncSuggestion);

    void onGetBackupSyncSuggestion(Status status, GetBackupSyncSuggestionResponse getBackupSyncSuggestionResponse);

    void onGetCallingCards(Status status, List<GetCallingCardResponse> list);

    void onGetDeviceContactsSyncSettingAction(Status status, String str);

    void onGetImportSimContactsSuggestions(Status status, List list);

    void onImportSimContacts(Status status, int i);

    void onMigrateContacts(Status status, List<Long> list);

    void onOptInBackupAndSync(Status status);

    void onOptInBackupAndSyncInternalOld(Status status);

    void onOptOutBackupAndSync(Status status);

    void onRecordBackupSyncUserAction(Status status, RecordBackupSyncUserActionResponse recordBackupSyncUserActionResponse);

    void onRemoveAccountCategoryFromBackupAndSync(Status status);

    void onStatus(Status status);

    void onSyncHighResPhoto(Status status);

    void onSyncStatusUpdate(Status status, ExtendedSyncStatus extendedSyncStatus);

    void onUpdateCallingCard(Status status, CallingCardRequestStatus callingCardRequestStatus);

    void updateSyncStatusDone(Status status);
}
