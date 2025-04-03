package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dscj {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public boolean f;

    public dscj(ewnp ewnpVar, boolean z) {
        ewnpVar.getClass();
        String str = ewnpVar.b;
        str.getClass();
        ewmw ewmwVar = ewnpVar.d;
        String str2 = (ewmwVar == null ? ewmw.a : ewmwVar).c;
        str2.getClass();
        String str3 = ewnpVar.e;
        str3.getClass();
        String str4 = ewnpVar.g;
        str4.getClass();
        eygr eygrVar = ewnpVar.h;
        eygrVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = eygrVar.iterator();
        while (it.hasNext()) {
            arrayList.add(new dsci((ewnk) it.next()));
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dscj)) {
            return false;
        }
        dscj dscjVar = (dscj) obj;
        return ffkj.e(this.a, dscjVar.a) && ffkj.e(this.b, dscjVar.b) && ffkj.e(this.c, dscjVar.c) && ffkj.e(this.d, dscjVar.d) && ffkj.e(this.e, dscjVar.e) && this.f == dscjVar.f;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        return "StickerPack(id=" + this.a + ", icon=" + this.b + ", title=" + this.c + ", artist=" + this.d + ", stickers=" + this.e + ", isFavorite=" + this.f + ")";
    }
}
