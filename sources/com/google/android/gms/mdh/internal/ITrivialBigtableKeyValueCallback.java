package com.google.android.gms.mdh.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.TrivialBigtableKeyValue;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ITrivialBigtableKeyValueCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements ITrivialBigtableKeyValueCallback {
        static final int TRANSACTION_onRangeRetrieved = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements ITrivialBigtableKeyValueCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdh.internal.ITrivialBigtableKeyValueCallback");
            }

            @Override // com.google.android.gms.mdh.internal.ITrivialBigtableKeyValueCallback
            public void onRangeRetrieved(Status status, List<TrivialBigtableKeyValue> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdh.internal.ITrivialBigtableKeyValueCallback");
        }

        public static ITrivialBigtableKeyValueCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdh.internal.ITrivialBigtableKeyValueCallback");
            return queryLocalInterface instanceof ITrivialBigtableKeyValueCallback ? (ITrivialBigtableKeyValueCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) rve.a(parcel, Status.CREATOR);
            ArrayList createTypedArrayList = parcel.createTypedArrayList(TrivialBigtableKeyValue.CREATOR);
            enforceNoDataAvail(parcel);
            onRangeRetrieved(status, createTypedArrayList);
            return true;
        }
    }

    void onRangeRetrieved(Status status, List<TrivialBigtableKeyValue> list);
}
