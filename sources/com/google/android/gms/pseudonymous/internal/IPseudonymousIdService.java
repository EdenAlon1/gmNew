package com.google.android.gms.pseudonymous.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.android.gms.pseudonymous.SessionZwiebackToken;
import com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IPseudonymousIdService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IPseudonymousIdService {
        static final int TRANSACTION_getLastResetWallTimeMs = 3;
        static final int TRANSACTION_getSessionZwiebackTokens = 4;
        static final int TRANSACTION_getToken = 1;
        static final int TRANSACTION_setSessionZwiebackTokens = 5;
        static final int TRANSACTION_setToken = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IPseudonymousIdService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdService
            public void getLastResetWallTimeMs(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPseudonymousIdCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdService
            public void getSessionZwiebackTokens(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, List<String> list, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPseudonymousIdCallbacks);
                obtainAndWriteInterfaceToken.writeStringList(list);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdService
            public void getToken(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPseudonymousIdCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdService
            public void setSessionZwiebackTokens(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, List<SessionZwiebackToken> list, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPseudonymousIdCallbacks);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.pseudonymous.internal.IPseudonymousIdService
            public void setToken(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, PseudonymousIdToken pseudonymousIdToken, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iPseudonymousIdCallbacks);
                rve.d(obtainAndWriteInterfaceToken, pseudonymousIdToken);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
        }

        public static IPseudonymousIdService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
            return queryLocalInterface instanceof IPseudonymousIdService ? (IPseudonymousIdService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IPseudonymousIdCallbacks asInterface = IPseudonymousIdCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getToken(asInterface, apiMetadata);
            } else if (i == 2) {
                IPseudonymousIdCallbacks asInterface2 = IPseudonymousIdCallbacks.Stub.asInterface(parcel.readStrongBinder());
                PseudonymousIdToken pseudonymousIdToken = (PseudonymousIdToken) rve.a(parcel, PseudonymousIdToken.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                setToken(asInterface2, pseudonymousIdToken, apiMetadata2);
            } else if (i == 3) {
                IPseudonymousIdCallbacks asInterface3 = IPseudonymousIdCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getLastResetWallTimeMs(asInterface3, apiMetadata3);
            } else if (i == 4) {
                IPseudonymousIdCallbacks asInterface4 = IPseudonymousIdCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getSessionZwiebackTokens(asInterface4, createStringArrayList, apiMetadata4);
            } else {
                if (i != 5) {
                    return false;
                }
                IPseudonymousIdCallbacks asInterface5 = IPseudonymousIdCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ArrayList createTypedArrayList = parcel.createTypedArrayList(SessionZwiebackToken.CREATOR);
                ApiMetadata apiMetadata5 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                setSessionZwiebackTokens(asInterface5, createTypedArrayList, apiMetadata5);
            }
            return true;
        }
    }

    @Deprecated
    void getLastResetWallTimeMs(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, ApiMetadata apiMetadata);

    void getSessionZwiebackTokens(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, List<String> list, ApiMetadata apiMetadata);

    void getToken(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, ApiMetadata apiMetadata);

    void setSessionZwiebackTokens(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, List<SessionZwiebackToken> list, ApiMetadata apiMetadata);

    void setToken(IPseudonymousIdCallbacks iPseudonymousIdCallbacks, PseudonymousIdToken pseudonymousIdToken, ApiMetadata apiMetadata);
}
