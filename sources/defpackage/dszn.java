package defpackage;

import android.R;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dszn extends dszq {
    private final int a = R.attr.colorBackground;

    @Override // defpackage.dszq
    public final int a(Context context) {
        context.getClass();
        return ehdr.d(context, R.attr.colorBackground, "HugoColor");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dszn)) {
            return false;
        }
        int i = ((dszn) obj).a;
        return true;
    }

    public final int hashCode() {
        return R.attr.colorBackground;
    }

    public final String toString() {
        return "Attribute(attribute=16842801)";
    }
}
