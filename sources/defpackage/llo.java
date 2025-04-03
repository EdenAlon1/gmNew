package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class llo {
    public static final Object a(lkk lkkVar, lkj lkjVar, ffjm ffjmVar, ffgu ffguVar) {
        Object a;
        if (lkjVar != lkj.INITIALIZED) {
            return (lkkVar.a() != lkj.DESTROYED && (a = ffsl.a(new lln(lkkVar, lkjVar, ffjmVar, null), ffguVar)) == ffhh.a) ? a : ffcu.a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }
}
