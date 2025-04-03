package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebbr {
    private final ebbb a;
    private final fr b;
    private final eg c;
    private final ebce d;

    public ebbr(fr frVar, ebbb ebbbVar, eg egVar, ebce ebceVar) {
        this.b = frVar;
        this.a = ebbbVar;
        this.c = egVar;
        this.d = ebceVar;
    }

    public final ebbq a() {
        if (this.d != null) {
            if (fdra.a.get().d(((ebbg) this.a).a)) {
                this.d.bi();
            }
        }
        eg egVar = this.c;
        return new ebbq(this.b, this.a, egVar);
    }
}
