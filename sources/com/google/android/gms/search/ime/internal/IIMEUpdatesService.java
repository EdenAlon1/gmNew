package com.google.android.gms.search.ime.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.search.ime.GetCorpusHandlesRegisteredForIMECall$Request;
import com.google.android.gms.search.ime.GetIMEUpdatesCall$Request;
import com.google.android.gms.search.ime.internal.IIMEUpdatesCallbacks;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IIMEUpdatesService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IIMEUpdatesService {
        static final int TRANSACTION_getCorpusHandlesRegisteredForIME = 2;
        static final int TRANSACTION_getIMEUpdates = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IIMEUpdatesService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.ime.internal.IIMEUpdatesService");
            }

            @Override // com.google.android.gms.search.ime.internal.IIMEUpdatesService
            public void getCorpusHandlesRegisteredForIME(GetCorpusHandlesRegisteredForIMECall$Request getCorpusHandlesRegisteredForIMECall$Request, IIMEUpdatesCallbacks iIMEUpdatesCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getCorpusHandlesRegisteredForIMECall$Request);
                rve.f(obtainAndWriteInterfaceToken, iIMEUpdatesCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.ime.internal.IIMEUpdatesService
            public void getIMEUpdates(GetIMEUpdatesCall$Request getIMEUpdatesCall$Request, IIMEUpdatesCallbacks iIMEUpdatesCallbacks, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getIMEUpdatesCall$Request);
                rve.f(obtainAndWriteInterfaceToken, iIMEUpdatesCallbacks);
                rve.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.ime.internal.IIMEUpdatesService");
        }

        public static IIMEUpdatesService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.ime.internal.IIMEUpdatesService");
            return queryLocalInterface instanceof IIMEUpdatesService ? (IIMEUpdatesService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                GetCorpusHandlesRegisteredForIMECall$Request getCorpusHandlesRegisteredForIMECall$Request = (GetCorpusHandlesRegisteredForIMECall$Request) rve.a(parcel, GetCorpusHandlesRegisteredForIMECall$Request.CREATOR);
                IIMEUpdatesCallbacks asInterface = IIMEUpdatesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getCorpusHandlesRegisteredForIME(getCorpusHandlesRegisteredForIMECall$Request, asInterface, apiMetadata);
            } else {
                if (i != 3) {
                    return false;
                }
                GetIMEUpdatesCall$Request getIMEUpdatesCall$Request = (GetIMEUpdatesCall$Request) rve.a(parcel, GetIMEUpdatesCall$Request.CREATOR);
                IIMEUpdatesCallbacks asInterface2 = IIMEUpdatesCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ApiMetadata apiMetadata2 = (ApiMetadata) rve.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getIMEUpdates(getIMEUpdatesCall$Request, asInterface2, apiMetadata2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getCorpusHandlesRegisteredForIME(GetCorpusHandlesRegisteredForIMECall$Request getCorpusHandlesRegisteredForIMECall$Request, IIMEUpdatesCallbacks iIMEUpdatesCallbacks, ApiMetadata apiMetadata);

    void getIMEUpdates(GetIMEUpdatesCall$Request getIMEUpdatesCall$Request, IIMEUpdatesCallbacks iIMEUpdatesCallbacks, ApiMetadata apiMetadata);
}
