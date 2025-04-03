package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.dizg;
import defpackage.eier;
import defpackage.eigt;
import defpackage.eigu;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class MessageNotification implements Parcelable {
    public static final Parcelable.Creator<MessageNotification> CREATOR = new eigt();

    public static eigu e() {
        eier eierVar = new eier();
        eierVar.e(TraceId.b().d());
        return eierVar;
    }

    public abstract Conversation a();

    public abstract Message b();

    public abstract TraceId c();

    public abstract Optional d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(final Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, a(), i, false);
        dfxk.k(parcel, 2, b(), i, false);
        dfxk.k(parcel, 3, c(), i, false);
        if (dizg.v()) {
            d().ifPresent(new Consumer() { // from class: eigs
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    eihh.d(parcel, 4, (Instant) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        dfxk.c(parcel, a);
    }
}
