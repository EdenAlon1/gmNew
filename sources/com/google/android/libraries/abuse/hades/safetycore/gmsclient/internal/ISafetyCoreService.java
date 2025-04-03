package com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.IBooleanCallback;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.IStatusCallback;
import defpackage.dlkk;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ISafetyCoreService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISafetyCoreService {
        static final int TRANSACTION_classifyImageFileDescriptor = 4;
        static final int TRANSACTION_classifyVideoFileDescriptor = 6;
        static final int TRANSACTION_isClassifierAvailable = 5;
        static final int TRANSACTION_prewarm = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISafetyCoreService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService");
            }

            @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService
            public void classifyImageFileDescriptor(int i, ParcelFileDescriptor parcelFileDescriptor, ISafetyCoreCallbacks iSafetyCoreCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, parcelFileDescriptor);
                rve.f(obtainAndWriteInterfaceToken, iSafetyCoreCallbacks);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService
            public void classifyVideoFileDescriptor(int i, ParcelFileDescriptor parcelFileDescriptor, dlkk dlkkVar, ISafetyCoreCallbacks iSafetyCoreCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.d(obtainAndWriteInterfaceToken, parcelFileDescriptor);
                rve.d(obtainAndWriteInterfaceToken, dlkkVar);
                rve.f(obtainAndWriteInterfaceToken, iSafetyCoreCallbacks);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService
            public void isClassifierAvailable(int i, IBooleanCallback iBooleanCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.f(obtainAndWriteInterfaceToken, iBooleanCallback);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService
            public void prewarm(int[] iArr, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeIntArray(iArr);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService");
        }

        public static ISafetyCoreService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreService");
            return queryLocalInterface instanceof ISafetyCoreService ? (ISafetyCoreService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 3) {
                int[] createIntArray = parcel.createIntArray();
                IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                prewarm(createIntArray, asInterface);
            } else if (i == 4) {
                int readInt = parcel.readInt();
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) rve.a(parcel, ParcelFileDescriptor.CREATOR);
                ISafetyCoreCallbacks asInterface2 = ISafetyCoreCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                classifyImageFileDescriptor(readInt, parcelFileDescriptor, asInterface2);
            } else if (i == 5) {
                int readInt2 = parcel.readInt();
                IBooleanCallback asInterface3 = IBooleanCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                isClassifierAvailable(readInt2, asInterface3);
            } else {
                if (i != 6) {
                    return false;
                }
                int readInt3 = parcel.readInt();
                ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) rve.a(parcel, ParcelFileDescriptor.CREATOR);
                dlkk dlkkVar = (dlkk) rve.a(parcel, dlkk.CREATOR);
                ISafetyCoreCallbacks asInterface4 = ISafetyCoreCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                classifyVideoFileDescriptor(readInt3, parcelFileDescriptor2, dlkkVar, asInterface4);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void classifyImageFileDescriptor(int i, ParcelFileDescriptor parcelFileDescriptor, ISafetyCoreCallbacks iSafetyCoreCallbacks);

    void classifyVideoFileDescriptor(int i, ParcelFileDescriptor parcelFileDescriptor, dlkk dlkkVar, ISafetyCoreCallbacks iSafetyCoreCallbacks);

    void isClassifierAvailable(int i, IBooleanCallback iBooleanCallback);

    void prewarm(int[] iArr, IStatusCallback iStatusCallback);
}
