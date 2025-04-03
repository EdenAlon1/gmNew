package defpackage;

import android.graphics.Outline;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jff {
    public static final jff a = new jff();

    private jff() {
    }

    public final void a(Outline outline, icv icvVar) {
        if (!(icvVar instanceof ibc)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((ibc) icvVar).a);
    }
}
