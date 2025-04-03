package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctax {
    public static final ejui a = new ejtz("IMAGE_COMPRESSION_SETTINGS_DATA_SOURCE_CONTENT_KEY");
    public final ejvp b;
    public final ffbr c;
    public final ffbr d;
    private final ffbr e;
    private comc f;

    public ctax(ffbr ffbrVar, ejvp ejvpVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.e = ffbrVar;
        this.b = ejvpVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    public static boolean d(long j) {
        return j > ((Long) cbib.n.e()).longValue();
    }

    public final int a(long j) {
        try {
            if (!((auff) this.d.b()).a()) {
                return ((ctau) b().l()).c;
            }
            if (c()) {
                return (d(j) ? (Integer) ctay.e.e() : (Integer) ctay.a.e()).intValue();
            }
            return (d(j) ? (Integer) ctay.g.e() : (Integer) ctay.c.e()).intValue();
        } catch (eygu e) {
            ((akzt) this.c.b()).c("Bugle.Media.FastImageSending.FailToGetLongDimension.Count");
            throw e;
        }
    }

    public final comc b() {
        if (this.f == null) {
            comy comyVar = (comy) this.e.b();
            comu c = comv.c();
            c.d(comb.IMAGE_COMPRESSION);
            c.f(ctau.a);
            this.f = comyVar.a(c.a());
        }
        return this.f;
    }

    public final boolean c() {
        return ((ctau) b().l()).e;
    }
}
