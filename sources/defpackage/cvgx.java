package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.gms.wearable.Asset;
import j$.util.Optional;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvgx implements bcyg {
    public final dhzq a;

    public cvgx(dhzq dhzqVar) {
        this.a = dhzqVar;
        new HashMap();
    }

    @Override // defpackage.bcyg
    public final boolean E() {
        throw null;
    }

    @Override // defpackage.bcyg
    public final boolean H() {
        throw null;
    }

    @Override // defpackage.bcyg
    public final boolean I() {
        throw null;
    }

    public final ConversationIdType a() {
        return bdgq.b(cvgr.a(this.a, "1"));
    }

    @Override // defpackage.bcyg
    public final int b() {
        throw null;
    }

    public final void c(String str, Asset asset) {
        this.a.g("27".concat(String.valueOf(str)), asset);
    }

    public final void d(ConversationIdType conversationIdType) {
        this.a.n("1", conversationIdType.a());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvgx) {
            return this.a.equals(((cvgx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.bcyg
    public final Optional p() {
        throw null;
    }

    @Override // defpackage.bcyg
    public final String t() {
        throw null;
    }

    @Override // defpackage.bcyg
    public final String v() {
        throw null;
    }
}
