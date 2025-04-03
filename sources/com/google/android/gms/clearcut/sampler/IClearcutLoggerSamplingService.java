package com.google.android.gms.clearcut.sampler;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.clearcut.sampler.IDeviceSamplerCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IClearcutLoggerSamplingService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IClearcutLoggerSamplingService {
        static final int TRANSACTION_getDeviceSamplerDecision = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IClearcutLoggerSamplingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.clearcut.sampler.IClearcutLoggerSamplingService");
            }

            @Override // com.google.android.gms.clearcut.sampler.IClearcutLoggerSamplingService
            public void getDeviceSamplerDecision(SamplerConfigParcelable samplerConfigParcelable, IDeviceSamplerCallback iDeviceSamplerCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, samplerConfigParcelable);
                rve.f(obtainAndWriteInterfaceToken, iDeviceSamplerCallback);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.clearcut.sampler.IClearcutLoggerSamplingService");
        }

        public static IClearcutLoggerSamplingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.sampler.IClearcutLoggerSamplingService");
            return queryLocalInterface instanceof IClearcutLoggerSamplingService ? (IClearcutLoggerSamplingService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                return false;
            }
            SamplerConfigParcelable samplerConfigParcelable = (SamplerConfigParcelable) rve.a(parcel, SamplerConfigParcelable.CREATOR);
            IDeviceSamplerCallback asInterface = IDeviceSamplerCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            getDeviceSamplerDecision(samplerConfigParcelable, asInterface);
            return true;
        }
    }

    void getDeviceSamplerDecision(SamplerConfigParcelable samplerConfigParcelable, IDeviceSamplerCallback iDeviceSamplerCallback);
}
