package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbia extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ List c;
    final /* synthetic */ dbip d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbia(List list, dbip dbipVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = list;
        this.d = dbipVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbia) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        List list;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            ffci.b(obj);
            list = obj2;
        } else {
            ffci.b(obj);
            List list2 = this.c;
            dbip dbipVar = this.d;
            this.a = list2;
            this.b = 1;
            Object a = dbipVar.b.a(this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            list = list2;
            obj = a;
        }
        list.addAll((Collection) obj);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dbia(this.c, this.d, ffguVar);
    }
}
