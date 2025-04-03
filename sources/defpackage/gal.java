package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gal extends ffkk implements ffji {
    final /* synthetic */ gcz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gal(gcz gczVar) {
        super(1);
        this.a = gczVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = this.a;
        Long l = (Long) obj;
        if (l != null) {
            fuh fuhVar = (fuh) obj2;
            hal b = fuhVar.c.b(l.longValue());
            ((gdc) obj2).e.b(true == fuhVar.a.e(b.a) ? b : null);
        } else {
            ((gdc) obj2).e.b(null);
        }
        return ffcu.a;
    }
}
