package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cojz implements cojs {
    private static final enru f = enru.c("com/google/android/apps/messaging/shared/screendetection/ScreenDetectionUiAdapterImpl");
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public ajiy d;
    public coje e;
    private final ffsk g;

    public cojz(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.g = ffskVar;
    }

    public static final void b(Object obj) {
        if (obj instanceof ffwr) {
            ((enrr) ((enrr) f.j()).g(ffws.b(obj)).h("com/google/android/apps/messaging/shared/screendetection/ScreenDetectionUiAdapterImpl", "logAnyChannelFailure-rs8usWo", 117, "ScreenDetectionUiAdapterImpl.kt")).q("Failed to send result of handleDisplayChange");
        }
    }

    @Override // defpackage.cojs
    public final void a() {
        Object e = ((cfup) cojg.a.get()).e();
        e.getClass();
        if (((Boolean) e).booleanValue()) {
            axol.k(this.g, null, new cojy(this, null), 3);
        }
    }
}
