package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drzo extends drzq {
    private final String a;

    public drzo(String str) {
        this.a = str;
    }

    @Override // defpackage.drzq
    public final int a() {
        return R.drawable.quantum_gm_ic_history_vd_theme_24;
    }

    @Override // defpackage.drzq
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drzo) && ffkj.e(this.a, ((drzo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RecentSearchRow(content=" + this.a + ")";
    }
}
