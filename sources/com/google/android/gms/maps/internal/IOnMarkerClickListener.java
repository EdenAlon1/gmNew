package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnMarkerClickListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnMarkerClickListener {
        static final int TRANSACTION_onMarkerClick = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnMarkerClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnMarkerClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnMarkerClickListener
            public boolean onMarkerClick(IMarkerDelegate iMarkerDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMarkerDelegate);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
        }

        public static IOnMarkerClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
            return queryLocalInterface instanceof IOnMarkerClickListener ? (IOnMarkerClickListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IMarkerDelegate asInterface = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            boolean onMarkerClick = onMarkerClick(asInterface);
            parcel2.writeNoException();
            int i3 = rve.a;
            parcel2.writeInt(onMarkerClick ? 1 : 0);
            return true;
        }
    }

    boolean onMarkerClick(IMarkerDelegate iMarkerDelegate);
}
