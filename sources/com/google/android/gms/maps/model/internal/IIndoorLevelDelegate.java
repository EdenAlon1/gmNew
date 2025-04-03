package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IIndoorLevelDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IIndoorLevelDelegate {
        static final int TRANSACTION_activate = 3;
        static final int TRANSACTION_equalsRemote = 4;
        static final int TRANSACTION_getName = 1;
        static final int TRANSACTION_getShortName = 2;
        static final int TRANSACTION_hashCodeRemote = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IIndoorLevelDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorLevelDelegate
            public void activate() {
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorLevelDelegate
            public boolean equalsRemote(IIndoorLevelDelegate iIndoorLevelDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iIndoorLevelDelegate);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorLevelDelegate
            public String getName() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorLevelDelegate
            public String getShortName() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorLevelDelegate
            public int hashCodeRemote() {
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
        }

        public static IIndoorLevelDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
            return queryLocalInterface instanceof IIndoorLevelDelegate ? (IIndoorLevelDelegate) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String name = getName();
                parcel2.writeNoException();
                parcel2.writeString(name);
            } else if (i == 2) {
                String shortName = getShortName();
                parcel2.writeNoException();
                parcel2.writeString(shortName);
            } else if (i == 3) {
                activate();
                parcel2.writeNoException();
            } else if (i == 4) {
                IIndoorLevelDelegate asInterface = asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                boolean equalsRemote = equalsRemote(asInterface);
                parcel2.writeNoException();
                int i3 = rve.a;
                parcel2.writeInt(equalsRemote ? 1 : 0);
            } else {
                if (i != 5) {
                    return false;
                }
                int hashCodeRemote = hashCodeRemote();
                parcel2.writeNoException();
                parcel2.writeInt(hashCodeRemote);
            }
            return true;
        }
    }

    void activate();

    boolean equalsRemote(IIndoorLevelDelegate iIndoorLevelDelegate);

    String getName();

    String getShortName();

    int hashCodeRemote();
}
