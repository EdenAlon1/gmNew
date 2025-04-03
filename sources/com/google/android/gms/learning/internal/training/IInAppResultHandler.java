package com.google.android.gms.learning.internal.training;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.learning.ExampleConsumption;
import com.google.android.gms.learning.InAppTrainerOptions;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IInAppResultHandler extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IInAppResultHandler {
        static final int TRANSACTION_getVersion = 2;
        static final int TRANSACTION_handleResult = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IInAppResultHandler {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.training.IInAppResultHandler");
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppResultHandler
            public int getVersion() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.learning.internal.training.IInAppResultHandler
            public void handleResult(InAppTrainerOptions inAppTrainerOptions, boolean z, List<ExampleConsumption> list, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, inAppTrainerOptions);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.training.IInAppResultHandler");
        }

        public static IInAppResultHandler asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.training.IInAppResultHandler");
            return queryLocalInterface instanceof IInAppResultHandler ? (IInAppResultHandler) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                int version = getVersion();
                parcel2.writeNoException();
                parcel2.writeInt(version);
                return true;
            }
            if (i != 3) {
                return false;
            }
            InAppTrainerOptions inAppTrainerOptions = (InAppTrainerOptions) rve.a(parcel, InAppTrainerOptions.CREATOR);
            boolean g = rve.g(parcel);
            ArrayList createTypedArrayList = parcel.createTypedArrayList(ExampleConsumption.CREATOR);
            IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            handleResult(inAppTrainerOptions, g, createTypedArrayList, asInterface);
            return true;
        }
    }

    int getVersion();

    void handleResult(InAppTrainerOptions inAppTrainerOptions, boolean z, List<ExampleConsumption> list, IStatusCallback iStatusCallback);
}
