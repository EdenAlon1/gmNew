package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cspz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ csqc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cspz(csqc csqcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = csqcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cspz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            csqc csqcVar = this.b;
            cspu cspuVar = cspu.b;
            this.a = 1;
            if (csqcVar.f.fQ(cspuVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cspz(this.b, ffguVar);
    }
}
