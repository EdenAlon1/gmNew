package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ean extends eaq {
    public boolean a = true;
    public int b;

    public ean(int i) {
        this.b = i;
    }

    @Override // defpackage.eaq
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.eaq, defpackage.itu
    public final int e(iny inyVar, inx inxVar, int i) {
        return this.b == 1 ? inxVar.c(i) : inxVar.a(i);
    }

    @Override // defpackage.eaq, defpackage.itu
    public final int g(iny inyVar, inx inxVar, int i) {
        return this.b == 1 ? inxVar.c(i) : inxVar.a(i);
    }

    @Override // defpackage.eaq
    public final long i(ipl iplVar, long j) {
        int c = this.b == 1 ? iplVar.c(jzk.b(j)) : iplVar.a(jzk.b(j));
        if (c < 0) {
            c = 0;
        }
        return jzl.g(0, Alert.DURATION_SHOW_INDEFINITELY, c, c);
    }
}
