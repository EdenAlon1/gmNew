package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cusw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cutc b;
    final /* synthetic */ cujo c;
    final /* synthetic */ String d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cusw(ffgu ffguVar, cutc cutcVar, cujo cujoVar, String str) {
        super(2, ffguVar);
        this.b = cutcVar;
        this.c = cujoVar;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cusw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            if (!this.b.k()) {
                return cuko.a();
            }
            if (((Boolean) cutc.b.e()).booleanValue()) {
                if (culg.b().booleanValue()) {
                    List b = culn.b((culp) this.b.f.b(), this.c.n, null, 2);
                    if (!b.isEmpty()) {
                        Iterator it = b.iterator();
                        while (it.hasNext()) {
                            if (((cuux) it.next()).a == cukx.g) {
                                return cuko.a();
                            }
                        }
                    }
                } else {
                    culp culpVar = (culp) this.b.f.b();
                    cujo cujoVar = this.c;
                    engw a = culn.a(culpVar, cujoVar.g, cujoVar.n, null, null, 12);
                    if (!a.isEmpty()) {
                        enqv it2 = a.iterator();
                        while (it2.hasNext()) {
                            buis buisVar = (buis) it2.next();
                            cukx cukxVar = cukx.a;
                            if (cukw.a(buisVar.n()) == cukx.g) {
                                return cuko.a();
                            }
                        }
                    }
                }
            }
            cutc cutcVar = this.b;
            cujo cujoVar2 = this.c;
            List b2 = ffdx.b(this.d);
            erdy erdyVar = erdy.LINK_CLICK;
            this.a = 1;
            obj = cutcVar.j(cujoVar2, b2, erdyVar, null, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        cusu cusuVar = (cusu) obj;
        return cusuVar == null ? cuko.a() : cusu.a(cusuVar, null, true, 1);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cusw cuswVar = new cusw(ffguVar, this.b, this.c, this.d);
        cuswVar.e = obj;
        return cuswVar;
    }
}
