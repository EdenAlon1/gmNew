package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgg extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cdgk b;
    final /* synthetic */ Throwable c;
    final /* synthetic */ cdgq d;
    final /* synthetic */ cdgp e;
    final /* synthetic */ cdgt[] f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdgg(ffgu ffguVar, cdgk cdgkVar, Throwable th, cdgq cdgqVar, cdgp cdgpVar, cdgt[] cdgtVarArr) {
        super(2, ffguVar);
        this.b = cdgkVar;
        this.c = th;
        this.d = cdgqVar;
        this.e = cdgpVar;
        this.f = cdgtVarArr;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdgg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cdgk cdgkVar = this.b;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.d);
        arrayList.add(this.e);
        ffle.a(this.f, arrayList);
        cdgt[] cdgtVarArr = (cdgt[]) arrayList.toArray(new cdgt[arrayList.size()]);
        this.a = 1;
        Object b = cdgkVar.b(true, cdgtVarArr, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cdgg cdggVar = new cdgg(ffguVar, this.b, this.c, this.d, this.e, this.f);
        cdggVar.g = obj;
        return cdggVar;
    }
}
