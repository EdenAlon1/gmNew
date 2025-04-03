package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmw extends dzpk {
    public final dzpt a;
    public final emxc b;
    public final emxc c;
    public final emxc d;
    public final boolean e;
    public final long f;
    public final long g;
    public final boolean h;
    public final Map i;
    public final emxc j;
    public final engw k;
    public final long l;
    public final long m;
    public final eyee n;
    public final long o;
    public final long p;

    public dzmw(dzpt dzptVar, emxc emxcVar, emxc emxcVar2, emxc emxcVar3, boolean z, long j, long j2, boolean z2, Map map, emxc emxcVar4, engw engwVar, long j3, long j4, eyee eyeeVar, long j5, long j6) {
        this.a = dzptVar;
        this.b = emxcVar;
        this.c = emxcVar2;
        this.d = emxcVar3;
        this.e = z;
        this.f = j;
        this.g = j2;
        this.h = z2;
        this.i = map;
        this.j = emxcVar4;
        this.k = engwVar;
        this.l = j3;
        this.m = j4;
        this.n = eyeeVar;
        this.o = j5;
        this.p = j6;
    }

    @Override // defpackage.dzpk
    public final long a() {
        return this.o;
    }

    @Override // defpackage.dzpk
    public final long b() {
        return this.f;
    }

    @Override // defpackage.dzpk
    public final long c() {
        return this.g;
    }

    @Override // defpackage.dzpk
    public final long d() {
        return this.p;
    }

    @Override // defpackage.dzpk
    public final long e() {
        return this.l;
    }

    @Override // defpackage.dzpk
    public final long f() {
        return this.m;
    }

    @Override // defpackage.dzpk
    public final dzpj g() {
        return new dzmv(this);
    }

    @Override // defpackage.dzpk
    public final dzpt h() {
        return this.a;
    }

    @Override // defpackage.dzpk
    public final emxc i() {
        return this.d;
    }

    @Override // defpackage.dzpk
    public final emxc j() {
        return this.c;
    }

    @Override // defpackage.dzpk
    public final emxc k() {
        return this.j;
    }

    @Override // defpackage.dzpk
    public final emxc l() {
        return this.b;
    }

    @Override // defpackage.dzpk
    public final engw m() {
        return this.k;
    }

    @Override // defpackage.dzpk
    public final eyee n() {
        return this.n;
    }

    @Override // defpackage.dzpk
    public final Map o() {
        return this.i;
    }

    @Override // defpackage.dzpk
    public final boolean p() {
        return this.h;
    }

    @Override // defpackage.dzpk
    public final boolean q() {
        return this.e;
    }

    public final String toString() {
        eyee eyeeVar = this.n;
        engw engwVar = this.k;
        emxc emxcVar = this.j;
        Map map = this.i;
        emxc emxcVar2 = this.d;
        emxc emxcVar3 = this.c;
        emxc emxcVar4 = this.b;
        return "Conversation{conversationId=" + this.a.toString() + ", title=" + String.valueOf(emxcVar4) + ", imageUrl=" + String.valueOf(emxcVar3) + ", image=" + String.valueOf(emxcVar2) + ", isImageStale=" + this.e + ", expirationTimeMillis=" + this.f + ", lastDeletedTimeMillis=" + this.g + ", blockable=" + this.h + ", appData=" + map.toString() + ", suggestionList=" + String.valueOf(emxcVar) + ", capabilities=" + engwVar.toString() + ", propertiesExpirationTimeMillis=" + this.l + ", serverTimestampUs=" + this.m + ", conversationContext=" + eyeeVar.toString() + ", createdTimestampMs=" + this.o + ", localUpdateTimestampMs=" + this.p + "}";
    }
}
