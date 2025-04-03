package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ICancellationCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICancellationCallback {
        static final int TRANSACTION_cancel = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICancellationCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ICancellationCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ICancellationCallback
            public void cancel() {
                transactOneway(2, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ICancellationCallback");
        }

        public static ICancellationCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ICancellationCallback");
            return queryLocalInterface instanceof ICancellationCallback ? (ICancellationCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            cancel();
            return true;
        }
    }

    void cancel();
}
