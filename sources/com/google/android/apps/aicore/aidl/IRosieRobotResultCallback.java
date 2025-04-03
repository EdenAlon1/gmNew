package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.ryf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IRosieRobotResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IRosieRobotResultCallback {
        static final int TRANSACTION_onRosieRobotInferenceFailure = 3;
        static final int TRANSACTION_onRosieRobotInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IRosieRobotResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IRosieRobotResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotResultCallback
            public void onRosieRobotInferenceFailure(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IRosieRobotResultCallback
            public void onRosieRobotInferenceSuccess(ryf ryfVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, ryfVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IRosieRobotResultCallback");
        }

        public static IRosieRobotResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IRosieRobotResultCallback");
            return queryLocalInterface instanceof IRosieRobotResultCallback ? (IRosieRobotResultCallback) queryLocalInterface : new Proxy(iBinder);
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
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onRosieRobotInferenceFailure(readInt);
            return true;
        }
    }

    void onRosieRobotInferenceFailure(int i);

    void onRosieRobotInferenceSuccess(ryf ryfVar);
}
