package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnIndoorStateChangeListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnIndoorStateChangeListener {
        static final int TRANSACTION_onIndoorBuildingFocused = 1;
        static final int TRANSACTION_onIndoorLevelActivated = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnIndoorStateChangeListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
            }

            @Override // com.google.android.gms.maps.internal.IOnIndoorStateChangeListener
            public void onIndoorBuildingFocused() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IOnIndoorStateChangeListener
            public void onIndoorLevelActivated(IIndoorBuildingDelegate iIndoorBuildingDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iIndoorBuildingDelegate);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
        }

        public static IOnIndoorStateChangeListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
            return queryLocalInterface instanceof IOnIndoorStateChangeListener ? (IOnIndoorStateChangeListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                onIndoorBuildingFocused();
            } else {
                if (i != 2) {
                    return false;
                }
                IIndoorBuildingDelegate asInterface = IIndoorBuildingDelegate.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onIndoorLevelActivated(asInterface);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onIndoorBuildingFocused();

    void onIndoorLevelActivated(IIndoorBuildingDelegate iIndoorBuildingDelegate);
}
