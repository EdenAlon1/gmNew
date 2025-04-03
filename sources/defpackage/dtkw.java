package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtkw implements dtii {
    final /* synthetic */ dtld a;

    public dtkw(dtld dtldVar) {
        this.a = dtldVar;
    }

    @Override // defpackage.dtii
    public final void a() {
        this.a.b.a();
    }

    @Override // defpackage.dtii
    public final void b() {
        this.a.b.b();
    }

    @Override // defpackage.dtii
    public final void c(float f) {
        this.a.d.f(Float.valueOf(f));
        if (((Boolean) ((dtdy) this.a.b).f.c()).booleanValue()) {
            this.a.b.a();
            this.a.e = true;
        }
    }

    @Override // defpackage.dtii
    public final void d() {
        Float f = (Float) this.a.d.c();
        if (f != null) {
            dtld dtldVar = this.a;
            float floatValue = f.floatValue();
            if (floatValue < 0.0f || floatValue > 1.0f) {
                throw new IllegalArgumentException("Progress must be value [0-1]");
            }
            dtds dtdsVar = dtldVar.b;
            ((enrr) dtdy.a.h().h("com/google/android/libraries/compose/voice/audioplayer/AudioPlayerImpl", "seek", 91, "AudioPlayerImpl.kt")).t("Seeking to position: %s", Float.valueOf(floatValue));
            dtdy dtdyVar = (dtdy) dtdsVar;
            long duration = (long) (dtdyVar.e().getDuration() * floatValue);
            dtdyVar.d.f(Duration.ofMillis(duration));
            dtdyVar.e().seekTo((int) duration);
        }
        this.a.d.f(null);
        dtld dtldVar2 = this.a;
        if (dtldVar2.e) {
            dtldVar2.b.b();
            this.a.e = false;
        }
    }
}
