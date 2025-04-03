package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvhb implements bcyh {
    public final dhzq a = new dhzq();

    static {
        entd.c("BugleWearable");
    }

    @Override // defpackage.bcyh
    public final String S() {
        return cvgr.b(this.a, "24");
    }

    @Override // defpackage.bcyh
    public final String V(Context context) {
        return cvgr.b(this.a, "12");
    }

    public final void a(String str) {
        this.a.n("24", str);
    }

    @Override // defpackage.bcyh
    public final boolean az() {
        int p = this.a.p("11");
        return p >= 100 && p <= 117;
    }

    public final void b(String str) {
        this.a.n("12", str);
    }

    @Override // defpackage.bcyh
    public final int c() {
        return this.a.p("36");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cvhb) {
            return this.a.equals(((cvhb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.bcyh
    public final long n() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bcyh
    public final ConversationIdType t() {
        return bdgq.b(cvgr.a(this.a, "1"));
    }
}
