package com.google.android.gms.audit.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.audit.LogAuditRecordsRequest;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAuditService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAuditService {
        static final int TRANSACTION_logAuditRecords = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAuditService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.audit.internal.IAuditService");
            }

            @Override // com.google.android.gms.audit.internal.IAuditService
            public void logAuditRecords(LogAuditRecordsRequest logAuditRecordsRequest, IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, logAuditRecordsRequest);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.audit.internal.IAuditService");
        }

        public static IAuditService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.audit.internal.IAuditService");
            return queryLocalInterface instanceof IAuditService ? (IAuditService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            LogAuditRecordsRequest logAuditRecordsRequest = (LogAuditRecordsRequest) rve.a(parcel, LogAuditRecordsRequest.CREATOR);
            IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
            ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
            enforceNoDataAvail(parcel);
            logAuditRecords(logAuditRecordsRequest, asInterface, apiMetadata);
            parcel2.writeNoException();
            return true;
        }
    }

    void logAuditRecords(LogAuditRecordsRequest logAuditRecordsRequest, IStatusCallback iStatusCallback, ApiMetadata apiMetadata);
}
