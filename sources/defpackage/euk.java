package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
final class euk implements ion {
    public final exk a;
    public final int b;
    public final jwk c;
    public final ffix d;

    public euk(exk exkVar, int i, jwk jwkVar, ffix ffixVar) {
        this.a = exkVar;
        this.b = i;
        this.c = jwkVar;
        this.d = ffixVar;
    }

    @Override // defpackage.hvi
    public final /* synthetic */ hvi a(hvi hviVar) {
        return hvd.a(this, hviVar);
    }

    @Override // defpackage.hvi
    public final /* synthetic */ Object b(Object obj, ffjm ffjmVar) {
        return hvf.a(this, obj, ffjmVar);
    }

    @Override // defpackage.hvi
    public final /* synthetic */ boolean c(ffji ffjiVar) {
        return hvf.b(this, ffjiVar);
    }

    @Override // defpackage.ion
    public final /* synthetic */ int e(iny inyVar, inx inxVar, int i) {
        return iom.a(this, inyVar, inxVar, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euk)) {
            return false;
        }
        euk eukVar = (euk) obj;
        return ffkj.e(this.a, eukVar.a) && this.b == eukVar.b && ffkj.e(this.c, eukVar.c) && ffkj.e(this.d, eukVar.d);
    }

    @Override // defpackage.ion
    public final /* synthetic */ int f(iny inyVar, inx inxVar, int i) {
        return iom.b(this, inyVar, inxVar, i);
    }

    @Override // defpackage.ion
    public final /* synthetic */ int g(iny inyVar, inx inxVar, int i) {
        return iom.c(this, inyVar, inxVar, i);
    }

    @Override // defpackage.ion
    public final /* synthetic */ int h(iny inyVar, inx inxVar, int i) {
        return iom.d(this, inyVar, inxVar, i);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    @Override // defpackage.ion
    public final ipo i(ipq ipqVar, ipl iplVar, long j) {
        long j2;
        ipo ei;
        if (iplVar.b(jzk.a(j)) < jzk.b(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = jzk.m(j2, 0, Alert.DURATION_SHOW_INDEFINITELY, 0, 0, 13);
        }
        iqk e = iplVar.e(j);
        int min = Math.min(e.a, jzk.b(j2));
        ei = ipqVar.ei(min, e.b, ffem.a, new euj(ipqVar, this, e, min));
        return ei;
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
