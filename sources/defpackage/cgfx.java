package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgfx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cggd b;
    final /* synthetic */ Instant c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgfx(ffgu ffguVar, cggd cggdVar, int i, Instant instant, int i2) {
        super(2, ffguVar);
        this.b = cggdVar;
        this.d = i;
        this.c = instant;
        this.e = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgfx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cggd cggdVar = this.b;
        cgfy cgfyVar = new cgfy(this.d, this.c, this.e);
        this.a = 1;
        Object b = ctzl.b(cggdVar.b, cgfyVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cgfx cgfxVar = new cgfx(ffguVar, this.b, this.d, this.c, this.e);
        cgfxVar.f = obj;
        return cgfxVar;
    }
}
