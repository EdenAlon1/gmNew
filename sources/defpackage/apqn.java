package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class apqn implements apqy {
    public static apqm d() {
        apqi apqiVar = new apqi();
        apqiVar.b(0L);
        apqiVar.d(0L);
        apqiVar.c(false);
        return apqiVar;
    }

    @Override // defpackage.apqy
    public abstract long a();

    @Override // defpackage.apqy
    public abstract long b();

    @Override // defpackage.apqy
    public abstract boolean c();

    @Override // defpackage.apqy
    public final boolean e() {
        return a() > 0;
    }
}
