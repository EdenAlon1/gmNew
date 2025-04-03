package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmzr implements dnoq {
    public final List a;
    public final dmzq b;
    public final boolean c;
    private final ffix d;
    private final String e = null;
    private final ffix f = new ffix() { // from class: dmzo
        @Override // defpackage.ffix
        public final Object invoke() {
            return false;
        }
    };

    public dmzr(List list, dmzq dmzqVar, boolean z, ffix ffixVar) {
        this.a = list;
        this.b = dmzqVar;
        this.c = z;
        this.d = ffixVar;
    }

    @Override // defpackage.dnoq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dnoq
    public final ffix b() {
        return this.f;
    }

    @Override // defpackage.dnoq
    public final ffix c() {
        throw null;
    }

    @Override // defpackage.dnoq
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmzr)) {
            return false;
        }
        dmzr dmzrVar = (dmzr) obj;
        if (!ffkj.e(this.a, dmzrVar.a) || !ffkj.e(this.b, dmzrVar.b) || this.c != dmzrVar.c || !ffkj.e(this.d, dmzrVar.d)) {
            return false;
        }
        String str = dmzrVar.e;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode()) * 31;
    }

    public final String toString() {
        return "GalleryBubbleUiData(mediaItems=" + this.a + ", flags=" + this.b + ", isHighlighted=" + this.c + ", onLayout=" + this.d + ", contentDescription=null)";
    }
}
