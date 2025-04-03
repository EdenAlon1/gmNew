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
public interface IOnMarkerDragListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnMarkerDragListener {
        static final int TRANSACTION_onMarkerDrag = 2;
        static final int TRANSACTION_onMarkerDragEnd = 3;
        static final int TRANSACTION_onMarkerDragStart = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnMarkerDragListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnMarkerDragListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnMarkerDragListener
            public void onMarkerDrag(IMarkerDelegate iMarkerDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMarkerDelegate);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IOnMarkerDragListener
            public void onMarkerDragEnd(IMarkerDelegate iMarkerDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMarkerDelegate);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IOnMarkerDragListener
            public void onMarkerDragStart(IMarkerDelegate iMarkerDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMarkerDelegate);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
        }

        public static IOnMarkerDragListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerDragListener");
            return queryLocalInterface instanceof IOnMarkerDragListener ? (IOnMarkerDragListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IMarkerDelegate asInterface = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onMarkerDragStart(asInterface);
            } else if (i == 2) {
                IMarkerDelegate asInterface2 = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onMarkerDrag(asInterface2);
            } else {
                if (i != 3) {
                    return false;
                }
                IMarkerDelegate asInterface3 = IMarkerDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onMarkerDragEnd(asInterface3);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onMarkerDrag(IMarkerDelegate iMarkerDelegate);

    void onMarkerDragEnd(IMarkerDelegate iMarkerDelegate);

    void onMarkerDragStart(IMarkerDelegate iMarkerDelegate);
}
