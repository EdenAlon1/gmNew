package com.google.android.gms.learning.internal.http;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.learning.internal.http.IHttpRequestHandle;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IHttpRequestHandleFactory extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IHttpRequestHandleFactory {
        static final int TRANSACTION_create = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IHttpRequestHandleFactory {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.http.IHttpRequestHandleFactory");
            }

            @Override // com.google.android.gms.learning.internal.http.IHttpRequestHandleFactory
            public IHttpRequestHandle create(byte[] bArr, IObjectWrapper iObjectWrapper, int i, int i2, double d) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeDouble(d);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                IHttpRequestHandle asInterface = IHttpRequestHandle.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.http.IHttpRequestHandleFactory");
        }

        public static IHttpRequestHandleFactory asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.http.IHttpRequestHandleFactory");
            return queryLocalInterface instanceof IHttpRequestHandleFactory ? (IHttpRequestHandleFactory) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            byte[] createByteArray = parcel.createByteArray();
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            double readDouble = parcel.readDouble();
            enforceNoDataAvail(parcel);
            IHttpRequestHandle create = create(createByteArray, asInterface, readInt, readInt2, readDouble);
            parcel2.writeNoException();
            rve.f(parcel2, create);
            return true;
        }
    }

    IHttpRequestHandle create(byte[] bArr, IObjectWrapper iObjectWrapper, int i, int i2, double d);
}
