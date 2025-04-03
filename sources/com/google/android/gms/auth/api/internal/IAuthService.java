package com.google.android.gms.auth.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.internal.IAuthCallbacks;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAuthService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAuthService {
        static final int TRANSACTION_getSpatulaHeader = 3;
        static final int TRANSACTION_performProxyGrpcRequest = 2;
        static final int TRANSACTION_performProxyRequest = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAuthService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
            }

            @Override // com.google.android.gms.auth.api.internal.IAuthService
            public void getSpatulaHeader(IAuthCallbacks iAuthCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAuthCallbacks);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.internal.IAuthService
            public void performProxyGrpcRequest(IAuthCallbacks iAuthCallbacks, ProxyGrpcRequest proxyGrpcRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAuthCallbacks);
                rve.d(obtainAndWriteInterfaceToken, proxyGrpcRequest);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.api.internal.IAuthService
            public void performProxyRequest(IAuthCallbacks iAuthCallbacks, ProxyRequest proxyRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAuthCallbacks);
                rve.d(obtainAndWriteInterfaceToken, proxyRequest);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.internal.IAuthService");
        }

        public static IAuthService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
            return queryLocalInterface instanceof IAuthService ? (IAuthService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IAuthCallbacks asInterface = IAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ProxyRequest proxyRequest = (ProxyRequest) rve.a(parcel, ProxyRequest.CREATOR);
                enforceNoDataAvail(parcel);
                performProxyRequest(asInterface, proxyRequest);
            } else if (i == 2) {
                IAuthCallbacks asInterface2 = IAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ProxyGrpcRequest proxyGrpcRequest = (ProxyGrpcRequest) rve.a(parcel, ProxyGrpcRequest.CREATOR);
                enforceNoDataAvail(parcel);
                performProxyGrpcRequest(asInterface2, proxyGrpcRequest);
            } else {
                if (i != 3) {
                    return false;
                }
                IAuthCallbacks asInterface3 = IAuthCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getSpatulaHeader(asInterface3);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getSpatulaHeader(IAuthCallbacks iAuthCallbacks);

    void performProxyGrpcRequest(IAuthCallbacks iAuthCallbacks, ProxyGrpcRequest proxyGrpcRequest);

    void performProxyRequest(IAuthCallbacks iAuthCallbacks, ProxyRequest proxyRequest);
}
