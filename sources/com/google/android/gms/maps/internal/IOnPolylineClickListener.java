package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnPolylineClickListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnPolylineClickListener {
        static final int TRANSACTION_onPolylineClick = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnPolylineClickListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnPolylineClickListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnPolylineClickListener
            public void onPolylineClick(IPolylineDelegate iPolylineDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPolylineDelegate);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
        }

        public static IOnPolylineClickListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnPolylineClickListener");
            return queryLocalInterface instanceof IOnPolylineClickListener ? (IOnPolylineClickListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IPolylineDelegate asInterface = IPolylineDelegate.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            onPolylineClick(asInterface);
            parcel2.writeNoException();
            return true;
        }
    }

    void onPolylineClick(IPolylineDelegate iPolylineDelegate);
}
