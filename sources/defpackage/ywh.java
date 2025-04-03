package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ywh implements dtik {
    final /* synthetic */ dtiz a;
    final /* synthetic */ ywq b;
    private final /* synthetic */ dtik c;

    public ywh(dtiz dtizVar, ywq ywqVar) {
        this.a = dtizVar;
        this.b = ywqVar;
        this.c = dtizVar.c;
    }

    @Override // defpackage.dtik
    public final void a(boolean z, boolean z2, dteh dtehVar) {
        this.a.c.a(z, z2, dtehVar);
        if (z || !z2) {
            return;
        }
        this.b.c();
    }

    @Override // defpackage.dtik
    public final void b() {
        this.c.b();
    }

    @Override // defpackage.dtik
    public final void c() {
        this.c.c();
    }

    @Override // defpackage.dtik
    public final void d(dteh dtehVar) {
        this.a.c.d(dtehVar);
        this.b.c();
    }
}
