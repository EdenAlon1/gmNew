package com.google.android.gms.learning.internal.training;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.learning.InAppTrainerOptions;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IInAppTrainer extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInAppTrainer {
        static final int TRANSACTION_initV26 = 6;
        static final int TRANSACTION_initW24 = 7;
        static final int TRANSACTION_initY2020W18 = 8;
        static final int TRANSACTION_initY2020W30 = 9;
        static final int TRANSACTION_initY2020W36 = 10;
        static final int TRANSACTION_initY2021W30 = 11;
        static final int TRANSACTION_initY2022W24 = 12;
        static final int TRANSACTION_initY2023W12 = 13;
        static final int TRANSACTION_start = 3;
        static final int TRANSACTION_stop = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInAppTrainer {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.training.IInAppTrainer");
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public boolean initV26(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                rve.d(obtainAndWriteInterfaceToken, inAppTrainerOptions);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public boolean initW24(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                rve.d(obtainAndWriteInterfaceToken, inAppTrainerOptions);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public boolean initY2020W18(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                rve.d(obtainAndWriteInterfaceToken, inAppTrainerOptions);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public boolean initY2020W30(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                rve.d(obtainAndWriteInterfaceToken, inAppTrainerOptions);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public boolean initY2020W36(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                rve.d(obtainAndWriteInterfaceToken, inAppTrainerOptions);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public boolean initY2021W30(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                rve.d(obtainAndWriteInterfaceToken, inAppTrainerOptions);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public boolean initY2022W24(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                rve.d(obtainAndWriteInterfaceToken, inAppTrainerOptions);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public boolean initY2023W12(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                rve.d(obtainAndWriteInterfaceToken, inAppTrainerOptions);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken);
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public void start(int i, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppTrainer
            public void stop(IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.training.IInAppTrainer");
        }

        public static IInAppTrainer asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppTrainer");
            return queryLocalInterface instanceof IInAppTrainer ? (IInAppTrainer) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 3:
                    int readInt = parcel.readInt();
                    IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    start(readInt, asInterface);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    stop(asInterface2);
                    parcel2.writeNoException();
                    return true;
                case 5:
                default:
                    return false;
                case 6:
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    InAppTrainerOptions inAppTrainerOptions = (InAppTrainerOptions) rve.a(parcel, InAppTrainerOptions.CREATOR);
                    IStatusCallback asInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean initV26 = initV26(asInterface3, asInterface4, inAppTrainerOptions, asInterface5);
                    parcel2.writeNoException();
                    parcel2.writeInt(initV26 ? 1 : 0);
                    return true;
                case 7:
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    InAppTrainerOptions inAppTrainerOptions2 = (InAppTrainerOptions) rve.a(parcel, InAppTrainerOptions.CREATOR);
                    IStatusCallback asInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean initW24 = initW24(asInterface6, asInterface7, inAppTrainerOptions2, asInterface8);
                    parcel2.writeNoException();
                    parcel2.writeInt(initW24 ? 1 : 0);
                    return true;
                case 8:
                    IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    InAppTrainerOptions inAppTrainerOptions3 = (InAppTrainerOptions) rve.a(parcel, InAppTrainerOptions.CREATOR);
                    IStatusCallback asInterface11 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean initY2020W18 = initY2020W18(asInterface9, asInterface10, inAppTrainerOptions3, asInterface11);
                    parcel2.writeNoException();
                    parcel2.writeInt(initY2020W18 ? 1 : 0);
                    return true;
                case 9:
                    IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    InAppTrainerOptions inAppTrainerOptions4 = (InAppTrainerOptions) rve.a(parcel, InAppTrainerOptions.CREATOR);
                    IStatusCallback asInterface14 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean initY2020W30 = initY2020W30(asInterface12, asInterface13, inAppTrainerOptions4, asInterface14);
                    parcel2.writeNoException();
                    parcel2.writeInt(initY2020W30 ? 1 : 0);
                    return true;
                case 10:
                    IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    InAppTrainerOptions inAppTrainerOptions5 = (InAppTrainerOptions) rve.a(parcel, InAppTrainerOptions.CREATOR);
                    IStatusCallback asInterface17 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean initY2020W36 = initY2020W36(asInterface15, asInterface16, inAppTrainerOptions5, asInterface17);
                    parcel2.writeNoException();
                    parcel2.writeInt(initY2020W36 ? 1 : 0);
                    return true;
                case 11:
                    IObjectWrapper asInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper asInterface19 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    InAppTrainerOptions inAppTrainerOptions6 = (InAppTrainerOptions) rve.a(parcel, InAppTrainerOptions.CREATOR);
                    IStatusCallback asInterface20 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean initY2021W30 = initY2021W30(asInterface18, asInterface19, inAppTrainerOptions6, asInterface20);
                    parcel2.writeNoException();
                    parcel2.writeInt(initY2021W30 ? 1 : 0);
                    return true;
                case 12:
                    IObjectWrapper asInterface21 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper asInterface22 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    InAppTrainerOptions inAppTrainerOptions7 = (InAppTrainerOptions) rve.a(parcel, InAppTrainerOptions.CREATOR);
                    IStatusCallback asInterface23 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean initY2022W24 = initY2022W24(asInterface21, asInterface22, inAppTrainerOptions7, asInterface23);
                    parcel2.writeNoException();
                    parcel2.writeInt(initY2022W24 ? 1 : 0);
                    return true;
                case 13:
                    IObjectWrapper asInterface24 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper asInterface25 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    InAppTrainerOptions inAppTrainerOptions8 = (InAppTrainerOptions) rve.a(parcel, InAppTrainerOptions.CREATOR);
                    IStatusCallback asInterface26 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean initY2023W12 = initY2023W12(asInterface24, asInterface25, inAppTrainerOptions8, asInterface26);
                    parcel2.writeNoException();
                    parcel2.writeInt(initY2023W12 ? 1 : 0);
                    return true;
            }
        }
    }

    boolean initV26(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback);

    boolean initW24(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback);

    boolean initY2020W18(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback);

    boolean initY2020W30(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback);

    boolean initY2020W36(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback);

    boolean initY2021W30(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback);

    boolean initY2022W24(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback);

    boolean initY2023W12(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, InAppTrainerOptions inAppTrainerOptions, IStatusCallback iStatusCallback);

    void start(int i, IStatusCallback iStatusCallback);

    void stop(IStatusCallback iStatusCallback);
}
