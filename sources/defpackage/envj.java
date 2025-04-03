package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class envj extends Cenum {
    private final envh a;
    private final envp b;
    private final envi c;
    private final enul d;

    public envj() {
        envh envhVar = (envh) p(envh.class, "flogger.backend_factory");
        this.a = envhVar == null ? envk.a : envhVar;
        envp envpVar = (envp) p(envp.class, "flogger.logging_context");
        this.b = envpVar == null ? envz.a : envpVar;
        envi enviVar = (envi) p(envi.class, "flogger.clock");
        this.c = enviVar == null ? envo.a : enviVar;
        this.d = envn.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object p(java.lang.Class r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.envj.p(java.lang.Class, java.lang.String):java.lang.Object");
    }

    @Override // defpackage.Cenum
    protected final long c() {
        return this.c.a();
    }

    @Override // defpackage.Cenum
    protected final ento e(String str) {
        return this.a.a(str);
    }

    @Override // defpackage.Cenum
    protected final enul h() {
        return this.d;
    }

    @Override // defpackage.Cenum
    protected final envp j() {
        return this.b;
    }

    @Override // defpackage.Cenum
    protected final String m() {
        return "Platform: " + getClass().getName() + "\nBackendFactory: " + this.a.toString() + "\nClock: " + this.c.toString() + "\nContextDataProvider: " + String.valueOf(this.b) + "\nLogCallerFinder: Default stack-based caller finder\n";
    }
}
