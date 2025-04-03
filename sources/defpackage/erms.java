package defpackage;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
final class erms implements Comparator {
    public static final erms a;
    private static final /* synthetic */ erms[] b;

    static {
        erms ermsVar = new erms();
        a = ermsVar;
        b = new erms[]{ermsVar};
    }

    private erms() {
    }

    public static erms[] values() {
        return (erms[]) b.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < min; i++) {
            int b2 = ermu.b(bArr[i]) - ermu.b(bArr2[i]);
            if (b2 != 0) {
                return b2;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
