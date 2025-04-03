package com.google.android.apps.tachyon.telecom;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.apps.tachyon.telecom.IHandoverFallbackSource;
import com.google.android.apps.tachyon.telecom.IHandoverFallbackTarget;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ITelecomFallbackService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITelecomFallbackService {
        static final int TRANSACTION_requestHandover = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITelecomFallbackService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tachyon.telecom.ITelecomFallbackService");
            }

            @Override // com.google.android.apps.tachyon.telecom.ITelecomFallbackService
            public IHandoverFallbackTarget requestHandover(IHandoverFallbackSource iHandoverFallbackSource, Uri uri, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iHandoverFallbackSource);
                rve.d(obtainAndWriteInterfaceToken, uri);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                IHandoverFallbackTarget asInterface = IHandoverFallbackTarget.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.android.apps.tachyon.telecom.ITelecomFallbackService");
        }

        public static ITelecomFallbackService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tachyon.telecom.ITelecomFallbackService");
            return queryLocalInterface instanceof ITelecomFallbackService ? (ITelecomFallbackService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IHandoverFallbackSource asInterface = IHandoverFallbackSource.Stub.asInterface(parcel.readStrongBinder());
            Uri uri = (Uri) rve.a(parcel, Uri.CREATOR);
            Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            IHandoverFallbackTarget requestHandover = requestHandover(asInterface, uri, bundle);
            parcel2.writeNoException();
            rve.f(parcel2, requestHandover);
            return true;
        }
    }

    IHandoverFallbackTarget requestHandover(IHandoverFallbackSource iHandoverFallbackSource, Uri uri, Bundle bundle);
}
