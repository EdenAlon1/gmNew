package defpackage;

import android.net.Uri;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecwh {
    public final String a;
    public final Uri b;
    final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public ecwh(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final ecwh a() {
        return new ecwh(this.a, this.b, this.c, this.d, this.e, true, this.g);
    }

    public final ecwh b() {
        if (this.b == null) {
            Log.w("PhenotypeFlag", "Setting enableAutoSubpackage on SharedPrefs-backed flags");
        }
        return new ecwh(this.a, this.b, this.c, this.d, this.e, this.f, true);
    }

    public final ecwh c() {
        if (this.c.isEmpty()) {
            return new ecwh(this.a, this.b, this.c, this.d, true, this.f, this.g);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final ecwh d(String str) {
        return new ecwh(this.a, this.b, this.c, str, this.e, this.f, this.g);
    }

    @Deprecated
    public final ecwj e(String str, double d) {
        Double valueOf = Double.valueOf(d);
        int i = ecwj.e;
        return new ecwa(this, str, valueOf, false);
    }

    @Deprecated
    public final ecwj f(String str, int i) {
        Integer valueOf = Integer.valueOf(i);
        int i2 = ecwj.e;
        return new ecvy(this, str, valueOf);
    }

    @Deprecated
    public final ecwj g(String str, long j) {
        Long valueOf = Long.valueOf(j);
        int i = ecwj.e;
        return new ecvx(this, str, valueOf, false);
    }

    @Deprecated
    public final ecwj h(String str, String str2) {
        int i = ecwj.e;
        return new ecwc(this, str, str2, false);
    }

    @Deprecated
    public final ecwj i(String str, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        int i = ecwj.e;
        return new ecvz(this, str, valueOf, false);
    }

    @Deprecated
    public final ecwj j(String str, byte[] bArr) {
        int i = ecwj.e;
        return new ecwd(this, str, bArr);
    }

    @Deprecated
    public final ecwj k(String str, Object obj, ecwg ecwgVar) {
        int i = ecwj.e;
        return new ecwe(this, str, obj, ecwgVar);
    }

    public final ecwj l(String str, double d) {
        Double valueOf = Double.valueOf(d);
        int i = ecwj.e;
        return new ecwa(this, str, valueOf, true);
    }

    public final ecwj m(String str, long j) {
        Long valueOf = Long.valueOf(j);
        int i = ecwj.e;
        return new ecvx(this, str, valueOf, true);
    }

    public final ecwj n(String str, String str2) {
        int i = ecwj.e;
        return new ecwc(this, str, str2, true);
    }

    public final ecwj o(String str, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        int i = ecwj.e;
        return new ecvz(this, str, valueOf, true);
    }

    public final ecwj p(String str, ecwg ecwgVar, String str2) {
        int i = ecwj.e;
        return new ecwf(this, str, str2, ecwgVar);
    }

    @Deprecated
    public final ecwj q(String str, float f) {
        Float valueOf = Float.valueOf(f);
        int i = ecwj.e;
        return new ecwb(this, str, valueOf);
    }

    public ecwh(Uri uri) {
        this(null, uri, "", "", false, false, false);
    }

    public ecwh() {
        this("PhenotypePrefs", null, "", "", false, false, false);
    }
}
