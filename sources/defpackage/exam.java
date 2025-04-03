package defpackage;

import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exam {
    public final ewxv a;
    public final int b;
    public final int c;

    public exam(int i, int i2, Map map) {
        emxf.a(!map.isEmpty());
        emxf.a(i <= i2);
        this.b = i;
        this.c = i2;
        this.a = new ewxv(map);
    }

    public final int a() {
        return this.a.a().size();
    }

    public final String b(int i) {
        return (String) this.a.a().get(i);
    }

    public final String toString() {
        return String.format(Locale.US, "TextLink{start=%s, end=%s, entityScores=%s}", Integer.valueOf(this.b), Integer.valueOf(this.c), this.a);
    }
}
