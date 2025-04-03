package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnem implements dndt {
    public final String a;
    public final String b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final ffix f;
    public final int g;
    public final hus h;

    public dnem(String str, String str2, List list, boolean z, boolean z2, ffix ffixVar, hus husVar, int i) {
        list.getClass();
        ffixVar.getClass();
        husVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = ffixVar;
        this.h = husVar;
        this.g = i;
    }

    public static /* synthetic */ dnem a(dnem dnemVar, String str, String str2, List list, boolean z, ffix ffixVar, hus husVar, int i) {
        if ((i & 1) != 0) {
            str = dnemVar.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = dnemVar.b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            list = dnemVar.c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            z = dnemVar.d;
        }
        boolean z2 = z;
        boolean z3 = (i & 16) != 0 ? dnemVar.e : false;
        if ((i & 32) != 0) {
            ffixVar = dnemVar.f;
        }
        ffix ffixVar2 = ffixVar;
        hus husVar2 = (i & 64) != 0 ? dnemVar.h : husVar;
        int i2 = dnemVar.g;
        str3.getClass();
        list2.getClass();
        ffixVar2.getClass();
        husVar2.getClass();
        return new dnem(str3, str4, list2, z2, z3, ffixVar2, husVar2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnem)) {
            return false;
        }
        dnem dnemVar = (dnem) obj;
        return ffkj.e(this.a, dnemVar.a) && ffkj.e(this.b, dnemVar.b) && ffkj.e(this.c, dnemVar.c) && this.d == dnemVar.d && this.e == dnemVar.e && ffkj.e(this.f, dnemVar.f) && ffkj.e(this.h, dnemVar.h) && this.g == dnemVar.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + dnek.a(this.d)) * 31) + dnek.a(this.e)) * 31) + this.f.hashCode()) * 31) + this.h.hashCode()) * 31) + this.g;
    }

    public final String toString() {
        return "CheckboxListItemUiData(title=" + this.a + ", subtitle=" + this.b + ", subtitleAnnotations=" + this.c + ", isChecked=" + this.d + ", useTrailingCheckbox=" + this.e + ", onToggle=" + this.f + ", verticalAlignment=" + this.h + ", titleMaxLines=" + this.g + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ dnem(java.lang.String r10, java.lang.String r11, java.util.List r12, boolean r13, boolean r14, defpackage.ffix r15, defpackage.hus r16, int r17, int r18) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 4
            if (r1 == 0) goto L8
            ffel r12 = defpackage.ffel.a
        L8:
            r3 = r12
            r12 = r0 & 8
            r1 = 0
            r2 = 1
            if (r12 == 0) goto L11
            r12 = r1
            goto L12
        L11:
            r12 = r2
        L12:
            r4 = r12 & r13
            r12 = r0 & 16
            if (r12 == 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            r5 = r1 & r14
            r12 = r0 & 32
            if (r12 == 0) goto L27
            dnel r12 = new dnel
            r12.<init>()
            r6 = r12
            goto L28
        L27:
            r6 = r15
        L28:
            r12 = r0 & 64
            if (r12 == 0) goto L32
            int r12 = defpackage.huo.a
            hus r12 = defpackage.hum.n
            r7 = r12
            goto L34
        L32:
            r7 = r16
        L34:
            r12 = r0 & 2
            if (r12 == 0) goto L39
            r11 = 0
        L39:
            r12 = r0 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L3f
            r8 = r2
            goto L41
        L3f:
            r8 = r17
        L41:
            r0 = r9
            r1 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnem.<init>(java.lang.String, java.lang.String, java.util.List, boolean, boolean, ffix, hus, int, int):void");
    }
}
