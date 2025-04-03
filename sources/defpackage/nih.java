package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nih {
    public static int a(luv luvVar) {
        int e = luvVar.e();
        if (luvVar.e() == 1684108385) {
            luvVar.L(8);
            int i = e - 16;
            if (i == 1) {
                return luvVar.j();
            }
            if (i == 2) {
                return luvVar.n();
            }
            if (i == 3) {
                return luvVar.l();
            }
            if (i == 4 && (luvVar.d() & 128) == 0) {
                return luvVar.m();
            }
        }
        luj.f("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static ngd b(int i, String str, luv luvVar, boolean z, boolean z2) {
        int a = a(luvVar);
        if (z2) {
            a = Math.min(1, a);
        }
        if (a >= 0) {
            return z ? new ngi(str, null, engw.r(Integer.toString(a))) : new nfy("und", str, Integer.toString(a));
        }
        luj.f("MetadataUtil", "Failed to parse uint8 attribute: ".concat(lvk.e(i)));
        return null;
    }

    public static ngi c(int i, String str, luv luvVar) {
        int e = luvVar.e();
        if (luvVar.e() == 1684108385 && e >= 22) {
            luvVar.L(10);
            int n = luvVar.n();
            if (n > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(n);
                String sb2 = sb.toString();
                int n2 = luvVar.n();
                if (n2 > 0) {
                    sb2 = a.g(n2, sb2, "/");
                }
                return new ngi(str, null, engw.r(sb2));
            }
        }
        luj.f("MetadataUtil", "Failed to parse index/count attribute: ".concat(lvk.e(i)));
        return null;
    }

    public static ngi d(int i, String str, luv luvVar) {
        int e = luvVar.e();
        if (luvVar.e() == 1684108385) {
            luvVar.L(8);
            return new ngi(str, null, engw.r(luvVar.x(e - 16)));
        }
        luj.f("MetadataUtil", "Failed to parse text attribute: ".concat(lvk.e(i)));
        return null;
    }
}
