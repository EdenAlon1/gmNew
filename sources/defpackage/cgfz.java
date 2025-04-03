package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgfz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cggd b;
    final /* synthetic */ Instant c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgfz(ffgu ffguVar, cggd cggdVar, Instant instant) {
        super(2, ffguVar);
        this.b = cggdVar;
        this.c = instant;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgfz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        cgga cggaVar = new cgga(this.c);
        this.a = 1;
        Object b = ctzl.b(cggdVar.b, cggaVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cgfz cgfzVar = new cgfz(ffguVar, this.b, this.c);
        cgfzVar.d = obj;
        return cgfzVar;
    }
}
