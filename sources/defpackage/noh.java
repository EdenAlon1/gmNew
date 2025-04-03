package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class noh implements noa {
    final /* synthetic */ noj a;
    private final luu b = new luu(new byte[4]);

    public noh(noj nojVar) {
        this.a = nojVar;
    }

    @Override // defpackage.noa
    public final void a(luv luvVar) {
        if (luvVar.j() == 0 && (luvVar.j() & 128) != 0) {
            luvVar.L(6);
            int b = luvVar.b() / 4;
            for (int i = 0; i < b; i++) {
                luvVar.E(this.b, 4);
                luu luuVar = this.b;
                int d = luuVar.d(16);
                luuVar.n(3);
                if (d == 0) {
                    this.b.n(13);
                } else {
                    int d2 = this.b.d(13);
                    if (this.a.b.get(d2) == null) {
                        noj nojVar = this.a;
                        nojVar.b.put(d2, new nob(new noi(nojVar, d2)));
                        this.a.f++;
                    }
                }
            }
            this.a.b.remove(0);
        }
    }

    @Override // defpackage.noa
    public final void b(lvc lvcVar, ncr ncrVar, nom nomVar) {
    }
}
