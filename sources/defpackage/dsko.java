package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsko {
    public static final Object a(eg egVar, String str, String str2, String str3, boolean z, ffji ffjiVar, ffgu ffguVar) {
        ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar.B();
        ehft ehftVar = new ehft(egVar);
        ffjiVar.invoke(ehftVar);
        ehftVar.n(str);
        ehftVar.j(z);
        ehftVar.u(str2, new dskl(ffrhVar));
        if (str3 != null) {
            ehftVar.p(str3, new dskm(ffrhVar));
        }
        ehftVar.r(new dskn(ffrhVar));
        ffrhVar.d(new dskk(ehftVar.a()));
        Object m = ffrhVar.m();
        if (m == ffhh.a) {
            ffguVar.getClass();
        }
        return m;
    }
}
