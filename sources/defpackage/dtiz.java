package defpackage;

import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtiz implements dtab {
    public final fgdj a;
    public final ffix b;
    public final dtik c;
    public final fgdj d;
    public final ffxx e;
    public final fgdj f;
    public final fgdj g;
    public final dtil h;
    public final boolean i;
    public final Optional j;
    public final boolean k;
    public final boolean l;
    public final cteg m;

    public dtiz(fgdj fgdjVar, ffix ffixVar, dtik dtikVar, fgdj fgdjVar2, ffxx ffxxVar, fgdj fgdjVar3, fgdj fgdjVar4, dtil dtilVar, cteg ctegVar, boolean z, Optional optional, boolean z2, boolean z3) {
        dtilVar.getClass();
        this.a = fgdjVar;
        this.b = ffixVar;
        this.c = dtikVar;
        this.d = fgdjVar2;
        this.e = ffxxVar;
        this.f = fgdjVar3;
        this.g = fgdjVar4;
        this.h = dtilVar;
        this.m = ctegVar;
        this.i = z;
        this.j = optional;
        this.k = z2;
        this.l = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtiz)) {
            return false;
        }
        dtiz dtizVar = (dtiz) obj;
        return ffkj.e(this.a, dtizVar.a) && ffkj.e(this.b, dtizVar.b) && ffkj.e(this.c, dtizVar.c) && ffkj.e(this.d, dtizVar.d) && ffkj.e(this.e, dtizVar.e) && ffkj.e(this.f, dtizVar.f) && ffkj.e(this.g, dtizVar.g) && ffkj.e(this.h, dtizVar.h) && ffkj.e(this.m, dtizVar.m) && this.i == dtizVar.i && ffkj.e(this.j, dtizVar.j) && this.k == dtizVar.k && this.l == dtizVar.l;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.m.hashCode()) * 31) + dtiw.a(this.i)) * 31) + this.j.hashCode()) * 31) + dtiw.a(this.k)) * 31) + dtiw.a(this.l);
    }

    public final String toString() {
        return "VoiceConfiguration(voiceInputStateFlow=" + this.a + ", maxRecordingDuration=" + this.b + ", recordingActions=" + this.c + ", recordingTimerFlow=" + this.d + ", audioLevelFlow=" + this.e + ", errorMessageFlow=" + this.f + ", audioFileFlow=" + this.g + ", moodConfiguration=" + this.h + ", glideImageManager=" + this.m + ", pauseAudioPlaybackOnClose=" + this.i + ", xenoAudioProcessorState=" + this.j + ", useParentTheme=" + this.k + ", catchPlaybackPreparationException=" + this.l + ")";
    }

    public /* synthetic */ dtiz(fgdj fgdjVar, ffix ffixVar, dtik dtikVar, fgdj fgdjVar2, ffxx ffxxVar, fgdj fgdjVar3, fgdj fgdjVar4, dtil dtilVar, cteg ctegVar, boolean z, int i) {
        this((i & 1) != 0 ? fgdm.a(dtja.b) : fgdjVar, (i & 2) != 0 ? new ffix() { // from class: dtix
            @Override // defpackage.ffix
            public final Object invoke() {
                return dtja.a;
            }
        } : ffixVar, (i & 4) != 0 ? new dtiy() : dtikVar, (i & 8) != 0 ? fgdm.a(Duration.ZERO) : fgdjVar2, (i & 16) != 0 ? new ffyf(new dteo[0]) : ffxxVar, (i & 32) != 0 ? fgdm.a(null) : fgdjVar3, (i & 64) != 0 ? fgdm.a(null) : fgdjVar4, (i & 128) != 0 ? new dtil(null, 15) : dtilVar, ctegVar, (!((i & 512) == 0)) | z, Optional.empty(), false, false);
    }
}
