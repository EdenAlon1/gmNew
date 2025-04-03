package com.google.android.gms.learning.internal;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.learning.internal.IExampleStoreV2;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IInAppExampleStoreProxy extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInAppExampleStoreProxy {
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_onBind = 3;
        static final int TRANSACTION_onDestroy = 2;
        static final int TRANSACTION_onRebind = 6;
        static final int TRANSACTION_onTrimMemory = 4;
        static final int TRANSACTION_onUnbind = 5;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInAppExampleStoreProxy {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.IInAppExampleStoreProxy");
            }

            @Override // com.google.android.gms.learning.internal.IInAppExampleStoreProxy
            public void init(IObjectWrapper iObjectWrapper, IExampleStoreV2 iExampleStoreV2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.f(obtainAndWriteInterfaceToken, iExampleStoreV2);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.IInAppExampleStoreProxy
            public IBinder onBind(Intent intent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, intent);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                IBinder readStrongBinder = transactAndReadException.readStrongBinder();
                transactAndReadException.recycle();
                return readStrongBinder;
            }

            @Override // com.google.android.gms.learning.internal.IInAppExampleStoreProxy
            public void onDestroy() {
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.learning.internal.IInAppExampleStoreProxy
            public void onRebind(Intent intent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, intent);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.IInAppExampleStoreProxy
            public void onTrimMemory(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.IInAppExampleStoreProxy
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
            super("com.google.android.gms.learning.internal.IInAppExampleStoreProxy");
        }

        public static IInAppExampleStoreProxy asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.IInAppExampleStoreProxy");
            return queryLocalInterface instanceof IInAppExampleStoreProxy ? (IInAppExampleStoreProxy) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IExampleStoreV2 asInterface2 = IExampleStoreV2.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    init(asInterface, asInterface2);
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
                default:
                    return false;
            }
        }
    }

    void init(IObjectWrapper iObjectWrapper, IExampleStoreV2 iExampleStoreV2);

    IBinder onBind(Intent intent);

    void onDestroy();

    void onRebind(Intent intent);

    void onTrimMemory(int i);

    boolean onUnbind(Intent intent);
}
