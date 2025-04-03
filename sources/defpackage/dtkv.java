package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtkv {
    public final dtjb a;
    public final Duration b;
    public final drng c;
    public final Float d;
    public final Duration e;
    public final boolean f;
    public final dteh g;

    public dtkv(dtjb dtjbVar, Duration duration, drng drngVar, Float f, Duration duration2, boolean z, dteh dtehVar) {
        this.a = dtjbVar;
        this.b = duration;
        this.c = drngVar;
        this.d = f;
        this.e = duration2;
        this.f = z;
        this.g = dtehVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtkv)) {
            return false;
        }
        dtkv dtkvVar = (dtkv) obj;
        return this.a == dtkvVar.a && ffkj.e(this.b, dtkvVar.b) && ffkj.e(this.c, dtkvVar.c) && ffkj.e(this.d, dtkvVar.d) && ffkj.e(this.e, dtkvVar.e) && this.f == dtkvVar.f && ffkj.e(this.g, dtkvVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        drng drngVar = this.c;
        int hashCode2 = ((hashCode * 31) + (drngVar == null ? 0 : drngVar.hashCode())) * 31;
        Float f = this.d;
        return ((((((hashCode2 + (f != null ? f.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "VoiceFlowRequirements(state=" + this.a + ", recordingTime=" + this.b + ", audioFile=" + this.c + ", seekProgress=" + this.d + ", currentPosition=" + this.e + ", isPrepared=" + this.f + ", voiceMetadata=" + this.g + ")";
    }
}
