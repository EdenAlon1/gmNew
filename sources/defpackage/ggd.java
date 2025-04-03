package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ggd extends ffkk implements ffji {
    final /* synthetic */ boolean a;
    final /* synthetic */ czq b;
    final /* synthetic */ hho c;
    final /* synthetic */ hkx d;
    final /* synthetic */ hkx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggd(boolean z, czq czqVar, hho hhoVar, hkx hkxVar, hkx hkxVar2) {
        super(1);
        this.a = z;
        this.b = czqVar;
        this.c = hhoVar;
        this.d = hkxVar;
        this.e = hkxVar2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        idd iddVar = (idd) obj;
        float f = 0.8f;
        float f2 = 1.0f;
        iddVar.x(!this.a ? ggm.a(this.d) : ((Boolean) this.b.b()).booleanValue() ? 1.0f : 0.8f);
        if (!this.a) {
            f = ggm.a(this.d);
        } else if (((Boolean) this.b.b()).booleanValue()) {
            f = 1.0f;
        }
        iddVar.y(f);
        if (!this.a) {
            f2 = ((Number) this.e.a()).floatValue();
        } else if (!((Boolean) this.b.b()).booleanValue()) {
            f2 = 0.0f;
        }
        iddVar.a(f2);
        iddVar.C(((idr) this.c.a()).b);
        return ffcu.a;
    }
}
