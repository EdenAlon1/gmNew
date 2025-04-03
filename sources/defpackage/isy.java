package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isy {
    public static final View a(isw iswVar) {
        if (!iswVar.C().z) {
            imn.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) ium.a(isx.d(iswVar));
    }
}
