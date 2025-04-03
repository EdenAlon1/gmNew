package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.rvo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IAstroboyResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAstroboyResultCallback {
        static final int TRANSACTION_onAstroboyFailure = 3;
        static final int TRANSACTION_onAstroboySuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAstroboyResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.IAstroboyResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.IAstroboyResultCallback
            public void onAstroboyFailure(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.IAstroboyResultCallback
            public void onAstroboySuccess(rvo rvoVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rvoVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.IAstroboyResultCallback");
        }

        public static IAstroboyResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.IAstroboyResultCallback");
            return queryLocalInterface instanceof IAstroboyResultCallback ? (IAstroboyResultCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                rvo rvoVar = (rvo) rve.a(parcel, rvo.CREATOR);
                enforceNoDataAvail(parcel);
                onAstroboySuccess(rvoVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onAstroboyFailure(readInt);
            return true;
        }
    }

    void onAstroboyFailure(int i);

    void onAstroboySuccess(rvo rvoVar);
}
