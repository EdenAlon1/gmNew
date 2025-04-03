package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoft extends eofv {
    public eoft(Duration duration, double d, int i) {
        super(duration, d, i);
    }

    public final String toString() {
        emwz emwzVar = new emwz("exponentialBackoff");
        emwzVar.g("firstDelayMs", this.b.toMillis());
        emwzVar.d("multiplier", this.c);
        emwzVar.f("tries", this.a);
        return emwzVar.toString();
    }
}
