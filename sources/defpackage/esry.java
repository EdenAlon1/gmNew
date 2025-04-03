package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esry {
    public static final fatc a(Throwable th, fast fastVar) {
        fata a;
        fatb fatbVar = (fatb) fatc.a.createBuilder();
        fatbVar.getClass();
        fass fassVar = (fass) fasu.a.createBuilder();
        fassVar.getClass();
        faso.b(fastVar, fassVar);
        faso.d(4, fassVar);
        faso.e(4, fassVar);
        if (th instanceof esqb) {
            a = esqa.a(((esqb) th).a);
        } else {
            fasy fasyVar = (fasy) fata.a.createBuilder();
            fasyVar.getClass();
            fasx fasxVar = fasx.TACHYGRAM_ERROR_UNSPECIFIED;
            fasxVar.getClass();
            fasyVar.copyOnWrite();
            ((fata) fasyVar.instance).b = fasxVar.a();
            fasr fasrVar = fasr.ERROR_RECOVERY_TYPE_UNSPECIFIED;
            fasrVar.getClass();
            fasyVar.copyOnWrite();
            ((fata) fasyVar.instance).c = fasrVar.a();
            a = fasp.a(fasyVar);
        }
        faso.c(a, fassVar);
        fasq.b(faso.a(fassVar), fatbVar);
        return fasq.a(fatbVar);
    }

    public static final essp b(int i, String str) {
        return new essp(i, "GroupMessage of type " + fbzm.a(i) + " does not have a " + str + " message.");
    }
}
