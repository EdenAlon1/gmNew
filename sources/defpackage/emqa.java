package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emqa extends emra {
    public final boolean a;
    public final enhk b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;

    public emqa(boolean z, enhk enhkVar, Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.a = z;
        this.b = enhkVar;
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
        this.f = optional4;
    }

    @Override // defpackage.emra
    public final enhk a() {
        return this.b;
    }

    @Override // defpackage.emra
    public final Optional b() {
        return this.d;
    }

    @Override // defpackage.emra
    public final Optional c() {
        return this.f;
    }

    @Override // defpackage.emra
    public final Optional d() {
        return this.e;
    }

    @Override // defpackage.emra
    public final Optional e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof emra) {
            emra emraVar = (emra) obj;
            if (this.a == emraVar.f() && ennc.m(this.b, emraVar.a()) && this.c.equals(emraVar.e()) && this.d.equals(emraVar.b()) && this.e.equals(emraVar.d()) && this.f.equals(emraVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.emra
    public final boolean f() {
        return this.a;
    }

    public final int hashCode() {
        return (((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Optional optional = this.f;
        Optional optional2 = this.e;
        Optional optional3 = this.d;
        Optional optional4 = this.c;
        return "TemplateMatchResult{isMatch=" + this.a + ", argumentValues=" + String.valueOf(this.b) + ", templateId=" + String.valueOf(optional4) + ", domain=" + String.valueOf(optional3) + ", priority=" + String.valueOf(optional2) + ", preferredSuggestionScore=" + String.valueOf(optional) + "}";
    }
}
