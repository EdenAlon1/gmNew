package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ttk implements tsy {
    public static final cskc a = cskc.g("BugleCmsFolsom", "EncryptCmsBackupSyncletTask");
    public final axld b;
    private final ffbr c;
    private final ffsk d;

    public ttk(ffbr ffbrVar, ffsk ffskVar, axld axldVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        axldVar.getClass();
        this.c = ffbrVar;
        this.d = ffskVar;
        this.b = axldVar;
    }

    @Override // defpackage.tsy
    public final /* synthetic */ int a() {
        return 1;
    }

    @Override // defpackage.tsy
    public final elfl b() {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new ttj(this, null));
        return c;
    }

    @Override // defpackage.tsy
    public final String c() {
        return "EncryptCmsBackupSyncletTask";
    }

    @Override // defpackage.tsy
    public final int d() {
        return 2;
    }

    @Override // defpackage.tsy
    public final /* synthetic */ Object e() {
        return tsx.a();
    }

    public final void f(String str) {
        String substring;
        int Y = ffpc.Y(str, ".");
        if (Y == -1) {
            substring = str;
        } else {
            substring = str.substring(Y + 1, str.length());
            substring.getClass();
        }
        a.p("EncryptCmsBackupHandler completed with status ".concat(substring));
        ((akzt) this.c.b()).c(str);
    }
}
