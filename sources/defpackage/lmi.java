package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmi implements Runnable {
    private final lkv a;
    private final lki b;
    private boolean c;

    public lmi(lkv lkvVar, lki lkiVar) {
        lkiVar.getClass();
        this.a = lkvVar;
        this.b = lkiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        this.a.e(this.b);
        this.c = true;
    }
}
