package com.google.android.ims.rcsservice.events;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IEventObserver extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IEventObserver {
        static final int TRANSACTION_notifyEvent = 1;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IEventObserver {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.events.IEventObserver");
            }

            @Override // com.google.android.ims.rcsservice.events.IEventObserver
            public void notifyEvent(Event event) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                rve.d(obtainAndWriteInterfaceToken, event);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.events.IEventObserver");
        }

        public static IEventObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.events.IEventObserver");
            return queryLocalInterface instanceof IEventObserver ? (IEventObserver) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            Event event = (Event) rve.a(parcel, Event.CREATOR);
            enforceNoDataAvail(parcel);
            notifyEvent(event);
            return true;
        }
    }

    void notifyEvent(Event event);
}
