package com.google.android.gms.people.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.consentprimitive.ContactsConsentsStatus;
import com.google.android.gms.people.protomodel.BackedUpContactsPerDeviceEntity;
import com.google.android.gms.people.protomodel.PersonEntity;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IPeopleCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPeopleCallbacks {
        static final int TRANSACTION_onBundleLoaded = 1;
        static final int TRANSACTION_onContactTypeMetadataRetrieved = 6;
        static final int TRANSACTION_onDataHolderLoaded = 2;
        static final int TRANSACTION_onDataHoldersLoaded = 4;
        static final int TRANSACTION_onFirstFullSyncStatusCallback = 18;
        static final int TRANSACTION_onGalProviderTypeCallback = 15;
        static final int TRANSACTION_onGetContactsConsentsStatusCallback = 19;
        static final int TRANSACTION_onMatrixCursorCallback = 16;
        static final int TRANSACTION_onParcelFileDescriptorLoaded = 5;
        static final int TRANSACTION_onParcelFileDescriptorLoaded_old = 3;
        static final int TRANSACTION_onPersonRetrieved = 7;
        static final int TRANSACTION_onStatusCallback = 8;
        static final int TRANSACTION_onSyncStatus = 12;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPeopleCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.people.internal.IPeopleCallbacks");
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onBundleLoaded(int i, Bundle bundle, Bundle bundle2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.d(obtainAndWriteInterfaceToken, bundle2);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onContactTypeMetadataRetrieved(int i, BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, backedUpContactsPerDeviceEntity);
                transactOneway(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onDataHolderLoaded(int i, Bundle bundle, DataHolder dataHolder) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.d(obtainAndWriteInterfaceToken, dataHolder);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onDataHoldersLoaded(int i, Bundle bundle, DataHolder[] dataHolderArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                obtainAndWriteInterfaceToken.writeTypedArray(dataHolderArr, 0);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onFirstFullSyncStatusCallback(int i, SyncStatus syncStatus) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, syncStatus);
                transactOneway(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onGalProviderTypeCallback(int i, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(15, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onGetContactsConsentsStatusCallback(Status status, ContactsConsentsStatus contactsConsentsStatus) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, contactsConsentsStatus);
                transactOneway(19, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onMatrixCursorCallback(int i, MatrixCursorParcelable matrixCursorParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, matrixCursorParcelable);
                transactOneway(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onParcelFileDescriptorLoaded(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.d(obtainAndWriteInterfaceToken, parcelFileDescriptor);
                rve.d(obtainAndWriteInterfaceToken, bundle2);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onParcelFileDescriptorLoaded_old(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                rve.d(obtainAndWriteInterfaceToken, parcelFileDescriptor);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onPersonRetrieved(int i, PersonEntity personEntity) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, personEntity);
                transactOneway(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onStatusCallback(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.internal.IPeopleCallbacks
            public void onSyncStatus(int i, SyncStatus syncStatus) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, syncStatus);
                transactOneway(12, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.people.internal.IPeopleCallbacks");
        }

        public static IPeopleCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
            return queryLocalInterface instanceof IPeopleCallbacks ? (IPeopleCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 12) {
                int readInt = parcel.readInt();
                SyncStatus syncStatus = (SyncStatus) rve.a(parcel, SyncStatus.CREATOR);
                enforceNoDataAvail(parcel);
                onSyncStatus(readInt, syncStatus);
                return true;
            }
            if (i == 15) {
                int readInt2 = parcel.readInt();
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                onGalProviderTypeCallback(readInt2, readString);
                return true;
            }
            if (i == 16) {
                int readInt3 = parcel.readInt();
                MatrixCursorParcelable matrixCursorParcelable = (MatrixCursorParcelable) rve.a(parcel, MatrixCursorParcelable.CREATOR);
                enforceNoDataAvail(parcel);
                onMatrixCursorCallback(readInt3, matrixCursorParcelable);
                return true;
            }
            if (i == 18) {
                int readInt4 = parcel.readInt();
                SyncStatus syncStatus2 = (SyncStatus) rve.a(parcel, SyncStatus.CREATOR);
                enforceNoDataAvail(parcel);
                onFirstFullSyncStatusCallback(readInt4, syncStatus2);
                return true;
            }
            if (i == 19) {
                Status status = (Status) rve.a(parcel, Status.CREATOR);
                ContactsConsentsStatus contactsConsentsStatus = (ContactsConsentsStatus) rve.a(parcel, ContactsConsentsStatus.CREATOR);
                enforceNoDataAvail(parcel);
                onGetContactsConsentsStatusCallback(status, contactsConsentsStatus);
                return true;
            }
            switch (i) {
                case 1:
                    int readInt5 = parcel.readInt();
                    Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    Bundle bundle2 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onBundleLoaded(readInt5, bundle, bundle2);
                    return true;
                case 2:
                    int readInt6 = parcel.readInt();
                    Bundle bundle3 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    DataHolder dataHolder = (DataHolder) rve.a(parcel, DataHolder.CREATOR);
                    enforceNoDataAvail(parcel);
                    onDataHolderLoaded(readInt6, bundle3, dataHolder);
                    return true;
                case 3:
                    int readInt7 = parcel.readInt();
                    Bundle bundle4 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) rve.a(parcel, ParcelFileDescriptor.CREATOR);
                    enforceNoDataAvail(parcel);
                    onParcelFileDescriptorLoaded_old(readInt7, bundle4, parcelFileDescriptor);
                    return true;
                case 4:
                    int readInt8 = parcel.readInt();
                    Bundle bundle5 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    DataHolder[] dataHolderArr = (DataHolder[]) parcel.createTypedArray(DataHolder.CREATOR);
                    enforceNoDataAvail(parcel);
                    onDataHoldersLoaded(readInt8, bundle5, dataHolderArr);
                    return true;
                case 5:
                    int readInt9 = parcel.readInt();
                    Bundle bundle6 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) rve.a(parcel, ParcelFileDescriptor.CREATOR);
                    Bundle bundle7 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onParcelFileDescriptorLoaded(readInt9, bundle6, parcelFileDescriptor2, bundle7);
                    return true;
                case 6:
                    int readInt10 = parcel.readInt();
                    BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity = (BackedUpContactsPerDeviceEntity) rve.a(parcel, BackedUpContactsPerDeviceEntity.CREATOR);
                    enforceNoDataAvail(parcel);
                    onContactTypeMetadataRetrieved(readInt10, backedUpContactsPerDeviceEntity);
                    return true;
                case 7:
                    int readInt11 = parcel.readInt();
                    PersonEntity personEntity = (PersonEntity) rve.a(parcel, PersonEntity.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPersonRetrieved(readInt11, personEntity);
                    return true;
                case 8:
                    int readInt12 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    onStatusCallback(readInt12);
                    return true;
                default:
                    return false;
            }
        }
    }

    void onBundleLoaded(int i, Bundle bundle, Bundle bundle2);

    void onContactTypeMetadataRetrieved(int i, BackedUpContactsPerDeviceEntity backedUpContactsPerDeviceEntity);

    void onDataHolderLoaded(int i, Bundle bundle, DataHolder dataHolder);

    void onDataHoldersLoaded(int i, Bundle bundle, DataHolder[] dataHolderArr);

    void onFirstFullSyncStatusCallback(int i, SyncStatus syncStatus);

    void onGalProviderTypeCallback(int i, String str);

    void onGetContactsConsentsStatusCallback(Status status, ContactsConsentsStatus contactsConsentsStatus);

    void onMatrixCursorCallback(int i, MatrixCursorParcelable matrixCursorParcelable);

    void onParcelFileDescriptorLoaded(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2);

    void onParcelFileDescriptorLoaded_old(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor);

    void onPersonRetrieved(int i, PersonEntity personEntity);

    void onStatusCallback(int i);

    void onSyncStatus(int i, SyncStatus syncStatus);
}
