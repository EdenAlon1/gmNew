package com.google.firebase.appindexing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.eunw;
import defpackage.euoy;
import defpackage.rve;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IAppIndexingCallback extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAppIndexingCallback {
        static final int TRANSACTION_onGet = 4;
        static final int TRANSACTION_onGetIndexableResponse = 2;
        static final int TRANSACTION_onSearch = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAppIndexingCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingCallback");
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingCallback
            public void onGet(Status status, List<Thing> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeList(list);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingCallback
            public void onGetIndexableResponse(euoy euoyVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, euoyVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingCallback
            public void onSearch(Status status, eunw[] eunwVarArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeTypedArray(eunwVarArr, 0);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.firebase.appindexing.internal.IAppIndexingCallback");
        }

        public static IAppIndexingCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingCallback");
            return queryLocalInterface instanceof IAppIndexingCallback ? (IAppIndexingCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                euoy euoyVar = (euoy) rve.a(parcel, euoy.CREATOR);
                enforceNoDataAvail(parcel);
                onGetIndexableResponse(euoyVar);
                return true;
            }
            if (i == 3) {
                Status status = (Status) rve.a(parcel, Status.CREATOR);
                eunw[] eunwVarArr = (eunw[]) parcel.createTypedArray(eunw.CREATOR);
                enforceNoDataAvail(parcel);
                onSearch(status, eunwVarArr);
                return true;
            }
            if (i != 4) {
                return false;
            }
            Status status2 = (Status) rve.a(parcel, Status.CREATOR);
            ArrayList b = rve.b(parcel);
            enforceNoDataAvail(parcel);
            onGet(status2, b);
            return true;
        }
    }

    void onGet(Status status, List<Thing> list);

    void onGetIndexableResponse(euoy euoyVar);

    void onSearch(Status status, eunw[] eunwVarArr);
}
