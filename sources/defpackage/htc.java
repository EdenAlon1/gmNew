package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class htc extends ffkk implements ffji {
    final /* synthetic */ hte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htc(hte hteVar) {
        super(1);
        this.a = hteVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        hte hteVar = this.a;
        synchronized (hteVar.e) {
            hta htaVar = hteVar.f;
            htaVar.getClass();
            Object obj2 = htaVar.b;
            obj2.getClass();
            int i = htaVar.d;
            cog cogVar = htaVar.c;
            if (cogVar == null) {
                cogVar = new cog((byte[]) null);
                htaVar.c = cogVar;
                htaVar.f.e(obj2, cogVar);
            }
            htaVar.a(obj, i, obj2, cogVar);
        }
        return ffcu.a;
    }
}
