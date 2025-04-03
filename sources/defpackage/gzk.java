package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzk extends ffkk implements ffix {
    final /* synthetic */ gzl a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzk(gzl gzlVar, Object obj) {
        super(0);
        this.a = gzlVar;
        this.b = obj;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        gzl gzlVar = this.a;
        hbq p = gzlVar.p();
        Object obj = this.b;
        float b = p.b(obj);
        if (!Float.isNaN(b)) {
            gzlVar.h.a(b, 0.0f);
            gzlVar.m(null);
        }
        gzlVar.l(obj);
        return ffcu.a;
    }
}
