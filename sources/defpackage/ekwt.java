package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekwt extends elcf {
    private final engw a;
    private final engw b;
    private final UUID c;

    public ekwt(engw engwVar, engw engwVar2, UUID uuid) {
        this.a = engwVar;
        this.b = engwVar2;
        this.c = uuid;
    }

    @Override // defpackage.elcf
    public final engw a() {
        return this.b;
    }

    @Override // defpackage.elcf
    public final engw b() {
        return this.a;
    }

    @Override // defpackage.elcf
    public final UUID c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elcf) {
            elcf elcfVar = (elcf) obj;
            if (enkr.h(this.a, elcfVar.b()) && enkr.h(this.b, elcfVar.a()) && this.c.equals(elcfVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
