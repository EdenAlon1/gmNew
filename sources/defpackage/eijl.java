package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eijl extends eikk {
    private final ContentType a;
    private final Class b;
    private final Supplier c;

    public eijl(ContentType contentType, Class cls, Supplier supplier) {
        this.a = contentType;
        this.b = cls;
        this.c = supplier;
    }

    @Override // defpackage.eikk
    public final ContentType a() {
        return this.a;
    }

    @Override // defpackage.eikk
    public final Class b() {
        return this.b;
    }

    @Override // defpackage.eikk
    public final Supplier c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eikk) {
            eikk eikkVar = (eikk) obj;
            if (this.a.equals(eikkVar.a()) && this.b.equals(eikkVar.b())) {
                equals = this.c.equals(eikkVar.c());
                if (equals) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        hashCode = this.c.hashCode();
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        Supplier supplier = this.c;
        Class cls = this.b;
        return "Configuration{contentType=" + this.a.toString() + ", messageType=" + cls.toString() + ", factory=" + supplier.toString() + "}";
    }
}
