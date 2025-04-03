package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dfxk;
import defpackage.dktx;
import defpackage.eige;
import defpackage.eigy;
import defpackage.eihh;
import defpackage.eihn;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class LocationInformation implements Parcelable, eihn {
    public static final Parcelable.Creator<LocationInformation> CREATOR = new eige();

    public abstract double a();

    public abstract double b();

    public abstract Optional c();

    public abstract Optional d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    @Override // defpackage.eihn
    public final void hz(eigy eigyVar) {
        eigyVar.f(this);
    }

    public abstract String i();

    public final String toString() {
        return String.format("LocationInformation {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", i()), String.format("timestamp=%s", h()), String.format("label=%s", dktx.LOCATION.c(e())), String.format("location=%s", dktx.LOCATION.c(f())), String.format("longitude=%s", dktx.LOCATION.c(Double.valueOf(b()))), String.format("latitude=%s", dktx.LOCATION.c(Double.valueOf(a()))), String.format("radius=%s", dktx.LOCATION.c(g())), String.format("entity=%s", dktx.LOCATION.c(c())))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, i(), false);
        if (h().isPresent()) {
            eihh.d(parcel, 2, (Instant) h().get());
        }
        if (d().isPresent()) {
            eihh.d(parcel, 3, (Instant) d().get());
        }
        if (e().isPresent()) {
            dfxk.m(parcel, 4, (String) e().get(), false);
        }
        if (f().isPresent()) {
            dfxk.m(parcel, 5, (String) f().get(), false);
        }
        dfxk.g(parcel, 6, b());
        dfxk.g(parcel, 7, a());
        if (g().isPresent()) {
            dfxk.g(parcel, 8, ((Double) g().get()).doubleValue());
        }
        if (c().isPresent()) {
            dfxk.m(parcel, 9, (String) c().get(), false);
        }
        dfxk.c(parcel, a);
    }
}
