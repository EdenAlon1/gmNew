package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class coqh extends ffhv implements ffjm {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coqh(Set set, Set set2, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((coqh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Set set = this.a;
        set.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((copj) it.next()).b(this.b);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new coqh(this.a, this.b, ffguVar);
    }
}
