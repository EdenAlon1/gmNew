package defpackage;

import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class sxy extends szw {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final Boolean g;
    public final Boolean h;
    public final Integer i;
    public final BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus j;

    public sxy(String str, String str2, String str3, int i, boolean z, boolean z2, Boolean bool, Boolean bool2, Integer num, BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus participantBlockAndSpamStatus) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null displayDestination");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.c = str3;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = bool;
        this.h = bool2;
        this.i = num;
        this.j = participantBlockAndSpamStatus;
    }

    @Override // defpackage.szw
    public final int a() {
        return this.d;
    }

    @Override // defpackage.szw
    public final BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus b() {
        return this.j;
    }

    @Override // defpackage.szw
    public final Boolean c() {
        return this.g;
    }

    @Override // defpackage.szw
    public final Boolean d() {
        return this.h;
    }

    @Override // defpackage.szw
    public final Integer e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        Boolean bool;
        Boolean bool2;
        Integer num;
        BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus participantBlockAndSpamStatus;
        if (obj == this) {
            return true;
        }
        if (obj instanceof szw) {
            szw szwVar = (szw) obj;
            szwVar.k();
            String str = this.a;
            if (str != null ? str.equals(szwVar.h()) : szwVar.h() == null) {
                if (this.b.equals(szwVar.g()) && this.c.equals(szwVar.f()) && this.d == szwVar.a() && this.e == szwVar.i() && this.f == szwVar.j() && ((bool = this.g) != null ? bool.equals(szwVar.c()) : szwVar.c() == null) && ((bool2 = this.h) != null ? bool2.equals(szwVar.d()) : szwVar.d() == null) && ((num = this.i) != null ? num.equals(szwVar.e()) : szwVar.e() == null) && ((participantBlockAndSpamStatus = this.j) != null ? participantBlockAndSpamStatus.equals(szwVar.b()) : szwVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.szw
    public final String f() {
        return this.c;
    }

    @Override // defpackage.szw
    public final String g() {
        return this.b;
    }

    @Override // defpackage.szw
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((((((((((((str == null ? 0 : str.hashCode()) ^ (-722379962)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true == this.f ? 1231 : 1237)) * 1000003;
        Boolean bool = this.g;
        int hashCode2 = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Boolean bool2 = this.h;
        int hashCode3 = (hashCode2 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Integer num = this.i;
        int hashCode4 = (hashCode3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus participantBlockAndSpamStatus = this.j;
        return hashCode4 ^ (participantBlockAndSpamStatus != null ? participantBlockAndSpamStatus.hashCode() : 0);
    }

    @Override // defpackage.szw
    public final boolean i() {
        return this.e;
    }

    @Override // defpackage.szw
    public final boolean j() {
        return this.f;
    }

    public final String toString() {
        return "Input{type=PARTICIPANT, targetParticipantId=" + this.a + ", displayDestination=" + this.b + ", conversationId=" + this.c + ", anchorViewId=" + this.d + ", block=" + this.e + ", reportSpam=" + this.f + ", originalBlockStatus=" + this.g + ", originalSpamStatus=" + this.h + ", originalSpamSources=" + this.i + ", participantBlockAndSpamStatus=" + String.valueOf(this.j) + "}";
    }

    @Override // defpackage.szw
    public final void k() {
    }
}
