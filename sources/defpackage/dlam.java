package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlam implements dlai {
    private static final enru a = enru.c("com/google/android/libraries/abuse/hades/moirai/download/DefaultBinaryTransparencyVerifier");
    private final dlcr b;

    public dlam(dlcr dlcrVar) {
        dlcrVar.getClass();
        this.b = dlcrVar;
    }

    private static final int b(ewfs ewfsVar, byte[] bArr) {
        eudz.a();
        etgi etgiVar = (etgi) etga.d(bArr).f(etth.a, etgi.class);
        try {
            ewff ewffVar = ewfsVar.c;
            if (ewffVar == null) {
                ewffVar = ewff.a;
            }
            byte[] I = ewffVar.c.I();
            ewff ewffVar2 = ewfsVar.c;
            if (ewffVar2 == null) {
                ewffVar2 = ewff.a;
            }
            etgiVar.a(I, ewffVar2.b.I());
            return 0;
        } catch (GeneralSecurityException unused) {
            ((enrr) a.j().h("com/google/android/libraries/abuse/hades/moirai/download/DefaultBinaryTransparencyVerifier", "verifyProtectionLogRootSignature", 100, "DefaultBinaryTransparencyVerifier.kt")).q("Failure verifying log root signature.");
            return ffkj.e(ewfsVar, ewfs.a) ? 7 : 3;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|(1:(1:9)(2:103|104))(2:105|(2:107|108)(2:109|(1:111)))|10|11|12|(1:14)|15|16|(2:18|(2:20|(5:22|23|(1:25)(9:32|(1:34)|35|(1:37)|38|(2:41|39)|42|43|(2:45|(2:47|(2:49|(4:51|(2:52|(2:54|(1:57)(1:56))(2:85|86))|58|(8:60|(6:63|(1:65)|66|(2:68|69)(2:71|72)|70|61)|73|74|(2:77|75)|78|79|(1:81)(1:82))(2:83|84))(2:87|88))(2:89|90))(2:91|92))(2:93|94))|26|(1:28)(2:30|31))(2:95|96))(2:97|98))(2:99|100)))|112|6|(0)(0)|10|11|12|(0)|15|16|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0292, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0293, code lost:
    
        ((defpackage.enrr) ((defpackage.enrr) defpackage.dlam.a.j()).g(r0).h("com/google/android/libraries/abuse/hades/moirai/download/DefaultBinaryTransparencyVerifier", "verifyProtectionProofHashes", 53, "DefaultBinaryTransparencyVerifier.kt")).q("Invalid log root envelope.");
        r0 = new defpackage.dlah(4, 6);
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[Catch: IllegalArgumentException -> 0x0292, TryCatch #0 {IllegalArgumentException -> 0x0292, blocks: (B:12:0x0061, B:14:0x0065, B:15:0x0067, B:18:0x0089, B:20:0x0095, B:22:0x00a2, B:95:0x0280, B:96:0x0285, B:97:0x0286, B:98:0x028b, B:99:0x028c, B:100:0x0291), top: B:11:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089 A[Catch: IllegalArgumentException -> 0x0292, TRY_ENTER, TryCatch #0 {IllegalArgumentException -> 0x0292, blocks: (B:12:0x0061, B:14:0x0065, B:15:0x0067, B:18:0x0089, B:20:0x0095, B:22:0x00a2, B:95:0x0280, B:96:0x0285, B:97:0x0286, B:98:0x028b, B:99:0x028c, B:100:0x0291), top: B:11:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028c A[Catch: IllegalArgumentException -> 0x0292, TryCatch #0 {IllegalArgumentException -> 0x0292, blocks: (B:12:0x0061, B:14:0x0065, B:15:0x0067, B:18:0x0089, B:20:0x0095, B:22:0x00a2, B:95:0x0280, B:96:0x0285, B:97:0x0286, B:98:0x028b, B:99:0x028c, B:100:0x0291), top: B:11:0x0061 }] */
    @Override // defpackage.dlai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(byte[] r24, defpackage.ewfs r25, defpackage.dlhd r26, defpackage.ffgu r27) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlam.a(byte[], ewfs, dlhd, ffgu):java.lang.Object");
    }
}
