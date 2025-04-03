package com.google.android.gms.fido.sourcedevice.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;
import com.google.android.gms.fido.sourcedevice.internal.IStartDirectTransferCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISourceDirectTransferService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISourceDirectTransferService {
        static final int TRANSACTION_startDirectTransfer = 1;
        static final int TRANSACTION_startDirectTransferService = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISourceDirectTransferService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService");
            }

            @Override // com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService
            public void startDirectTransfer(IStartDirectTransferCallbacks iStartDirectTransferCallbacks, SourceStartDirectTransferOptions sourceStartDirectTransferOptions, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStartDirectTransferCallbacks);
                rve.d(obtainAndWriteInterfaceToken, sourceStartDirectTransferOptions);
                rve.d(obtainAndWriteInterfaceToken, parcelFileDescriptor);
                rve.d(obtainAndWriteInterfaceToken, parcelFileDescriptor2);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService
            public void startDirectTransferService(IStatusCallback iStatusCallback, SourceStartDirectTransferOptions sourceStartDirectTransferOptions, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, sourceStartDirectTransferOptions);
                rve.d(obtainAndWriteInterfaceToken, parcelFileDescriptor);
                rve.d(obtainAndWriteInterfaceToken, parcelFileDescriptor2);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService");
        }

        public static ISourceDirectTransferService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.sourcedevice.internal.ISourceDirectTransferService");
            return queryLocalInterface instanceof ISourceDirectTransferService ? (ISourceDirectTransferService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IStartDirectTransferCallbacks asInterface = IStartDirectTransferCallbacks.Stub.asInterface(parcel.readStrongBinder());
                SourceStartDirectTransferOptions sourceStartDirectTransferOptions = (SourceStartDirectTransferOptions) rve.a(parcel, SourceStartDirectTransferOptions.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) rve.a(parcel, ParcelFileDescriptor.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) rve.a(parcel, ParcelFileDescriptor.CREATOR);
                enforceNoDataAvail(parcel);
                startDirectTransfer(asInterface, sourceStartDirectTransferOptions, parcelFileDescriptor, parcelFileDescriptor2);
            } else {
                if (i != 2) {
                    return false;
                }
                IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                SourceStartDirectTransferOptions sourceStartDirectTransferOptions2 = (SourceStartDirectTransferOptions) rve.a(parcel, SourceStartDirectTransferOptions.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor3 = (ParcelFileDescriptor) rve.a(parcel, ParcelFileDescriptor.CREATOR);
                ParcelFileDescriptor parcelFileDescriptor4 = (ParcelFileDescriptor) rve.a(parcel, ParcelFileDescriptor.CREATOR);
                enforceNoDataAvail(parcel);
                startDirectTransferService(asInterface2, sourceStartDirectTransferOptions2, parcelFileDescriptor3, parcelFileDescriptor4);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void startDirectTransfer(IStartDirectTransferCallbacks iStartDirectTransferCallbacks, SourceStartDirectTransferOptions sourceStartDirectTransferOptions, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2);

    void startDirectTransferService(IStatusCallback iStatusCallback, SourceStartDirectTransferOptions sourceStartDirectTransferOptions, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2);
}
