package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class famx implements evbk {
    private final ecda b = ecda.a(famy.a, new ecda("EncryptedGenerate"));
    private final enip c = new enpx("https://www.googleapis.com/auth/mdi.aratea");

    @Override // defpackage.evbk
    public final ecda a() {
        return this.b;
    }

    @Override // defpackage.evbk
    public final Set b() {
        return this.c.isEmpty() ? famy.e.g : this.c;
    }

    public final String toString() {
        return this.b.a;
    }
}
