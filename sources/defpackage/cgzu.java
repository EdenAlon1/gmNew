package defpackage;

import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgzu {
    public static final cgzu a;
    public static final enhk b;
    private static final /* synthetic */ cgzu[] d;
    final int c = 0;

    static {
        cgzu cgzuVar = new cgzu();
        a = cgzuVar;
        d = new cgzu[]{cgzuVar};
        b = ennc.d(Arrays.asList(values()), new emwl() { // from class: cgzt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return 0;
            }
        });
    }

    private cgzu() {
    }

    public static cgzu[] values() {
        return (cgzu[]) d.clone();
    }
}
