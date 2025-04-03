package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gaj extends ffkk implements ffji {
    final /* synthetic */ gcz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaj(gcz gczVar) {
        super(1);
        this.a = gczVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        int i = ((gdj) obj).a;
        Object obj2 = this.a;
        gdc gdcVar = (gdc) obj2;
        Long d = gdcVar.d();
        if (d != null) {
            fuh fuhVar = (fuh) obj2;
            fuhVar.b(fuhVar.c.e(d.longValue()).e);
        }
        gdcVar.f.b(new gdj(i));
        return ffcu.a;
    }
}
