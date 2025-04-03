package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dayr extends ffhv implements ffjm {
    final /* synthetic */ cskc a;
    final /* synthetic */ engw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dayr(ffgu ffguVar, cskc cskcVar, engw engwVar) {
        super(2, ffguVar);
        this.a = cskcVar;
        this.b = engwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dayr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.p("Local cms keys");
        enqv it = this.b.iterator();
        it.getClass();
        while (it.hasNext()) {
            bqvj bqvjVar = (bqvj) it.next();
            byte[] q = bqvjVar.q();
            q.getClass();
            String j = eoeg.h.j(q);
            int length = q.length;
            String ac = length >= 32 ? ffpc.ac(j, 3) : a.f(length, "short(", ")");
            csjb c = this.a.c();
            c.y(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, bqvjVar.l());
            c.y("index", bqvjVar.k());
            c.A("cmsId", bqvjVar.o());
            c.A("correlationId", bqvjVar.n());
            c.A("ref", ac);
            c.y("length", length);
            c.r();
        }
        this.a.p("End cms keys");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dayr dayrVar = new dayr(ffguVar, this.a, this.b);
        dayrVar.c = obj;
        return dayrVar;
    }
}
