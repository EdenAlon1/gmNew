package com.google.android.gms.feedback.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.internal.IFeedbackCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IFeedbackService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IFeedbackService {
        static final int TRANSACTION_dismissFeedback = 10;
        static final int TRANSACTION_saveAsyncFeedbackPsbd = 5;
        static final int TRANSACTION_saveAsyncFeedbackPsd = 4;
        static final int TRANSACTION_sendSilentFeedback = 7;
        static final int TRANSACTION_silentSendFeedback = 3;
        static final int TRANSACTION_startFeedback = 1;
        static final int TRANSACTION_startFeedbackActivity = 8;
        static final int TRANSACTION_startFeedbackWithTimestamp = 6;
        static final int TRANSACTION_startFeedbackWithTimestampAndCallback = 9;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IFeedbackService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.feedback.internal.IFeedbackService");
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackService
            public void dismissFeedback() {
                transactOneway(10, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackService
            public void saveAsyncFeedbackPsbd(FeedbackOptions feedbackOptions, Bundle bundle, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, feedbackOptions);
                rve.d(obtainAndWriteInterfaceToken, bundle);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackService
            public void saveAsyncFeedbackPsd(Bundle bundle, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackService
            public boolean sendSilentFeedback(FeedbackOptions feedbackOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, feedbackOptions);
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackService
            public boolean silentSendFeedback(ErrorReport errorReport) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, errorReport);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackService
            public boolean startFeedback(ErrorReport errorReport) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, errorReport);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackService
            public void startFeedbackActivity(FeedbackOptions feedbackOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, feedbackOptions);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackService
            public void startFeedbackWithTimestamp(ErrorReport errorReport, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, errorReport);
                obtainAndWriteInterfaceToken.writeLong(j);
                transactOneway(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackService
            public void startFeedbackWithTimestampAndCallback(ErrorReport errorReport, long j, IFeedbackCallbacks iFeedbackCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, errorReport);
                obtainAndWriteInterfaceToken.writeLong(j);
                rve.f(obtainAndWriteInterfaceToken, iFeedbackCallbacks);
                transactOneway(9, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.feedback.internal.IFeedbackService");
        }

        public static IFeedbackService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
            return queryLocalInterface instanceof IFeedbackService ? (IFeedbackService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    ErrorReport errorReport = (ErrorReport) rve.a(parcel, ErrorReport.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean startFeedback = startFeedback(errorReport);
                    parcel2.writeNoException();
                    parcel2.writeInt(startFeedback ? 1 : 0);
                    return true;
                case 2:
                default:
                    return false;
                case 3:
                    ErrorReport errorReport2 = (ErrorReport) rve.a(parcel, ErrorReport.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean silentSendFeedback = silentSendFeedback(errorReport2);
                    parcel2.writeNoException();
                    parcel2.writeInt(silentSendFeedback ? 1 : 0);
                    return true;
                case 4:
                    Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    long readLong = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    saveAsyncFeedbackPsd(bundle, readLong);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    FeedbackOptions feedbackOptions = (FeedbackOptions) rve.a(parcel, FeedbackOptions.CREATOR);
                    Bundle bundle2 = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    long readLong2 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    saveAsyncFeedbackPsbd(feedbackOptions, bundle2, readLong2);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    ErrorReport errorReport3 = (ErrorReport) rve.a(parcel, ErrorReport.CREATOR);
                    long readLong3 = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    startFeedbackWithTimestamp(errorReport3, readLong3);
                    return true;
                case 7:
                    FeedbackOptions feedbackOptions2 = (FeedbackOptions) rve.a(parcel, FeedbackOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean sendSilentFeedback = sendSilentFeedback(feedbackOptions2);
                    parcel2.writeNoException();
                    parcel2.writeInt(sendSilentFeedback ? 1 : 0);
                    return true;
                case 8:
                    FeedbackOptions feedbackOptions3 = (FeedbackOptions) rve.a(parcel, FeedbackOptions.CREATOR);
                    enforceNoDataAvail(parcel);
                    startFeedbackActivity(feedbackOptions3);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    ErrorReport errorReport4 = (ErrorReport) rve.a(parcel, ErrorReport.CREATOR);
                    long readLong4 = parcel.readLong();
                    IFeedbackCallbacks asInterface = IFeedbackCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    startFeedbackWithTimestampAndCallback(errorReport4, readLong4, asInterface);
                    return true;
                case 10:
                    dismissFeedback();
                    return true;
            }
        }
    }

    void dismissFeedback();

    void saveAsyncFeedbackPsbd(FeedbackOptions feedbackOptions, Bundle bundle, long j);

    void saveAsyncFeedbackPsd(Bundle bundle, long j);

    boolean sendSilentFeedback(FeedbackOptions feedbackOptions);

    boolean silentSendFeedback(ErrorReport errorReport);

    boolean startFeedback(ErrorReport errorReport);

    void startFeedbackActivity(FeedbackOptions feedbackOptions);

    void startFeedbackWithTimestamp(ErrorReport errorReport, long j);

    void startFeedbackWithTimestampAndCallback(ErrorReport errorReport, long j, IFeedbackCallbacks iFeedbackCallbacks);
}
