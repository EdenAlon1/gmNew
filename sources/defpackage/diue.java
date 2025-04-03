package defpackage;

import j$.time.Duration;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diue extends IOException {
    public final int a;
    public final Duration b;

    public diue(int i, Duration duration) {
        super("HTTP response code=" + i + " retryAfter=" + String.valueOf(duration));
        this.a = i;
        this.b = duration;
    }
}
