package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qok implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ qol c;

    public qok(qol qolVar, String str, long j) {
        this.a = str;
        this.b = j;
        this.c = qolVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.a(this.a, this.b);
        qol qolVar = this.c;
        qolVar.a.b(qolVar.toString());
    }
}
