package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aani extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aans b;
    final /* synthetic */ String c;
    final /* synthetic */ aamr d;
    final /* synthetic */ List e;
    final /* synthetic */ List f;
    final /* synthetic */ fflb g;
    final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aani(aans aansVar, String str, aamr aamrVar, List list, List list2, fflb fflbVar, List list3, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aansVar;
        this.c = str;
        this.d = aamrVar;
        this.e = list;
        this.f = list2;
        this.g = fflbVar;
        this.h = list3;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aani) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        List list;
        fgcm fgcmVar;
        Object c;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aans aansVar = this.b;
            String str = this.c;
            aamr aamrVar = this.d;
            this.a = 1;
            obj = aansVar.b(aansVar.a, str, aamrVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ffcf ffcfVar = (ffcf) obj;
        String str2 = (String) ffcfVar.a;
        List list2 = (List) ffcfVar.b;
        if (((Boolean) ((cfup) ctjd.aC.get()).e()).booleanValue()) {
            List list3 = this.e;
            list = new ArrayList();
            for (Object obj2 : list3) {
                dltq dltqVar = (dltq) obj2;
                if (!(dltqVar instanceof dlto) || ((dlto) dltqVar).a.ordinal() != 2) {
                    list.add(obj2);
                }
            }
        } else {
            list = ffel.a;
        }
        List e = aans.e(ffdx.ad(ffdx.ad(this.f, list), list2));
        this.b.h.put(this.d.r.a(), new aamc(str2, e));
        if ((!list2.isEmpty() || !this.e.isEmpty()) && (fgcmVar = (fgcm) this.g.a) != null) {
            List list4 = this.h;
            do {
                c = fgcmVar.c();
            } while (!fgcmVar.g(c, doml.l((doml) c, str2, aans.e(ffdx.ad(e, list4)), null, new ffix() { // from class: aanh
                @Override // defpackage.ffix
                public final Object invoke() {
                    return ffcu.a;
                }
            }, null, false, false, 4193788)));
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aani(this.b, this.c, this.d, this.e, this.f, this.g, this.h, ffguVar);
    }
}
