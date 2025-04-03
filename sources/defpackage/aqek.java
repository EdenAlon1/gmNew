package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqek extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqem b;
    final /* synthetic */ Instant c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqek(aqem aqemVar, Instant instant, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aqemVar;
        this.c = instant;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqek) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        aqem aqemVar = this.b;
        Instant instant = this.c;
        this.a = 1;
        if (aqemVar.b(instant, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqek(this.b, this.c, ffguVar);
    }
}
