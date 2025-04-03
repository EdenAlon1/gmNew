package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aepi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aepk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aepi(ffgu ffguVar, aepk aepkVar) {
        super(2, ffguVar);
        this.b = aepkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aepi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            aepk aepkVar = this.b;
            ListenableFuture c = aepkVar.b.c(aepkVar.a);
            this.a = 1;
            obj = fgfz.c(c, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ((eixn) obj).b();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aepi aepiVar = new aepi(ffguVar, this.b);
        aepiVar.c = obj;
        return aepiVar;
    }
}
