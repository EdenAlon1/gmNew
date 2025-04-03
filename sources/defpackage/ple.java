package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ple {
    public static final plf a(float f) {
        Float valueOf = Float.valueOf(f);
        String str = plg.a;
        str.getClass();
        Object b = new pgt(valueOf, str, 1).a("Ratio must be in range (0.0, 1.0). Use SplitType.expandContainers() instead of 0 or 1.", new pld(f)).b();
        b.getClass();
        float floatValue = ((Number) b).floatValue();
        return new plf("ratio:" + floatValue, floatValue);
    }
}
