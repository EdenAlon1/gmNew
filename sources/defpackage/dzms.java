package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzms extends dzpb {
    public final dzpg a;
    public final emxc b;
    public final emxc c;
    public final emxc d;
    public final emxc e;
    public final boolean f;
    public final long g;
    public final engw h;
    public final engw i;
    public final emxc j;
    public final emxc k;
    public final long l;

    public dzms(dzpg dzpgVar, emxc emxcVar, emxc emxcVar2, emxc emxcVar3, emxc emxcVar4, boolean z, long j, engw engwVar, engw engwVar2, emxc emxcVar5, emxc emxcVar6, long j2) {
        this.a = dzpgVar;
        this.b = emxcVar;
        this.c = emxcVar2;
        this.d = emxcVar3;
        this.e = emxcVar4;
        this.f = z;
        this.g = j;
        this.h = engwVar;
        this.i = engwVar2;
        this.j = emxcVar5;
        this.k = emxcVar6;
        this.l = j2;
    }

    @Override // defpackage.dzpb
    public final long a() {
        return this.g;
    }

    @Override // defpackage.dzpb
    public final long b() {
        return this.l;
    }

    @Override // defpackage.dzpb
    public final dzpa c() {
        return new dzmr(this);
    }

    @Override // defpackage.dzpb
    public final dzpg d() {
        return this.a;
    }

    @Override // defpackage.dzpb
    public final emxc e() {
        return this.c;
    }

    @Override // defpackage.dzpb
    public final emxc f() {
        return this.e;
    }

    @Override // defpackage.dzpb
    public final emxc g() {
        return this.d;
    }

    @Override // defpackage.dzpb
    public final emxc h() {
        return this.k;
    }

    @Override // defpackage.dzpb
    public final emxc i() {
        return this.b;
    }

    @Override // defpackage.dzpb
    public final boolean j() {
        return this.f;
    }

    public final String toString() {
        emxc emxcVar = this.k;
        emxc emxcVar2 = this.j;
        engw engwVar = this.i;
        engw engwVar2 = this.h;
        emxc emxcVar3 = this.e;
        emxc emxcVar4 = this.d;
        emxc emxcVar5 = this.c;
        emxc emxcVar6 = this.b;
        return "Contact{contactId=" + this.a.toString() + ", name=" + String.valueOf(emxcVar6) + ", a11yName=" + String.valueOf(emxcVar5) + ", imageUrl=" + String.valueOf(emxcVar4) + ", image=" + String.valueOf(emxcVar3) + ", isImageStale=" + this.f + ", expirationTimeMillis=" + this.g + ", menuItems=" + engwVar2.toString() + ", toolbarButtons=" + engwVar.toString() + ", customViewContentModel=" + String.valueOf(emxcVar2) + ", lighterUiConfigurations=" + String.valueOf(emxcVar) + ", serverTimestampUs=" + this.l + "}";
    }
}
