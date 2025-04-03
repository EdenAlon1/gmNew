package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eesl implements eerx {
    private final eesi a;

    public eesl(eesi eesiVar) {
        this.a = eesiVar;
    }

    @Override // defpackage.eerx
    public final void a(String str, boolean z) {
        int i = 0;
        while (true) {
            eesi eesiVar = this.a;
            if (i >= eesiVar.e.size()) {
                return;
            }
            ewnp ewnpVar = (ewnp) eesiVar.e.get(i);
            int a = ewno.a(ewnpVar.c);
            if (a != 0 && a == 3 && ewnpVar.b.equals(str)) {
                eesiVar.q(i);
                return;
            }
            i++;
        }
    }

    @Override // defpackage.eerx
    public final void b() {
    }
}
