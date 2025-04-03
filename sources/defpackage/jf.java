package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jf implements Runnable {
    final /* synthetic */ jz a;

    public jf(jz jzVar) {
        this.a = jzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz jzVar = this.a;
        if ((jzVar.L & 1) != 0) {
            jzVar.D(0);
        }
        jz jzVar2 = this.a;
        if ((jzVar2.L & 4096) != 0) {
            jzVar2.D(108);
        }
        jz jzVar3 = this.a;
        jzVar3.K = false;
        jzVar3.L = 0;
    }
}
