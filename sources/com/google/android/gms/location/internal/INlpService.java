package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.location.NlpLocationRequest;
import com.google.android.gms.location.internal.ILocationStatusCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface INlpService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements INlpService {
        static final int TRANSACTION_getCellBasedLocation = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements INlpService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.internal.INlpService");
            }

            @Override // com.google.android.gms.location.internal.INlpService
            public void getCellBasedLocation(NlpLocationRequest nlpLocationRequest, ILocationStatusCallback iLocationStatusCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, nlpLocationRequest);
                rve.f(obtainAndWriteInterfaceToken, iLocationStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.location.internal.INlpService");
        }

        public static INlpService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.INlpService");
            return queryLocalInterface instanceof INlpService ? (INlpService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            NlpLocationRequest nlpLocationRequest = (NlpLocationRequest) rve.a(parcel, NlpLocationRequest.CREATOR);
            ILocationStatusCallback asInterface = ILocationStatusCallback.Stub.asInterface(parcel.readStrongBinder());
            ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
            enforceNoDataAvail(parcel);
            getCellBasedLocation(nlpLocationRequest, asInterface, apiMetadata);
            parcel2.writeNoException();
            return true;
        }
    }

    void getCellBasedLocation(NlpLocationRequest nlpLocationRequest, ILocationStatusCallback iLocationStatusCallback, ApiMetadata apiMetadata);
}
