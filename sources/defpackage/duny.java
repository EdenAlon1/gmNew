package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duny extends dunx {
    private final String a;
    private final long c;

    public duny(String str, String str2, int i, long j, long j2) {
        super(str2, i, j);
        this.a = str;
        this.c = j2;
    }

    public final String toString() {
        emwz emwzVar = new emwz("Start");
        a(emwzVar);
        emwzVar.a(this.a);
        emwzVar.e("durationSinceEnqueue", this.c / 1000000.0f);
        return emwzVar.toString();
    }
}
