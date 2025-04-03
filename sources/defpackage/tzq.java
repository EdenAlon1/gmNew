package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tzq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bfki b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzq(ffgu ffguVar, bfki bfkiVar) {
        super(2, ffguVar);
        this.b = bfkiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tzq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            elfl w = this.b.w();
            w.getClass();
            this.a = 1;
            obj = fgfz.c(w, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        obj.getClass();
        return Optional.ofNullable(ffdx.N((List) obj, 0));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        tzq tzqVar = new tzq(ffguVar, this.b);
        tzqVar.c = obj;
        return tzqVar;
    }
}
