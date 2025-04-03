package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crwl {
    public static final cskc a = cskc.g("BugleCmsFolsom", "CmsCipherKeyFactoryImpl");
    public final eszz b;
    public final axld c;
    public final errl d;
    public final errl e;
    public final crpp f;
    private final ffbr g;

    public crwl(axld axldVar, crpp crppVar, ffbr ffbrVar, errl errlVar, errl errlVar2, eszz eszzVar) {
        this.b = eszzVar;
        this.c = axldVar;
        this.f = crppVar;
        this.g = ffbrVar;
        this.d = errlVar;
        this.e = errlVar2;
    }

    public final bqvj a(eshl eshlVar) {
        String[] strArr = bqws.a;
        bqvm bqvmVar = new bqvm();
        bqvmVar.e(eshlVar.b);
        int i = eshlVar.d;
        eshm eshmVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : eshm.CMS_HMAC_SHA256_KEY : eshm.CMS_BACKUP_KEY : eshm.CMS_ENCRYPTION_KEY : eshm.CMS_UNKNOWN_KEY;
        if (eshmVar == null) {
            eshmVar = eshm.UNRECOGNIZED;
        }
        Integer num = (Integer) csbr.k.get(eshmVar);
        if (num == null) {
            throw new RuntimeException("Key Type cannot be mapped, make sure CmsObjectBuilderUtility contains the key type and the key type is backed up properly. Key type: " + eshlVar.d);
        }
        bqvmVar.f(num.intValue());
        eyee eyeeVar = eshlVar.c;
        if (eyeeVar.H()) {
            throw new RuntimeException(String.format("Key is empty, make sure you have backed up the key. KeyType: %d, KeyIndex: %d", Integer.valueOf(eshlVar.d), Integer.valueOf(eshlVar.b)));
        }
        bqvmVar.d(eyeeVar.I());
        bqvmVar.c(this.b.c);
        bqvmVar.b(this.b.k);
        return bqvmVar.a();
    }

    public final bqvj b(eyee eyeeVar, int i) {
        try {
            bqvj b = ((Boolean) ((cfup) csgj.Z.get()).e()).booleanValue() ? ((cryg) this.g.b()).b(i, 2) : ((cryg) this.g.b()).c(2);
            byte[] q = b == null ? null : b.q();
            if (b == null || q == null) {
                throw new crwj();
            }
            return a((eshl) eyfy.parseFrom(eshl.a, crvx.a(eyeeVar.I(), q)));
        } catch (eygu e) {
            throw new crwg(e, "Failed to create ".concat(String.valueOf(eshl.class.getSimpleName())));
        } catch (Exception e2) {
            if (e2 instanceof csgt) {
                throw ((csgt) e2);
            }
            throw new crwi(e2, String.format("Can't decrypt %s for %s", esij.class.getSimpleName(), eshl.class.getSimpleName()));
        }
    }
}
