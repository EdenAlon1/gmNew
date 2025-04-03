package com.google.android.gms.cloudmessaging;

import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class IMessengerCompat$Impl extends Binder implements IInterface {
    private final Handler a;

    IMessengerCompat$Impl(Handler handler) {
        this.a = handler;
        attachInterface(this, "com.google.android.gms.iid.IMessengerCompat");
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        parcel.enforceInterface(getInterfaceDescriptor());
        if (i != 1) {
            return false;
        }
        send(parcel.readInt() != 0 ? (Message) Message.CREATOR.createFromParcel(parcel) : null);
        return true;
    }

    public void send(Message message) {
        message.arg2 = Binder.getCallingUid();
        this.a.dispatchMessage(message);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
