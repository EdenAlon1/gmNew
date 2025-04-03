package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eghj extends eghl {
    private final engw a;
    private final exfw b;
    private final emxc c;

    public eghj(engw engwVar, exfw exfwVar, emxc emxcVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null photos");
        }
        this.a = engwVar;
        if (exfwVar == null) {
            throw new NullPointerException("Null eventLog");
        }
        this.b = exfwVar;
        this.c = emxcVar;
    }

    @Override // defpackage.eghl
    public final emxc a() {
        return this.c;
    }

    @Override // defpackage.eghl
    public final engw b() {
        return this.a;
    }

    @Override // defpackage.eghl
    public final exfw c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eghl) {
            eghl eghlVar = (eghl) obj;
            if (enkr.h(this.a, eghlVar.b()) && this.b.equals(eghlVar.c()) && this.c.equals(eghlVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.c;
        exfw exfwVar = this.b;
        return "DevicePhotoResource{photos=" + this.a.toString() + ", eventLog=" + exfwVar.toString() + ", errorState=" + emxcVar.toString() + "}";
    }
}
