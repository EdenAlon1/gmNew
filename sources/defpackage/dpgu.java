package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpgu {
    public final Duration a;
    public final ffix b;
    public final Integer c;
    public final Integer d;
    public final boolean e;

    public dpgu(Duration duration, ffix ffixVar, Integer num, Integer num2, boolean z) {
        this.a = duration;
        this.b = ffixVar;
        this.c = num;
        this.d = num2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpgu)) {
            return false;
        }
        dpgu dpguVar = (dpgu) obj;
        return ffkj.e(this.a, dpguVar.a) && ffkj.e(this.b, dpguVar.b) && ffkj.e(this.c, dpguVar.c) && ffkj.e(this.d, dpguVar.d) && this.e == dpguVar.e;
    }

    public final int hashCode() {
        Duration duration = this.a;
        return ((((((((duration == null ? 0 : duration.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "PopupCameraConfiguration(countdownDuration=" + this.a + ", outputBitmapSizeProvider=" + this.b + ", recordingStartedSound=" + this.c + ", recordingStoppedSound=" + this.d + ", enablePopupCameraPlaybackBottomMarginFix=" + this.e + ")";
    }
}
