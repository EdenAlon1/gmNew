package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akby implements cnjx, cnjs {
    public static final enru a = enru.c("com/google/android/apps/messaging/restore/listeners/RestoreAfterAppUpdateBootAndPackageReplacedListener");
    public final ffbr b;
    public final ffbr c;
    public final Context d;
    private final ffbr e;
    private final ffsk f;

    public akby(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar, Context context) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffskVar.getClass();
        context.getClass();
        this.e = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.f = ffskVar;
        this.d = context;
    }

    @Override // defpackage.cnjs
    public final void a() {
        if (((aspb) this.e.b()).a()) {
            ensk e = a.e();
            e.Y(ente.a, "BugleBackup");
            ((enrr) e.h("com/google/android/apps/messaging/restore/listeners/RestoreAfterAppUpdateBootAndPackageReplacedListener", "onBootComplete", 86, "RestoreAfterAppUpdateBootAndPackageReplacedListener.kt")).q("RestoreAfterAppUpdate#onBootComplete called");
            axol.k(this.f, null, new akbw(this, null), 3);
        }
    }

    @Override // defpackage.cnjx
    public final void b() {
        if (((aspb) this.e.b()).a()) {
            ensk e = a.e();
            e.Y(ente.a, "BugleBackup");
            ((enrr) e.h("com/google/android/apps/messaging/restore/listeners/RestoreAfterAppUpdateBootAndPackageReplacedListener", "onPackageReplaced", 57, "RestoreAfterAppUpdateBootAndPackageReplacedListener.kt")).q("RestoreAfterAppUpdate#onPackageReplaced called");
            axol.k(this.f, null, new akbx(this, null), 3);
        }
    }
}
