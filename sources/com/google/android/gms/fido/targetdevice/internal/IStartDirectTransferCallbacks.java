package com.google.android.gms.fido.targetdevice.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.fido.targetdevice.TargetDirectTransferResult;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IStartDirectTransferCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IStartDirectTransferCallbacks {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IStartDirectTransferCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.targetdevice.internal.IStartDirectTransferCallbacks");
            }

            @Override // com.google.android.gms.fido.targetdevice.internal.IStartDirectTransferCallbacks
            public void onResult(TargetDirectTransferResult targetDirectTransferResult) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, targetDirectTransferResult);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.targetdevice.internal.IStartDirectTransferCallbacks");
        }

        public static IStartDirectTransferCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.targetdevice.internal.IStartDirectTransferCallbacks");
            return queryLocalInterface instanceof IStartDirectTransferCallbacks ? (IStartDirectTransferCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            TargetDirectTransferResult targetDirectTransferResult = (TargetDirectTransferResult) rve.a(parcel, TargetDirectTransferResult.CREATOR);
            enforceNoDataAvail(parcel);
            onResult(targetDirectTransferResult);
            return true;
        }
    }

    void onResult(TargetDirectTransferResult targetDirectTransferResult);
}
