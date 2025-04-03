package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.ryl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISmartReplyResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISmartReplyResultCallback {
        static final int TRANSACTION_onSmartReplyInferenceFailure = 3;
        static final int TRANSACTION_onSmartReplyInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISmartReplyResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ISmartReplyResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyResultCallback
            public void onSmartReplyInferenceFailure(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ISmartReplyResultCallback
            public void onSmartReplyInferenceSuccess(ryl rylVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, rylVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ISmartReplyResultCallback");
        }

        public static ISmartReplyResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISmartReplyResultCallback");
            return queryLocalInterface instanceof ISmartReplyResultCallback ? (ISmartReplyResultCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                ryl rylVar = (ryl) rve.a(parcel, ryl.CREATOR);
                enforceNoDataAvail(parcel);
                onSmartReplyInferenceSuccess(rylVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onSmartReplyInferenceFailure(readInt);
            return true;
        }
    }

    void onSmartReplyInferenceFailure(int i);

    void onSmartReplyInferenceSuccess(ryl rylVar);
}
