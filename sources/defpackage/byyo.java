package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byyo {
    public static final byyp a(String str) {
        if (str == null) {
            return new byyp(-1);
        }
        Integer g = ffpc.g(str);
        return g != null ? new byyp(g.intValue()) : new byyp(str);
    }

    public static final String b(byyp byypVar) {
        byypVar.getClass();
        String str = byypVar.a;
        return str == null ? String.valueOf(byypVar.b) : str;
    }
}
