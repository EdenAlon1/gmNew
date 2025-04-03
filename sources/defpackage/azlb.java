package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azlb extends aztg {
    private final ParticipantsTable.BindData a;
    private final Optional b;

    public azlb(ParticipantsTable.BindData bindData, Optional optional) {
        if (bindData == null) {
            throw new NullPointerException("Null selfParticipant");
        }
        this.a = bindData;
        this.b = optional;
    }

    @Override // defpackage.aztg
    public final ParticipantsTable.BindData a() {
        return this.a;
    }

    @Override // defpackage.aztg
    public final Optional b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aztg) {
            aztg aztgVar = (aztg) obj;
            if (this.a.equals(aztgVar.a()) && this.b.equals(aztgVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "Subscription{selfParticipant=" + this.a.toString() + ", messagingIdentity=" + optional.toString() + "}";
    }
}
