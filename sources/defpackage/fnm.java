package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fnm extends ffkk implements ffix {
    final /* synthetic */ fkh a;
    final /* synthetic */ fnv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnm(fnv fnvVar, fkh fkhVar) {
        super(0);
        this.b = fnvVar;
        this.a = fkhVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (!ffkj.e(this.b, this.a.a)) {
            ffdx.v(this.a.b, new fnl(this.b));
            hio hioVar = this.a.c;
            if (hioVar != null) {
                hioVar.a();
            }
        }
        return ffcu.a;
    }
}
