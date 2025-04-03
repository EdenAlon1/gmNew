package com.google.android.gms.mobstore;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.mobstore.IMobStoreFileCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMobStoreFileService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMobStoreFileService {
        static final int TRANSACTION_deleteFile = 2;
        static final int TRANSACTION_openFileDescriptor = 1;
        static final int TRANSACTION_rename = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMobStoreFileService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mobstore.IMobStoreFileService");
            }

            @Override // com.google.android.gms.mobstore.IMobStoreFileService
            public void deleteFile(IMobStoreFileCallbacks iMobStoreFileCallbacks, DeleteFileRequest deleteFileRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMobStoreFileCallbacks);
                rve.d(obtainAndWriteInterfaceToken, deleteFileRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mobstore.IMobStoreFileService
            public void openFileDescriptor(IMobStoreFileCallbacks iMobStoreFileCallbacks, OpenFileDescriptorRequest openFileDescriptorRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMobStoreFileCallbacks);
                rve.d(obtainAndWriteInterfaceToken, openFileDescriptorRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mobstore.IMobStoreFileService
            public void rename(IMobStoreFileCallbacks iMobStoreFileCallbacks, RenameRequest renameRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMobStoreFileCallbacks);
                rve.d(obtainAndWriteInterfaceToken, renameRequest);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mobstore.IMobStoreFileService");
        }

        public static IMobStoreFileService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mobstore.IMobStoreFileService");
            return queryLocalInterface instanceof IMobStoreFileService ? (IMobStoreFileService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IMobStoreFileCallbacks asInterface = IMobStoreFileCallbacks.Stub.asInterface(parcel.readStrongBinder());
                OpenFileDescriptorRequest openFileDescriptorRequest = (OpenFileDescriptorRequest) rve.a(parcel, OpenFileDescriptorRequest.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                openFileDescriptor(asInterface, openFileDescriptorRequest, apiMetadata);
            } else if (i == 2) {
                IMobStoreFileCallbacks asInterface2 = IMobStoreFileCallbacks.Stub.asInterface(parcel.readStrongBinder());
                DeleteFileRequest deleteFileRequest = (DeleteFileRequest) rve.a(parcel, DeleteFileRequest.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                deleteFile(asInterface2, deleteFileRequest, apiMetadata2);
            } else {
                if (i != 3) {
                    return false;
                }
                IMobStoreFileCallbacks asInterface3 = IMobStoreFileCallbacks.Stub.asInterface(parcel.readStrongBinder());
                RenameRequest renameRequest = (RenameRequest) rve.a(parcel, RenameRequest.CREATOR);
                ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                rename(asInterface3, renameRequest, apiMetadata3);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void deleteFile(IMobStoreFileCallbacks iMobStoreFileCallbacks, DeleteFileRequest deleteFileRequest, ApiMetadata apiMetadata);

    void openFileDescriptor(IMobStoreFileCallbacks iMobStoreFileCallbacks, OpenFileDescriptorRequest openFileDescriptorRequest, ApiMetadata apiMetadata);

    void rename(IMobStoreFileCallbacks iMobStoreFileCallbacks, RenameRequest renameRequest, ApiMetadata apiMetadata);
}
