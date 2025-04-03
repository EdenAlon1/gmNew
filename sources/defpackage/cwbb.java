package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwbb {
    public final ChipData a;
    public final boolean b;
    public final boolean c;

    public cwbb(ChipData chipData, boolean z, boolean z2) {
        chipData.getClass();
        this.a = chipData;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwbb)) {
            return false;
        }
        cwbb cwbbVar = (cwbb) obj;
        return ffkj.e(this.a, cwbbVar.a) && this.b == cwbbVar.b && this.c == cwbbVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + cwba.a(this.b)) * 31) + cwba.a(this.c);
    }

    public final String toString() {
        return "GroupChatCapability(chipData=" + this.a + ", hasRcs=" + this.b + ", hasE2ee=" + this.c + ")";
    }
}
