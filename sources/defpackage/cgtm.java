package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgtm {
    private final ffbr a;
    private final elbx b;

    public cgtm(ffbr ffbrVar, elbx elbxVar) {
        this.a = ffbrVar;
        this.b = elbxVar;
    }

    public final void a(ezne ezneVar) {
        if (((Boolean) djai.t().a.X.a()).booleanValue()) {
            ekzm b = this.b.b("BugleMobileConfigurationLogger#logMobileConfigurationEvent");
            try {
                akxl akxlVar = (akxl) this.a.b();
                eolu eoluVar = (eolu) eolv.a.createBuilder();
                eolt eoltVar = eolt.BUGLE_MOBILE_CONFIGURATION_CLIENT_EVENT;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eolvVar.j = eoltVar.dk;
                eolvVar.b |= 1;
                eoluVar.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar.instance;
                ezneVar.getClass();
                eolvVar2.bA = ezneVar;
                eolvVar2.g |= 4;
                akxlVar.j(eoluVar);
                b.close();
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }
}
