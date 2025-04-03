package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egnt extends egjl {
    public final llf a;
    private final eghy b;

    public egnt(eghy eghyVar) {
        llf llfVar = new llf();
        this.a = llfVar;
        this.b = eghyVar;
        llfVar.p(eghyVar.a(), new llh() { // from class: egns
            @Override // defpackage.llh
            public final void a(Object obj) {
                egnt.this.a.j((egih) obj);
            }
        });
    }

    @Override // defpackage.egjl
    public final lld a() {
        return this.a;
    }

    @Override // defpackage.egjl
    public final void b(int i) {
        this.b.b(i);
    }

    @Override // defpackage.egjl
    public final void c() {
        this.b.c();
    }
}
