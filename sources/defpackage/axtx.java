package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axtx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ Duration c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axtx(ffxx ffxxVar, ffgu ffguVar, Duration duration) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = duration;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axtx) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxy ffxyVar = (ffxy) this.d;
            ffxx ffxxVar = this.b;
            axtw axtwVar = new axtw(ffxyVar, this.c);
            this.a = 1;
            if (ffxxVar.a(axtwVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axtx axtxVar = new axtx(this.b, ffguVar, this.c);
        axtxVar.d = obj;
        return axtxVar;
    }
}
