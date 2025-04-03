package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwor {
    public static final enru a = enru.c("com/google/android/apps/messaging/toast/ToastsControllerImpl");
    public final Context b;
    public final lkk c;
    public final cwos d;
    private final ffsk e;
    private boolean f;

    public cwor(Context context, ffsk ffskVar, lkk lkkVar, cwos cwosVar) {
        ffskVar.getClass();
        lkkVar.getClass();
        cwosVar.getClass();
        this.b = context;
        this.e = ffskVar;
        this.c = lkkVar;
        this.d = cwosVar;
    }

    public final void a() {
        ((enrr) a.e().h("com/google/android/apps/messaging/toast/ToastsControllerImpl", "initialize", 32, "ToastsControllerImpl.kt")).q("Initializing toast controller.");
        if (this.f) {
            return;
        }
        axol.k(this.e, null, new cwoq(this, null), 3);
        this.f = true;
    }
}
