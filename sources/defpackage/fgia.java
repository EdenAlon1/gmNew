package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgia {
    public static final void a(ffgu ffguVar, ffgu ffguVar2) {
        try {
            fggl.a(ffhi.c(ffguVar), ffcu.a);
        } catch (Throwable th) {
            c(ffguVar2, th);
        }
    }

    public static final void b(ffjm ffjmVar, Object obj, ffgu ffguVar) {
        try {
            fggl.a(ffhi.c(ffhi.b(ffjmVar, obj, ffguVar)), ffcu.a);
        } catch (Throwable th) {
            c(ffguVar, th);
        }
    }

    private static final void c(ffgu ffguVar, Throwable th) {
        ffguVar.w(ffci.a(th));
        throw th;
    }
}
