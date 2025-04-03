package defpackage;

import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alnv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ alnw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alnv(alnw alnwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = alnwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alnv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            if (!((Optional) this.b.b.b()).isEmpty()) {
                aloc alocVar = (aloc) ((Optional) this.b.b.b()).get();
                this.a = 1;
                obj = alocVar.a(this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            return ffcu.a;
        }
        eisx eisxVar = (eisx) obj;
        if (eisxVar != null) {
            alnw alnwVar = this.b;
            if (eisxVar.a() == alnwVar.a.a()) {
                Iterator it = ((Set) alnwVar.c.b()).iterator();
                while (it.hasNext()) {
                    ((alnu) it.next()).a();
                }
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new alnv(this.b, ffguVar);
    }
}
