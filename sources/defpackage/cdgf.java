package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cdgk b;
    final /* synthetic */ cdgq c;
    final /* synthetic */ cdgm d;
    final /* synthetic */ cdgt[] e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdgf(ffgu ffguVar, cdgk cdgkVar, cdgq cdgqVar, cdgm cdgmVar, cdgt[] cdgtVarArr) {
        super(2, ffguVar);
        this.b = cdgkVar;
        this.c = cdgqVar;
        this.d = cdgmVar;
        this.e = cdgtVarArr;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdgf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        arrayList.add(this.c);
        arrayList.add(this.d);
        ffle.a(this.e, arrayList);
        cdgt[] cdgtVarArr = (cdgt[]) arrayList.toArray(new cdgt[arrayList.size()]);
        this.a = 1;
        Object b = cdgkVar.b(false, cdgtVarArr, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cdgf cdgfVar = new cdgf(ffguVar, this.b, this.c, this.d, this.e);
        cdgfVar.f = obj;
        return cdgfVar;
    }
}
