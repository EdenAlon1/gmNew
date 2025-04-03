package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sau extends saq {
    private final String a;
    private final String b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    public sau(String str, String str2, int i, int i2, int i3, int i4) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null modelName");
        }
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    @Override // defpackage.saq
    public final int a() {
        return this.e;
    }

    @Override // defpackage.saq
    public final int b() {
        return this.c;
    }

    @Override // defpackage.saq
    public final int c() {
        return this.d;
    }

    @Override // defpackage.saq
    public final int d() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof saq) {
            saq saqVar = (saq) obj;
            if (this.a.equals(saqVar.h()) && this.b.equals(saqVar.g()) && this.c == saqVar.b() && this.d == saqVar.c() && this.e == saqVar.a() && this.f == saqVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.saq
    public final String g() {
        return this.b;
    }

    @Override // defpackage.saq
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    public final String toString() {
        return "AiFeature{name=" + this.a + ", modelName=" + this.b + ", type=" + this.c + ", variant=" + this.d + ", id=" + this.e + ", version=" + this.f + "}";
    }
}
