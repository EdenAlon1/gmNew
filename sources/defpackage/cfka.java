package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfka extends ffhv implements ffji {
    int a;
    final /* synthetic */ fgcq b;
    final /* synthetic */ Set c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfka(fgcq fgcqVar, Set set, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = fgcqVar;
        this.c = set;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cfjz cfjzVar = new cfjz(this.b, this.c);
            this.a = 1;
            obj = fgbj.a(cfjzVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        long longValue = ((Number) obj).longValue();
        csjb c = cfki.a.c();
        c.I("At least one item in the tranche was cancelled before execution completed");
        c.z("workItemId", longValue);
        c.r();
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cfka(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
