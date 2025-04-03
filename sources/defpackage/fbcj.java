package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fbcj extends fbcg {
    private final engw b;

    public fbcj(Iterable iterable) {
        this.b = engw.j(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fbcg
    public final fbch a(Object obj) {
        int i = engw.d;
        engr engrVar = new engr();
        engw engwVar = this.b;
        int size = engwVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            fbcg fbcgVar = (fbcg) engwVar.get(i2);
            try {
                engrVar.h(fbcgVar.a(obj));
            } catch (RuntimeException e) {
                fbco.b(e, fbcgVar, obj);
            }
        }
        engw g = engrVar.g();
        return !g.isEmpty() ? ((enou) g).c == 1 ? new fbcn((fbch) enjk.l(g)) : new fbck(g) : fbch.a;
    }
}
