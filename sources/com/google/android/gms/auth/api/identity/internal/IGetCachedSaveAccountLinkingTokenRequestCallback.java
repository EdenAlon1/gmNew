package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGetCachedSaveAccountLinkingTokenRequestCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGetCachedSaveAccountLinkingTokenRequestCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGetCachedSaveAccountLinkingTokenRequestCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback
            public void onResult(Status status, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, saveAccountLinkingTokenRequest);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback");
        }

        public static IGetCachedSaveAccountLinkingTokenRequestCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IGetCachedSaveAccountLinkingTokenRequestCallback");
            return queryLocalInterface instanceof IGetCachedSaveAccountLinkingTokenRequestCallback ? (IGetCachedSaveAccountLinkingTokenRequestCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) rve.a(parcel, SaveAccountLinkingTokenRequest.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(status, saveAccountLinkingTokenRequest);
            return true;
        }
    }

    void onResult(Status status, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest);
}
