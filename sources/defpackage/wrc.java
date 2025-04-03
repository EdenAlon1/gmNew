package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrc extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ List c;
    final /* synthetic */ wrg d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrc(ffgu ffguVar, List list, wrg wrgVar) {
        super(3, ffguVar);
        this.c = list;
        this.d = wrgVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wrc wrcVar = new wrc((ffgu) obj3, this.c, this.d);
        wrcVar.e = (ffxy) obj;
        wrcVar.b = obj2;
        return wrcVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxx c;
        int i;
        ffhh ffhhVar = ffhh.a;
        int i2 = this.a;
        ffci.b(obj);
        if (i2 == 0) {
            ?? r2 = this.e;
            aaxe aaxeVar = (aaxe) this.b;
            List list = this.c;
            ArrayList<wqq> arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((wqq) obj2).a().contains(aaxeVar.a())) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
            for (wqq wqqVar : arrayList) {
                wrg wrgVar = this.d;
                ffxx ffzhVar = new ffzh(new wrd(null), wqqVar.b());
                Object b = wrgVar.e.b();
                b.getClass();
                boolean booleanValue = ((Boolean) fflm.a((Optional) b, false)).booleanValue();
                long j = ffpw.a;
                Object b2 = wrgVar.d.b();
                b2.getClass();
                long e = ffpy.e(((Number) b2).longValue(), ffpz.c);
                wre wreVar = new wre(wqqVar, null);
                if (booleanValue) {
                    ffzhVar = axta.a(ffzhVar, e, 1, wreVar);
                }
                ffzk ffzkVar = new ffzk(ffzhVar, new wrf(null));
                String simpleName = wqqVar.getClass().getSimpleName();
                simpleName.getClass();
                arrayList2.add(axrb.a(ffzkVar, simpleName));
            }
            if (arrayList2.isEmpty()) {
                c = new ffyg(ffel.a);
                i = 1;
            } else {
                wrg wrgVar2 = this.d;
                long j2 = ffpw.a;
                Object b3 = this.d.c.b();
                b3.getClass();
                long e2 = ffpy.e(((Number) b3).longValue(), ffpz.c);
                ffxx[] ffxxVarArr = (ffxx[]) ffdx.ak(arrayList2).toArray(new ffxx[0]);
                int length = ffxxVarArr.length;
                boolean[] zArr = new boolean[length];
                for (int i3 = 0; i3 < length; i3++) {
                    zArr[i3] = false;
                }
                int length2 = ffxxVarArr.length;
                ArrayList arrayList3 = new ArrayList(length2);
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2) {
                    arrayList3.add(new fgbt(ffxxVarArr[i4], new wqv(zArr, i5, null)));
                    i4++;
                    i5++;
                }
                ffzh ffzhVar2 = new ffzh(new wra(wrgVar2.b, e2, ffxxVarArr, zArr, null), new wqy((ffxx[]) ffdx.ak(arrayList3).toArray(new ffxx[0])));
                wrg wrgVar3 = this.d;
                ffbr ffbrVar = wrgVar3.c;
                fgdj c2 = axrb.c(wrgVar3.g.a, "TrustedContactsUiAdapter");
                Object b4 = ffbrVar.b();
                b4.getClass();
                c = axsp.c(ffzhVar2, c2, wrgVar3.b, ffpy.e(((Number) b4).longValue(), ffpz.c), new wrb(null));
                i = 1;
            }
            this.a = i;
            if (ffyk.c(r2, c, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
