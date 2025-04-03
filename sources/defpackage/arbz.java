package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class arbz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ arca b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arbz(arca arcaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = arcaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((arbz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fgcm fgcmVar = this.b.b;
            fgcmVar.f(((Duration) fgcmVar.c()).plus(ernk.g(1)));
            while (true) {
                long millis = ernk.g(1).toMillis();
                this.a = 1;
                if (ffsw.c(millis, this) == ffhhVar) {
                    return ffhhVar;
                }
                fgcm fgcmVar2 = this.b.b;
                fgcmVar2.f(((Duration) fgcmVar2.c()).plus(ernk.g(1)));
            }
        }
        fgcm fgcmVar22 = this.b.b;
        fgcmVar22.f(((Duration) fgcmVar22.c()).plus(ernk.g(1)));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new arbz(this.b, ffguVar);
    }
}
