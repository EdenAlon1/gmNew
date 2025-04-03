package com.google.android.gms.cobalt.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.cobalt.LogIntegerRequest;
import com.google.android.gms.cobalt.LogOccurrenceRequest;
import com.google.android.gms.cobalt.internal.ICobaltLoggerCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ICobaltLoggerService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ICobaltLoggerService {
        static final int TRANSACTION_logInteger = 2;
        static final int TRANSACTION_logOccurrence = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ICobaltLoggerService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.cobalt.internal.ICobaltLoggerService");
            }

            @Override // com.google.android.gms.cobalt.internal.ICobaltLoggerService
            public void logInteger(LogIntegerRequest logIntegerRequest, ICobaltLoggerCallbacks iCobaltLoggerCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, logIntegerRequest);
                rve.f(obtainAndWriteInterfaceToken, iCobaltLoggerCallbacks);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.cobalt.internal.ICobaltLoggerService
            public void logOccurrence(LogOccurrenceRequest logOccurrenceRequest, ICobaltLoggerCallbacks iCobaltLoggerCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, logOccurrenceRequest);
                rve.f(obtainAndWriteInterfaceToken, iCobaltLoggerCallbacks);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.cobalt.internal.ICobaltLoggerService");
        }

        public static ICobaltLoggerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cobalt.internal.ICobaltLoggerService");
            return queryLocalInterface instanceof ICobaltLoggerService ? (ICobaltLoggerService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                LogOccurrenceRequest logOccurrenceRequest = (LogOccurrenceRequest) rve.a(parcel, LogOccurrenceRequest.CREATOR);
                ICobaltLoggerCallbacks asInterface = ICobaltLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                logOccurrence(logOccurrenceRequest, asInterface);
            } else {
                if (i != 2) {
                    return false;
                }
                LogIntegerRequest logIntegerRequest = (LogIntegerRequest) rve.a(parcel, LogIntegerRequest.CREATOR);
                ICobaltLoggerCallbacks asInterface2 = ICobaltLoggerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                logInteger(logIntegerRequest, asInterface2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void logInteger(LogIntegerRequest logIntegerRequest, ICobaltLoggerCallbacks iCobaltLoggerCallbacks);

    void logOccurrence(LogOccurrenceRequest logOccurrenceRequest, ICobaltLoggerCallbacks iCobaltLoggerCallbacks);
}
