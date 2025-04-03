package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cumo {
    public static final cfup a = cfvl.n(cfvl.b, "enable_spam_fm", false);
    public static final cfup b = cfvl.n(cfvl.b, "enable_fm_tachyon_sync", false);
    public static final cfup c = cfvl.j(cfvl.b, "spam_fm_mct", 0.5f);
    public static final cfup d;
    public static final cfup e;
    public static final cfup f;
    public static final cfva g;

    static {
        cfvl.j(cfvl.b, "spam_fm_hct", 0.9f);
        d = cfvl.m(cfvl.b, "spam_fm_fid", "");
        e = cfvl.m(cfvl.b, "spam_fm_gid", "");
        cfvl.l(cfvl.b, "spam_fm_cadence", 4L);
        f = cfvl.l(cfvl.b, "spam_fm_cadence_m", 30L);
        cfvl.y("spam_fm_update_threshold");
        ecwh ecwhVar = cfvl.b;
        ezgt ezgtVar = (ezgt) ezgu.a.createBuilder();
        ezgtVar.a((int) ernk.b(4).toSeconds());
        ezgtVar.a((int) ernk.e(30).toSeconds());
        ezgtVar.a((int) ernk.e(30).toSeconds());
        ezgtVar.a((int) ernk.b(1).toSeconds());
        ezgtVar.a((int) ernk.b(1).toSeconds());
        ezgtVar.a((int) ernk.b(1).toSeconds());
        g = cfvl.u(ecwhVar, "spam_fm_delay_array_seconds", ezgtVar.build(), new ecwg() { // from class: cumn
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (ezgu) eyfy.parseFrom(ezgu.a, bArr);
            }
        });
    }
}
