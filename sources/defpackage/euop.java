package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euop {
    public final eupd a;
    public final dhri b = new dhri();
    final /* synthetic */ euoq c;

    public euop(euoq euoqVar, eupd eupdVar) {
        this.c = euoqVar;
        this.a = eupdVar;
    }

    public final void a() {
        synchronized (this.c.b) {
            dfwv.i(this.c.c == 0);
            this.c.c = 1;
        }
        this.c.a.l(new euoo(this)).p(this.c, new dhqv() { // from class: euom
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                euop euopVar;
                euop euopVar2 = euop.this;
                synchronized (euopVar2.c.b) {
                    if (euopVar2.c.b.peek() == euopVar2) {
                        euopVar2.c.b.remove();
                        euoq euoqVar = euopVar2.c;
                        euoqVar.c = 0;
                        euopVar = (euop) euoqVar.b.peek();
                    } else {
                        euopVar = null;
                    }
                }
                euopVar2.b.c(exc);
                if (euopVar != null) {
                    euopVar.a();
                }
            }
        });
    }
}
