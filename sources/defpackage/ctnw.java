package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctnw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctof b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctnw(ctof ctofVar, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ctofVar;
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctnw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ctof ctofVar = this.b;
                List list = this.c;
                this.a = 1;
                obj = ctofVar.f(list, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            return (ctje) obj;
        } catch (Throwable th) {
            csjb e = this.b.n.e();
            e.I("Error while generating smart suggestions");
            e.s(th);
            axnw.h(((cfyt) this.b.j.b()).b(th));
            ctin ctinVar = new ctin();
            ctinVar.b(fbqx.EXCEPTION_THROWN);
            return ctinVar.a();
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ctnw(this.b, this.c, ffguVar);
    }
}
