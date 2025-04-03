package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjsh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjsn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjsh(ffgu ffguVar, cjsn cjsnVar) {
        super(2, ffguVar);
        this.b = cjsnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjsh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ListenableFuture d = ((cjui) this.b.b).d.d();
            d.getClass();
            this.a = 1;
            obj = fgfz.c(d, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        eygr eygrVar = ((ewrq) obj).b;
        eygrVar.getClass();
        return ffdx.M(eygrVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjsh cjshVar = new cjsh(ffguVar, this.b);
        cjshVar.c = obj;
        return cjshVar;
    }
}
