package defpackage;

import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class sxz extends BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final int d;

    public sxz(String str, boolean z, boolean z2, int i) {
        if (str == null) {
            throw new NullPointerException("Null targetParticipantId");
        }
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    @Override // com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus
    public final int a() {
        return this.d;
    }

    @Override // com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus
    public final String b() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus
    public final boolean c() {
        return this.b;
    }

    @Override // com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus) {
            BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus participantBlockAndSpamStatus = (BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus) obj;
            if (this.a.equals(participantBlockAndSpamStatus.b()) && this.b == participantBlockAndSpamStatus.c() && this.c == participantBlockAndSpamStatus.d() && this.d == participantBlockAndSpamStatus.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237)) * 1000003) ^ this.d;
    }

    public final String toString() {
        return "ParticipantBlockAndSpamStatus{targetParticipantId=" + this.a + ", originalBlockStatus=" + this.b + ", originalSpamStatus=" + this.c + ", originalSpamSources=" + this.d + "}";
    }
}
