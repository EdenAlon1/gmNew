package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dndl implements dndq {
    public final String a;
    public final String b;
    public final String c;
    public final Uri d;
    public final String e;
    public final dnal f;
    public final dndk g;
    private final ffix h;

    public dndl(String str, String str2, String str3, Uri uri, String str4, dnal dnalVar, dndk dndkVar, ffix ffixVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = uri;
        this.e = str4;
        this.f = dnalVar;
        this.g = dndkVar;
        this.h = ffixVar;
    }

    @Override // defpackage.doms
    public final ffix a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dndl)) {
            return false;
        }
        dndl dndlVar = (dndl) obj;
        return ffkj.e(this.a, dndlVar.a) && ffkj.e(this.b, dndlVar.b) && ffkj.e(this.c, dndlVar.c) && ffkj.e(this.d, dndlVar.d) && ffkj.e(this.e, dndlVar.e) && ffkj.e(this.f, dndlVar.f) && ffkj.e(this.g, dndlVar.g) && ffkj.e(this.h, dndlVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "Loaded(name=" + this.a + ", description=" + this.b + ", source=" + this.c + ", imageUri=" + this.d + ", imageContentDescription=" + this.e + ", requestListener=" + this.f + ", flags=" + this.g + ", onClick=" + this.h + ")";
    }
}
