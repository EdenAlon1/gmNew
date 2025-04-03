package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IRpcResponseCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IRpcResponseCallback {
        static final int TRANSACTION_onResponse = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IRpcResponseCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback");
            }

            @Override // com.google.android.gms.wearable.internal.IRpcResponseCallback
            public void onResponse(boolean z, byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wearable.internal.IRpcResponseCallback");
        }

        public static IRpcResponseCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IRpcResponseCallback");
            return queryLocalInterface instanceof IRpcResponseCallback ? (IRpcResponseCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            boolean g = rve.g(parcel);
            byte[] createByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            onResponse(g, createByteArray);
            return true;
        }
    }

    void onResponse(boolean z, byte[] bArr);
}
