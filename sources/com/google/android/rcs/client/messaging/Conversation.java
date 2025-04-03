package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dktx;
import defpackage.ehzz;
import defpackage.eica;
import defpackage.eiiv;
import defpackage.eijb;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public abstract class Conversation implements Parcelable {
    public static final Parcelable.Creator<Conversation> CREATOR = new ehzz();

    public abstract eica a();

    public abstract String b();

    public abstract int c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("Conversation {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", b()), String.format("destination=%s", dktx.PHONE_NUMBER.c(a())), String.format("type=%s", c() != 1 ? "GROUP" : "ONE_TO_ONE"))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        eijb.o(parcel, 1, c() - 1);
        eijb.r(parcel, 2, b());
        eijb.p(parcel, 3, a(), new eiiv() { // from class: ehzy
            @Override // defpackage.eiiv
            public final void a(Parcel parcel2, Object obj, int i2) {
                eijd.a(parcel2, (eica) obj);
            }
        }, i);
        eijb.l(parcel);
    }
}
