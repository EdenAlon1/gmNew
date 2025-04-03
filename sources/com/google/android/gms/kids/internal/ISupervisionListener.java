package com.google.android.gms.kids.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISupervisionListener extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISupervisionListener {
        static final int TRANSACTION_onSupervisionExited = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISupervisionListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.ISupervisionListener");
            }

            @Override // com.google.android.gms.kids.internal.ISupervisionListener
            public void onSupervisionExited() {
                transactOneway(1, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.kids.internal.ISupervisionListener");
        }

        public static ISupervisionListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.ISupervisionListener");
            return queryLocalInterface instanceof ISupervisionListener ? (ISupervisionListener) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            onSupervisionExited();
            return true;
        }
    }

    void onSupervisionExited();
}
