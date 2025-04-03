package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rwe;
import defpackage.rwx;
import defpackage.ryf;
import defpackage.rzf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMockService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMockService {
        static final int TRANSACTION_queueImageDescriptionResult = 4;
        static final int TRANSACTION_queueLLMResult = 2;
        static final int TRANSACTION_queueRosieRobotResult = 5;
        static final int TRANSACTION_queueSummarizationResult = 3;
        static final int TRANSACTION_reset = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMockService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IMockService");
            }

            @Override // com.google.android.apps.aicore.aidl.IMockService
            public void queueImageDescriptionResult(rwe rweVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rweVar);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IMockService
            public void queueLLMResult(rwx rwxVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rwxVar);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IMockService
            public void queueRosieRobotResult(ryf ryfVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, ryfVar);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IMockService
            public void queueSummarizationResult(rzf rzfVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rzfVar);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IMockService
            public void reset() {
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IMockService");
        }

        public static IMockService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IMockService");
            return queryLocalInterface instanceof IMockService ? (IMockService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                reset();
            } else if (i == 2) {
                rwx rwxVar = (rwx) rve.a(parcel, rwx.CREATOR);
                enforceNoDataAvail(parcel);
                queueLLMResult(rwxVar);
            } else if (i == 3) {
                rzf rzfVar = (rzf) rve.a(parcel, rzf.CREATOR);
                enforceNoDataAvail(parcel);
                queueSummarizationResult(rzfVar);
            } else if (i == 4) {
                rwe rweVar = (rwe) rve.a(parcel, rwe.CREATOR);
                enforceNoDataAvail(parcel);
                queueImageDescriptionResult(rweVar);
            } else {
                if (i != 5) {
                    return false;
                }
                ryf ryfVar = (ryf) rve.a(parcel, ryf.CREATOR);
                enforceNoDataAvail(parcel);
                queueRosieRobotResult(ryfVar);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void queueImageDescriptionResult(rwe rweVar);

    void queueLLMResult(rwx rwxVar);

    void queueRosieRobotResult(ryf ryfVar);

    void queueSummarizationResult(rzf rzfVar);

    void reset();
}
