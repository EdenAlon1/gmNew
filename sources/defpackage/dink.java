package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dink implements dimm {
    final Object a;
    final String b;

    public dink(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    @Override // defpackage.dimm
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.dimm
    public final String b() {
        return this.b;
    }

    public final String toString() {
        return String.format(Locale.US, "%s=%s", this.b, this.a);
    }
}
