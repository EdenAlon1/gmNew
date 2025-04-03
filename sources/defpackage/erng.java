package defpackage;

import j$.time.Instant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erng implements ernh {
    public static final erng a;
    private static final /* synthetic */ erng[] b;

    static {
        erng erngVar = new erng();
        a = erngVar;
        b = new erng[]{erngVar};
    }

    private erng() {
    }

    public static erng[] values() {
        return (erng[]) b.clone();
    }

    @Override // defpackage.ernh
    public final Instant a() {
        return Instant.now();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "TimeSource.system()";
    }
}
