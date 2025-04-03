package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjjg implements fbba {
    public static cjjc a(View view) {
        if (!(view instanceof cjjc)) {
            throw new IllegalStateException(a.I(view, cjjd.class, "Attempt to inject a View wrapper of type "));
        }
        cjjc cjjcVar = (cjjc) view;
        cjjcVar.getClass();
        return cjjcVar;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
