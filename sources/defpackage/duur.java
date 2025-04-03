package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duur {
    public static final duur a = new duur();
    public static final duur b = new duur(null);
    public final Integer c = null;
    public final boolean d = false;

    private duur() {
    }

    public final boolean a() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        duur duurVar = (duur) obj;
        return emxb.a(this.c, duurVar.c) && this.d == duurVar.d;
    }

    public final int hashCode() {
        Integer num = this.c;
        if (num == null) {
            return Integer.MIN_VALUE;
        }
        int i = true != this.d ? 0 : Integer.MIN_VALUE;
        num.intValue();
        return Integer.MAX_VALUE ^ i;
    }

    public final String toString() {
        if (equals(a)) {
            return "Disabled";
        }
        emwz b2 = emxa.b(this);
        b2.b("metaVersion", this.c);
        b2.h("replaceAll", this.d);
        return b2.toString();
    }

    public duur(byte[] bArr) {
    }
}
