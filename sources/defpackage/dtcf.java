package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtcf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dtcg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtcf(dtcg dtcgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dtcgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtcf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Duration duration = dtcg.a;
            fgcm fgcmVar = this.b.c;
            fgcmVar.f(((Duration) fgcmVar.c()).plus(dtcg.a));
            while (true) {
                long j = dtcg.b;
                this.a = 1;
                if (ffsw.d(j, this) == ffhhVar) {
                    return ffhhVar;
                }
                Duration duration2 = dtcg.a;
                fgcm fgcmVar2 = this.b.c;
                fgcmVar2.f(((Duration) fgcmVar2.c()).plus(dtcg.a));
            }
        }
        Duration duration22 = dtcg.a;
        fgcm fgcmVar22 = this.b.c;
        fgcmVar22.f(((Duration) fgcmVar22.c()).plus(dtcg.a));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtcf(this.b, ffguVar);
    }
}
