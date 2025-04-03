package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dabr implements erqj {
    final /* synthetic */ dabs a;

    public dabr(dabs dabsVar) {
        this.a = dabsVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final Integer num = (Integer) obj;
        efbd.e(eldl.l(new Runnable() { // from class: dabq
            @Override // java.lang.Runnable
            public final void run() {
                Integer num2 = num;
                dabr dabrVar = dabr.this;
                dabrVar.a.a(num2.intValue());
                if (((csiy) dabrVar.a.b.b()).a) {
                    ensk e = dabs.a.e();
                    e.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/ui/dark/DarkModeManager$1", "onSuccess", 112, "DarkModeManager.java")).q("DarkModeManager: Dark mode set after activity#onCreate");
                    ((akzt) dabrVar.a.c.b()).e("Bugle.DarkMode.Activity.LateRead", num2.intValue());
                }
            }
        }));
        ((akzt) this.a.c.b()).c("Bugle.DarkMode.Activity.Recreate.InLaunch");
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ensk j = dabs.a.j();
        j.Y(ente.a, "Bugle");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/ui/dark/DarkModeManager$1", "onFailure", (char) 127, "DarkModeManager.java")).q("DarkModeManager: Get DarkMode error");
    }
}
