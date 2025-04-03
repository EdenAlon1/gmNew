package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nka implements Comparable {
    public final long a;
    public final byte[] b;

    public nka(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.a, ((nka) obj).a);
    }
}
