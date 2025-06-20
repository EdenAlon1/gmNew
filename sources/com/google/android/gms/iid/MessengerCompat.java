package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.dgpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MessengerCompat implements ReflectedParcelable {
    public static final Parcelable.Creator<MessengerCompat> CREATOR = new dgpl();
    final Messenger a;

    public MessengerCompat(IBinder iBinder) {
        this.a = new Messenger(iBinder);
    }

    public final IBinder a() {
        return this.a.getBinder();
    }

    public final void b(Message message) {
        this.a.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((MessengerCompat) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a.getBinder());
    }
}
