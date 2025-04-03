package com.google.android.gms.gmscompliance;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IGmsDeviceComplianceService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IGmsDeviceComplianceService {
        static final int TRANSACTION_getGmsDeviceCompliance = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IGmsDeviceComplianceService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.gmscompliance.IGmsDeviceComplianceService");
            }

            @Override // com.google.android.gms.gmscompliance.IGmsDeviceComplianceService
            public void getGmsDeviceCompliance(IGmsDeviceComplianceServiceCallback iGmsDeviceComplianceServiceCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iGmsDeviceComplianceServiceCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.gmscompliance.IGmsDeviceComplianceService");
        }

        public static IGmsDeviceComplianceService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gmscompliance.IGmsDeviceComplianceService");
            return queryLocalInterface instanceof IGmsDeviceComplianceService ? (IGmsDeviceComplianceService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IGmsDeviceComplianceServiceCallback asInterface = IGmsDeviceComplianceServiceCallback.Stub.asInterface(parcel.readStrongBinder());
            ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
            enforceNoDataAvail(parcel);
            getGmsDeviceCompliance(asInterface, apiMetadata);
            parcel2.writeNoException();
            return true;
        }
    }

    void getGmsDeviceCompliance(IGmsDeviceComplianceServiceCallback iGmsDeviceComplianceServiceCallback, ApiMetadata apiMetadata);
}
