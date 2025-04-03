package defpackage;

import android.net.Uri;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class amik implements amfx {
    @Override // defpackage.amfx
    public abstract ayhd A();

    @Override // defpackage.amfx
    public abstract azcr B();

    public abstract cjcn C();

    @Override // defpackage.amfx
    public abstract ckte D();

    @Override // defpackage.amfx
    public abstract eoxn E();

    @Override // defpackage.amfx
    public abstract Instant F();

    @Override // defpackage.amfx
    public abstract String G();

    @Override // defpackage.amfx
    public abstract String H();

    @Override // defpackage.amfx
    public abstract String I();

    @Override // defpackage.amfx
    public abstract boolean J();

    @Override // defpackage.amfx
    public abstract boolean K();

    @Override // defpackage.amfx
    public final /* synthetic */ boolean L() {
        return amfw.a(this);
    }

    @Override // defpackage.amfx
    public final boolean M() {
        return J() || byyr.d(v());
    }

    @Override // defpackage.alxj
    public abstract Uri a();

    @Override // defpackage.alxj
    public final alxi b() {
        return u() ? alxi.UNKNOWN : J() ? alxi.RBM : byyr.b(v()) ? alxi.GROUP : alxi.ONE_ON_ONE;
    }

    @Override // defpackage.alxj
    public abstract amny d();

    @Override // defpackage.alxj
    public abstract ampp e();

    @Override // defpackage.alxj
    public abstract aqux f();

    @Override // defpackage.alxj
    public abstract cfmh h();

    @Override // defpackage.alxj
    public abstract String i();

    @Override // defpackage.alxj
    public final boolean j() {
        if (b() != alxi.RBM) {
            return (byyr.d(v()) && w() == 2) ? false : true;
        }
        return false;
    }

    @Override // defpackage.alxj
    public abstract boolean k();

    @Override // defpackage.alxj
    public abstract boolean m();

    @Override // defpackage.alxj
    public abstract boolean n();

    @Override // defpackage.alxj
    public abstract boolean q();

    @Override // defpackage.alxj
    public abstract boolean s();

    public final String toString() {
        return "BugleConversationProperties: {\n  id: " + c().toString() + "\n  kind: " + String.valueOf(b()) + "\n  ConversationType: " + byyr.a(v()) + "\n  name: " + i() + "\n  nameIsAutomatic: " + r() + "\n  archiveStatus: " + g().toString() + "\n  isDeleted: " + u() + "\n  activeSelfIdentity: " + String.valueOf(f()) + "\n  icon: " + cskt.f(a()) + "\n  isUnread: " + p() + "\n  isEncrypted: " + o() + "\n  wasPreviouslyEncrypted: " + t() + "\n  hasRbmBotRecipient: " + J() + "\n  errorState: " + A().name() + "\n  joinState: " + w() + "\n  sendMode: " + E().name() + "\n  rcsConferenceUri: " + H() + "\n  rcsGroupId: " + I() + "\n  rcsChatSessionId: " + x() + "\n  wasRcs: " + amfw.a(this) + "\n  sessionAllowsRevocation: " + K() + "\n  participantNormalizedDestination: " + cskt.e(G()) + "\n  parentalApprovalStatus: " + d().toString() + "\n  canRemovePeople: " + k() + "\n  getCanAddPeople: " + j() + "\n  getCanUpdateGroupName: " + n() + "\n  getCanUpdateGroupIcon: " + m() + "\n  mmsGroupUpgradeStatus: " + D().toString() + "\n  palMode: " + z().toString() + "\n  longPressActionsEnabled: " + q() + "\n  shouldShowSimName: " + s() + "\n destinationToken: " + B().toString() + "\n conversationMuteThreshold: " + C().toString() + "\n}";
    }

    @Override // defpackage.amfx
    public abstract int v();

    @Override // defpackage.amfx
    public abstract int w();

    @Override // defpackage.amfx
    public abstract long x();

    public abstract amij y();

    @Override // defpackage.amfx
    public abstract amtc z();
}
