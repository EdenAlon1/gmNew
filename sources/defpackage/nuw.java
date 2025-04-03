package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nuw {
    public final lsa a;
    public final int b;
    public final String c;

    /* JADX WARN: Multi-variable type inference failed */
    public nuw(lsb lsbVar, int i, int i2, String str) {
        this.a = (lsa) lsbVar.b.get(i);
        this.b = i2;
        this.c = str;
    }

    public final boolean a() {
        return this.a.c(this.b);
    }
}
