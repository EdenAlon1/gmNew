package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abrs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ absj b;
    final /* synthetic */ Set c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abrs(absj absjVar, Set set, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = absjVar;
        this.c = set;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abrs) c((akzw) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        elfl t = this.b.b.t(this.c);
        t.getClass();
        this.a = 1;
        Object c = fgfz.c(t, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abrs(this.b, this.c, ffguVar);
    }
}
