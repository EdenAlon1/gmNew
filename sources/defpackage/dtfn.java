package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtfn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dtfs b;
    final /* synthetic */ Duration c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtfn(dtfs dtfsVar, Duration duration, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dtfsVar;
        this.c = duration;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtfn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dpfm dpfmVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        while (this.b.f()) {
            dtfs dtfsVar = this.b;
            dpea dpeaVar = dtfsVar.b;
            int i2 = 0;
            if (dpeaVar != null && (dpfmVar = dpeaVar.g) != null) {
                int i3 = dpfmVar.h;
                dpfmVar.h = 0;
                i2 = i3;
            }
            dtfsVar.a.a.h(new dteo(dten.a(i2)));
            Duration duration = this.c;
            this.a = 1;
            if (ernj.a(duration, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dtfn(this.b, this.c, ffguVar);
    }
}
