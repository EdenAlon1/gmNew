package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccto {
    private final int a;
    private final becg b;
    private final boolean c;

    public ccto(int i, becg becgVar, boolean z) {
        this.a = i;
        this.b = becgVar;
        this.c = z;
    }

    public final bech a(int i, String str) {
        return b(i, str, csgg.b());
    }

    public final bech b(int i, String str, Integer[] numArr) {
        bech bechVar = new bech();
        bechVar.c = this.b;
        bechVar.e = 32;
        bechVar.b = this.a;
        bechVar.i = str;
        bechVar.c();
        bechVar.h = this.c;
        bechVar.b(String.format(Locale.US, "%s NOT IN (%s)", String.format(Locale.US, "(SELECT cms_life_cycle FROM %s as parent WHERE %s = parent.%s)", bece.d(i), (true != this.b.equals(becg.DELETE) ? "NEW." : "OLD.").concat(str), "_id"), emww.d(',').f(numArr)));
        return bechVar;
    }
}
