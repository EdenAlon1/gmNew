package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ora implements Runnable {
    final /* synthetic */ orb a;

    public ora(orb orbVar) {
        this.a = orbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.performHapticFeedback(0);
    }
}
