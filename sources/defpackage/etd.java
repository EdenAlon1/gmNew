package defpackage;

import androidx.compose.foundation.relocation.BringIntoViewRequesterElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etd extends ffkk implements ffjm {
    final /* synthetic */ eva a;
    final /* synthetic */ jpo b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ exk e;
    final /* synthetic */ jvu f;
    final /* synthetic */ jwn g;
    final /* synthetic */ hvi h;
    final /* synthetic */ hvi i;
    final /* synthetic */ hvi j;
    final /* synthetic */ hvi k;
    final /* synthetic */ fhi l;
    final /* synthetic */ boolean m;
    final /* synthetic */ ffji n;
    final /* synthetic */ jvj o;
    final /* synthetic */ jzn p;
    final /* synthetic */ epe q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etd(eva evaVar, jpo jpoVar, int i, int i2, exk exkVar, jvu jvuVar, jwn jwnVar, hvi hviVar, hvi hviVar2, hvi hviVar3, hvi hviVar4, epe epeVar, fhi fhiVar, boolean z, ffji ffjiVar, jvj jvjVar, jzn jznVar) {
        super(2);
        this.a = evaVar;
        this.b = jpoVar;
        this.c = i;
        this.d = i2;
        this.e = exkVar;
        this.f = jvuVar;
        this.g = jwnVar;
        this.h = hviVar;
        this.i = hviVar2;
        this.j = hviVar3;
        this.k = hviVar4;
        this.q = epeVar;
        this.l = fhiVar;
        this.m = z;
        this.n = ffjiVar;
        this.o = jvjVar;
        this.p = jznVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi eysVar;
        hvi g;
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        if (hfdVar.J((intValue & 3) != 2, intValue & 1)) {
            hvi g2 = huz.g(ebs.u(hvi.e, ((jzq) this.a.e.a()).a, 0.0f, 2), new euh(this.c, this.d, this.b));
            exk exkVar = this.e;
            jvu jvuVar = this.f;
            jwn jwnVar = this.g;
            boolean F = hfdVar.F(this.a);
            eva evaVar = this.a;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new etc(evaVar);
                hfdVar.y(f);
            }
            ffix ffixVar = (ffix) f;
            dqs c = exkVar.c();
            long j = jvuVar.c;
            int e = jpm.e(j);
            long j2 = exkVar.b;
            int e2 = e != jpm.e(j2) ? jpm.e(j) : jpm.a(j) != jpm.a(j2) ? jpm.a(j) : jpm.d(j);
            exkVar.b = jvuVar.c;
            jwk a = eyq.a(jwnVar, jvuVar.b);
            int ordinal = c.ordinal();
            if (ordinal == 0) {
                eysVar = new eys(exkVar, e2, a, ffixVar);
            } else {
                if (ordinal != 1) {
                    throw new ffcd();
                }
                eysVar = new euk(exkVar, e2, a, ffixVar);
            }
            g = huz.g(hxo.b(g2).a(eysVar).a(this.h).a(this.i), new exo(this.b));
            fgo.a(g.a(this.j).a(this.k).a(new BringIntoViewRequesterElement(this.q)), hpx.d(-1172467467, new etb(this.l, this.a, this.m, this.n, this.f, this.o, this.p, this.d), hfdVar), hfdVar, 48);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
