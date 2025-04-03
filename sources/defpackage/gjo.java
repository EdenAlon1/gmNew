package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjo extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ boolean c;
    final /* synthetic */ gqr d;
    final /* synthetic */ jvu e;
    final /* synthetic */ ffji f;
    final /* synthetic */ boolean g;
    final /* synthetic */ jpo h;
    final /* synthetic */ euw i;
    final /* synthetic */ euv j;
    final /* synthetic */ boolean k;
    final /* synthetic */ int l;
    final /* synthetic */ int m;
    final /* synthetic */ jwn n;
    final /* synthetic */ ffjm o;
    final /* synthetic */ ffjm p;
    final /* synthetic */ ffjm q;
    final /* synthetic */ idh r;
    final /* synthetic */ dwn s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjo(hvi hviVar, ffjm ffjmVar, boolean z, gqr gqrVar, jvu jvuVar, ffji ffjiVar, boolean z2, jpo jpoVar, euw euwVar, euv euvVar, boolean z3, int i, int i2, jwn jwnVar, dwn dwnVar, ffjm ffjmVar2, ffjm ffjmVar3, ffjm ffjmVar4, idh idhVar) {
        super(2);
        this.a = hviVar;
        this.b = ffjmVar;
        this.c = z;
        this.d = gqrVar;
        this.e = jvuVar;
        this.f = ffjiVar;
        this.g = z2;
        this.h = jpoVar;
        this.i = euwVar;
        this.j = euvVar;
        this.k = z3;
        this.l = i;
        this.m = i2;
        this.n = jwnVar;
        this.s = dwnVar;
        this.o = ffjmVar2;
        this.p = ffjmVar3;
        this.q = ffjmVar4;
        this.r = idhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi hviVar;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi hviVar2 = this.a;
            if (this.b != null) {
                hfdVar.v(620349524);
                hviVar = eba.j(jjs.c(hvi.e, true, gjl.a), 0.0f, hdh.e(hfdVar), 0.0f, 0.0f, 13);
                hfdVar.o();
            } else {
                hfdVar.v(620733211);
                hfdVar.o();
                hviVar = hvi.e;
            }
            hvi a = ebs.a(hdh.a(hviVar2.a(hviVar), this.c, hcb.b(R.string.default_error_message, hfdVar)), 280.0f, 56.0f);
            idl idlVar = new idl(this.d.a(this.c));
            jvu jvuVar = this.e;
            ffji ffjiVar = this.f;
            boolean z = this.g;
            jpo jpoVar = this.h;
            euw euwVar = this.i;
            euv euvVar = this.j;
            boolean z2 = this.k;
            int i = this.l;
            int i2 = this.m;
            jwn jwnVar = this.n;
            dwn dwnVar = this.s;
            eri.c(jvuVar, ffjiVar, a, z, jpoVar, euwVar, euvVar, z2, i, i2, jwnVar, null, dwnVar, idlVar, hpx.d(-757328870, new gjn(jvuVar, z, z2, jwnVar, dwnVar, this.c, this.b, this.o, this.p, this.q, this.d, this.r), hfdVar), hfdVar, 0, 196608, 4096);
        }
        return ffcu.a;
    }
}
