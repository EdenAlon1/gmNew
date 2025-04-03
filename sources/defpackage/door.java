package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class door {
    public final cym a;
    public final cym b;
    public final cym c;
    public final cym d;
    public final cym e;
    public final cym f;
    private final cym g;

    public door() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof door)) {
            return false;
        }
        door doorVar = (door) obj;
        return ffkj.e(this.a, doorVar.a) && ffkj.e(this.b, doorVar.b) && ffkj.e(this.c, doorVar.c) && ffkj.e(this.d, doorVar.d) && ffkj.e(this.e, doorVar.e) && ffkj.e(this.g, doorVar.g) && ffkj.e(this.f, doorVar.f);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.g.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "Easing(emphasized=" + this.a + ", emphasizedAccelerate=" + this.b + ", emphasizedDecelerate=" + this.c + ", linear=" + this.d + ", standard=" + this.e + ", standardAccelerate=" + this.g + ", standardDecelerate=" + this.f + ")";
    }

    public /* synthetic */ door(byte[] bArr) {
        cyh cyhVar = new cyh(0.2f, 0.0f, 0.0f, 1.0f);
        cyh cyhVar2 = new cyh(0.3f, 0.0f, 0.8f, 0.15f);
        cyh cyhVar3 = new cyh(0.05f, 0.7f, 0.1f, 1.0f);
        cym cymVar = cyp.d;
        cyh cyhVar4 = new cyh(0.2f, 0.0f, 0.0f, 1.0f);
        cyh cyhVar5 = new cyh(0.3f, 0.0f, 1.0f, 1.0f);
        cyh cyhVar6 = new cyh(0.0f, 0.0f, 0.0f, 1.0f);
        cymVar.getClass();
        this.a = cyhVar;
        this.b = cyhVar2;
        this.c = cyhVar3;
        this.d = cymVar;
        this.e = cyhVar4;
        this.g = cyhVar5;
        this.f = cyhVar6;
    }
}
