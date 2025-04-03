package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cywx implements cywp {
    public final ffsk a;
    public final ffbr b;
    public final ffbr c;
    public final atjh d;
    public final atjd e;
    public final ffxx f;
    public final cyvq g;
    private final Optional h;

    /* JADX WARN: Type inference failed for: r1v1, types: [cyxw, java.lang.Object] */
    public cywx(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, cyvq cyvqVar, Optional optional, atjh atjhVar, atjd atjdVar) {
        ffskVar.getClass();
        cyvqVar.getClass();
        this.a = ffskVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.g = cyvqVar;
        this.h = optional;
        this.d = atjhVar;
        this.e = atjdVar;
        optional.isPresent();
        this.f = optional.get().a();
    }

    @Override // defpackage.cywp
    public final fgdj a(cyvt cyvtVar) {
        ffxx a = fgau.a(new cyws(this.g.c), new cyww(this, cyvtVar, null));
        int i = fgcz.a;
        return fgbn.b(a, this.a, fgcy.a(0L, 3), null);
    }
}
