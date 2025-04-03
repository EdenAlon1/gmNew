package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICertData extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICertData {
        static final int TRANSACTION_getBytesWrapped = 1;
        static final int TRANSACTION_getHashCode = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICertData {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.ICertData");
            }

            @Override // com.google.android.gms.common.internal.ICertData
            public IObjectWrapper getBytesWrapped() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.common.internal.ICertData
            public int getHashCode() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }
        }

        public Stub() {
            super("com.google.android.gms.common.internal.ICertData");
        }

        public static ICertData asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
            return queryLocalInterface instanceof ICertData ? (ICertData) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IObjectWrapper bytesWrapped = getBytesWrapped();
                parcel2.writeNoException();
                rve.f(parcel2, bytesWrapped);
            } else {
                if (i != 2) {
                    return false;
                }
                int hashCode = getHashCode();
                parcel2.writeNoException();
                parcel2.writeInt(hashCode);
            }
            return true;
        }
    }

    IObjectWrapper getBytesWrapped();

    int getHashCode();
}
