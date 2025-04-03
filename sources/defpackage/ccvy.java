package defpackage;

import android.content.Context;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccvy extends ffhv implements ffjm {
    final /* synthetic */ ccwa a;
    final /* synthetic */ crwx b;
    final /* synthetic */ bqvj c;
    final /* synthetic */ EnumSet d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccvy(ffgu ffguVar, ccwa ccwaVar, crwx crwxVar, bqvj bqvjVar, EnumSet enumSet) {
        super(2, ffguVar);
        this.a = ccwaVar;
        this.b = crwxVar;
        this.c = bqvjVar;
        this.d = enumSet;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccvy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        crwq crwqVar = this.a.h;
        ((crvx) crwqVar.b.b()).getClass();
        ckch ckchVar = (ckch) crwqVar.c.b();
        ckchVar.getClass();
        ckds ckdsVar = (ckds) crwqVar.d.b();
        ckdsVar.getClass();
        coxk coxkVar = (coxk) crwqVar.e.b();
        coxkVar.getClass();
        akzt akztVar = (akzt) crwqVar.f.b();
        akztVar.getClass();
        aolr aolrVar = (aolr) crwqVar.g.b();
        aolrVar.getClass();
        ((Context) crwqVar.i.b()).getClass();
        atab atabVar = (atab) crwqVar.j.b();
        atabVar.getClass();
        crwx crwxVar = this.b;
        crwxVar.getClass();
        bqvj bqvjVar = this.c;
        bqvjVar.getClass();
        crwv crwvVar = new crwv(crwqVar.a, ckchVar, ckdsVar, coxkVar, akztVar, aolrVar, crwqVar.h, atabVar, crwxVar, bqvjVar);
        if (csgj.a()) {
            EnumSet enumSet = this.d;
            return ffkj.e(enumSet, ccwa.b) ? crwvVar.d(ccwa.e) : ffkj.e(enumSet, ccwa.c) ? crwvVar.d(ccwa.f) : ffkj.e(enumSet, ccwa.d) ? crwvVar.d(ccwa.g) : crwvVar.c();
        }
        EnumSet enumSet2 = this.d;
        return ffkj.e(enumSet2, ccwa.b) ? crwvVar.d(ccwa.e) : ffkj.e(enumSet2, ccwa.c) ? crwvVar.d(ccwa.f) : crwvVar.c();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccvy ccvyVar = new ccvy(ffguVar, this.a, this.b, this.c, this.d);
        ccvyVar.e = obj;
        return ccvyVar;
    }
}
