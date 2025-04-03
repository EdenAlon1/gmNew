package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyqi extends dyqw {
    private final emxc a;

    public dyqi(emxc emxcVar) {
        this.a = emxcVar;
    }

    @Override // defpackage.dyqw
    public final emxc a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyqw) {
            dyqw dyqwVar = (dyqw) obj;
            dyqwVar.b();
            if (this.a.equals(dyqwVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-723379965);
    }

    public final String toString() {
        return "SendMessageResult{status=SUCCESS, serverTimestamp=" + String.valueOf(this.a) + "}";
    }

    @Override // defpackage.dyqw
    public final void b() {
    }
}
