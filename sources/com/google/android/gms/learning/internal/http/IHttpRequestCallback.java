package com.google.android.gms.learning.internal.http;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IHttpRequestCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IHttpRequestCallback {
        static final int TRANSACTION_onResponseBody = 4;
        static final int TRANSACTION_onResponseBodyError = 5;
        static final int TRANSACTION_onResponseCompleted = 6;
        static final int TRANSACTION_onResponseError = 3;
        static final int TRANSACTION_onResponseStarted = 2;
        static final int TRANSACTION_readRequestBody = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IHttpRequestCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.http.IHttpRequestCallback");
            }

            @Override // com.google.android.gms.learning.internal.http.IHttpRequestCallback
            public boolean onResponseBody(byte[] bArr, int i, int i2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.learning.internal.http.IHttpRequestCallback
            public void onResponseBodyError(byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.http.IHttpRequestCallback
            public void onResponseCompleted() {
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.learning.internal.http.IHttpRequestCallback
            public void onResponseError(byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.http.IHttpRequestCallback
            public boolean onResponseStarted(byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.learning.internal.http.IHttpRequestCallback
            public boolean readRequestBody(byte[] bArr, long j, int[] iArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                obtainAndWriteInterfaceToken.writeLong(j);
                obtainAndWriteInterfaceToken.writeIntArray(iArr);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.readByteArray(bArr);
                transactAndReadException.readIntArray(iArr);
                transactAndReadException.recycle();
                return g;
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.http.IHttpRequestCallback");
        }

        public static IHttpRequestCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.http.IHttpRequestCallback");
            return queryLocalInterface instanceof IHttpRequestCallback ? (IHttpRequestCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    byte[] createByteArray = parcel.createByteArray();
                    long readLong = parcel.readLong();
                    int[] createIntArray = parcel.createIntArray();
                    enforceNoDataAvail(parcel);
                    boolean readRequestBody = readRequestBody(createByteArray, readLong, createIntArray);
                    parcel2.writeNoException();
                    int i3 = rve.a;
                    parcel2.writeInt(readRequestBody ? 1 : 0);
                    parcel2.writeByteArray(createByteArray);
                    parcel2.writeIntArray(createIntArray);
                    return true;
                case 2:
                    byte[] createByteArray2 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    boolean onResponseStarted = onResponseStarted(createByteArray2);
                    parcel2.writeNoException();
                    int i4 = rve.a;
                    parcel2.writeInt(onResponseStarted ? 1 : 0);
                    return true;
                case 3:
                    byte[] createByteArray3 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    onResponseError(createByteArray3);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    byte[] createByteArray4 = parcel.createByteArray();
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    boolean onResponseBody = onResponseBody(createByteArray4, readInt, readInt2);
                    parcel2.writeNoException();
                    int i5 = rve.a;
                    parcel2.writeInt(onResponseBody ? 1 : 0);
                    return true;
                case 5:
                    byte[] createByteArray5 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    onResponseBodyError(createByteArray5);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onResponseCompleted();
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean onResponseBody(byte[] bArr, int i, int i2);

    void onResponseBodyError(byte[] bArr);

    void onResponseCompleted();

    void onResponseError(byte[] bArr);

    boolean onResponseStarted(byte[] bArr);

    boolean readRequestBody(byte[] bArr, long j, int[] iArr);
}
