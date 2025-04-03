package com.google.android.ims.rcsservice.events;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.ims.rcsservice.events.IEventObserver;
import defpackage.rve;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IEvent extends IInterface {

    /* compiled from: PG */
    public static abstract class Stub extends BaseStub implements IEvent {
        static final int TRANSACTION_ping = 3;
        static final int TRANSACTION_subscribe = 1;
        static final int TRANSACTION_unsubscribe = 2;

        /* compiled from: PG */
        public static class Proxy extends BaseProxy implements IEvent {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.events.IEvent");
            }

            @Override // com.google.android.ims.rcsservice.events.IEvent
            public void ping() {
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.ims.rcsservice.events.IEvent
            public int subscribe(int i, IEventObserver iEventObserver) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                rve.f(obtainAndWriteInterfaceToken, iEventObserver);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.rcsservice.events.IEvent
            public void unsubscribe(int i, int i2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.events.IEvent");
        }

        public static IEvent asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.events.IEvent");
            return queryLocalInterface instanceof IEvent ? (IEvent) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                int readInt = parcel.readInt();
                IEventObserver asInterface = IEventObserver.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                int subscribe = subscribe(readInt, asInterface);
                parcel2.writeNoException();
                parcel2.writeInt(subscribe);
            } else if (i == 2) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                unsubscribe(readInt2, readInt3);
                parcel2.writeNoException();
            } else {
                if (i != 3) {
                    return false;
                }
                ping();
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void ping();

    int subscribe(int i, IEventObserver iEventObserver);

    void unsubscribe(int i, int i2);
}
