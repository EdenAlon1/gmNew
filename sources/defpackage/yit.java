package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yit extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yja b;
    final /* synthetic */ Instant c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yit(yja yjaVar, Instant instant, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yjaVar;
        this.c = instant;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yit) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            yja yjaVar = this.b;
            Instant instant = this.c;
            this.a = 1;
            if (yjaVar.c(instant, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yit(this.b, this.c, ffguVar);
    }
}
