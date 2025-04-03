package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class khc {
    khe a;
    final /* synthetic */ khd b;

    public khc(khd khdVar) {
        this.b = khdVar;
    }

    public final String toString() {
        String str = "[ ";
        if (this.a != null) {
            for (int i = 0; i < 9; i++) {
                str = str + this.a.i[i] + " ";
            }
        }
        return str + "] " + this.a;
    }
}
