package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vff extends vfi {
    private final vgb a;
    private final SelfIdentityId b;
    private final cmrf c;

    public vff(vgb vgbVar, SelfIdentityId selfIdentityId, cmrf cmrfVar) {
        this.a = vgbVar;
        this.b = selfIdentityId;
        this.c = cmrfVar;
    }

    @Override // defpackage.vfi
    public final vgb a() {
        return this.a;
    }

    @Override // defpackage.vfi
    public final SelfIdentityId b() {
        return this.b;
    }

    @Override // defpackage.vfi
    public final cmrf c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        SelfIdentityId selfIdentityId;
        if (obj == this) {
            return true;
        }
        if (obj instanceof vfi) {
            vfi vfiVar = (vfi) obj;
            if (this.a.equals(vfiVar.a()) && ((selfIdentityId = this.b) != null ? selfIdentityId.equals(vfiVar.b()) : vfiVar.b() == null) && this.c.equals(vfiVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        SelfIdentityId selfIdentityId = this.b;
        return (((hashCode * 1000003) ^ (selfIdentityId == null ? 0 : selfIdentityId.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        cmrf cmrfVar = this.c;
        SelfIdentityId selfIdentityId = this.b;
        return "ReactionBadgeClickEvent{reactionSelectionData=" + this.a.toString() + ", selfParticipantId=" + String.valueOf(selfIdentityId) + ", messageReactionsData=" + cmrfVar.toString() + "}";
    }
}
