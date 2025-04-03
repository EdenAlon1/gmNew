package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckgl {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/availability/RcsUpdateNotifier");
    public final Context b;
    public final errl c;
    public final errl d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;

    public ckgl(Context context, errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        this.b = context;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.c = errlVar;
        this.d = errlVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.j = ffbrVar6;
        this.k = ffbrVar7;
    }

    public static void a(Exception exc) {
        ((enrr) ((enrr) ((enrr) a.j()).g(exc)).h("com/google/android/apps/messaging/shared/rcs/availability/RcsUpdateNotifier", "onUpdateFailure", 'l', "RcsUpdateNotifier.java")).q("failed to update RCS success notification state");
    }
}
