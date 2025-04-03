package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsjl {
    public final View a;
    public final dqnn b;

    public dsjl(View view, dqnn dqnnVar) {
        this.a = view;
        this.b = dqnnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsjl)) {
            return false;
        }
        dsjl dsjlVar = (dsjl) obj;
        return ffkj.e(this.a, dsjlVar.a) && ffkj.e(this.b, dsjlVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TextControl(view=" + this.a + ", controller=" + this.b + ")";
    }
}
