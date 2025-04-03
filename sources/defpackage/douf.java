package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class douf implements dlut, doui {
    public final String a;
    public final boolean b;
    private final List c;
    private final String d;
    private final dotn e;

    public douf(String str, boolean z, List list, dotn dotnVar) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = null;
        this.e = dotnVar;
    }

    public static /* synthetic */ douf b(douf doufVar, boolean z) {
        return new douf(doufVar.a, z, doufVar.c, doufVar.e);
    }

    @Override // defpackage.dlut
    public final String a() {
        return null;
    }

    @Override // defpackage.dlut
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof douf)) {
            return false;
        }
        douf doufVar = (douf) obj;
        if (!ffkj.e(this.a, doufVar.a) || this.b != doufVar.b || !ffkj.e(this.c, doufVar.c)) {
            return false;
        }
        String str = doufVar.d;
        return ffkj.e(null, null) && ffkj.e(this.e, doufVar.e);
    }

    @Override // defpackage.dlut
    public final List f() {
        return this.c;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode()) * 961) + this.e.hashCode();
    }

    public final String toString() {
        return "LoadingComplete(text=" + this.a + ", expanded=" + this.b + ", annotations=" + this.c + ", contentDescription=null, flags=" + this.e + ")";
    }

    public /* synthetic */ douf(String str, boolean z, List list) {
        this(str, z, list, new dotn(null));
    }
}
