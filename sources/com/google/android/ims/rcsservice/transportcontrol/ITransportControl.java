package com.google.android.ims.rcsservice.transportcontrol;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ITransportControl extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITransportControl {
        static final int TRANSACTION_useTransport = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITransportControl {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.transportcontrol.ITransportControl");
            }

            @Override // com.google.android.ims.rcsservice.transportcontrol.ITransportControl
            public TransportControlServiceResult useTransport(TransportOptions transportOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, transportOptions);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                TransportControlServiceResult transportControlServiceResult = (TransportControlServiceResult) rve.a(transactAndReadException, TransportControlServiceResult.CREATOR);
                transactAndReadException.recycle();
                return transportControlServiceResult;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.transportcontrol.ITransportControl");
        }

        public static ITransportControl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.transportcontrol.ITransportControl");
            return queryLocalInterface instanceof ITransportControl ? (ITransportControl) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            TransportOptions transportOptions = (TransportOptions) rve.a(parcel, TransportOptions.CREATOR);
            enforceNoDataAvail(parcel);
            TransportControlServiceResult useTransport = useTransport(transportOptions);
            parcel2.writeNoException();
            rve.e(parcel2, useTransport);
            return true;
        }
    }

    TransportControlServiceResult useTransport(TransportOptions transportOptions);
}
