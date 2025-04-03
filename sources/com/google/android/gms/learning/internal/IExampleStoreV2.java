package com.google.android.gms.learning.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.learning.internal.IExampleStoreQueryCallbackV2;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IExampleStoreV2 extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IExampleStoreV2 {
        static final int TRANSACTION_startQuery = 2;
        static final int TRANSACTION_startQueryWithSelectorContext = 4;
        static final int TRANSACTION_supportsSelectorContext = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IExampleStoreV2 {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.learning.internal.IExampleStoreV2");
            }

            @Override // com.google.android.gms.learning.internal.IExampleStoreV2
            public void startQuery(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IExampleStoreQueryCallbackV2 iExampleStoreQueryCallbackV2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                rve.f(obtainAndWriteInterfaceToken, iExampleStoreQueryCallbackV2);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.IExampleStoreV2
            public void startQueryWithSelectorContext(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IExampleStoreQueryCallbackV2 iExampleStoreQueryCallbackV2, IObjectWrapper iObjectWrapper3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                rve.f(obtainAndWriteInterfaceToken, iExampleStoreQueryCallbackV2);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper3);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.learning.internal.IExampleStoreV2
            public boolean supportsSelectorContext() {
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                boolean g = rve.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }
        }

        public Stub() {
            super("com.google.android.gms.learning.internal.IExampleStoreV2");
        }

        public static IExampleStoreV2 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.internal.IExampleStoreV2");
            return queryLocalInterface instanceof IExampleStoreV2 ? (IExampleStoreV2) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                String readString = parcel.readString();
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IExampleStoreQueryCallbackV2 asInterface3 = IExampleStoreQueryCallbackV2.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                startQuery(readString, asInterface, asInterface2, asInterface3);
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                boolean supportsSelectorContext = supportsSelectorContext();
                parcel2.writeNoException();
                int i3 = rve.a;
                parcel2.writeInt(supportsSelectorContext ? 1 : 0);
                return true;
            }
            if (i != 4) {
                return false;
            }
            String readString2 = parcel.readString();
            IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IExampleStoreQueryCallbackV2 asInterface6 = IExampleStoreQueryCallbackV2.Stub.asInterface(parcel.readStrongBinder());
            IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            startQueryWithSelectorContext(readString2, asInterface4, asInterface5, asInterface6, asInterface7);
            parcel2.writeNoException();
            return true;
        }
    }

    void startQuery(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IExampleStoreQueryCallbackV2 iExampleStoreQueryCallbackV2);

    void startQueryWithSelectorContext(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IExampleStoreQueryCallbackV2 iExampleStoreQueryCallbackV2, IObjectWrapper iObjectWrapper3);

    boolean supportsSelectorContext();
}
