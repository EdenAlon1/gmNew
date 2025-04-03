package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnsm implements dnto {
    private final dntn a;
    private final Long b;
    private final ffbz c;
    private final int d;

    public dnsm(ffix ffixVar, int i, dntn dntnVar, Long l) {
        this.d = i;
        this.a = dntnVar;
        this.b = l;
        this.c = ffca.b(2, ffixVar);
    }

    private final List d() {
        return (List) this.c.a();
    }

    @Override // defpackage.dnto
    public final dntn a() {
        return this.a;
    }

    @Override // defpackage.dnto
    public final List b() {
        return d();
    }

    @Override // defpackage.dnto
    public final int c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dnsm) {
            dnsm dnsmVar = (dnsm) obj;
            return this.d == dnsmVar.d && ffkj.e(this.a, dnsmVar.a) && ffkj.e(null, null) && ffkj.e(null, null) && ffkj.e(d(), dnsmVar.d()) && ffkj.e(this.b, dnsmVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.d * 31) + this.a.hashCode()) * 29791) + d().hashCode()) * 31) + this.b.hashCode();
    }
}
