package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class orj implements Runnable {
    final /* synthetic */ orm a;

    public orj(orm ormVar) {
        this.a = ormVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        orm ormVar = this.a;
        int a = (int) (ormVar.a.a() * 0.125f);
        int a2 = ormVar.d.y <= a ? ormVar.d.y - a : ormVar.d.y >= ormVar.a.a() - a ? (ormVar.d.y - ormVar.a.a()) + a : 0;
        if (a2 == 0) {
            return;
        }
        if (!ormVar.e) {
            if (Math.abs(ormVar.c.y - ormVar.d.y) < ((int) (ormVar.a.a() * 0.125f * 0.25f))) {
                return;
            }
        }
        ormVar.e = true;
        if (a2 <= a) {
            a = a2;
        }
        float a3 = ormVar.a.a();
        int signum = (int) Math.signum(a);
        int pow = (int) (signum * 70 * ((float) Math.pow(Math.min(1.0f, Math.abs(a) / ((int) (a3 * 0.125f))), 10.0d)));
        ((ork) ormVar.a).a.aJ(0, pow == 0 ? signum : pow, -1, -1, null);
        ormVar.a.b(ormVar.b);
        ormVar.a.c(ormVar.b);
    }
}
