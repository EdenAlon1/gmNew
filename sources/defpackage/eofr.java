package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eofr extends eofv {
    public eofr(Duration duration) {
        super(duration, 1.0d, 48);
    }

    public final String toString() {
        emwz emwzVar = new emwz("uniformDelay");
        emwzVar.g("delay", this.b.toMillis());
        emwzVar.f("tries", this.a);
        return emwzVar.toString();
    }
}
