package defpackage;

import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlfn extends dlaf {
    public final ByteBuffer a;
    public final String b;
    public final String c;
    public final ffpa d;
    public final String e;
    public final int f;
    private final Map g = null;
    private final String h = null;

    public dlfn(ByteBuffer byteBuffer, String str, String str2, int i, ffpa ffpaVar, String str3) {
        this.a = byteBuffer;
        this.b = str;
        this.c = str2;
        this.f = i;
        this.d = ffpaVar;
        this.e = str3;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be direct");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlfn)) {
            return false;
        }
        dlfn dlfnVar = (dlfn) obj;
        if (!ffkj.e(this.a, dlfnVar.a) || !ffkj.e(this.b, dlfnVar.b) || !ffkj.e(this.c, dlfnVar.c) || this.f != dlfnVar.f) {
            return false;
        }
        Map map = dlfnVar.g;
        if (!ffkj.e(null, null) || !ffkj.e(this.d, dlfnVar.d) || !ffkj.e(this.e, dlfnVar.e)) {
            return false;
        }
        String str = dlfnVar.h;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        ffpa ffpaVar = this.d;
        int hashCode2 = ((((hashCode * 31) + this.f) * 961) + (ffpaVar == null ? 0 : ffpaVar.hashCode())) * 31;
        String str = this.e;
        return (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
    }
}
