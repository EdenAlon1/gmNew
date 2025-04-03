package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fggd {
    public static final fgho a = new fgho("CLOSED");

    public static final Object a(fghl fghlVar, long j, ffjm ffjmVar) {
        while (true) {
            if (fghlVar.b >= j && !fghlVar.r()) {
                return fghlVar;
            }
            Object m = fghlVar.m();
            fgho fghoVar = a;
            if (m == fghoVar) {
                return fghoVar;
            }
            fghl fghlVar2 = (fghl) ((fgge) m);
            if (fghlVar2 == null) {
                fghlVar2 = (fghl) ffjmVar.a(Long.valueOf(fghlVar.b + 1), fghlVar);
                if (fghlVar.a.d(null, fghlVar2)) {
                    if (fghlVar.r()) {
                        fghlVar.q();
                    }
                }
            }
            fghlVar = fghlVar2;
        }
    }
}
