package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzqs extends ffhv implements ffjm {
    final /* synthetic */ Optional a;
    final /* synthetic */ bzqw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzqs(ffgu ffguVar, Optional optional, bzqw bzqwVar) {
        super(2, ffguVar);
        this.a = optional;
        this.b = bzqwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzqs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        boolean z = true;
        if (this.a.isPresent()) {
            eygi eygiVar = ((fcks) this.a.get()).b;
            eygiVar.getClass();
            bzqw bzqwVar = this.b;
            enru enruVar = bzqw.a;
            if ((eygiVar.contains(new Integer(cgye.ETOUFFEE.h)) && eygiVar.contains(new Integer(cgye.ETOUFFEE_GROUPS.h))) != ((bzqa) bzqwVar.e.b()).i()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bzqs bzqsVar = new bzqs(ffguVar, this.a, this.b);
        bzqsVar.c = obj;
        return bzqsVar;
    }
}
