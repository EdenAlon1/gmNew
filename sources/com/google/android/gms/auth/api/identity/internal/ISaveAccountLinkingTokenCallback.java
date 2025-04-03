package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISaveAccountLinkingTokenCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISaveAccountLinkingTokenCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISaveAccountLinkingTokenCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback
            public void onResult(Status status, SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, saveAccountLinkingTokenResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
        }

        public static ISaveAccountLinkingTokenCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
            return queryLocalInterface instanceof ISaveAccountLinkingTokenCallback ? (ISaveAccountLinkingTokenCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            SaveAccountLinkingTokenResult saveAccountLinkingTokenResult = (SaveAccountLinkingTokenResult) rve.a(parcel, SaveAccountLinkingTokenResult.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, saveAccountLinkingTokenResult);
            return true;
        }
    }

    void onResult(Status status, SaveAccountLinkingTokenResult saveAccountLinkingTokenResult);
}
