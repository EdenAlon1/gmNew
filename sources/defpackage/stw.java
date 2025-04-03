package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stw extends ffhv implements ffjm {
    final /* synthetic */ buxm a;
    final /* synthetic */ Instant b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stw(ffgu ffguVar, buxm buxmVar, Instant instant) {
        super(2, ffguVar);
        this.a = buxmVar;
        this.b = instant;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((stw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bvhd a = bvhn.a();
        a.z("+birthdaySuggestions");
        a.d(new sty(this.a, this.b));
        return a.b().y();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        stw stwVar = new stw(ffguVar, this.a, this.b);
        stwVar.c = obj;
        return stwVar;
    }
}
