package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slq {
    public final skk a;
    public final String b;
    public final Duration c;

    public slq(skk skkVar, String str, Duration duration) {
        this.a = skkVar;
        this.b = str;
        this.c = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slq)) {
            return false;
        }
        slq slqVar = (slq) obj;
        return ffkj.e(this.a, slqVar.a) && ffkj.e(this.b, slqVar.b) && ffkj.e(this.c, slqVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TranscriptionSessionInfo(audioInfo=" + this.a + ", finalResult=" + this.b + ", sessionDuration=" + this.c + ")";
    }
}
