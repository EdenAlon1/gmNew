package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdxd extends ffhv implements ffjm {
    final /* synthetic */ ccca a;
    final /* synthetic */ cdxe b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdxd(ffgu ffguVar, ccca cccaVar, cdxe cdxeVar) {
        super(2, ffguVar);
        this.a = cccaVar;
        this.b = cdxeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdxd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ccbz b = ccbz.b(this.a.d);
        if (b == null) {
            b = ccbz.UNSPECIFIED;
        }
        b.getClass();
        if (((cdxh) Map.EL.getOrDefault(this.b.b, b, null)) == null) {
            throw new IllegalArgumentException("Undefined CMS Backfill Missing Field task type.");
        }
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cdxd cdxdVar = new cdxd(ffguVar, this.a, this.b);
        cdxdVar.c = obj;
        return cdxdVar;
    }
}
