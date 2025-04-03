package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwib {
    public final boolean a;
    public final boolean b;
    private final boolean c;
    private final boolean d;

    public cwib() {
        this(false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwib)) {
            return false;
        }
        cwib cwibVar = (cwib) obj;
        boolean z = cwibVar.c;
        if (this.a != cwibVar.a) {
            return false;
        }
        boolean z2 = cwibVar.d;
        return this.b == cwibVar.b;
    }

    public final int hashCode() {
        return (((((cwia.a(false) * 31) + cwia.a(this.a)) * 31) + cwia.a(false)) * 31) + cwia.a(this.b);
    }

    public final String toString() {
        return "Flags(useComposeBackHandler=false, enableBackBehaviorFix=" + this.a + ", enableStartChatCoolRanchPhase3=false, enableAutomationDetectionForClickEvents=" + this.b + ")";
    }

    public /* synthetic */ cwib(boolean z, int i) {
        boolean c = cubs.c();
        this.c = false;
        this.a = z & ((i & 2) == 0);
        this.d = false;
        this.b = c;
    }
}
