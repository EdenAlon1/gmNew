package com.google.firebase.appindexing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.firebase.appindexing.internal.IAppIndexingCallback;
import defpackage.eunq;
import defpackage.eunu;
import defpackage.euoj;
import defpackage.euow;
import defpackage.eupd;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IAppIndexingService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IAppIndexingService {
        static final int TRANSACTION_get = 10;
        static final int TRANSACTION_getIndexable = 5;
        static final int TRANSACTION_mutate = 8;
        static final int TRANSACTION_patch = 7;
        static final int TRANSACTION_remove = 2;
        static final int TRANSACTION_removeAll = 3;
        static final int TRANSACTION_removeTypes = 9;
        static final int TRANSACTION_search = 6;
        static final int TRANSACTION_update = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IAppIndexingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingService");
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void get(IAppIndexingCallback iAppIndexingCallback, String[] strArr, eunq eunqVar, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAppIndexingCallback);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                rve.d(obtainAndWriteInterfaceToken, eunqVar);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void getIndexable(IAppIndexingCallback iAppIndexingCallback, euow euowVar, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAppIndexingCallback);
                rve.d(obtainAndWriteInterfaceToken, euowVar);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public euoj mutate(IStatusCallback iStatusCallback, eupd eupdVar, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, eupdVar);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                euoj euojVar = (euoj) rve.a(transactAndReadException, euoj.CREATOR);
                transactAndReadException.recycle();
                return euojVar;
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void patch(IStatusCallback iStatusCallback, Thing[] thingArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeTypedArray(thingArr, 0);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void remove(IStatusCallback iStatusCallback, String[] strArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void removeAll(IStatusCallback iStatusCallback, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void removeTypes(IStatusCallback iStatusCallback, String[] strArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void search(IAppIndexingCallback iAppIndexingCallback, eunu[] eunuVarArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iAppIndexingCallback);
                obtainAndWriteInterfaceToken.writeTypedArray(eunuVarArr, 0);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void update(IStatusCallback iStatusCallback, Thing[] thingArr, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeTypedArray(thingArr, 0);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.firebase.appindexing.internal.IAppIndexingService");
        }

        public static IAppIndexingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
            return queryLocalInterface instanceof IAppIndexingService ? (IAppIndexingService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Thing[] thingArr = (Thing[]) parcel.createTypedArray(Thing.CREATOR);
                    ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    update(asInterface, thingArr, apiMetadata);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String[] createStringArray = parcel.createStringArray();
                    ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    remove(asInterface2, createStringArray, apiMetadata2);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    ApiMetadata apiMetadata3 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    removeAll(asInterface3, apiMetadata3);
                    parcel2.writeNoException();
                    return true;
                case 4:
                default:
                    return false;
                case 5:
                    IAppIndexingCallback asInterface4 = IAppIndexingCallback.Stub.asInterface(parcel.readStrongBinder());
                    euow euowVar = (euow) rve.a(parcel, euow.CREATOR);
                    ApiMetadata apiMetadata4 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    getIndexable(asInterface4, euowVar, apiMetadata4);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    IAppIndexingCallback asInterface5 = IAppIndexingCallback.Stub.asInterface(parcel.readStrongBinder());
                    eunu[] eunuVarArr = (eunu[]) parcel.createTypedArray(eunu.CREATOR);
                    ApiMetadata apiMetadata5 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    search(asInterface5, eunuVarArr, apiMetadata5);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    IStatusCallback asInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Thing[] thingArr2 = (Thing[]) parcel.createTypedArray(Thing.CREATOR);
                    ApiMetadata apiMetadata6 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    patch(asInterface6, thingArr2, apiMetadata6);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    IStatusCallback asInterface7 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    eupd eupdVar = (eupd) rve.a(parcel, eupd.CREATOR);
                    ApiMetadata apiMetadata7 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    euoj mutate = mutate(asInterface7, eupdVar, apiMetadata7);
                    parcel2.writeNoException();
                    rve.e(parcel2, mutate);
                    return true;
                case 9:
                    IStatusCallback asInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String[] createStringArray2 = parcel.createStringArray();
                    ApiMetadata apiMetadata8 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    removeTypes(asInterface8, createStringArray2, apiMetadata8);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    IAppIndexingCallback asInterface9 = IAppIndexingCallback.Stub.asInterface(parcel.readStrongBinder());
                    String[] createStringArray3 = parcel.createStringArray();
                    eunq eunqVar = (eunq) rve.a(parcel, eunq.CREATOR);
                    ApiMetadata apiMetadata9 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                    enforceNoDataAvail(parcel);
                    get(asInterface9, createStringArray3, eunqVar, apiMetadata9);
                    parcel2.writeNoException();
                    return true;
            }
        }
    }

    void get(IAppIndexingCallback iAppIndexingCallback, String[] strArr, eunq eunqVar, ApiMetadata apiMetadata);

    void getIndexable(IAppIndexingCallback iAppIndexingCallback, euow euowVar, ApiMetadata apiMetadata);

    euoj mutate(IStatusCallback iStatusCallback, eupd eupdVar, ApiMetadata apiMetadata);

    void patch(IStatusCallback iStatusCallback, Thing[] thingArr, ApiMetadata apiMetadata);

    void remove(IStatusCallback iStatusCallback, String[] strArr, ApiMetadata apiMetadata);

    void removeAll(IStatusCallback iStatusCallback, ApiMetadata apiMetadata);

    void removeTypes(IStatusCallback iStatusCallback, String[] strArr, ApiMetadata apiMetadata);

    void search(IAppIndexingCallback iAppIndexingCallback, eunu[] eunuVarArr, ApiMetadata apiMetadata);

    void update(IStatusCallback iStatusCallback, Thing[] thingArr, ApiMetadata apiMetadata);
}
