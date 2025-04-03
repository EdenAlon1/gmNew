package com.google.android.gms.kids.internal;

import android.database.CursorWindow;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.kids.EnsureSupervisionSetupRequest;
import com.google.android.gms.kids.GetParentVerificationIntentRequest;
import com.google.android.gms.kids.internal.IEnsureSupervisionSetupCallback;
import com.google.android.gms.kids.internal.IGetParentVerificationIntentCallback;
import com.google.android.gms.kids.internal.IKidsCallbacks;
import com.google.android.gms.kids.internal.IScreentimeRestrictionCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IKidsService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IKidsService {
        static final int TRANSACTION_ensureSupervisionSetup = 3010;
        static final int TRANSACTION_getAppliedTimeLimit = 3001;
        static final int TRANSACTION_getAppliedTimeLimitAsync = 3002;
        static final int TRANSACTION_getParentVerificationIntent = 3005;
        static final int TRANSACTION_registerScreentimeRestrictionCallback = 3008;
        static final int TRANSACTION_unregisterScreentimeRestrictionCallback = 3009;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IKidsService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IKidsService");
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public void ensureSupervisionSetup(EnsureSupervisionSetupRequest ensureSupervisionSetupRequest, IEnsureSupervisionSetupCallback iEnsureSupervisionSetupCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, ensureSupervisionSetupRequest);
                rve.f(obtainAndWriteInterfaceToken, iEnsureSupervisionSetupCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_ensureSupervisionSetup, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public CursorWindow getAppliedTimeLimit(ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_getAppliedTimeLimit, obtainAndWriteInterfaceToken);
                CursorWindow cursorWindow = (CursorWindow) rve.a(transactAndReadException, CursorWindow.CREATOR);
                transactAndReadException.recycle();
                return cursorWindow;
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public void getAppliedTimeLimitAsync(IKidsCallbacks iKidsCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iKidsCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getAppliedTimeLimitAsync, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public void getParentVerificationIntent(GetParentVerificationIntentRequest getParentVerificationIntentRequest, IGetParentVerificationIntentCallback iGetParentVerificationIntentCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getParentVerificationIntentRequest);
                rve.f(obtainAndWriteInterfaceToken, iGetParentVerificationIntentCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getParentVerificationIntent, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public void registerScreentimeRestrictionCallback(IScreentimeRestrictionCallback iScreentimeRestrictionCallback, IKidsCallbacks iKidsCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iScreentimeRestrictionCallback);
                rve.f(obtainAndWriteInterfaceToken, iKidsCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_registerScreentimeRestrictionCallback, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public void unregisterScreentimeRestrictionCallback(IScreentimeRestrictionCallback iScreentimeRestrictionCallback, IKidsCallbacks iKidsCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iScreentimeRestrictionCallback);
                rve.f(obtainAndWriteInterfaceToken, iKidsCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_unregisterScreentimeRestrictionCallback, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.kids.internal.IKidsService");
        }

        public static IKidsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IKidsService");
            return queryLocalInterface instanceof IKidsService ? (IKidsService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == TRANSACTION_getAppliedTimeLimit) {
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                CursorWindow appliedTimeLimit = getAppliedTimeLimit(apiMetadata);
                parcel2.writeNoException();
                rve.e(parcel2, appliedTimeLimit);
                return true;
            }
            if (i == TRANSACTION_getAppliedTimeLimitAsync) {
                IKidsCallbacks asInterface = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getAppliedTimeLimitAsync(asInterface, apiMetadata2);
                parcel2.writeNoException();
                return true;
            }
            if (i == TRANSACTION_getParentVerificationIntent) {
                GetParentVerificationIntentRequest getParentVerificationIntentRequest = (GetParentVerificationIntentRequest) rve.a(parcel, GetParentVerificationIntentRequest.CREATOR);
                IGetParentVerificationIntentCallback asInterface2 = IGetParentVerificationIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getParentVerificationIntent(getParentVerificationIntentRequest, asInterface2, apiMetadata3);
                parcel2.writeNoException();
                return true;
            }
            switch (i) {
                case TRANSACTION_registerScreentimeRestrictionCallback /* 3008 */:
                    IScreentimeRestrictionCallback asInterface3 = IScreentimeRestrictionCallback.Stub.asInterface(parcel.readStrongBinder());
                    IKidsCallbacks asInterface4 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    registerScreentimeRestrictionCallback(asInterface3, asInterface4, apiMetadata4);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_unregisterScreentimeRestrictionCallback /* 3009 */:
                    IScreentimeRestrictionCallback asInterface5 = IScreentimeRestrictionCallback.Stub.asInterface(parcel.readStrongBinder());
                    IKidsCallbacks asInterface6 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata5 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterScreentimeRestrictionCallback(asInterface5, asInterface6, apiMetadata5);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_ensureSupervisionSetup /* 3010 */:
                    EnsureSupervisionSetupRequest ensureSupervisionSetupRequest = (EnsureSupervisionSetupRequest) rve.a(parcel, EnsureSupervisionSetupRequest.CREATOR);
                    IEnsureSupervisionSetupCallback asInterface7 = IEnsureSupervisionSetupCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata6 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    ensureSupervisionSetup(ensureSupervisionSetupRequest, asInterface7, apiMetadata6);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void ensureSupervisionSetup(EnsureSupervisionSetupRequest ensureSupervisionSetupRequest, IEnsureSupervisionSetupCallback iEnsureSupervisionSetupCallback, ApiMetadata apiMetadata);

    @Deprecated
    CursorWindow getAppliedTimeLimit(ApiMetadata apiMetadata);

    void getAppliedTimeLimitAsync(IKidsCallbacks iKidsCallbacks, ApiMetadata apiMetadata);

    void getParentVerificationIntent(GetParentVerificationIntentRequest getParentVerificationIntentRequest, IGetParentVerificationIntentCallback iGetParentVerificationIntentCallback, ApiMetadata apiMetadata);

    void registerScreentimeRestrictionCallback(IScreentimeRestrictionCallback iScreentimeRestrictionCallback, IKidsCallbacks iKidsCallbacks, ApiMetadata apiMetadata);

    void unregisterScreentimeRestrictionCallback(IScreentimeRestrictionCallback iScreentimeRestrictionCallback, IKidsCallbacks iKidsCallbacks, ApiMetadata apiMetadata);
}
