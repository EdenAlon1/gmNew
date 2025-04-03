package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.TraceId;
import defpackage.dfxk;
import defpackage.dizg;
import defpackage.ehzm;
import defpackage.eiaa;
import defpackage.eicn;
import defpackage.eico;
import defpackage.eigz;
import defpackage.eihh;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class SendMessageRequest implements Parcelable, eiaa {
    public static final Parcelable.Creator<SendMessageRequest> CREATOR = new eicn();

    public static eico j() {
        ehzm ehzmVar = new ehzm();
        ehzmVar.e(MessageClass.e().a());
        ehzmVar.h(TraceId.b().d());
        ehzmVar.f(eigz.MESSAGING_METHOD_UNKNOWN);
        return ehzmVar;
    }

    public abstract PendingIntent a();

    public abstract com.google.android.rcs.client.messaging.data.Conversation b();

    public abstract Message c();

    public abstract MessageClass d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.eiaa
    public final boolean e() {
        return MessageClass.i(d());
    }

    @Override // defpackage.eiaa
    public final boolean f() {
        return b().c() == 2 ? MessageClass.g(d()) : MessageClass.h(d());
    }

    public abstract eigz g();

    public abstract TraceId h();

    public abstract Optional i();

    @Override // android.os.Parcelable
    public final void writeToParcel(final Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.B(parcel, a());
        dfxk.k(parcel, 2, b(), i, false);
        dfxk.k(parcel, 3, c(), i, false);
        dfxk.k(parcel, 4, d(), i, false);
        dfxk.k(parcel, 5, h(), i, false);
        i().ifPresent(new Consumer() { // from class: eicm
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                dfxk.f(parcel, 6, ((eyee) obj).I(), false);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (dizg.E()) {
            eihh.c(parcel, 7, g());
        }
        dfxk.c(parcel, a);
    }
}
