package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeqn implements Runnable {
    final /* synthetic */ eeqm a;

    public eeqn(eeqm eeqmVar) {
        this.a = eeqmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eeqo.a.add(this.a);
        int i = eeqo.b;
        if (i != -1) {
            this.a.b(i);
        }
    }
}
