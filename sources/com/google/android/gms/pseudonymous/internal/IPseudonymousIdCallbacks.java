package com.google.android.gms.pseudonymous.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.android.gms.pseudonymous.SessionZwiebackToken;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IPseudonymousIdCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPseudonymousIdCallbacks {
        static final int TRANSACTION_onGetLastResetWallTimeMs = 3;
        static final int TRANSACTION_onSessionZwiebackTokensRetrieved = 4;
        static final int TRANSACTION_onSetSessionZwiebackTokens = 5;
        static final int TRANSACTION_onSetToken = 2;
        static final int TRANSACTION_onTokenRetrieved = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPseudonymousIdCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
            public void onGetLastResetWallTimeMs(Status status, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
            public void onSessionZwiebackTokensRetrieved(Status status, List<SessionZwiebackToken> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
            public void onSetSessionZwiebackTokens(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
            public void onSetToken(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks
            public void onTokenRetrieved(Status status, PseudonymousIdToken pseudonymousIdToken) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, pseudonymousIdToken);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
        }

        public static IPseudonymousIdCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
            return queryLocalInterface instanceof IPseudonymousIdCallbacks ? (IPseudonymousIdCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) rve.a(parcel, Status.CREATOR);
                PseudonymousIdToken pseudonymousIdToken = (PseudonymousIdToken) rve.a(parcel, PseudonymousIdToken.CREATOR);
                enforceNoDataAvail(parcel);
                onTokenRetrieved(status, pseudonymousIdToken);
            } else if (i == 2) {
                Status status2 = (Status) rve.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onSetToken(status2);
            } else if (i == 3) {
                Status status3 = (Status) rve.a(parcel, Status.CREATOR);
                long readLong = parcel.readLong();
                enforceNoDataAvail(parcel);
                onGetLastResetWallTimeMs(status3, readLong);
            } else if (i == 4) {
                Status status4 = (Status) rve.a(parcel, Status.CREATOR);
                ArrayList createTypedArrayList = parcel.createTypedArrayList(SessionZwiebackToken.CREATOR);
                enforceNoDataAvail(parcel);
                onSessionZwiebackTokensRetrieved(status4, createTypedArrayList);
            } else {
                if (i != 5) {
                    return false;
                }
                Status status5 = (Status) rve.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onSetSessionZwiebackTokens(status5);
            }
            return true;
        }
    }

    void onGetLastResetWallTimeMs(Status status, long j);

    void onSessionZwiebackTokensRetrieved(Status status, List<SessionZwiebackToken> list);

    void onSetSessionZwiebackTokens(Status status);

    void onSetToken(Status status);

    void onTokenRetrieved(Status status, PseudonymousIdToken pseudonymousIdToken);
}
