package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eys implements ion {
    public final exk a;
    public final int b;
    public final jwk c;
    public final ffix d;

    public eys(exk exkVar, int i, jwk jwkVar, ffix ffixVar) {
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
        if (!(obj instanceof eys)) {
            return false;
        }
        eys eysVar = (eys) obj;
        return ffkj.e(this.a, eysVar.a) && this.b == eysVar.b && ffkj.e(this.c, eysVar.c) && ffkj.e(this.d, eysVar.d);
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
        ipo ei;
        iqk e = iplVar.e(jzk.m(j, 0, 0, 0, Alert.DURATION_SHOW_INDEFINITELY, 7));
        int min = Math.min(e.b, jzk.a(j));
        ei = ipqVar.ei(e.a, min, ffem.a, new eyr(ipqVar, this, e, min));
        return ei;
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
