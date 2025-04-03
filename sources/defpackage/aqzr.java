package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqzr extends aqzt {
    public final boolean a;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final arac h;

    public aqzr(int i, int i2, int i3, int i4, boolean z, int i5, arac aracVar) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.a = z;
        this.g = i5;
        this.h = aracVar;
    }

    @Override // defpackage.arad
    public final int a() {
        return this.e;
    }

    @Override // defpackage.arad
    public final int b() {
        return this.d;
    }

    @Override // defpackage.arad
    public final int c() {
        return this.c;
    }

    @Override // defpackage.arad
    public final int d() {
        return this.f;
    }

    @Override // defpackage.arad
    public final int e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aqzt) {
            aqzt aqztVar = (aqzt) obj;
            if (this.c == aqztVar.c() && this.d == aqztVar.b() && this.e == aqztVar.a() && this.f == aqztVar.d() && this.a == aqztVar.g() && this.g == aqztVar.e() && this.h.equals(aqztVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.arad
    public final arac f() {
        return this.h;
    }

    @Override // defpackage.arad
    @Deprecated
    public final boolean g() {
        return this.a;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        int i2 = this.c;
        return ((((i ^ ((((((((i2 ^ 1000003) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        return "BugleSimpleMessageProperties{currentMessageCount=" + this.c + ", codePointsUsed=" + this.d + ", codePointsRemaining=" + this.e + ", maxMessageCount=" + this.f + ", lengthRequiresMms=" + this.a + ", maxSubjectLength=" + this.g + ", requiredProtocol=" + this.h.toString() + "}";
    }
}
