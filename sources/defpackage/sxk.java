package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxk extends sxo {
    public final String a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final int e;
    private final engw f;

    public sxk(String str, Optional optional, Optional optional2, Optional optional3, engw engwVar, int i) {
        this.a = str;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.f = engwVar;
        this.e = i;
    }

    @Override // defpackage.sxo
    public final int a() {
        return this.e;
    }

    @Override // defpackage.sxo
    public final engw b() {
        return this.f;
    }

    @Override // defpackage.sxo
    public final Optional c() {
        return this.b;
    }

    @Override // defpackage.sxo
    public final Optional d() {
        return this.c;
    }

    @Override // defpackage.sxo
    public final Optional e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sxo) {
            sxo sxoVar = (sxo) obj;
            if (this.a.equals(sxoVar.f()) && this.b.equals(sxoVar.c()) && this.c.equals(sxoVar.d()) && this.d.equals(sxoVar.e()) && enkr.h(this.f, sxoVar.b()) && this.e == sxoVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sxo
    public final String f() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        engw engwVar = this.f;
        Optional optional = this.d;
        Optional optional2 = this.c;
        return "Request{displayDestination=" + this.a + ", newBlockStatus=" + String.valueOf(this.b) + ", newSpamStatus=" + String.valueOf(optional2) + ", undoAction=" + String.valueOf(optional) + ", snackbarInteractions=" + engwVar.toString() + ", anchorViewId=" + this.e + "}";
    }
}
