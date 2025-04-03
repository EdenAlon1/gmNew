package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euov extends eunp {
    private final euot a;

    public euov(Context context) {
        this.a = new euot(context);
    }

    private final void d(int i, euof euofVar) {
        euofVar.e.a = i;
        this.a.l(new euos(new euof[]{euofVar}));
    }

    @Override // defpackage.eunp
    public final void b(euof euofVar) {
        d(2, euofVar);
    }

    @Override // defpackage.eunp
    public final void c(euof euofVar) {
        d(1, euofVar);
    }
}
