package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ellw {
    public static final /* synthetic */ int c = 0;
    public final boolean a;
    public final Pattern b;

    static {
        Pattern.compile("\\\\");
        Pattern.compile("(?:^|[^$])(?:\\$\\$)*\\$[`']");
        Pattern.compile("\\$\\$");
    }

    public ellw(Pattern pattern, boolean z) {
        this.b = pattern;
        this.a = z;
    }
}
