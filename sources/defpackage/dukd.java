package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dukd {
    public static eyhs a(eyhs eyhsVar, byte[] bArr) {
        try {
            return eyhsVar.toBuilder().mergeFrom(bArr, eyfc.a()).build();
        } catch (eygu e) {
            throw new IllegalStateException(e);
        }
    }
}
