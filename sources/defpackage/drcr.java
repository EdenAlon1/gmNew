package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drcr implements dren {
    public final String a;
    public final String b;
    private final String c;
    private final Iterable d;
    private final drek e;
    private final drcq f;

    public /* synthetic */ drcr(String str, String str2, String str3, Iterable iterable, drek drekVar, int i) {
        drekVar = (i & 16) != 0 ? drej.a : drekVar;
        str.getClass();
        str2.getClass();
        str3.getClass();
        iterable.getClass();
        drekVar.getClass();
        this.a = str;
        this.c = str2;
        this.b = str3;
        this.d = iterable;
        this.e = drekVar;
        this.f = new drcq(new dreh(this));
    }

    @Override // defpackage.dren
    public final drek a() {
        return this.e;
    }

    @Override // defpackage.dren
    public final /* synthetic */ drlu b() {
        return drld.d;
    }

    @Override // defpackage.drli
    public final Iterable c() {
        return this.d;
    }

    @Override // defpackage.dren
    public final String d() {
        return this.c;
    }

    @Override // defpackage.dren
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drcr)) {
            return false;
        }
        drcr drcrVar = (drcr) obj;
        return ffkj.e(this.a, drcrVar.a) && ffkj.e(this.c, drcrVar.c) && ffkj.e(this.b, drcrVar.b) && ffkj.e(this.d, drcrVar.d) && ffkj.e(this.e, drcrVar.e);
    }

    @Override // defpackage.dren
    public final String f() {
        return this.b;
    }

    @Override // defpackage.doxs
    public final /* synthetic */ doxr fm() {
        return this.e;
    }

    @Override // defpackage.doxx
    public final /* synthetic */ Object fn() {
        return this.f;
    }

    @Override // defpackage.doxs
    public final String fo() {
        String str = this.b;
        String str2 = this.c;
        String b = dqlb.b(this.a);
        String b2 = dqlb.b(str2);
        Uri parse = Uri.parse(str);
        parse.getClass();
        String a = dqlb.a(parse);
        Iterable iterable = this.d;
        ArrayList arrayList = new ArrayList(ffdx.n(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((drem) it.next()).fo());
        }
        return "GifMedia(id='" + b + "', description='" + b2 + "', webUrl='" + a + "', variations=" + arrayList + ", source=" + this.e + ")";
    }

    @Override // defpackage.dren
    public final /* synthetic */ int h() {
        return dreg.b(this);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    @Override // defpackage.drlj
    public final /* bridge */ /* synthetic */ drlw m() {
        drlw b;
        b = b();
        return b;
    }

    public final String toString() {
        return "GifMedia(id=" + this.a + ", description=" + this.c + ", webUrl=" + this.b + ", variations=" + this.d + ", source=" + this.e + ")";
    }
}
