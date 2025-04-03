package com.google.android.gms.learning.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IArtifactFileDescriptorCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IArtifactFileDescriptorCallback {
        static final int TRANSACTION_onFailure = 3;
        static final int TRANSACTION_onSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IArtifactFileDescriptorCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.IArtifactFileDescriptorCallback");
            }

            @Override // com.google.android.gms.learning.internal.IArtifactFileDescriptorCallback
            public void onFailure(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.IArtifactFileDescriptorCallback
            public void onSuccess(byte[] bArr, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                rve.d(obtainAndWriteInterfaceToken, parcelFileDescriptor);
                rve.d(obtainAndWriteInterfaceToken, uri);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.IArtifactFileDescriptorCallback");
        }

        public static IArtifactFileDescriptorCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.IArtifactFileDescriptorCallback");
            return queryLocalInterface instanceof IArtifactFileDescriptorCallback ? (IArtifactFileDescriptorCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                Status status = (Status) rve.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onFailure(status);
                return true;
            }
            byte[] createByteArray = parcel.createByteArray();
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) rve.a(parcel, ParcelFileDescriptor.CREATOR);
            Uri uri = (Uri) rve.a(parcel, Uri.CREATOR);
            enforceNoDataAvail(parcel);
            onSuccess(createByteArray, parcelFileDescriptor, uri);
            return true;
        }
    }

    void onFailure(Status status);

    void onSuccess(byte[] bArr, ParcelFileDescriptor parcelFileDescriptor, Uri uri);
}
