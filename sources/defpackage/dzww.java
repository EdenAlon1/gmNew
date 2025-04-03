package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzww {
    public final dzwu a;
    final /* synthetic */ dzwy c;
    public boolean b = false;
    private final dzwt d = new dzwt() { // from class: dzwv
        @Override // defpackage.dzwt
        public final void a(Object obj) {
            dzww dzwwVar = dzww.this;
            synchronized (dzwwVar.c) {
                synchronized (dzwwVar) {
                    if (!dzwwVar.b) {
                        dzwwVar.b = true;
                        dzwy dzwyVar = dzwwVar.c;
                        dzwyVar.b--;
                    }
                    dzwwVar.c.a.put(dzwwVar.a, obj);
                    dzwy dzwyVar2 = dzwwVar.c;
                    if (dzwyVar2.b == 0) {
                        dzwyVar2.c(new dzwx(dzwyVar2.a));
                    }
                }
            }
        }
    };

    public dzww(dzwy dzwyVar, dzwu dzwuVar) {
        this.c = dzwyVar;
        this.a = dzwuVar;
    }

    public final synchronized void a() {
        this.b = false;
        this.a.j(this.d);
    }

    public final synchronized void b() {
        this.a.l(this.d);
        this.b = false;
    }
}
