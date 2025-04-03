package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dznr extends dzqo {
    public final emxc a;
    public final emxc b;
    public final emxc c;
    public final emxc d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final emxc i;
    public final int j;

    public dznr(emxc emxcVar, emxc emxcVar2, emxc emxcVar3, emxc emxcVar4, int i, boolean z, boolean z2, boolean z3, emxc emxcVar5, int i2) {
        this.a = emxcVar;
        this.b = emxcVar2;
        this.c = emxcVar3;
        this.d = emxcVar4;
        this.e = i;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = emxcVar5;
        this.j = i2;
    }

    @Override // defpackage.dzqo
    public final int a() {
        return this.j;
    }

    @Override // defpackage.dzqo
    public final int b() {
        return this.e;
    }

    @Override // defpackage.dzqo
    public final emxc c() {
        return this.a;
    }

    @Override // defpackage.dzqo
    @Deprecated
    public final emxc d() {
        return this.b;
    }

    @Override // defpackage.dzqo
    public final emxc e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzqo) {
            dzqo dzqoVar = (dzqo) obj;
            if (this.a.equals(dzqoVar.c()) && this.b.equals(dzqoVar.d()) && this.c.equals(dzqoVar.g()) && this.d.equals(dzqoVar.e()) && this.e == dzqoVar.b() && this.f == dzqoVar.j() && this.g == dzqoVar.i() && this.h == dzqoVar.h() && this.i.equals(dzqoVar.f()) && this.j == dzqoVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dzqo
    public final emxc f() {
        return this.i;
    }

    @Override // defpackage.dzqo
    public final emxc g() {
        return this.c;
    }

    @Override // defpackage.dzqo
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true == this.h ? 1231 : 1237)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j;
    }

    @Override // defpackage.dzqo
    public final boolean i() {
        return this.g;
    }

    @Override // defpackage.dzqo
    public final boolean j() {
        return this.f;
    }

    public final String toString() {
        emxc emxcVar = this.i;
        emxc emxcVar2 = this.d;
        emxc emxcVar3 = this.c;
        emxc emxcVar4 = this.b;
        return "Overlay{dismissAction=" + String.valueOf(this.a) + ", displayIcon=" + String.valueOf(emxcVar4) + ", lighterIcon=" + String.valueOf(emxcVar3) + ", displayText=" + String.valueOf(emxcVar2) + ", timeToLiveSec=" + this.e + ", hideSnippetInConversationList=" + this.f + ", hideDismissButton=" + this.g + ", dismissibleByTappingOutside=" + this.h + ", expireTimeStamp=" + String.valueOf(emxcVar) + ", overlayStyle=" + this.j + "}";
    }
}
