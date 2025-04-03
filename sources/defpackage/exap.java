package defpackage;

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exap {
    static final Executor a = Executors.newFixedThreadPool(1);
    static final ewye b = new ewye();
    public static final /* synthetic */ int f = 0;
    public final CharSequence c;
    public final List d;
    public final Bundle e;

    public exap(CharSequence charSequence, List list, Bundle bundle) {
        this.c = charSequence;
        this.d = DesugarCollections.unmodifiableList(list);
        this.e = bundle;
    }

    public final String toString() {
        return String.format(Locale.US, "TextLinks{fullText=%s, links=%s}", this.c, this.d);
    }
}
