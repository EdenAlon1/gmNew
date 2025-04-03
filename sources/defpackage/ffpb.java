package defpackage;

import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffpb {
    public static final ffos a(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new ffov(matcher, charSequence);
        }
        return null;
    }
}
