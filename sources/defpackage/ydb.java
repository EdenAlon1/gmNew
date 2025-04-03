package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ydb {
    public final fgdj a;
    private final fgcm b;

    public ydb() {
        fgcm a = fgdm.a(new xhu(null, null, null, false, null, null, null, false, 0, false, 1023));
        this.b = a;
        this.a = a;
    }

    public final xhu a(ffji ffjiVar) {
        fgcm fgcmVar;
        Object c;
        do {
            fgcmVar = this.b;
            c = fgcmVar.c();
        } while (!fgcmVar.g(c, ffjiVar.invoke(c)));
        return (xhu) c;
    }

    public final xhu b(ffji ffjiVar) {
        fgcm fgcmVar;
        Object c;
        Object invoke;
        do {
            fgcmVar = this.b;
            c = fgcmVar.c();
            invoke = ffjiVar.invoke(c);
        } while (!fgcmVar.g(c, invoke));
        return (xhu) invoke;
    }

    public final void c(ffji ffjiVar) {
        fgcm fgcmVar;
        Object c;
        do {
            fgcmVar = this.b;
            c = fgcmVar.c();
        } while (!fgcmVar.g(c, ffjiVar.invoke(c)));
    }
}
