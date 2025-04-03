package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnpg extends ffhv implements ffjm {
    final /* synthetic */ cnph a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnpg(cnph cnphVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cnphVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnpg) c((cnpk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (this.a.c.a()) {
            cnph cnphVar = this.a;
            Iterator it = cnphVar.d.iterator();
            while (it.hasNext()) {
                axol.k(cnphVar.b, null, new cnpf((aene) it.next(), null), 3);
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cnpg(this.a, ffguVar);
    }
}
