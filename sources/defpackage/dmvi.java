package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmvi implements dmvt {
    public final String a;
    public final List b;
    public final String c;
    public final List d;
    public final doas e;
    public final doas f;
    public final ffix g;

    public dmvi(String str, List list, String str2, List list2, doas doasVar, doas doasVar2, ffix ffixVar) {
        list2.getClass();
        ffixVar.getClass();
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = list2;
        this.e = doasVar;
        this.f = doasVar2;
        this.g = ffixVar;
    }

    public static /* synthetic */ dmvi b(dmvi dmviVar, String str, List list, String str2, doas doasVar, doas doasVar2, ffix ffixVar, int i) {
        if ((i & 1) != 0) {
            str = dmviVar.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            list = dmviVar.b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str2 = dmviVar.c;
        }
        String str4 = str2;
        List list3 = (i & 8) != 0 ? dmviVar.d : null;
        if ((i & 16) != 0) {
            doasVar = dmviVar.e;
        }
        doas doasVar3 = doasVar;
        if ((i & 32) != 0) {
            doasVar2 = dmviVar.f;
        }
        doas doasVar4 = doasVar2;
        if ((i & 64) != 0) {
            ffixVar = dmviVar.g;
        }
        ffix ffixVar2 = ffixVar;
        str3.getClass();
        list2.getClass();
        list3.getClass();
        ffixVar2.getClass();
        return new dmvi(str3, list2, str4, list3, doasVar3, doasVar4, ffixVar2);
    }

    @Override // defpackage.dmvt
    public final /* synthetic */ dmvt a(boolean z, ffix ffixVar) {
        return dmvb.a(this, z, ffixVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmvi)) {
            return false;
        }
        dmvi dmviVar = (dmvi) obj;
        return ffkj.e(this.a, dmviVar.a) && ffkj.e(this.b, dmviVar.b) && ffkj.e(this.c, dmviVar.c) && ffkj.e(this.d, dmviVar.d) && ffkj.e(this.e, dmviVar.e) && ffkj.e(this.f, dmviVar.f) && ffkj.e(this.g, dmviVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        int hashCode2 = ((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31;
        doas doasVar = this.e;
        int hashCode3 = (hashCode2 + (doasVar == null ? 0 : doasVar.hashCode())) * 31;
        doas doasVar2 = this.f;
        return ((hashCode3 + (doasVar2 != null ? doasVar2.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "Option(title=" + this.a + ", items=" + this.b + ", body=" + this.c + ", bodyAnnotations=" + this.d + ", confirmButton=" + this.e + ", dismissButton=" + this.f + ", onDismissRequest=" + this.g + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ dmvi(java.lang.String r9, java.util.List r10, java.lang.String r11, java.util.List r12, defpackage.doas r13, defpackage.doas r14, defpackage.ffix r15, int r16) {
        /*
            r8 = this;
            r0 = r16 & 8
            if (r0 == 0) goto L6
            ffel r12 = defpackage.ffel.a
        L6:
            r4 = r12
            r12 = r16 & 16
            r0 = 0
            if (r12 == 0) goto Le
            r5 = r0
            goto Lf
        Le:
            r5 = r13
        Lf:
            r12 = r16 & 32
            if (r12 == 0) goto L15
            r6 = r0
            goto L16
        L15:
            r6 = r14
        L16:
            r12 = r16 & 64
            if (r12 == 0) goto L21
            dmvh r12 = new dmvh
            r12.<init>()
            r7 = r12
            goto L22
        L21:
            r7 = r15
        L22:
            r12 = r16 & 4
            if (r12 == 0) goto L2b
            r3 = r0
            r1 = r9
            r2 = r10
            r0 = r8
            goto L2f
        L2b:
            r3 = r11
            r0 = r8
            r1 = r9
            r2 = r10
        L2f:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmvi.<init>(java.lang.String, java.util.List, java.lang.String, java.util.List, doas, doas, ffix, int):void");
    }
}
