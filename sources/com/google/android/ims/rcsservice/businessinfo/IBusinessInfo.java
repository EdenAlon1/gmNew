package com.google.android.ims.rcsservice.businessinfo;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IBusinessInfo extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IBusinessInfo {
        private static final String DESCRIPTOR = "com.google.android.ims.rcsservice.businessinfo.IBusinessInfo";
        static final int TRANSACTION_retrieveBusinessInfo = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IBusinessInfo {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.ims.rcsservice.businessinfo.IBusinessInfo
            public void retrieveBusinessInfo(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IBusinessInfo asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return queryLocalInterface instanceof IBusinessInfo ? (IBusinessInfo) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            String readString = parcel.readString();
            enforceNoDataAvail(parcel);
            retrieveBusinessInfo(readString);
            parcel2.writeNoException();
            return true;
        }
    }

    void retrieveBusinessInfo(String str);
}
