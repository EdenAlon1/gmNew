package com.google.android.gms.learning.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.DiagnosisInfo;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IInitializeCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInitializeCallback {
        static final int TRANSACTION_onFailure = 3;
        static final int TRANSACTION_onSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInitializeCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.IInitializeCallback");
            }

            @Override // com.google.android.gms.learning.internal.IInitializeCallback
            public void onFailure(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.IInitializeCallback
            public void onSuccess(DiagnosisInfo diagnosisInfo) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, diagnosisInfo);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.IInitializeCallback");
        }

        public static IInitializeCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.IInitializeCallback");
            return queryLocalInterface instanceof IInitializeCallback ? (IInitializeCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                DiagnosisInfo diagnosisInfo = (DiagnosisInfo) rve.a(parcel, DiagnosisInfo.CREATOR);
                enforceNoDataAvail(parcel);
                onSuccess(diagnosisInfo);
                return true;
            }
            if (i != 3) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            enforceNoDataAvail(parcel);
            onFailure(status);
            return true;
        }
    }

    void onFailure(Status status);

    void onSuccess(DiagnosisInfo diagnosisInfo);
}
