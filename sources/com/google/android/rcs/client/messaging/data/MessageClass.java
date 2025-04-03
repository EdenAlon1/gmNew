package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.diyv;
import defpackage.diyy;
import defpackage.eiep;
import defpackage.eigm;
import defpackage.eign;
import defpackage.eigo;
import defpackage.eigp;
import defpackage.eihh;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class MessageClass implements Parcelable {
    public static final diyy a = diyv.b("include_disposition_notification_required");
    public static final Parcelable.Creator<MessageClass> CREATOR = new eigm();

    public static eign e() {
        eiep eiepVar = new eiep();
        eiepVar.e(eigp.UNKNOWN_MESSAGE_SOURCE);
        eiepVar.d(eigo.UNKNOWN_MESSAGE_PRIORITY);
        eiepVar.c(true);
        eiepVar.b(true);
        return eiepVar;
    }

    public static boolean f(MessageClass messageClass) {
        if (messageClass.b() == eigp.CONTROL) {
            return messageClass.a() == eigo.HIGH || messageClass.a() == eigo.NORMAL;
        }
        return false;
    }

    public static boolean g(MessageClass messageClass) {
        return (messageClass.b() == eigp.CONTROL && messageClass.a() == eigo.LOW) ? false : true;
    }

    public static boolean h(MessageClass messageClass) {
        if (messageClass.b() == eigp.USER) {
            return messageClass.a() == eigo.HIGH || messageClass.a() == eigo.NORMAL;
        }
        return false;
    }

    public static boolean i(MessageClass messageClass) {
        return (messageClass.a().equals(eigo.HIGH) || messageClass.a().equals(eigo.NORMAL)) && !messageClass.d();
    }

    public abstract eigo a();

    public abstract eigp b();

    public abstract boolean c();

    public abstract boolean d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = dfxk.a(parcel);
        eihh.c(parcel, 1, b());
        eihh.c(parcel, 2, a());
        dfxk.d(parcel, 3, d());
        if (((Boolean) a.a()).booleanValue()) {
            dfxk.d(parcel, 4, c());
        }
        dfxk.c(parcel, a2);
    }
}
