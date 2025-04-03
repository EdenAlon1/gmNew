package defpackage;

import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffov implements ffos {
    public final Matcher a;
    public final ffou b = new ffou(this);
    private final CharSequence c;

    public ffov(Matcher matcher, CharSequence charSequence) {
        this.a = matcher;
        this.c = charSequence;
    }

    @Override // defpackage.ffos
    public final String a() {
        String group = this.a.group();
        group.getClass();
        return group;
    }

    @Override // defpackage.ffos
    public final ffmj b() {
        Matcher matcher = this.a;
        return ffmk.q(matcher.start(), matcher.end());
    }

    @Override // defpackage.ffos
    public final ffos c() {
        Matcher matcher = this.a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        if (end > this.c.length()) {
            return null;
        }
        Matcher matcher2 = this.a.pattern().matcher(this.c);
        matcher2.getClass();
        return ffpb.a(matcher2, end, this.c);
    }
}
