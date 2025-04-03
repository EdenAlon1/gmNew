package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjj extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ gqr b;
    final /* synthetic */ String c;
    final /* synthetic */ ffji d;
    final /* synthetic */ boolean e;
    final /* synthetic */ jpo f;
    final /* synthetic */ euw g;
    final /* synthetic */ euv h;
    final /* synthetic */ int i;
    final /* synthetic */ int j;
    final /* synthetic */ jwn k;
    final /* synthetic */ ffjm l;
    final /* synthetic */ ffjm m;
    final /* synthetic */ idh n;
    final /* synthetic */ dwn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjj(hvi hviVar, gqr gqrVar, String str, ffji ffjiVar, boolean z, jpo jpoVar, euw euwVar, euv euvVar, int i, int i2, jwn jwnVar, dwn dwnVar, ffjm ffjmVar, ffjm ffjmVar2, idh idhVar) {
        super(2);
        this.a = hviVar;
        this.b = gqrVar;
        this.c = str;
        this.d = ffjiVar;
        this.e = z;
        this.f = jpoVar;
        this.g = euwVar;
        this.h = euvVar;
        this.i = i;
        this.j = i2;
        this.k = jwnVar;
        this.o = dwnVar;
        this.l = ffjmVar;
        this.m = ffjmVar2;
        this.n = idhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi hviVar = this.a;
            hfdVar.v(611500667);
            hfdVar.o();
            hvi a = ebs.a(hdh.a(hviVar.a(hvi.e), false, hcb.b(R.string.default_error_message, hfdVar)), 280.0f, 56.0f);
            idl idlVar = new idl(this.b.a(false));
            String str = this.c;
            ffji ffjiVar = this.d;
            boolean z = this.e;
            jpo jpoVar = this.f;
            euw euwVar = this.g;
            euv euvVar = this.h;
            int i = this.i;
            int i2 = this.j;
            jwn jwnVar = this.k;
            dwn dwnVar = this.o;
            eri.d(str, ffjiVar, a, z, jpoVar, euwVar, euvVar, false, i, i2, jwnVar, null, dwnVar, idlVar, hpx.d(1474611661, new gji(str, z, jwnVar, dwnVar, this.l, this.m, this.b, this.n), hfdVar), hfdVar, 0, 196608, 4096);
        }
        return ffcu.a;
    }
}
