package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dody implements dodz {
    public final String a;
    public final String b;
    public final docp c;
    public final List d;
    public final boolean e;
    public final String f;
    private final ffix g;
    private final ffix h;

    public dody() {
        this(null, null, null, null, false, null, 127);
    }

    @Override // defpackage.dnoq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dnoq
    public final ffix b() {
        return this.h;
    }

    @Override // defpackage.dnoq
    public final ffix c() {
        return this.g;
    }

    @Override // defpackage.dnoq
    public final boolean d() {
        throw null;
    }

    @Override // defpackage.dodz
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dody)) {
            return false;
        }
        dody dodyVar = (dody) obj;
        return ffkj.e(this.a, dodyVar.a) && ffkj.e(this.b, dodyVar.b) && ffkj.e(this.c, dodyVar.c) && ffkj.e(this.d, dodyVar.d) && this.e == dodyVar.e && ffkj.e(this.g, dodyVar.g) && ffkj.e(this.f, dodyVar.f);
    }

    @Override // defpackage.dodz
    public final String f() {
        return this.a;
    }

    @Override // defpackage.dodz
    public final List g() {
        return this.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int hashCode2 = ((hashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31;
        docp docpVar = this.c;
        int hashCode3 = (((((((hashCode2 + (docpVar == null ? 0 : docpVar.hashCode())) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231)) * 31) + this.g.hashCode()) * 31;
        String str3 = this.f;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "VerticalRichCardUiData(title=" + this.a + ", description=" + this.b + ", media=" + this.c + ", actions=" + this.d + ", isHighlighted=" + this.e + ", onLayout=" + this.g + ", contentDescription=" + this.f + ")";
    }

    public /* synthetic */ dody(String str, String str2, docp docpVar, List list, boolean z, String str3, int i) {
        list = (i & 8) != 0 ? ffel.a : list;
        boolean z2 = z & ((i & 16) == 0);
        ffix ffixVar = (i & 32) != 0 ? new ffix() { // from class: dodw
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : null;
        int i2 = i & 2;
        int i3 = i & 1;
        docpVar = (i & 4) != 0 ? null : docpVar;
        str2 = i2 != 0 ? null : str2;
        str = 1 == i3 ? null : str;
        str3 = (i & 64) != 0 ? null : str3;
        list.getClass();
        ffixVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = docpVar;
        this.d = list;
        this.e = z2;
        this.g = ffixVar;
        this.f = str3;
        if (str == null && str2 == null && docpVar == null) {
            throw new IllegalStateException("One of title, description, or media must be provided.");
        }
        this.h = new ffix() { // from class: dodx
            @Override // defpackage.ffix
            public final Object invoke() {
                return false;
            }
        };
    }
}
