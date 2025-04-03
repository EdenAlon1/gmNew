package com.google.android.gms.wallet.fragment.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IWalletFragmentStateListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IWalletFragmentStateListener {
        static final int TRANSACTION_onStateChanged = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IWalletFragmentStateListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener
            public void onStateChanged(int i, int i2, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
        }

        public static IWalletFragmentStateListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener");
            return queryLocalInterface instanceof IWalletFragmentStateListener ? (IWalletFragmentStateListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            onStateChanged(readInt, readInt2, bundle);
            parcel2.writeNoException();
            return true;
        }
    }

    void onStateChanged(int i, int i2, Bundle bundle);
}
