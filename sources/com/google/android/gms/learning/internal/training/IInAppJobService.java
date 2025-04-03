package com.google.android.gms.learning.internal.training;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IInAppJobService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInAppJobService {
        static final int TRANSACTION_init = 9;
        static final int TRANSACTION_onDestroy = 2;
        static final int TRANSACTION_onRebind = 6;
        static final int TRANSACTION_onStartCommand = 4;
        static final int TRANSACTION_onStartJob = 7;
        static final int TRANSACTION_onStopJob = 8;
        static final int TRANSACTION_onTrimMemory = 3;
        static final int TRANSACTION_onUnbind = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInAppJobService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.training.IInAppJobService");
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppJobService
            public boolean init(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppJobService
            public void onDestroy() {
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppJobService
            public void onRebind(Intent intent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, intent);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppJobService
            public int onStartCommand(Intent intent, int i, int i2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, intent);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppJobService
            public boolean onStartJob(JobParameters jobParameters) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, jobParameters);
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppJobService
            public boolean onStopJob(JobParameters jobParameters) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, jobParameters);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppJobService
            public void onTrimMemory(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppJobService
            public boolean onUnbind(Intent intent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, intent);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.training.IInAppJobService");
        }

        public static IInAppJobService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppJobService");
            return queryLocalInterface instanceof IInAppJobService ? (IInAppJobService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    onDestroy();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    onTrimMemory(readInt);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    Intent intent = (Intent) rve.a(parcel, Intent.CREATOR);
                    int readInt2 = parcel.readInt();
                    int readInt3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    int onStartCommand = onStartCommand(intent, readInt2, readInt3);
                    parcel2.writeNoException();
                    parcel2.writeInt(onStartCommand);
                    return true;
                case 5:
                    Intent intent2 = (Intent) rve.a(parcel, Intent.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean onUnbind = onUnbind(intent2);
                    parcel2.writeNoException();
                    parcel2.writeInt(onUnbind ? 1 : 0);
                    return true;
                case 6:
                    Intent intent3 = (Intent) rve.a(parcel, Intent.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRebind(intent3);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    JobParameters jobParameters = (JobParameters) rve.a(parcel, JobParameters.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean onStartJob = onStartJob(jobParameters);
                    parcel2.writeNoException();
                    parcel2.writeInt(onStartJob ? 1 : 0);
                    return true;
                case 8:
                    JobParameters jobParameters2 = (JobParameters) rve.a(parcel, JobParameters.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean onStopJob = onStopJob(jobParameters2);
                    parcel2.writeNoException();
                    parcel2.writeInt(onStopJob ? 1 : 0);
                    return true;
                case 9:
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean init = init(asInterface, asInterface2);
                    parcel2.writeNoException();
                    int i3 = rve.a;
                    parcel2.writeInt(init ? 1 : 0);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean init(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2);

    void onDestroy();

    void onRebind(Intent intent);

    int onStartCommand(Intent intent, int i, int i2);

    boolean onStartJob(JobParameters jobParameters);

    boolean onStopJob(JobParameters jobParameters);

    void onTrimMemory(int i);

    boolean onUnbind(Intent intent);
}
