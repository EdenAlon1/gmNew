package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dfxk;
import defpackage.dktx;
import defpackage.eiej;
import defpackage.eifu;
import defpackage.eifv;
import defpackage.eifw;
import defpackage.eihh;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class GroupMember implements Parcelable {
    public static final Parcelable.Creator<GroupMember> CREATOR = new eifu();

    public static eifv f() {
        eiej eiejVar = new eiej();
        eiejVar.b("");
        eiejVar.d(false);
        eiejVar.f(eifw.UNKNOWN);
        return eiejVar;
    }

    public abstract eifw a();

    public abstract RcsDestinationId b();

    public abstract Optional c();

    public abstract String d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract boolean e();

    public final String toString() {
        return String.format("GroupMember {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", dktx.PHONE_NUMBER.c(b())), String.format("displayName=%s", dktx.USER_ID.c(d())), String.format("referrer=%s", dktx.PHONE_NUMBER.c(c())), String.format("isOwnUser=%s", Boolean.valueOf(e())), String.format("status=%s", a()))));
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [android.os.Parcelable, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, b(), i, false);
        dfxk.m(parcel, 2, d(), false);
        if (c().isPresent()) {
            dfxk.k(parcel, 3, c().get(), i, false);
        }
        dfxk.d(parcel, 4, e());
        eihh.c(parcel, 5, a());
        dfxk.c(parcel, a);
    }
}
