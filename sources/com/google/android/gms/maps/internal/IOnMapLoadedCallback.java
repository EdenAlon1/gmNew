package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnMapLoadedCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnMapLoadedCallback {
        static final int TRANSACTION_onMapLoaded = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnMapLoadedCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IOnMapLoadedCallback");
            }

            @Override // com.google.android.gms.maps.internal.IOnMapLoadedCallback
            public void onMapLoaded() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
        }

        public static IOnMapLoadedCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLoadedCallback");
            return queryLocalInterface instanceof IOnMapLoadedCallback ? (IOnMapLoadedCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            onMapLoaded();
            parcel2.writeNoException();
            return true;
        }
    }

    void onMapLoaded();
}
