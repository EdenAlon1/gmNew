package com.google.android.gms.auth.frp.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.auth.frp.FrpUnlockResponse;
import com.google.android.gms.auth.frp.UnlockForWearResponse;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFrpCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFrpCallbacks {
        static final int TRANSACTION_onGetSnapshot = 1;
        static final int TRANSACTION_onIsChallengeRequired = 3;
        static final int TRANSACTION_onIsChallengeSupported = 2;
        static final int TRANSACTION_onUnlock = 5;
        static final int TRANSACTION_onUnlockedForWear = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFrpCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.frp.internal.IFrpCallbacks");
            }

            @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
            public void onGetSnapshot(Status status, FrpSnapshot frpSnapshot) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, frpSnapshot);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
            public void onIsChallengeRequired(Status status, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
            public void onIsChallengeSupported(Status status, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
            public void onUnlock(Status status, FrpUnlockResponse frpUnlockResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, frpUnlockResponse);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.frp.internal.IFrpCallbacks
            public void onUnlockedForWear(Status status, UnlockForWearResponse unlockForWearResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, unlockForWearResponse);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.frp.internal.IFrpCallbacks");
        }

        public static IFrpCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.frp.internal.IFrpCallbacks");
            return queryLocalInterface instanceof IFrpCallbacks ? (IFrpCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) rve.a(parcel, Status.CREATOR);
                FrpSnapshot frpSnapshot = (FrpSnapshot) rve.a(parcel, FrpSnapshot.CREATOR);
                enforceNoDataAvail(parcel);
                onGetSnapshot(status, frpSnapshot);
            } else if (i == 2) {
                Status status2 = (Status) rve.a(parcel, Status.CREATOR);
                boolean g = rve.g(parcel);
                enforceNoDataAvail(parcel);
                onIsChallengeSupported(status2, g);
            } else if (i == 3) {
                Status status3 = (Status) rve.a(parcel, Status.CREATOR);
                boolean g2 = rve.g(parcel);
                enforceNoDataAvail(parcel);
                onIsChallengeRequired(status3, g2);
            } else if (i == 4) {
                Status status4 = (Status) rve.a(parcel, Status.CREATOR);
                UnlockForWearResponse unlockForWearResponse = (UnlockForWearResponse) rve.a(parcel, UnlockForWearResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onUnlockedForWear(status4, unlockForWearResponse);
            } else {
                if (i != 5) {
                    return false;
                }
                Status status5 = (Status) rve.a(parcel, Status.CREATOR);
                FrpUnlockResponse frpUnlockResponse = (FrpUnlockResponse) rve.a(parcel, FrpUnlockResponse.CREATOR);
                enforceNoDataAvail(parcel);
                onUnlock(status5, frpUnlockResponse);
            }
            return true;
        }
    }

    void onGetSnapshot(Status status, FrpSnapshot frpSnapshot);

    void onIsChallengeRequired(Status status, boolean z);

    void onIsChallengeSupported(Status status, boolean z);

    void onUnlock(Status status, FrpUnlockResponse frpUnlockResponse);

    void onUnlockedForWear(Status status, UnlockForWearResponse unlockForWearResponse);
}
