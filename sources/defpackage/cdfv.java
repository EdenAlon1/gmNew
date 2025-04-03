package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdfv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ cdfy c;
    final /* synthetic */ ccce d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdfv(ffgu ffguVar, List list, cdfy cdfyVar, ccce ccceVar, int i, String str) {
        super(2, ffguVar);
        this.b = list;
        this.c = cdfyVar;
        this.d = ccceVar;
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdfv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        boolean z = true;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            List<ccce> list = this.b;
            ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
            for (ccce ccceVar : list) {
                cdfy cdfyVar = this.c;
                ffhe ffheVar = ffhe.a;
                arrayList.add(ffra.b(cdfyVar.c, ekxi.a(ffheVar), ffsm.a, new cdfw(null, this.c, this.d, ccceVar, this.e, this.f)));
            }
            this.a = 1;
            obj = ffqv.a(arrayList, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        Iterable iterable = (Iterable) obj;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue()) {
                    break;
                }
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cdfv cdfvVar = new cdfv(ffguVar, this.b, this.c, this.d, this.e, this.f);
        cdfvVar.g = obj;
        return cdfvVar;
    }
}
