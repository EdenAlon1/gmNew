package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azys {
    final String a = eleg.c();
    final emyl b;

    public azys() {
        final RuntimeException runtimeException = new RuntimeException();
        this.b = emys.a(new emyl() { // from class: azyr
            @Override // defpackage.emyl
            public final Object get() {
                return Arrays.toString(runtimeException.getStackTrace());
            }
        });
    }

    public final String a() {
        return (String) this.b.get();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof azys)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        azys azysVar = (azys) obj;
        return Objects.equals(azysVar.a, this.a) && Objects.equals(azysVar.a(), a());
    }

    public final int hashCode() {
        return Objects.hash(a(), this.a);
    }
}
