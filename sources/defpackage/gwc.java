package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwc extends ffkk implements ffjn {
    final /* synthetic */ gwd a;
    final /* synthetic */ idh b;
    final /* synthetic */ jzn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwc(gwd gwdVar, idh idhVar, jzn jznVar) {
        super(3);
        this.a = gwdVar;
        this.b = idhVar;
        this.c = jznVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        icv icvVar = (icv) obj;
        iam d = this.a.a.a().d(ias.c(((iar) obj2).a));
        long b = d.b();
        jzn jznVar = this.c;
        icr a = this.b.a(b, (kah) obj3, jznVar);
        if (a instanceof icp) {
            icvVar.r(((icp) a).a);
        } else if (a instanceof icq) {
            icvVar.s(((icq) a).a);
        } else {
            if (!(a instanceof ico)) {
                throw new ffcd();
            }
            icvVar.q(((ico) a).a);
        }
        icvVar.n(ial.a(d.b, d.c));
        return ffcu.a;
    }
}
