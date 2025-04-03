package com.google.android.gms.time.trustedtime.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.time.trustedtime.dto.TimeSignalResult;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IOnLatestTimeSignalCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IOnLatestTimeSignalCallback {
        static final int TRANSACTION_onLatestTimeSignal = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IOnLatestTimeSignalCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.time.trustedtime.internal.IOnLatestTimeSignalCallback");
            }

            @Override // com.google.android.gms.time.trustedtime.internal.IOnLatestTimeSignalCallback
            public void onLatestTimeSignal(Status status, TimeSignalResult timeSignalResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, timeSignalResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.time.trustedtime.internal.IOnLatestTimeSignalCallback");
        }

        public static IOnLatestTimeSignalCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.time.trustedtime.internal.IOnLatestTimeSignalCallback");
            return queryLocalInterface instanceof IOnLatestTimeSignalCallback ? (IOnLatestTimeSignalCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            TimeSignalResult timeSignalResult = (TimeSignalResult) rve.a(parcel, TimeSignalResult.CREATOR);
            enforceNoDataAvail(parcel);
            onLatestTimeSignal(status, timeSignalResult);
            return true;
        }
    }

    void onLatestTimeSignal(Status status, TimeSignalResult timeSignalResult);
}
