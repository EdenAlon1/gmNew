package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqcj implements aqcm {
    private final String a;
    private final int c = 2;
    private final boolean b = false;

    public aqcj(String str) {
        this.a = str;
    }

    @Override // defpackage.aqcm
    public final String a() {
        return this.a;
    }

    @Override // defpackage.aqcm
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqcj)) {
            return false;
        }
        aqcj aqcjVar = (aqcj) obj;
        if (!ffkj.e(this.a, aqcjVar.a)) {
            return false;
        }
        int i = aqcjVar.c;
        boolean z = aqcjVar.b;
        return true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 2) * 31) + 1237;
    }

    public final String toString() {
        return "BugleIncomingDisplayableStatus(text=" + this.a + ", type=" + ((Object) aqcn.a(2)) + ", canDownload=false)";
    }
}
