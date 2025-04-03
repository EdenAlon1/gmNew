package com.google.android.gms.common.audience.dynamite;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.audience.dynamite.IAudienceViewCallbacks;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IAudienceView extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAudienceView {
        static final int TRANSACTION_getView = 8;
        static final int TRANSACTION_initialize = 2;
        static final int TRANSACTION_onRestoreInstanceState = 7;
        static final int TRANSACTION_onSaveInstanceState = 6;
        static final int TRANSACTION_setAudience = 5;
        static final int TRANSACTION_setEditMode = 3;
        static final int TRANSACTION_setIsUnderageAccount = 9;
        static final int TRANSACTION_setShowEmptyText = 4;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAudienceView {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.audience.dynamite.IAudienceView");
            }

            @Override // com.google.android.gms.common.audience.dynamite.IAudienceView
            public IObjectWrapper getView() {
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.common.audience.dynamite.IAudienceView
            public void initialize(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IAudienceViewCallbacks iAudienceViewCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                rve.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                rve.f(obtainAndWriteInterfaceToken, iAudienceViewCallbacks);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.audience.dynamite.IAudienceView
            public void onRestoreInstanceState(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.audience.dynamite.IAudienceView
            public Bundle onSaveInstanceState() {
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                Bundle bundle = (Bundle) rve.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.gms.common.audience.dynamite.IAudienceView
            public void setAudience(Audience audience) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, audience);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.audience.dynamite.IAudienceView
            public void setEditMode(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.audience.dynamite.IAudienceView
            public void setIsUnderageAccount(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.common.audience.dynamite.IAudienceView
            public void setShowEmptyText(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = rve.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.audience.dynamite.IAudienceView");
        }

        public static IAudienceView asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.audience.dynamite.IAudienceView");
            return queryLocalInterface instanceof IAudienceView ? (IAudienceView) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 2:
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IAudienceViewCallbacks asInterface3 = IAudienceViewCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    initialize(asInterface, asInterface2, asInterface3);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    setEditMode(readInt);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    boolean g = rve.g(parcel);
                    enforceNoDataAvail(parcel);
                    setShowEmptyText(g);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    Audience audience = (Audience) rve.a(parcel, Audience.CREATOR);
                    enforceNoDataAvail(parcel);
                    setAudience(audience);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    Bundle onSaveInstanceState = onSaveInstanceState();
                    parcel2.writeNoException();
                    rve.e(parcel2, onSaveInstanceState);
                    return true;
                case 7:
                    Bundle bundle = (Bundle) rve.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRestoreInstanceState(bundle);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    IObjectWrapper view = getView();
                    parcel2.writeNoException();
                    rve.f(parcel2, view);
                    return true;
                case 9:
                    boolean g2 = rve.g(parcel);
                    enforceNoDataAvail(parcel);
                    setIsUnderageAccount(g2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    IObjectWrapper getView();

    void initialize(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IAudienceViewCallbacks iAudienceViewCallbacks);

    void onRestoreInstanceState(Bundle bundle);

    Bundle onSaveInstanceState();

    void setAudience(Audience audience);

    void setEditMode(int i);

    void setIsUnderageAccount(boolean z);

    void setShowEmptyText(boolean z);
}
