package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aplr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aplx b;
    final /* synthetic */ amfx c;
    final /* synthetic */ apfz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aplr(aplx aplxVar, amfx amfxVar, apfz apfzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aplxVar;
        this.c = amfxVar;
        this.d = apfzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aplr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        aplx aplxVar = this.b;
        cowy cowyVar = cowy.IDLE;
        Instant instant = Instant.EPOCH;
        instant.getClass();
        amfx amfxVar = this.c;
        apfz apfzVar = this.d;
        aqux g = apfzVar.g();
        this.a = 1;
        Object d = aplxVar.d(cowyVar, instant, amfxVar, apfzVar, g, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aplr(this.b, this.c, this.d, ffguVar);
    }
}
