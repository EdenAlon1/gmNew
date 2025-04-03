package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cekl implements cctm {
    private final crty a;
    private final cclj b;
    private final ffsk c;

    public cekl(crty crtyVar, cclj ccljVar, ffsk ffskVar) {
        crtyVar.getClass();
        ffskVar.getClass();
        this.a = crtyVar;
        this.b = ccljVar;
        this.c = ffskVar;
    }

    @Override // defpackage.cctm
    public final axew a() {
        return axew.BACKUP_KEY;
    }

    @Override // defpackage.cctm
    public final bqkx b() {
        return bqkx.BACKUP_KEY_OBJECT;
    }

    @Override // defpackage.cctm
    public final /* synthetic */ ccdx c() {
        return this.b;
    }

    @Override // defpackage.cctm
    public final elfl d(String str) {
        if (str == null || ffpc.J(str)) {
            return this.a.y();
        }
        throw new IllegalArgumentException("Backup keys cannot be paginated.");
    }

    @Override // defpackage.cctm
    public final elfl e(pot potVar) {
        elfl c;
        c = axol.c(this.c, ffhe.a, ffsm.a, new cekk(null));
        return c;
    }

    @Override // defpackage.cctm
    public final epfx f() {
        return epfx.RESTORE_BACKUP_KEY;
    }

    @Override // defpackage.cctm
    public final /* bridge */ /* synthetic */ String g(Object obj) {
        eszz eszzVar = (eszz) obj;
        eszzVar.getClass();
        String str = eszzVar.c;
        str.getClass();
        return str;
    }

    @Override // defpackage.cctm
    public final String h() {
        return "Backup Key";
    }
}
