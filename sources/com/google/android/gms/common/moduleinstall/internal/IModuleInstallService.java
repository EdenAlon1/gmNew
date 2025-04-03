package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks;
import com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IModuleInstallService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IModuleInstallService {
        static final int TRANSACTION_areModulesAvailable = 1;
        static final int TRANSACTION_getInstallModulesIntent = 3;
        static final int TRANSACTION_installModules = 2;
        static final int TRANSACTION_releaseModules = 4;
        static final int TRANSACTION_unregisterListener = 6;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IModuleInstallService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
            }

            @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallService
            public void areModulesAvailable(IModuleInstallCallbacks iModuleInstallCallbacks, ApiFeatureRequest apiFeatureRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iModuleInstallCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiFeatureRequest);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallService
            public void getInstallModulesIntent(IModuleInstallCallbacks iModuleInstallCallbacks, ApiFeatureRequest apiFeatureRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iModuleInstallCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiFeatureRequest);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallService
            public void installModules(IModuleInstallCallbacks iModuleInstallCallbacks, ApiFeatureRequest apiFeatureRequest, IModuleInstallStatusListener iModuleInstallStatusListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iModuleInstallCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiFeatureRequest);
                rve.f(obtainAndWriteInterfaceToken, iModuleInstallStatusListener);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallService
            public void releaseModules(IStatusCallback iStatusCallback, ApiFeatureRequest apiFeatureRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, apiFeatureRequest);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.moduleinstall.internal.IModuleInstallService
            public void unregisterListener(IStatusCallback iStatusCallback, IModuleInstallStatusListener iModuleInstallStatusListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.f(obtainAndWriteInterfaceToken, iModuleInstallStatusListener);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        }

        public static IModuleInstallService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
            return queryLocalInterface instanceof IModuleInstallService ? (IModuleInstallService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IModuleInstallCallbacks asInterface = IModuleInstallCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) rve.a(parcel, ApiFeatureRequest.CREATOR);
                enforceNoDataAvail(parcel);
                areModulesAvailable(asInterface, apiFeatureRequest);
            } else if (i == 2) {
                IModuleInstallCallbacks asInterface2 = IModuleInstallCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiFeatureRequest apiFeatureRequest2 = (ApiFeatureRequest) rve.a(parcel, ApiFeatureRequest.CREATOR);
                IModuleInstallStatusListener asInterface3 = IModuleInstallStatusListener.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                installModules(asInterface2, apiFeatureRequest2, asInterface3);
            } else if (i == 3) {
                IModuleInstallCallbacks asInterface4 = IModuleInstallCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiFeatureRequest apiFeatureRequest3 = (ApiFeatureRequest) rve.a(parcel, ApiFeatureRequest.CREATOR);
                enforceNoDataAvail(parcel);
                getInstallModulesIntent(asInterface4, apiFeatureRequest3);
            } else if (i == 4) {
                IStatusCallback asInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                ApiFeatureRequest apiFeatureRequest4 = (ApiFeatureRequest) rve.a(parcel, ApiFeatureRequest.CREATOR);
                enforceNoDataAvail(parcel);
                releaseModules(asInterface5, apiFeatureRequest4);
            } else {
                if (i != 6) {
                    return false;
                }
                IStatusCallback asInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                IModuleInstallStatusListener asInterface7 = IModuleInstallStatusListener.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                unregisterListener(asInterface6, asInterface7);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void areModulesAvailable(IModuleInstallCallbacks iModuleInstallCallbacks, ApiFeatureRequest apiFeatureRequest);

    void getInstallModulesIntent(IModuleInstallCallbacks iModuleInstallCallbacks, ApiFeatureRequest apiFeatureRequest);

    void installModules(IModuleInstallCallbacks iModuleInstallCallbacks, ApiFeatureRequest apiFeatureRequest, IModuleInstallStatusListener iModuleInstallStatusListener);

    void releaseModules(IStatusCallback iStatusCallback, ApiFeatureRequest apiFeatureRequest);

    void unregisterListener(IStatusCallback iStatusCallback, IModuleInstallStatusListener iModuleInstallStatusListener);
}
