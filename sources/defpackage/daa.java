package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class daa implements cyl {
    private final int a;

    public daa() {
        this((byte[]) null);
    }

    @Override // defpackage.cxt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dcw a(dbv dbvVar) {
        return new dde(this.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof daa) && ((daa) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public daa(int i) {
        this.a = i;
    }

    public /* synthetic */ daa(byte[] bArr) {
        this(0);
    }
}
