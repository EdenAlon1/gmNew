package com.google.android.gms.phenotype.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFlagUpdateListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFlagUpdateListener {
        static final int TRANSACTION_onFlagUpdate = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFlagUpdateListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.phenotype.internal.IFlagUpdateListener");
            }

            @Override // com.google.android.gms.phenotype.internal.IFlagUpdateListener
            public void onFlagUpdate(byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        }

        public static IFlagUpdateListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
            return queryLocalInterface instanceof IFlagUpdateListener ? (IFlagUpdateListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            byte[] createByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            onFlagUpdate(createByteArray);
            return true;
        }
    }

    void onFlagUpdate(byte[] bArr);
}
