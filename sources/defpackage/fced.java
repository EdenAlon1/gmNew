package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fced extends eyfq implements eyht {
    public fced() {
        super(fcee.b);
    }

    public final void a(fgtb fgtbVar) {
        copyOnWrite();
        fcee fceeVar = (fcee) this.instance;
        eygj eygjVar = fcee.a;
        fgtbVar.getClass();
        eygi eygiVar = fceeVar.c;
        if (!eygiVar.c()) {
            fceeVar.c = eyfy.mutableCopy(eygiVar);
        }
        fceeVar.c.h(fgtbVar.a());
    }
}
