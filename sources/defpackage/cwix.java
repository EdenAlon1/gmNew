package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwix extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ cwiz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwix(cwiz cwizVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cwizVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwix) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        aqux aquxVar;
        Object obj3;
        ffhh ffhhVar = ffhh.a;
        int i = this.b;
        if (i == 0) {
            ffci.b(obj);
            cwiz cwizVar = this.c;
            elfl e = ((aqvh) cwizVar.b.b()).e();
            this.a = cwizVar;
            this.b = 1;
            Object c = fgfz.c(e, this);
            if (c != ffhhVar) {
                obj2 = cwizVar;
                obj = c;
            }
            return ffhhVar;
        }
        if (i != 1) {
            obj3 = this.a;
            ffci.b(obj);
            obj.getClass();
            aquxVar = (aqux) ffdx.M((List) obj);
            obj2 = obj3;
            ((cwiz) obj2).d(aquxVar);
            return ffcu.a;
        }
        obj2 = this.a;
        ffci.b(obj);
        obj.getClass();
        aquxVar = (aqux) fflm.b((Optional) obj);
        if (aquxVar == null) {
            elfl b = ((aqvh) this.c.b.b()).a().b();
            b.getClass();
            this.a = obj2;
            this.b = 2;
            obj = fgfz.c(b, this);
            if (obj != ffhhVar) {
                obj3 = obj2;
                obj.getClass();
                aquxVar = (aqux) ffdx.M((List) obj);
                obj2 = obj3;
            }
            return ffhhVar;
        }
        ((cwiz) obj2).d(aquxVar);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwix(this.c, ffguVar);
    }
}
