package com.google.android.gms.learning.internal.training;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.learning.internal.http.IHttpRequestHandleFactory;
import com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IInAppTrainingService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInAppTrainingService {
        static final int TRANSACTION_addHttpRequestHandleFactory = 10;
        static final int TRANSACTION_addHttpUrlConnectionFactory = 9;
        static final int TRANSACTION_onBind = 3;
        static final int TRANSACTION_onCreate = 1;
        static final int TRANSACTION_onDestroy = 2;
        static final int TRANSACTION_onRebind = 7;
        static final int TRANSACTION_onStartCommand = 5;
        static final int TRANSACTION_onTrimMemory = 4;
        static final int TRANSACTION_onUnbind = 6;
        static final int TRANSACTION_setPRFSdkImpl = 8;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInAppTrainingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.training.IInAppTrainingService");
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public void addHttpRequestHandleFactory(String str, IHttpRequestHandleFactory iHttpRequestHandleFactory) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.f(obtainAndWriteInterfaceToken, iHttpRequestHandleFactory);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public void addHttpUrlConnectionFactory(String str, IHttpUrlConnectionFactory iHttpUrlConnectionFactory) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.f(obtainAndWriteInterfaceToken, iHttpUrlConnectionFactory);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public IBinder onBind(Intent intent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, intent);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                IBinder readStrongBinder = transactAndReadException.readStrongBinder();
                transactAndReadException.recycle();
                return readStrongBinder;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public void onCreate(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public void onDestroy() {
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public void onRebind(Intent intent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, intent);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public int onStartCommand(Intent intent, int i, int i2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, intent);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public void onTrimMemory(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public boolean onUnbind(Intent intent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, intent);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainingService
            public void setPRFSdkImpl() {
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.training.IInAppTrainingService");
        }

        public static IInAppTrainingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainingService");
            return queryLocalInterface instanceof IInAppTrainingService ? (IInAppTrainingService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    onCreate(asInterface);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    onDestroy();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    Intent intent = (Intent) rve.a(parcel, Intent.CREATOR);
                    enforceNoDataAvail(parcel);
                    IBinder onBind = onBind(intent);
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(onBind);
                    return true;
                case 4:
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    onTrimMemory(readInt);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    Intent intent2 = (Intent) rve.a(parcel, Intent.CREATOR);
                    int readInt2 = parcel.readInt();
                    int readInt3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    int onStartCommand = onStartCommand(intent2, readInt2, readInt3);
                    parcel2.writeNoException();
                    parcel2.writeInt(onStartCommand);
                    return true;
                case 6:
                    Intent intent3 = (Intent) rve.a(parcel, Intent.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean onUnbind = onUnbind(intent3);
                    parcel2.writeNoException();
                    parcel2.writeInt(onUnbind ? 1 : 0);
                    return true;
                case 7:
                    Intent intent4 = (Intent) rve.a(parcel, Intent.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRebind(intent4);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    setPRFSdkImpl();
                    parcel2.writeNoException();
                    return true;
                case 9:
                    String readString = parcel.readString();
                    IHttpUrlConnectionFactory asInterface2 = IHttpUrlConnectionFactory.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    addHttpUrlConnectionFactory(readString, asInterface2);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    String readString2 = parcel.readString();
                    IHttpRequestHandleFactory asInterface3 = IHttpRequestHandleFactory.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    addHttpRequestHandleFactory(readString2, asInterface3);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void addHttpRequestHandleFactory(String str, IHttpRequestHandleFactory iHttpRequestHandleFactory);

    void addHttpUrlConnectionFactory(String str, IHttpUrlConnectionFactory iHttpUrlConnectionFactory);

    IBinder onBind(Intent intent);

    void onCreate(IObjectWrapper iObjectWrapper);

    void onDestroy();

    void onRebind(Intent intent);

    int onStartCommand(Intent intent, int i, int i2);

    void onTrimMemory(int i);

    boolean onUnbind(Intent intent);

    @Deprecated
    void setPRFSdkImpl();
}
