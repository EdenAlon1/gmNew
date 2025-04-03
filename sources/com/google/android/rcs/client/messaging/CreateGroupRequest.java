package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfxk;
import defpackage.eiac;
import defpackage.engw;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class CreateGroupRequest implements Parcelable {
    public static final Parcelable.Creator<CreateGroupRequest> CREATOR = new eiac();

    public abstract PendingIntent a();

    public abstract engw b();

    public abstract Optional c();

    public abstract String d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    @Override // android.os.Parcelable
    public final void writeToParcel(final Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.B(parcel, a());
        dfxk.m(parcel, 2, d(), false);
        dfxk.m(parcel, 3, e(), false);
        dfxk.n(parcel, 4, b(), false);
        c().ifPresent(new Consumer() { // from class: eiab
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                dfxk.f(parcel, 5, ((eyee) obj).I(), false);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dfxk.c(parcel, a);
    }
}
