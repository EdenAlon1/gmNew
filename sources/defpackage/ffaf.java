package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffaf implements febh {
    private final eyhs a;

    public ffaf(eyhs eyhsVar) {
        this.a = eyhsVar;
    }

    @Override // defpackage.febh
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        try {
            return this.a.getParserForType().l(bArr, ffag.a);
        } catch (eygu e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.febh
    public final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        return ((eyhs) obj).toByteArray();
    }
}
