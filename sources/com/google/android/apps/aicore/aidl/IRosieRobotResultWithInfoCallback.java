package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rvy;
import defpackage.ryf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IRosieRobotResultWithInfoCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IRosieRobotResultWithInfoCallback {
        static final int TRANSACTION_onRosieRobotInferenceFailure = 3;
        static final int TRANSACTION_onRosieRobotInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IRosieRobotResultWithInfoCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IRosieRobotResultWithInfoCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotResultWithInfoCallback
            public void onRosieRobotInferenceFailure(rvy rvyVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvyVar);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotResultWithInfoCallback
            public void onRosieRobotInferenceSuccess(ryf ryfVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, ryfVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IRosieRobotResultWithInfoCallback");
        }

        public static IRosieRobotResultWithInfoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IRosieRobotResultWithInfoCallback");
            return queryLocalInterface instanceof IRosieRobotResultWithInfoCallback ? (IRosieRobotResultWithInfoCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                ryf ryfVar = (ryf) rve.a(parcel, ryf.CREATOR);
                enforceNoDataAvail(parcel);
                onRosieRobotInferenceSuccess(ryfVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            rvy rvyVar = (rvy) rve.a(parcel, rvy.CREATOR);
            enforceNoDataAvail(parcel);
            onRosieRobotInferenceFailure(rvyVar);
            return true;
        }
    }

    void onRosieRobotInferenceFailure(rvy rvyVar);

    void onRosieRobotInferenceSuccess(ryf ryfVar);
}
