package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbc extends ffkk implements ffix {
    final /* synthetic */ dbe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbc(dbe dbeVar) {
        super(0);
        this.a = dbeVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        dbe dbeVar = this.a;
        boolean z = true;
        if (ffkj.e(dbeVar.f(), dbeVar.e()) && !this.a.s() && !((Boolean) this.a.c.a()).booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
