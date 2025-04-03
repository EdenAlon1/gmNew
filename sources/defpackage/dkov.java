package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkov {
    public String b;
    public dkxl d;
    public dkye e;
    public List f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public String a = eeja.a();
    public long c = System.currentTimeMillis();

    public dkov(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
    }

    public final dkxl a() {
        if (this.d == null) {
            this.d = (dkxl) this.i.b();
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dkov)) {
            return false;
        }
        dkov dkovVar = (dkov) obj;
        return Objects.equals(this.b, dkovVar.b) && Objects.equals(this.d, dkovVar.a());
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = str != null ? str.hashCode() : 0;
        dkxl dkxlVar = this.d;
        return (hashCode * 31) + (dkxlVar != null ? dkxlVar.hashCode() : 0);
    }
}
