package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.FeatureStyle;
import com.google.android.gms.maps.model.internal.IFeatureDelegate;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IStyleFactory extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IStyleFactory {
        static final int TRANSACTION_getStyle = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IStyleFactory {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IStyleFactory");
            }

            @Override // com.google.android.gms.maps.model.internal.IStyleFactory
            public FeatureStyle getStyle(IFeatureDelegate iFeatureDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iFeatureDelegate);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                FeatureStyle featureStyle = (FeatureStyle) rve.a(transactAndReadException, FeatureStyle.CREATOR);
                transactAndReadException.recycle();
                return featureStyle;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IStyleFactory");
        }

        public static IStyleFactory asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IStyleFactory");
            return queryLocalInterface instanceof IStyleFactory ? (IStyleFactory) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IFeatureDelegate asInterface = IFeatureDelegate.Stub.asInterface(parcel.readStrongBinder());
            enforceNoDataAvail(parcel);
            FeatureStyle style = getStyle(asInterface);
            parcel2.writeNoException();
            rve.e(parcel2, style);
            return true;
        }
    }

    FeatureStyle getStyle(IFeatureDelegate iFeatureDelegate);
}
