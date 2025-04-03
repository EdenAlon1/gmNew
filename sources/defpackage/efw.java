package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class efw extends ffkk implements ffix {
    final /* synthetic */ hkx a;
    final /* synthetic */ ehh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efw(hkx hkxVar, ehh ehhVar) {
        super(0);
        this.a = hkxVar;
        this.b = ehhVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        efr efrVar = (efr) this.a.a();
        return new eft(this.b, efrVar, new elp(this.b.d.c.a(), efrVar));
    }
}
