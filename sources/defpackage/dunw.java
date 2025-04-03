package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dunw extends dunx {
    final Throwable a;
    private final String c;
    private final long d;

    public dunw(String str, String str2, int i, long j, long j2, Throwable th) {
        super(str2, i, j);
        this.a = th;
        this.c = str;
        this.d = j2;
    }

    public final String toString() {
        emwz emwzVar = new emwz("Finish");
        a(emwzVar);
        emwzVar.a(this.c);
        emwzVar.e("durationSinceStart", this.d / 1000000.0f);
        emwzVar.a(this.a);
        emwzVar.c();
        return emwzVar.toString();
    }
}
