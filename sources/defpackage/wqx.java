package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqx extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public wqx(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wqx wqxVar = new wqx((ffgu) obj3);
        wqxVar.c = (ffxy) obj;
        wqxVar.b = (Object[]) obj2;
        return wqxVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r6 = this.c;
            List J = ffdo.J((dlsr[]) this.b);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : J) {
                if (((dlsr) obj2).e) {
                    arrayList.add(obj2);
                }
            }
            this.a = 1;
            if (r6.fQ(arrayList, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
