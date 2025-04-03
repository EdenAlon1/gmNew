package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exop extends exos {
    public final Optional a;

    public exop(Optional optional) {
        this.a = optional;
    }

    @Override // defpackage.exos
    public final Optional a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof exos) {
            exos exosVar = (exos) obj;
            if (this.a.equals(exosVar.a())) {
                exosVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "ImageProcessingOptions{regionOfInterest=" + this.a.toString() + ", rotationDegrees=0}";
    }

    @Override // defpackage.exos
    public final void b() {
    }
}
