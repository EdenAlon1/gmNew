package defpackage;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efcm {
    public final String a;
    private final List b;

    public efcm(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = str;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(efco.a(this.a));
        if (this.b.isEmpty()) {
            return sb.toString();
        }
        sb.append("(");
        sb.append(TextUtils.join(",", this.b));
        sb.append(")");
        return sb.toString();
    }
}
