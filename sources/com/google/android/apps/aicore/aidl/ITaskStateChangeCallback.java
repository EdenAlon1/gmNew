package com.google.android.apps.aicore.aidl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITaskStateChangeCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITaskStateChangeCallback {
        static final int TRANSACTION_onInferenceProgress = 3;
        static final int TRANSACTION_onTaskStateChange = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITaskStateChangeCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.aicore.aidl.ITaskStateChangeCallback");
            }

            @Override // com.google.android.apps.aicore.aidl.ITaskStateChangeCallback
            public void onInferenceProgress(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.aicore.aidl.ITaskStateChangeCallback
            public void onTaskStateChange(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.aicore.aidl.ITaskStateChangeCallback");
        }

        public static ITaskStateChangeCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.aicore.aidl.ITaskStateChangeCallback");
            return queryLocalInterface instanceof ITaskStateChangeCallback ? (ITaskStateChangeCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                onTaskStateChange(readInt);
                return true;
            }
            if (i != 3) {
                return false;
            }
            float readFloat = parcel.readFloat();
            enforceNoDataAvail(parcel);
            onInferenceProgress(readFloat);
            return true;
        }
    }

    void onInferenceProgress(float f);

    void onTaskStateChange(int i);
}
