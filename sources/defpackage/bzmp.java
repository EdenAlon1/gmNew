package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzmp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bznk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzmp(bznk bznkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bznkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzmp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Object b = this.b.n.b();
            b.getClass();
            Iterable iterable = (Iterable) b;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (!((bzhr) it.next()).c()) {
                        return false;
                    }
                }
            }
            comc n = this.b.n();
            this.a = 1;
            obj = n.c(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return Boolean.valueOf(((bzma) obj).j);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzmp(this.b, ffguVar);
    }
}
