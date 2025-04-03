package com.google.android.gms.learning.internal.http;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.learning.internal.http.IHttpRequestCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IHttpRequestHandle extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IHttpRequestHandle {
        static final int TRANSACTION_close = 5;
        static final int TRANSACTION_getTotalSentReceivedBytes = 4;
        static final int TRANSACTION_performRequest = 2;
        static final int TRANSACTION_waitForRequestCompletion = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IHttpRequestHandle {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.http.IHttpRequestHandle");
            }

            @Override // com.google.android.gms.learning.internal.http.IHttpRequestHandle
            public void close() {
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.learning.internal.http.IHttpRequestHandle
            public byte[] getTotalSentReceivedBytes() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                byte[] createByteArray = transactAndReadException.createByteArray();
                transactAndReadException.recycle();
                return createByteArray;
            }

            @Override // com.google.android.gms.learning.internal.http.IHttpRequestHandle
            public void performRequest(IHttpRequestCallback iHttpRequestCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iHttpRequestCallback);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.http.IHttpRequestHandle
            public void waitForRequestCompletion() {
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.http.IHttpRequestHandle");
        }

        public static IHttpRequestHandle asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.http.IHttpRequestHandle");
            return queryLocalInterface instanceof IHttpRequestHandle ? (IHttpRequestHandle) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                IHttpRequestCallback asInterface = IHttpRequestCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                performRequest(asInterface);
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                waitForRequestCompletion();
                parcel2.writeNoException();
                return true;
            }
            if (i == 4) {
                byte[] totalSentReceivedBytes = getTotalSentReceivedBytes();
                parcel2.writeNoException();
                parcel2.writeByteArray(totalSentReceivedBytes);
                return true;
            }
            if (i != 5) {
                return false;
            }
            close();
            parcel2.writeNoException();
            return true;
        }
    }

    void close();

    byte[] getTotalSentReceivedBytes();

    void performRequest(IHttpRequestCallback iHttpRequestCallback);

    void waitForRequestCompletion();
}
