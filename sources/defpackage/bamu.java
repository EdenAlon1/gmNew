package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bamu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Optional b;
    final /* synthetic */ bamw c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bamu(ffgu ffguVar, Optional optional, bamw bamwVar) {
        super(2, ffguVar);
        this.b = optional;
        this.c = bamwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bamu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        if (this.b.isEmpty()) {
            return Optional.empty();
        }
        elfl j = ((ayif) this.c.w.b()).j((engw) this.b.get());
        this.a = 1;
        Object c = fgfz.c(j, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bamu bamuVar = new bamu(ffguVar, this.b, this.c);
        bamuVar.d = obj;
        return bamuVar;
    }
}
