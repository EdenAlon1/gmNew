package com.google.android.gms.clearcut.sampler;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IDeviceSamplerCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IDeviceSamplerCallback {
        static final int TRANSACTION_onDecisionRetrieved = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IDeviceSamplerCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.clearcut.sampler.IDeviceSamplerCallback");
            }

            @Override // com.google.android.gms.clearcut.sampler.IDeviceSamplerCallback
            public void onDecisionRetrieved(Status status, SamplerDecisionParcelable samplerDecisionParcelable) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                rve.d(obtainAndWriteInterfaceToken, samplerDecisionParcelable);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.clearcut.sampler.IDeviceSamplerCallback");
        }

        public static IDeviceSamplerCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.sampler.IDeviceSamplerCallback");
            return queryLocalInterface instanceof IDeviceSamplerCallback ? (IDeviceSamplerCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            SamplerDecisionParcelable samplerDecisionParcelable = (SamplerDecisionParcelable) rve.a(parcel, SamplerDecisionParcelable.CREATOR);
            enforceNoDataAvail(parcel);
            onDecisionRetrieved(status, samplerDecisionParcelable);
            return true;
        }
    }

    void onDecisionRetrieved(Status status, SamplerDecisionParcelable samplerDecisionParcelable);
}
