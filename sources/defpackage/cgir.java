package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgir extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cgis b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgir(cgis cgisVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cgisVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgir) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            this.a = 1;
            obj = cggl.a();
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            dhre c = ((dgsq) this.b.b.b()).c((cgim) this.b.o.a());
            final cgis cgisVar = this.b;
            c.s(new dhqs() { // from class: cgin
                @Override // defpackage.dhqs
                public final void a(dhre dhreVar) {
                    cgis cgisVar2 = cgis.this;
                    Object b = cgisVar2.e.b();
                    b.getClass();
                    axol.m((ffsk) b, new cgip(cgisVar2, null));
                }
            });
            final cgis cgisVar2 = this.b;
            c.t(new dhqv() { // from class: cgio
                @Override // defpackage.dhqv
                public final void d(Exception exc) {
                    cgis cgisVar3 = cgis.this;
                    Object b = cgisVar3.e.b();
                    b.getClass();
                    axol.m((ffsk) b, new cgiq(cgisVar3, exc, null));
                    if (((Boolean) cgisVar3.l.b()).booleanValue()) {
                        throw new IllegalStateException("Failed to register listener on a standalone device.", exc);
                    }
                }
            });
            return ffcu.a;
        }
        ((cggu) this.b.g.b()).b(cggt.c);
        ensk h = cgis.a.h();
        h.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.O, "TrustedContactsSyncManager");
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/kids/sync/TrustedContactsSyncManager$registerListener$1", "invokeSuspend", 82, "TrustedContactsSyncManager.kt")).q("TrustedContacts not enabled due to preconditions. Does not need to register parental controls listener.");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgir(this.b, ffguVar);
    }
}
