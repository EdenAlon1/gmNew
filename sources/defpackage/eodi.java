package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
final class eodi implements eodj {
    public static final eodi a;
    private static final /* synthetic */ eodi[] b;

    static {
        eodi eodiVar = new eodi();
        a = eodiVar;
        b = new eodi[]{eodiVar};
    }

    private eodi() {
    }

    public static eodi[] values() {
        return (eodi[]) b.clone();
    }

    @Override // defpackage.eodj
    public final /* synthetic */ long a(byte[] bArr, int i) {
        if (ordinal() == 0) {
            return ermr.d(bArr[i + 7], bArr[i + 6], bArr[i + 5], bArr[i + 4], bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
        }
        throw null;
    }
}
