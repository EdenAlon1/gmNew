package com.google.android.search.verification.api;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface IMessageActionService extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IMessageActionService {
        static final int TRANSACTION_sendMessage = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IMessageActionService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.search.verification.api.IMessageActionService");
            }

            @Override // com.google.android.search.verification.api.IMessageActionService
            public void sendMessage(Intent intent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, intent);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.search.verification.api.IMessageActionService");
        }

        public static IMessageActionService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.search.verification.api.IMessageActionService");
            return queryLocalInterface instanceof IMessageActionService ? (IMessageActionService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Intent intent = (Intent) rve.a(parcel, Intent.CREATOR);
            enforceNoDataAvail(parcel);
            sendMessage(intent);
            return true;
        }
    }

    void sendMessage(Intent intent);
}
