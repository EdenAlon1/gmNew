package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xvq extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ xvs c;
    final /* synthetic */ List d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvq(ffgu ffguVar, xvs xvsVar, List list) {
        super(3, ffguVar);
        this.c = xvsVar;
        this.d = list;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xvq xvqVar = new xvq((ffgu) obj3, this.c, this.d);
        xvqVar.e = (ffxy) obj;
        xvqVar.b = (Object[]) obj2;
        return xvqVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r9 = this.e;
            List L = ffdo.L((dlwk[]) this.b);
            xvs xvsVar = this.c;
            List list = this.d;
            dmmk dmmkVar = new dmmk(L, new xvm(xvsVar, list), new xvn(xvsVar, list), new xvo(xvsVar, list));
            this.a = 1;
            if (r9.fQ(dmmkVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
