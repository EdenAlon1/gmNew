package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsat implements dtab {
    public final List a;
    public final Integer b;
    private final int c;
    private final boolean d;

    public dsat(List list, Integer num) {
        list.getClass();
        this.a = list;
        this.c = R.drawable.shortcut_icon_shape;
        this.b = num;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsat)) {
            return false;
        }
        dsat dsatVar = (dsat) obj;
        if (!ffkj.e(this.a, dsatVar.a)) {
            return false;
        }
        int i = dsatVar.c;
        if (!ffkj.e(this.b, dsatVar.b)) {
            return false;
        }
        boolean z = dsatVar.d;
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return ((((hashCode + R.drawable.shortcut_icon_shape) * 31) + (num == null ? 0 : num.hashCode())) * 31) + 1237;
    }

    public final String toString() {
        return "ShortcutsConfiguration(shortcuts=" + this.a + ", shapeDrawable=2131232742, backgroundDrawable=" + this.b + ", stretchOnExpand=false)";
    }
}
