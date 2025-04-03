package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqjt implements arak {
    final /* synthetic */ engw a;
    final /* synthetic */ aqjw b;

    public aqjt(aqjw aqjwVar, engw engwVar) {
        this.a = engwVar;
        this.b = aqjwVar;
    }

    @Override // defpackage.arak
    public final elfl c() {
        ekzz f = eleg.f("getAllRecipientsById");
        engw engwVar = this.a;
        final aqjw aqjwVar = this.b;
        try {
            elfl h = aqjw.j(engwVar).w().h(new emwl() { // from class: aqir
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return aqjw.this.x((engw) obj);
                }
            }, aqjwVar.c);
            f.b(h);
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.arak
    public final /* bridge */ /* synthetic */ Object d() {
        return this.b.x(aqjw.j(this.a).y());
    }
}
