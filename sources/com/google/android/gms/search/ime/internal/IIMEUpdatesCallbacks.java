package com.google.android.gms.search.ime.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.search.ime.GetCorpusHandlesRegisteredForIMECall$Response;
import com.google.android.gms.search.ime.GetIMEUpdatesCall$Response;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface IIMEUpdatesCallbacks extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IIMEUpdatesCallbacks {
        static final int TRANSACTION_onGetCorpusHandlesRegisteredForIMEResponse = 2;
        static final int TRANSACTION_onGetIMEUpdatesResponse = 3;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IIMEUpdatesCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.search.ime.internal.IIMEUpdatesCallbacks");
            }

            @Override // com.google.android.gms.search.ime.internal.IIMEUpdatesCallbacks
            public void onGetCorpusHandlesRegisteredForIMEResponse(GetCorpusHandlesRegisteredForIMECall$Response getCorpusHandlesRegisteredForIMECall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getCorpusHandlesRegisteredForIMECall$Response);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.search.ime.internal.IIMEUpdatesCallbacks
            public void onGetIMEUpdatesResponse(GetIMEUpdatesCall$Response getIMEUpdatesCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, getIMEUpdatesCall$Response);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.search.ime.internal.IIMEUpdatesCallbacks");
        }

        public static IIMEUpdatesCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.ime.internal.IIMEUpdatesCallbacks");
            return queryLocalInterface instanceof IIMEUpdatesCallbacks ? (IIMEUpdatesCallbacks) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                GetCorpusHandlesRegisteredForIMECall$Response getCorpusHandlesRegisteredForIMECall$Response = (GetCorpusHandlesRegisteredForIMECall$Response) rve.a(parcel, GetCorpusHandlesRegisteredForIMECall$Response.CREATOR);
                enforceNoDataAvail(parcel);
                onGetCorpusHandlesRegisteredForIMEResponse(getCorpusHandlesRegisteredForIMECall$Response);
                return true;
            }
            if (i != 3) {
                return false;
            }
            GetIMEUpdatesCall$Response getIMEUpdatesCall$Response = (GetIMEUpdatesCall$Response) rve.a(parcel, GetIMEUpdatesCall$Response.CREATOR);
            enforceNoDataAvail(parcel);
            onGetIMEUpdatesResponse(getIMEUpdatesCall$Response);
            return true;
        }
    }

    void onGetCorpusHandlesRegisteredForIMEResponse(GetCorpusHandlesRegisteredForIMECall$Response getCorpusHandlesRegisteredForIMECall$Response);

    void onGetIMEUpdatesResponse(GetIMEUpdatesCall$Response getIMEUpdatesCall$Response);
}
