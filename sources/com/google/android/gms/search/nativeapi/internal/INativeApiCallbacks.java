package com.google.android.gms.search.nativeapi.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.search.nativeapi.GetNativeApiInfoCall$Response;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface INativeApiCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements INativeApiCallbacks {
        static final int TRANSACTION_onGetNativeApiInfoResponse = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements INativeApiCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.nativeapi.internal.INativeApiCallbacks");
            }

            @Override // com.google.android.gms.search.nativeapi.internal.INativeApiCallbacks
            public void onGetNativeApiInfoResponse(GetNativeApiInfoCall$Response getNativeApiInfoCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getNativeApiInfoCall$Response);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.nativeapi.internal.INativeApiCallbacks");
        }

        public static INativeApiCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.nativeapi.internal.INativeApiCallbacks");
            return queryLocalInterface instanceof INativeApiCallbacks ? (INativeApiCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            GetNativeApiInfoCall$Response getNativeApiInfoCall$Response = (GetNativeApiInfoCall$Response) rve.a(parcel, GetNativeApiInfoCall$Response.CREATOR);
            enforceNoDataAvail(parcel);
            onGetNativeApiInfoResponse(getNativeApiInfoCall$Response);
            return true;
        }
    }

    void onGetNativeApiInfoResponse(GetNativeApiInfoCall$Response getNativeApiInfoCall$Response);
}
