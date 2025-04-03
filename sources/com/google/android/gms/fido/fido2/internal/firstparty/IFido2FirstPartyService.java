package com.google.android.gms.fido.fido2.internal.firstparty;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.fido2.api.IByteArrayCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFido2FirstPartyService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFido2FirstPartyService {
        static final int TRANSACTION_getLinkInfo = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFido2FirstPartyService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.internal.firstparty.IFido2FirstPartyService");
            }

            @Override // com.google.android.gms.fido.fido2.internal.firstparty.IFido2FirstPartyService
            public void getLinkInfo(IByteArrayCallback iByteArrayCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iByteArrayCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.internal.firstparty.IFido2FirstPartyService");
        }

        public static IFido2FirstPartyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.firstparty.IFido2FirstPartyService");
            return queryLocalInterface instanceof IFido2FirstPartyService ? (IFido2FirstPartyService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IByteArrayCallback asInterface = IByteArrayCallback.Stub.asInterface(parcel.readStrongBinder());
            ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
            enforceNoDataAvail(parcel);
            getLinkInfo(asInterface, apiMetadata);
            parcel2.writeNoException();
            return true;
        }
    }

    void getLinkInfo(IByteArrayCallback iByteArrayCallback, ApiMetadata apiMetadata);
}
