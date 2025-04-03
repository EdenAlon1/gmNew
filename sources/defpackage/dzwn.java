package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzwn extends dzwu {
    private dzwu a;
    private dzwt b;

    public static dzwu d(dzwu dzwuVar, final emwl emwlVar) {
        final dzwn dzwnVar = new dzwn();
        dzwnVar.a = dzwuVar;
        dzwnVar.b = new dzwt() { // from class: dzwm
            @Override // defpackage.dzwt
            public final void a(Object obj) {
                dzwn.this.c(emwlVar.apply(obj));
            }
        };
        return dzwnVar;
    }

    @Override // defpackage.dzwu
    protected final synchronized void a() {
        this.a.j(this.b);
    }

    @Override // defpackage.dzwu
    protected final synchronized void b() {
        this.a.l(this.b);
    }
}
