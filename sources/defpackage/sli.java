package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sli {
    public final Duration a;
    public int c;
    public final StringBuilder b = new StringBuilder();
    public Duration d = Duration.ZERO;

    public sli(Duration duration) {
        this.a = duration;
    }

    public final String a() {
        return this.b.toString();
    }

    public final void b() {
        if (this.c > 0) {
            StringBuilder sb = this.b;
            sb.setLength(sb.length() - this.c);
            this.c = 0;
        }
    }
}
