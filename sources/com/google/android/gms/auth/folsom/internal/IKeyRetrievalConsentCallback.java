package com.google.android.gms.auth.folsom.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IKeyRetrievalConsentCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IKeyRetrievalConsentCallback {
        static final int TRANSACTION_onConsentResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IKeyRetrievalConsentCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback");
            }

            @Override // com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback
            public void onConsentResult(Status status, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback");
        }

        public static IKeyRetrievalConsentCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.folsom.internal.IKeyRetrievalConsentCallback");
            return queryLocalInterface instanceof IKeyRetrievalConsentCallback ? (IKeyRetrievalConsentCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            boolean g = rve.g(parcel);
            enforceNoDataAvail(parcel);
            onConsentResult(status, g);
            return true;
        }
    }

    void onConsentResult(Status status, boolean z);
}
