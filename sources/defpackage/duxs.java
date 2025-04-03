package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duxs {
    public static final duxu a;

    static {
        dunl a2 = dunl.a();
        if (a2.g == null) {
            dunu f = dunl.f();
            dunp dunpVar = new dunp(f, new dunn("ExeSeq-P10", 10, f));
            synchronized (a2.c) {
                a2.c.add(f);
            }
            a2.g = new duno(errs.b(dunpVar));
        }
        a = new duxu(a2.g);
    }
}
