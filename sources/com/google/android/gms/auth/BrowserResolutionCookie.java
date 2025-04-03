package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dezl;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BrowserResolutionCookie extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BrowserResolutionCookie> CREATOR = new dezl();
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public boolean f;
    public boolean g;

    private BrowserResolutionCookie() {
        this.d = "/";
        this.e = -1L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BrowserResolutionCookie) {
            BrowserResolutionCookie browserResolutionCookie = (BrowserResolutionCookie) obj;
            if (dfwq.a(this.a, browserResolutionCookie.a) && dfwq.a(this.b, browserResolutionCookie.b) && dfwq.a(this.c, browserResolutionCookie.c) && dfwq.a(this.d, browserResolutionCookie.d) && dfwq.a(Long.valueOf(this.e), Long.valueOf(browserResolutionCookie.e)) && dfwq.a(Boolean.valueOf(this.f), Boolean.valueOf(browserResolutionCookie.f)) && dfwq.a(Boolean.valueOf(this.g), Boolean.valueOf(browserResolutionCookie.g))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Long.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, this.a, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.j(parcel, 5, this.e);
        dfxk.d(parcel, 6, this.f);
        dfxk.d(parcel, 7, this.g);
        dfxk.c(parcel, a);
    }

    public BrowserResolutionCookie(String str, String str2, String str3, String str4, long j, boolean z, boolean z2) {
        this.d = "/";
        this.e = -1L;
        dfwv.l(str);
        this.a = str;
        dfwv.l(str2);
        this.b = str2;
        dfwv.l(str3);
        this.c = str3;
        dfwv.l(str4);
        this.d = str4;
        this.e = j;
        this.f = z;
        this.g = z2;
    }
}
