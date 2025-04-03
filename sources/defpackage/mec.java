package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mec {
    public final String a;
    public final lqc b;
    public final lqc c;
    public final int d;
    public final int e;

    public mec(String str, lqc lqcVar, lqc lqcVar2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        lti.a(z);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.a = str;
        this.b = lqcVar;
        lti.f(lqcVar2);
        this.c = lqcVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mec mecVar = (mec) obj;
            if (this.d == mecVar.d && this.e == mecVar.e && this.a.equals(mecVar.a) && this.b.equals(mecVar.b) && this.c.equals(mecVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d + 527) * 31) + this.e) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
