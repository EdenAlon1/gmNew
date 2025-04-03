package com.google.android.gms.kids.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IScreentimeRestrictionCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IScreentimeRestrictionCallback {
        static final int TRANSACTION_onRestrictedModeChanged = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IScreentimeRestrictionCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IScreentimeRestrictionCallback");
            }

            @Override // com.google.android.gms.kids.internal.IScreentimeRestrictionCallback
            public void onRestrictedModeChanged(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.kids.internal.IScreentimeRestrictionCallback");
        }

        public static IScreentimeRestrictionCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IScreentimeRestrictionCallback");
            return queryLocalInterface instanceof IScreentimeRestrictionCallback ? (IScreentimeRestrictionCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            onRestrictedModeChanged(readInt);
            return true;
        }
    }

    void onRestrictedModeChanged(int i);
}
