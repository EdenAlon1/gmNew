package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;
import defpackage.ryx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ISuggestedTextResultCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISuggestedTextResultCallback {
        static final int TRANSACTION_onSuggestedTextInferenceFailure = 3;
        static final int TRANSACTION_onSuggestedTextInferenceSuccess = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISuggestedTextResultCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback
            public void onSuggestedTextInferenceFailure(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback
            public void onSuggestedTextInferenceSuccess(ryx ryxVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, ryxVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback");
        }

        public static ISuggestedTextResultCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ISuggestedTextResultCallback");
            return queryLocalInterface instanceof ISuggestedTextResultCallback ? (ISuggestedTextResultCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                ryx ryxVar = (ryx) rve.a(parcel, ryx.CREATOR);
                enforceNoDataAvail(parcel);
                onSuggestedTextInferenceSuccess(ryxVar);
                return true;
            }
            if (i != 3) {
                return false;
            }
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onSuggestedTextInferenceFailure(readInt);
            return true;
        }
    }

    void onSuggestedTextInferenceFailure(int i);

    void onSuggestedTextInferenceSuccess(ryx ryxVar);
}
