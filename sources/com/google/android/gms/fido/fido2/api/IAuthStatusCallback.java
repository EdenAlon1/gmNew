package com.google.android.gms.fido.fido2.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.fido.fido2.api.IUserPresenceApprover;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAuthStatusCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAuthStatusCallback {
        static final int TRANSACTION_onStatusChanged = 1;
        static final int TRANSACTION_onUserPresenceApprovalRequired = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAuthStatusCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.api.IAuthStatusCallback");
            }

            @Override // com.google.android.gms.fido.fido2.api.IAuthStatusCallback
            public void onStatusChanged(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.api.IAuthStatusCallback
            public void onUserPresenceApprovalRequired(IUserPresenceApprover iUserPresenceApprover) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iUserPresenceApprover);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.api.IAuthStatusCallback");
        }

        public static IAuthStatusCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.api.IAuthStatusCallback");
            return queryLocalInterface instanceof IAuthStatusCallback ? (IAuthStatusCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                onStatusChanged(readInt);
            } else {
                if (i != 2) {
                    return false;
                }
                IUserPresenceApprover asInterface = IUserPresenceApprover.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                onUserPresenceApprovalRequired(asInterface);
            }
            return true;
        }
    }

    void onStatusChanged(int i);

    void onUserPresenceApprovalRequired(IUserPresenceApprover iUserPresenceApprover);
}
