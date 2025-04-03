package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edwu implements erqj {
    final /* synthetic */ edwv a;

    public edwu(edwv edwvVar) {
        this.a = edwvVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((enrr) ((enrr) edwv.a.h()).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltPeriodicJobImpl$LogUploaderFinishCallback", "onSuccess", 205, "MobaltPeriodicJobImpl.java")).q("Mobalt: finish sending logs to the Cobalt Server successfully");
        edwv edwvVar = this.a;
        edwvVar.n.b(edwvVar.c, (int) edwvVar.d, "SUCCESS");
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (th instanceof CancellationException) {
            ((enrr) ((enrr) ((enrr) edwv.a.i()).g(th)).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltPeriodicJobImpl$LogUploaderFinishCallback", "onFailure", (char) 193, "MobaltPeriodicJobImpl.java")).q("Mobalt: cancelled sending logs to the Cobalt Server");
            edwv edwvVar = this.a;
            edwvVar.n.b(edwvVar.c, (int) edwvVar.d, "CANCELLED");
        } else {
            ((enrr) ((enrr) ((enrr) edwv.a.i()).g(th)).h("com/google/android/libraries/privatetelemetry/mobalt/impl/MobaltPeriodicJobImpl$LogUploaderFinishCallback", "onFailure", (char) 198, "MobaltPeriodicJobImpl.java")).q("Mobalt: failed sending logs to the Cobalt Server");
            edwv edwvVar2 = this.a;
            edwvVar2.n.b(edwvVar2.c, (int) edwvVar2.d, "FAILURE");
        }
    }
}
