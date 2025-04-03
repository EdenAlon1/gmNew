package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmfm implements dmfn {
    public final String a;
    public final doas b;
    public final doas c;
    public final String d;
    public final List e;
    public final boolean f;
    public final dmeb g;
    public final ffix h;
    public final doat i;
    private final boolean j;
    private final boolean k;

    public dmfm(String str, doas doasVar, doas doasVar2, String str2, List list, doat doatVar, boolean z, dmeb dmebVar, ffix ffixVar) {
        str.getClass();
        list.getClass();
        dmebVar.getClass();
        this.a = str;
        this.b = doasVar;
        this.c = doasVar2;
        this.d = str2;
        this.e = list;
        this.i = doatVar;
        this.f = z;
        this.j = false;
        this.g = dmebVar;
        this.k = true;
        this.h = ffixVar;
    }

    @Override // defpackage.dmfn
    public final dmfn a(ffix ffixVar) {
        return new dmfm(this.a, this.b, this.c, this.d, this.e, this.i, this.f, this.g, ffixVar);
    }

    @Override // defpackage.dmfn
    public final ffix b() {
        return this.h;
    }

    @Override // defpackage.dmfn
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmfm)) {
            return false;
        }
        dmfm dmfmVar = (dmfm) obj;
        if (!ffkj.e(this.a, dmfmVar.a) || !ffkj.e(this.b, dmfmVar.b) || !ffkj.e(this.c, dmfmVar.c) || !ffkj.e(this.d, dmfmVar.d) || !ffkj.e(this.e, dmfmVar.e) || !ffkj.e(this.i, dmfmVar.i) || this.f != dmfmVar.f) {
            return false;
        }
        boolean z = dmfmVar.j;
        if (this.g != dmfmVar.g) {
            return false;
        }
        boolean z2 = dmfmVar.k;
        return ffkj.e(this.h, dmfmVar.h);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int hashCode2 = ((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.e.hashCode()) * 31;
        doat doatVar = this.i;
        return ((((((((((hashCode2 + (doatVar == null ? 0 : doatVar.a)) * 31) + dmfl.a(this.f)) * 31) + dmfl.a(false)) * 31) + this.g.hashCode()) * 31) + dmfl.a(true)) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "OptIn(title=" + this.a + ", confirmButton=" + this.b + ", denyButton=" + this.c + ", body=" + this.d + ", bodyAnnotations=" + this.e + ", illustration=" + this.i + ", showCloseButton=" + this.f + ", useEqualButtons=false, buttonLayout=" + this.g + ", includeScrim=true, onDismiss=" + this.h + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ dmfm(java.lang.String r13, defpackage.doas r14, defpackage.doas r15, java.lang.String r16, java.util.List r17, defpackage.doat r18, defpackage.dmeb r19, defpackage.ffix r20, int r21) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 16
            if (r1 == 0) goto La
            ffel r1 = defpackage.ffel.a
            r7 = r1
            goto Lc
        La:
            r7 = r17
        Lc:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L13
            r8 = r2
            goto L15
        L13:
            r8 = r18
        L15:
            r1 = r0 & 64
            if (r1 == 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            r9 = r1
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L25
            dmeb r1 = defpackage.dmeb.c
            r10 = r1
            goto L27
        L25:
            r10 = r19
        L27:
            r0 = r0 & 8
            if (r0 == 0) goto L33
            r6 = r2
            r3 = r13
            r4 = r14
            r5 = r15
            r11 = r20
            r2 = r12
            goto L3b
        L33:
            r6 = r16
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r11 = r20
        L3b:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmfm.<init>(java.lang.String, doas, doas, java.lang.String, java.util.List, doat, dmeb, ffix, int):void");
    }
}
