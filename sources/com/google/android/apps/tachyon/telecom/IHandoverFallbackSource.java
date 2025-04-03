package com.google.android.apps.tachyon.telecom;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IHandoverFallbackSource extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IHandoverFallbackSource {
        static final int TRANSACTION_disconnect = 1;
        static final int TRANSACTION_onTargetDisconnected = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IHandoverFallbackSource {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tachyon.telecom.IHandoverFallbackSource");
            }

            @Override // com.google.android.apps.tachyon.telecom.IHandoverFallbackSource
            public void disconnect() {
                transactOneway(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.apps.tachyon.telecom.IHandoverFallbackSource
            public void onTargetDisconnected() {
                transactOneway(2, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.apps.tachyon.telecom.IHandoverFallbackSource");
        }

        public static IHandoverFallbackSource asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tachyon.telecom.IHandoverFallbackSource");
            return queryLocalInterface instanceof IHandoverFallbackSource ? (IHandoverFallbackSource) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                disconnect();
            } else {
                if (i != 2) {
                    return false;
                }
                onTargetDisconnected();
            }
            return true;
        }
    }

    void disconnect();

    void onTargetDisconnected();
}
