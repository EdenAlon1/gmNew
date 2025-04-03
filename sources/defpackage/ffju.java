package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffju implements Serializable, ffkf {
    private final Class a;
    protected final Object b;
    private final String c;
    private final String d;
    private final boolean e;
    private final int f;
    private final int g;

    public ffju(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.b = obj;
        this.a = cls;
        this.c = str;
        this.d = str2;
        this.e = 1 == (i2 & 1);
        this.f = i;
        this.g = i2 >> 1;
    }

    @Override // defpackage.ffkf
    public final int dR() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffju)) {
            return false;
        }
        ffju ffjuVar = (ffju) obj;
        return this.e == ffjuVar.e && this.f == ffjuVar.f && this.g == ffjuVar.g && ffkj.e(this.b, ffjuVar.b) && ffkj.e(this.a, ffjuVar.a) && this.c.equals(ffjuVar.c) && this.d.equals(ffjuVar.d);
    }

    public final int hashCode() {
        Object obj = this.b;
        return ((((((((((((obj != null ? obj.hashCode() : 0) * 31) + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231)) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        int i = fflc.a;
        return ffld.a(this);
    }

    public ffju(int i, Class cls, String str, String str2, int i2) {
        this(i, ffjz.f, cls, str, str2, i2);
    }
}
