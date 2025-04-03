package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewcp extends eyfq implements eyht {
    public ewcp() {
        super(ewcq.a);
    }

    public final void a(double d) {
        copyOnWrite();
        ewcq ewcqVar = (ewcq) this.instance;
        ewcq ewcqVar2 = ewcq.a;
        eygd eygdVar = ewcqVar.b;
        if (!eygdVar.c()) {
            ewcqVar.b = eyfy.mutableCopy(eygdVar);
        }
        ewcqVar.b.h(d);
    }
}
