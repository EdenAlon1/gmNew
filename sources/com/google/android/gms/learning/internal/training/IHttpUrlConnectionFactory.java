package com.google.android.gms.learning.internal.training;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IHttpUrlConnectionFactory extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IHttpUrlConnectionFactory {
        static final int TRANSACTION_allowFallbackToDefault = 3;
        static final int TRANSACTION_createUrlConnection = 2;
        static final int TRANSACTION_initialize = 1;
        static final int TRANSACTION_requestEnableQuic = 6;
        static final int TRANSACTION_supportAcceptEncodingHeader = 4;
        static final int TRANSACTION_supportSetConnectTimeoutMs = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IHttpUrlConnectionFactory {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory");
            }

            @Override // com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory
            public boolean allowFallbackToDefault() {
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory
            public IObjectWrapper createUrlConnection(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory
            public boolean initialize() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory
            public void requestEnableQuic(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory
            public boolean supportAcceptEncodingHeader() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory
            public boolean supportSetConnectTimeoutMs() {
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory");
        }

        public static IHttpUrlConnectionFactory asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory");
            return queryLocalInterface instanceof IHttpUrlConnectionFactory ? (IHttpUrlConnectionFactory) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    boolean initialize = initialize();
                    parcel2.writeNoException();
                    int i3 = rve.a;
                    parcel2.writeInt(initialize ? 1 : 0);
                    return true;
                case 2:
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper createUrlConnection = createUrlConnection(readString);
                    parcel2.writeNoException();
                    rve.f(parcel2, createUrlConnection);
                    return true;
                case 3:
                    boolean allowFallbackToDefault = allowFallbackToDefault();
                    parcel2.writeNoException();
                    int i4 = rve.a;
                    parcel2.writeInt(allowFallbackToDefault ? 1 : 0);
                    return true;
                case 4:
                    boolean supportAcceptEncodingHeader = supportAcceptEncodingHeader();
                    parcel2.writeNoException();
                    int i5 = rve.a;
                    parcel2.writeInt(supportAcceptEncodingHeader ? 1 : 0);
                    return true;
                case 5:
                    boolean supportSetConnectTimeoutMs = supportSetConnectTimeoutMs();
                    parcel2.writeNoException();
                    int i6 = rve.a;
                    parcel2.writeInt(supportSetConnectTimeoutMs ? 1 : 0);
                    return true;
                case 6:
                    boolean g = rve.g(parcel);
                    enforceNoDataAvail(parcel);
                    requestEnableQuic(g);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean allowFallbackToDefault();

    IObjectWrapper createUrlConnection(String str);

    boolean initialize();

    void requestEnableQuic(boolean z);

    boolean supportAcceptEncodingHeader();

    boolean supportSetConnectTimeoutMs();
}
