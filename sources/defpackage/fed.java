package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fed extends ffkk implements ffji {
    final /* synthetic */ fcp a;
    final /* synthetic */ fdh b;
    final /* synthetic */ ffkx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fed(fcp fcpVar, fdh fdhVar, ffkx ffkxVar) {
        super(1);
        this.a = fcpVar;
        this.b = fdhVar;
        this.c = ffkxVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iku ikuVar = (iku) obj;
        if (this.a.b(ikuVar.c, this.b)) {
            ikuVar.b();
            this.c.a = true;
        }
        return ffcu.a;
    }
}
