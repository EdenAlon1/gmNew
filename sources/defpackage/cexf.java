package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cexf {
    public final long a;
    public final Object b;
    public final int e;
    public final long d = Thread.currentThread().getId();
    public final StackTraceElement[] c = Thread.currentThread().getStackTrace();

    public cexf(long j, int i, Object obj) {
        this.a = j;
        this.e = i;
        this.b = obj;
    }

    public final boolean a(Pattern pattern, Pattern pattern2) {
        Object obj = this.b;
        return (pattern == null || pattern.matcher(obj instanceof ceze ? ((ceze) obj).r() : obj.toString()).matches()) && (pattern2 == null || pattern2.matcher(cexg.c(this.e)).matches());
    }
}
