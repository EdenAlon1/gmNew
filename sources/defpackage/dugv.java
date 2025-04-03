package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dugv {
    private static final enru a = enru.c("com/google/android/libraries/geller/portable/GellerUtil");

    /* JADX WARN: Type inference failed for: r7v3, types: [eyhs, java.lang.Object] */
    public static eyhs a(byte[] bArr, eyhs eyhsVar) {
        if (bArr == null) {
            ((enrr) ((enrr) a.i()).h("com/google/android/libraries/geller/portable/GellerUtil", "processNativeResult", 67, "GellerUtil.java")).q("Native result is null.");
            return eyhsVar;
        }
        try {
            return eyhsVar.getParserForType().l(bArr, eyfc.a());
        } catch (eygu e) {
            ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/android/libraries/geller/portable/GellerUtil", "processNativeResult", '@', "GellerUtil.java")).q("Invalid native result.");
            return eyhsVar;
        }
    }
}
