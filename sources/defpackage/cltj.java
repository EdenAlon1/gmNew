package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cltj {
    private final ffbr a;

    public cltj(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final awui a(clns clnsVar, clqv clqvVar) {
        int i = clqvVar.b;
        int a = clqu.a(i);
        if (a == 0) {
            throw null;
        }
        int i2 = a - 1;
        if (i2 == 0) {
            return ((avkc) this.a.b()).a((clqvVar.b == 1 ? (clqq) clqvVar.c : clqq.a).c, false);
        }
        if (i2 != 1) {
            throw new IllegalArgumentException("No valid destination set");
        }
        String str = (i == 2 ? (cltf) clqvVar.c : cltf.a).c;
        int i3 = clnsVar.c;
        int a2 = clnr.a(i3);
        if (a2 != 0 && a2 == 3) {
            return ((avkc) this.a.b()).a(str, true);
        }
        int a3 = clnr.a(i3);
        if (a3 == 0 || a3 != 4) {
            throw new IllegalArgumentException("Conversation type not supported");
        }
        if (str.startsWith("sip:")) {
            str = str.substring(4);
        }
        int indexOf = str.indexOf(59);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        return ((avkc) this.a.b()).b(str);
    }
}
