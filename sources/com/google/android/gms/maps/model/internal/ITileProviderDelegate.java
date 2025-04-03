package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.Tile;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ITileProviderDelegate extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITileProviderDelegate {
        static final int TRANSACTION_getTile = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITileProviderDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.ITileProviderDelegate
            public Tile getTile(int i, int i2, int i3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeInt(i3);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                Tile tile = (Tile) rve.a(transactAndReadException, Tile.CREATOR);
                transactAndReadException.recycle();
                return tile;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        }

        public static ITileProviderDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            return queryLocalInterface instanceof ITileProviderDelegate ? (ITileProviderDelegate) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            enforceNoDataAvail(parcel);
            Tile tile = getTile(readInt, readInt2, readInt3);
            parcel2.writeNoException();
            rve.e(parcel2, tile);
            return true;
        }
    }

    Tile getTile(int i, int i2, int i3);
}
