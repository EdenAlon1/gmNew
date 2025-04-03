package defpackage;

import android.util.Size;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afo extends aht {
    private final String a;
    private final Class b;
    private final bgk c;
    private final bhh d;
    private final Size e;
    private final bgr f;
    private final List g;

    public afo(String str, Class cls, bgk bgkVar, bhh bhhVar, Size size, bgr bgrVar, List list) {
        this.a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.b = cls;
        if (bgkVar == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.c = bgkVar;
        if (bhhVar == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.d = bhhVar;
        this.e = size;
        this.f = bgrVar;
        this.g = list;
    }

    @Override // defpackage.aht
    public final Size a() {
        return this.e;
    }

    @Override // defpackage.aht
    public final bgk b() {
        return this.c;
    }

    @Override // defpackage.aht
    public final bgr c() {
        return this.f;
    }

    @Override // defpackage.aht
    public final bhh d() {
        return this.d;
    }

    @Override // defpackage.aht
    public final Class e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Size size;
        bgr bgrVar;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aht) {
            aht ahtVar = (aht) obj;
            if (this.a.equals(ahtVar.f()) && this.b.equals(ahtVar.e()) && this.c.equals(ahtVar.b()) && this.d.equals(ahtVar.d()) && ((size = this.e) != null ? size.equals(ahtVar.a()) : ahtVar.a() == null) && ((bgrVar = this.f) != null ? bgrVar.equals(ahtVar.c()) : ahtVar.c() == null) && ((list = this.g) != null ? list.equals(ahtVar.g()) : ahtVar.g() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aht
    public final String f() {
        return this.a;
    }

    @Override // defpackage.aht
    public final List g() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        Size size = this.e;
        int hashCode2 = ((hashCode * 1000003) ^ (size == null ? 0 : size.hashCode())) * 1000003;
        bgr bgrVar = this.f;
        int hashCode3 = (hashCode2 ^ (bgrVar == null ? 0 : bgrVar.hashCode())) * 1000003;
        List list = this.g;
        return hashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "UseCaseInfo{useCaseId=" + this.a + ", useCaseType=" + this.b + ", sessionConfig=" + this.c + ", useCaseConfig=" + this.d + ", surfaceResolution=" + this.e + ", streamSpec=" + this.f + ", captureTypes=" + this.g + "}";
    }
}
