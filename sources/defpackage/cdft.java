package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdft extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cdfy b;
    final /* synthetic */ Throwable c;
    final /* synthetic */ ccce d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdft(ffgu ffguVar, cdfy cdfyVar, Throwable th, ccce ccceVar, int i, String str) {
        super(2, ffguVar);
        this.b = cdfyVar;
        this.c = th;
        this.d = ccceVar;
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdft) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        ArrayList arrayList = new ArrayList(6);
        ccce ccceVar = this.d;
        arrayList.add(new cdgq(cdfy.b(ccceVar), cdfy.a(ccceVar)));
        arrayList.add(new cdgm(cdfy.b(this.d) == bqkw.BACKUP_DELETE ? null : this.d.e));
        arrayList.add(new cdgn(this.d));
        epeg a = axdy.a(this.c);
        a.getClass();
        arrayList.add(new cdgr(a));
        arrayList.add(new cdgl(this.e));
        String str = this.f;
        cdgt[] cdgtVarArr = str != null ? (cdgt[]) ffdx.b(new cdgp(str)).toArray(new cdgp[0]) : (cdgt[]) ffel.a.toArray(new cdgt[0]);
        cdgk cdgkVar = cdfyVar.a;
        ffle.a(cdgtVarArr, arrayList);
        cdgt[] cdgtVarArr2 = (cdgt[]) arrayList.toArray(new cdgt[arrayList.size()]);
        this.a = 1;
        Object b = cdgkVar.b(false, cdgtVarArr2, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cdft cdftVar = new cdft(ffguVar, this.b, this.c, this.d, this.e, this.f);
        cdftVar.g = obj;
        return cdftVar;
    }
}
