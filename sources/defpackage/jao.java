package defpackage;

import android.view.View;
import android.view.ViewStructure;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jao {
    public static final jao a = new jao();

    private jao() {
    }

    public final void a(ViewStructure viewStructure, View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
