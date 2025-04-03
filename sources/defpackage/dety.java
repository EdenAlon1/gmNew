package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dety implements detv {
    private final Context a;

    public dety(Context context) {
        this.a = context;
    }

    @Override // defpackage.detv
    public final detu a(String str, detq detqVar, dett dettVar) {
        if (new detq().equals(detqVar)) {
            return new detx(this.a, str, dettVar);
        }
        throw new IllegalArgumentException("Only \"proto\" encoding is supported by firelog1p. Got: ".concat(detqVar.toString()));
    }
}
