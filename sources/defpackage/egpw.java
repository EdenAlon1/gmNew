package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egpw extends egjl {
    private final llf a;
    private final egig b;

    public egpw(egig egigVar) {
        final llf llfVar = new llf();
        this.a = llfVar;
        this.b = egigVar;
        llfVar.p(egigVar.a(), new llh() { // from class: egpv
            @Override // defpackage.llh
            public final void a(Object obj) {
                llf.this.j((egih) obj);
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
