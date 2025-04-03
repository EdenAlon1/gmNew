package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ISignInCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISignInCallbacks {
        static final int TRANSACTION_onAuthAccountComplete = 3;
        static final int TRANSACTION_onGetCurrentAccountComplete = 7;
        static final int TRANSACTION_onRecordConsentByConsentResultComplete = 9;
        static final int TRANSACTION_onRecordConsentComplete = 6;
        static final int TRANSACTION_onSaveAccountToSessionStoreComplete = 4;
        static final int TRANSACTION_onSignInComplete = 8;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISignInCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.signin.internal.ISignInCallbacks");
            }

            @Override // com.google.android.gms.signin.internal.ISignInCallbacks
            public void onAuthAccountComplete(ConnectionResult connectionResult, AuthAccountResult authAccountResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, connectionResult);
                rve.d(obtainAndWriteInterfaceToken, authAccountResult);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInCallbacks
            public void onGetCurrentAccountComplete(Status status, GoogleSignInAccount googleSignInAccount) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, googleSignInAccount);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInCallbacks
            public void onRecordConsentByConsentResultComplete(RecordConsentByConsentResultResponse recordConsentByConsentResultResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, recordConsentByConsentResultResponse);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInCallbacks
            public void onRecordConsentComplete(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInCallbacks
            public void onSaveAccountToSessionStoreComplete(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.ISignInCallbacks
            public void onSignInComplete(SignInResponse signInResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, signInResponse);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.signin.internal.ISignInCallbacks");
        }

        public static ISignInCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
            return queryLocalInterface instanceof ISignInCallbacks ? (ISignInCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 3:
                    ConnectionResult connectionResult = (ConnectionResult) rve.a(parcel, ConnectionResult.CREATOR);
                    AuthAccountResult authAccountResult = (AuthAccountResult) rve.a(parcel, AuthAccountResult.CREATOR);
                    enforceNoDataAvail(parcel);
                    onAuthAccountComplete(connectionResult, authAccountResult);
                    break;
                case 4:
                    Status status = (Status) rve.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSaveAccountToSessionStoreComplete(status);
                    break;
                case 5:
                default:
                    return false;
                case 6:
                    Status status2 = (Status) rve.a(parcel, Status.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRecordConsentComplete(status2);
                    break;
                case 7:
                    Status status3 = (Status) rve.a(parcel, Status.CREATOR);
                    GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) rve.a(parcel, GoogleSignInAccount.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetCurrentAccountComplete(status3, googleSignInAccount);
                    break;
                case 8:
                    SignInResponse signInResponse = (SignInResponse) rve.a(parcel, SignInResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSignInComplete(signInResponse);
                    break;
                case 9:
                    RecordConsentByConsentResultResponse recordConsentByConsentResultResponse = (RecordConsentByConsentResultResponse) rve.a(parcel, RecordConsentByConsentResultResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRecordConsentByConsentResultComplete(recordConsentByConsentResultResponse);
                    break;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onAuthAccountComplete(ConnectionResult connectionResult, AuthAccountResult authAccountResult);

    void onGetCurrentAccountComplete(Status status, GoogleSignInAccount googleSignInAccount);

    void onRecordConsentByConsentResultComplete(RecordConsentByConsentResultResponse recordConsentByConsentResultResponse);

    void onRecordConsentComplete(Status status);

    void onSaveAccountToSessionStoreComplete(Status status);

    void onSignInComplete(SignInResponse signInResponse);
}
