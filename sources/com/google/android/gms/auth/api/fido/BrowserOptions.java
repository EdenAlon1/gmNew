package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.ChromeOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfcc;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.eyee;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BrowserOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BrowserOptions> CREATOR = new dfcc();
    public final String a;
    public final ChromeOptions b;
    private final eyee c;

    public BrowserOptions(String str, eyee eyeeVar, ChromeOptions chromeOptions) {
        dfwv.n(str);
        this.a = str;
        this.c = eyeeVar;
        this.b = chromeOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserOptions)) {
            return false;
        }
        BrowserOptions browserOptions = (BrowserOptions) obj;
        return dfwq.a(this.a, browserOptions.a) && dfwq.a(this.c, browserOptions.c) && dfwq.a(this.b, browserOptions.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, str, false);
        eyee eyeeVar = this.c;
        dfxk.f(parcel, 3, eyeeVar == null ? null : eyeeVar.I(), false);
        dfxk.k(parcel, 4, this.b, i, false);
        dfxk.c(parcel, a);
    }
}
