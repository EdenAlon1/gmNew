package com.google.android.gms.auth.api.phone.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.phone.IncomingCallRetrieverRequest;
import com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IMissedCallRetrieverService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMissedCallRetrieverService {
        static final int TRANSACTION_startMissedCallRetriever = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMissedCallRetrieverService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverService");
            }

            @Override // com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverService
            public void startMissedCallRetriever(IMissedCallRetrieverCallbacks iMissedCallRetrieverCallbacks, IncomingCallRetrieverRequest incomingCallRetrieverRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iMissedCallRetrieverCallbacks);
                rve.d(obtainAndWriteInterfaceToken, incomingCallRetrieverRequest);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverService");
        }

        public static IMissedCallRetrieverService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverService");
            return queryLocalInterface instanceof IMissedCallRetrieverService ? (IMissedCallRetrieverService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IMissedCallRetrieverCallbacks asInterface = IMissedCallRetrieverCallbacks.Stub.asInterface(parcel.readStrongBinder());
            IncomingCallRetrieverRequest incomingCallRetrieverRequest = (IncomingCallRetrieverRequest) rve.a(parcel, IncomingCallRetrieverRequest.CREATOR);
            enforceNoDataAvail(parcel);
            startMissedCallRetriever(asInterface, incomingCallRetrieverRequest);
            parcel2.writeNoException();
            return true;
        }
    }

    void startMissedCallRetriever(IMissedCallRetrieverCallbacks iMissedCallRetrieverCallbacks, IncomingCallRetrieverRequest incomingCallRetrieverRequest);
}
