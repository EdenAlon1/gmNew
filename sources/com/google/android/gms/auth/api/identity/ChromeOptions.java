package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfcp;
import defpackage.dfxk;
import defpackage.enhk;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ChromeOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChromeOptions> CREATOR = new dfcp();
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    static {
        enhk.p("org.chromium.chrome", "built_locally", "com.chrome.canary", "canary", "com.chrome.dev", "dev", "com.chrome.beta", "beta", "com.android.chrome", "stable");
    }

    public ChromeOptions(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChromeOptions)) {
            return false;
        }
        ChromeOptions chromeOptions = (ChromeOptions) obj;
        return Objects.equals(this.a, chromeOptions.a) && Objects.equals(this.b, chromeOptions.b) && this.c == chromeOptions.c && this.d == chromeOptions.d && this.e == chromeOptions.e && this.f == chromeOptions.f;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.d(parcel, 3, this.c);
        dfxk.d(parcel, 4, this.d);
        dfxk.d(parcel, 5, this.e);
        dfxk.d(parcel, 6, this.f);
        dfxk.c(parcel, a);
    }
}
