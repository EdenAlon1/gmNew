package com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.dlkh;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ISafetyCoreCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ISafetyCoreCallbacks {
        static final int TRANSACTION_onClassificationResult = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ISafetyCoreCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks");
            }

            @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks
            public void onClassificationResult(Status status, dlkh dlkhVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, dlkhVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks");
        }

        public static ISafetyCoreCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks");
            return queryLocalInterface instanceof ISafetyCoreCallbacks ? (ISafetyCoreCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            dlkh dlkhVar = (dlkh) rve.a(parcel, dlkh.CREATOR);
            enforceNoDataAvail(parcel);
            onClassificationResult(status, dlkhVar);
            return true;
        }
    }

    void onClassificationResult(Status status, dlkh dlkhVar);
}
