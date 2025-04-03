package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtlg implements dtlj {
    public final Duration a;
    public final fgdj b;
    public final fgdj c;
    public final Duration d;
    public final float e;
    public final dtii f;
    public final dteh g;
    public final ffji h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dtlg() {
        /*
            r9 = this;
            j$.time.Duration r1 = j$.time.Duration.ZERO
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            fgcm r2 = defpackage.fgdm.a(r0)
            fgcm r3 = defpackage.fgdm.a(r0)
            j$.time.Duration r4 = j$.time.Duration.ZERO
            dtlf r6 = new dtlf
            r6.<init>()
            dteh r0 = defpackage.dteh.a
            eyfq r0 = r0.createBuilder()
            dteg r0 = (defpackage.dteg) r0
            r0.getClass()
            dteh r7 = defpackage.dtei.a(r0)
            dtle r8 = new dtle
            r8.<init>()
            r5 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtlg.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtlg)) {
            return false;
        }
        dtlg dtlgVar = (dtlg) obj;
        return ffkj.e(this.a, dtlgVar.a) && ffkj.e(this.b, dtlgVar.b) && ffkj.e(this.c, dtlgVar.c) && ffkj.e(this.d, dtlgVar.d) && Float.compare(this.e, dtlgVar.e) == 0 && ffkj.e(this.f, dtlgVar.f) && ffkj.e(this.g, dtlgVar.g) && ffkj.e(this.h, dtlgVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "Playback(audioDuration=" + this.a + ", isPreparedFlow=" + this.b + ", isPlayingFlow=" + this.c + ", currentTime=" + this.d + ", progress=" + this.e + ", playbackActions=" + this.f + ", voiceMetadata=" + this.g + ", onVoiceMetadataUpdated=" + this.h + ")";
    }

    public dtlg(Duration duration, fgdj fgdjVar, fgdj fgdjVar2, Duration duration2, float f, dtii dtiiVar, dteh dtehVar, ffji ffjiVar) {
        duration.getClass();
        duration2.getClass();
        dtiiVar.getClass();
        this.a = duration;
        this.b = fgdjVar;
        this.c = fgdjVar2;
        this.d = duration2;
        this.e = f;
        this.f = dtiiVar;
        this.g = dtehVar;
        this.h = ffjiVar;
    }
}
