package com.google.android.gms.time.trustedtime.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.time.trustedtime.internal.IOnLatestTimeSignalCallback;
import com.google.android.gms.time.trustedtime.internal.IOnRetrieveGlobalStateCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ITrustedTimeService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITrustedTimeService {
        static final int TRANSACTION_getLatestTimeSignal = 4;
        static final int TRANSACTION_retrieveGlobalState = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITrustedTimeService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.time.trustedtime.internal.ITrustedTimeService");
            }

            @Override // com.google.android.gms.time.trustedtime.internal.ITrustedTimeService
            public void getLatestTimeSignal(IOnLatestTimeSignalCallback iOnLatestTimeSignalCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iOnLatestTimeSignalCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.time.trustedtime.internal.ITrustedTimeService
            public void retrieveGlobalState(IOnRetrieveGlobalStateCallback iOnRetrieveGlobalStateCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iOnRetrieveGlobalStateCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.time.trustedtime.internal.ITrustedTimeService");
        }

        public static ITrustedTimeService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.time.trustedtime.internal.ITrustedTimeService");
            return queryLocalInterface instanceof ITrustedTimeService ? (ITrustedTimeService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IOnRetrieveGlobalStateCallback asInterface = IOnRetrieveGlobalStateCallback.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                retrieveGlobalState(asInterface, apiMetadata);
            } else {
                if (i != 4) {
                    return false;
                }
                IOnLatestTimeSignalCallback asInterface2 = IOnLatestTimeSignalCallback.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getLatestTimeSignal(asInterface2, apiMetadata2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getLatestTimeSignal(IOnLatestTimeSignalCallback iOnLatestTimeSignalCallback, ApiMetadata apiMetadata);

    void retrieveGlobalState(IOnRetrieveGlobalStateCallback iOnRetrieveGlobalStateCallback, ApiMetadata apiMetadata);
}
