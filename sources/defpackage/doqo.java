package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doqo implements dnmw, dnmx {
    public final String a;
    public final dmzz b;
    public final List c;
    public final ffix d;
    private final String e;

    public doqo(String str, String str2, dmzz dmzzVar, List list, ffix ffixVar) {
        this.e = str;
        this.a = str2;
        this.b = dmzzVar;
        this.c = list;
        this.d = ffixVar;
    }

    @Override // defpackage.dnmw
    public final String b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doqo)) {
            return false;
        }
        doqo doqoVar = (doqo) obj;
        return ffkj.e(this.e, doqoVar.e) && ffkj.e(this.a, doqoVar.a) && this.b == doqoVar.b && ffkj.e(this.c, doqoVar.c) && ffkj.e(this.d, doqoVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() * 31) + this.a.hashCode();
        dmzz dmzzVar = this.b;
        int hashCode2 = ((((hashCode * 31) + (dmzzVar == null ? 0 : dmzzVar.hashCode())) * 31) + this.c.hashCode()) * 31;
        ffix ffixVar = this.d;
        return hashCode2 + (ffixVar != null ? ffixVar.hashCode() : 0);
    }

    public final String toString() {
        return "ToolstoneUiData(id=" + this.e + ", text=" + this.a + ", icon=" + this.b + ", annotations=" + this.c + ", onClose=" + this.d + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ doqo(java.lang.String r7, java.lang.String r8, defpackage.dmzz r9, java.util.List r10, defpackage.ffix r11, int r12) {
        /*
            r6 = this;
            r0 = r12 & 8
            if (r0 == 0) goto L6
            ffel r10 = defpackage.ffel.a
        L6:
            r4 = r10
            r10 = r12 & 4
            r0 = 0
            if (r10 == 0) goto Le
            r3 = r0
            goto Lf
        Le:
            r3 = r9
        Lf:
            r9 = r12 & 16
            if (r9 == 0) goto L18
            r5 = r0
            r1 = r7
            r2 = r8
            r0 = r6
            goto L1c
        L18:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
        L1c:
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doqo.<init>(java.lang.String, java.lang.String, dmzz, java.util.List, ffix, int):void");
    }
}
