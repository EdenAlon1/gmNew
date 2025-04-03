package com.google.android.gms.auth.folsom.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IByteArrayListCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IByteArrayListCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IByteArrayListCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.folsom.internal.IByteArrayListCallback");
            }

            @Override // com.google.android.gms.auth.folsom.internal.IByteArrayListCallback
            public void onResult(Status status, List<byte[]> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeList(list);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.folsom.internal.IByteArrayListCallback");
        }

        public static IByteArrayListCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IByteArrayListCallback");
            return queryLocalInterface instanceof IByteArrayListCallback ? (IByteArrayListCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            ArrayList b = rve.b(parcel);
            enforceNoDataAvail(parcel);
            onResult(status, b);
            return true;
        }
    }

    void onResult(Status status, List<byte[]> list);
}
