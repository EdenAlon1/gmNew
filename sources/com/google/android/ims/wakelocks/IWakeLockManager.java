package com.google.android.ims.wakelocks;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IWakeLockManager extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IWakeLockManager {
        static final int TRANSACTION_acquire = 1;
        static final int TRANSACTION_release = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IWakeLockManager {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.wakelocks.IWakeLockManager");
            }

            @Override // com.google.android.ims.wakelocks.IWakeLockManager
            public int acquire(IBinder iBinder, String str, int i, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStrongBinder(iBinder);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.wakelocks.IWakeLockManager
            public void release(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.wakelocks.IWakeLockManager");
        }

        public static IWakeLockManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.wakelocks.IWakeLockManager");
            return queryLocalInterface instanceof IWakeLockManager ? (IWakeLockManager) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                long readLong = parcel.readLong();
                enforceNoDataAvail(parcel);
                int acquire = acquire(readStrongBinder, readString, readInt, readLong);
                parcel2.writeNoException();
                parcel2.writeInt(acquire);
            } else {
                if (i != 2) {
                    return false;
                }
                int readInt2 = parcel.readInt();
                enforceNoDataAvail(parcel);
                release(readInt2);
                parcel2.writeNoException();
            }
            return true;
        }
    }

    int acquire(IBinder iBinder, String str, int i, long j);

    void release(int i);
}
