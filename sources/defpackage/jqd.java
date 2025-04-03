package defpackage;

import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqd {
    public static final boolean a(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
