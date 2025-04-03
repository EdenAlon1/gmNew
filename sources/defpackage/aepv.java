package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aepv implements fbba {
    public static aepp a(View view) {
        if (!(view instanceof aepp)) {
            throw new IllegalStateException(a.I(view, aepr.class, "Attempt to inject a View wrapper of type "));
        }
        aepp aeppVar = (aepp) view;
        aeppVar.getClass();
        return aeppVar;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
