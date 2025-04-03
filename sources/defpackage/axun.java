package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axun {
    private static final entd a = entd.c("BugleContacts");
    private final ffbr b;
    private final ctvs c;

    public axun(ffbr ffbrVar, ctvs ctvsVar) {
        ctvsVar.getClass();
        this.b = ffbrVar;
        this.c = ctvsVar;
    }

    public final boolean a() {
        int i = axwg.a;
        if (!axwg.a()) {
            ((ensz) a.h()).q("ContactsSyncFeature is not enabled.");
            return false;
        }
        if (!this.c.d()) {
            ((ensz) a.h()).q("Default SMS App is not Bugle.");
            return false;
        }
        if (((ctud) this.b.b()).i()) {
            return true;
        }
        ((ensz) a.h()).q("App does not have read contacts permission.");
        return false;
    }
}
