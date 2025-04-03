package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zcm implements dmfn {
    public final fgdj a;
    public final List b;
    public final zcj c;
    private final boolean d;
    private final ffix e;

    /* JADX WARN: Multi-variable type inference failed */
    public zcm() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31);
    }

    @Override // defpackage.dmfn
    public final dmfn a(ffix ffixVar) {
        return new zcm(this.a, this.b, this.c, this.d, ffixVar);
    }

    @Override // defpackage.dmfn
    public final ffix b() {
        return this.e;
    }

    @Override // defpackage.dmfn
    public final boolean c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcm)) {
            return false;
        }
        zcm zcmVar = (zcm) obj;
        return ffkj.e(this.a, zcmVar.a) && ffkj.e(this.b, zcmVar.b) && ffkj.e(this.c, zcmVar.c) && this.d == zcmVar.d && ffkj.e(this.e, zcmVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        zcj zcjVar = this.c;
        return (((((hashCode * 31) + (zcjVar == null ? 0 : zcjVar.hashCode())) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "ThemeSelectionUiData(currentThemeStateFlow=" + this.a + ", themes=" + this.b + ", menuButtonUiData=" + this.c + ", includeScrim=" + this.d + ", onDismiss=" + this.e + ")";
    }

    public zcm(fgdj fgdjVar, List list, zcj zcjVar, boolean z, ffix ffixVar) {
        fgdjVar.getClass();
        list.getClass();
        ffixVar.getClass();
        this.a = fgdjVar;
        this.b = list;
        this.c = zcjVar;
        this.d = z;
        this.e = ffixVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ zcm(defpackage.fgdj r9, defpackage.zcj r10, defpackage.ffix r11, int r12) {
        /*
            r8 = this;
            r0 = r12 & 1
            r1 = 0
            if (r0 == 0) goto L9
            fgcm r9 = defpackage.fgdm.a(r1)
        L9:
            r3 = r9
            r9 = r12 & 2
            if (r9 == 0) goto L16
            int r9 = defpackage.zci.a
            java.util.List r9 = defpackage.zci.a()
            r4 = r9
            goto L17
        L16:
            r4 = r1
        L17:
            r9 = r12 & 4
            if (r9 == 0) goto L1d
            r5 = r1
            goto L1e
        L1d:
            r5 = r10
        L1e:
            r9 = r12 & 8
            if (r9 == 0) goto L24
            r9 = 1
            goto L25
        L24:
            r9 = 0
        L25:
            r6 = r9
            r9 = r12 & 16
            if (r9 == 0) goto L2f
            zcl r11 = new zcl
            r11.<init>()
        L2f:
            r2 = r8
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zcm.<init>(fgdj, zcj, ffix, int):void");
    }
}
