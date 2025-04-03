package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdfw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cdfy b;
    final /* synthetic */ ccce c;
    final /* synthetic */ ccce d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdfw(ffgu ffguVar, cdfy cdfyVar, ccce ccceVar, ccce ccceVar2, int i, String str) {
        super(2, ffguVar);
        this.b = cdfyVar;
        this.c = ccceVar;
        this.d = ccceVar2;
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdfw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cdfy cdfyVar = this.b;
        ccce ccceVar = this.c;
        cdgq cdgqVar = new cdgq(cdfy.b(ccceVar), cdfy.a(ccceVar));
        cdgm cdgmVar = new cdgm(this.c.e);
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new cdgn(this.c));
        arrayList.add(new cdgr(epeg.CMS_DEPENDENCY_MISSING));
        ccce ccceVar2 = this.d;
        int i2 = ccceVar2.d;
        String str = ccceVar2.e;
        str.getClass();
        arrayList.add(new cdgo(i2, str));
        arrayList.add(new cdgl(this.e));
        String str2 = this.f;
        cdgt[] cdgtVarArr = str2 != null ? (cdgt[]) ffdx.b(new cdgp(str2)).toArray(new cdgp[0]) : (cdgt[]) ffel.a.toArray(new cdgt[0]);
        cdgk cdgkVar = cdfyVar.a;
        ffle.a(cdgtVarArr, arrayList);
        cdgt[] cdgtVarArr2 = (cdgt[]) arrayList.toArray(new cdgt[arrayList.size()]);
        this.a = 1;
        cdgd.b(cdgqVar.a);
        Object a = ffra.a(ekxi.a(cdgkVar.b), new cdgf(null, cdgkVar, cdgqVar, cdgmVar, cdgtVarArr2), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cdfw cdfwVar = new cdfw(ffguVar, this.b, this.c, this.d, this.e, this.f);
        cdfwVar.g = obj;
        return cdfwVar;
    }
}
