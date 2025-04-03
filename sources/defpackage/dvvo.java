package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvvo extends ffhv implements ffjm {
    final /* synthetic */ dvvp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvvo(dvvp dvvpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dvvpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvvo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        List a = this.a.a.a();
        a.getClass();
        enfz enfzVar = new enfz(a.size(), 1);
        Iterator it = a.iterator();
        while (it.hasNext()) {
            enfzVar.t((String) it.next(), eatw.b);
        }
        return new eats(enfzVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dvvo(this.a, ffguVar);
    }
}
