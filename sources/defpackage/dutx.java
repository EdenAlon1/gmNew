package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dutx extends duuf {
    static final int a = 3095253;
    static final dutx b = new dutx(-1, -1, "");
    final String c;

    public dutx(int i, int i2, String str) {
        super(c(a, i, i2));
        this.c = str;
    }

    @Override // defpackage.duuf
    public final int a() {
        return a;
    }

    @Override // defpackage.duuf
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dutx)) {
            return false;
        }
        dutx dutxVar = (dutx) obj;
        return super.equals(obj) && this.h == dutxVar.h && this.c.equals(dutxVar.c);
    }

    @Override // defpackage.duuf
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.c});
    }

    public final String toString() {
        emwz b2 = emxa.b(this);
        b2.g("id", this.h);
        b2.b("description", this.c);
        return b2.toString();
    }
}
