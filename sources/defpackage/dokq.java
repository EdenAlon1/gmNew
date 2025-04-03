package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dokq implements dokx {
    public final dmzz a;
    public final dojx b;
    public final boolean c;
    private final String d;
    private final String e;
    private final ffix f;
    private final boolean g;
    private final ffix h;

    public dokq(String str, String str2, dmzz dmzzVar, dojx dojxVar, boolean z, ffix ffixVar, ffix ffixVar2) {
        str.getClass();
        dojxVar.getClass();
        this.d = str;
        this.e = str2;
        this.a = dmzzVar;
        this.b = dojxVar;
        this.c = z;
        this.f = ffixVar;
        this.g = false;
        this.h = ffixVar2;
    }

    public static /* synthetic */ dokq e(dokq dokqVar, ffix ffixVar) {
        return new dokq(dokqVar.d, dokqVar.e, dokqVar.a, dokqVar.b, dokqVar.c, ffixVar, dokqVar.h);
    }

    @Override // defpackage.dokm
    public final ffix a() {
        return this.f;
    }

    @Override // defpackage.dokx
    public final dojx b() {
        return this.b;
    }

    @Override // defpackage.dokx
    public final String c() {
        return this.e;
    }

    @Override // defpackage.dokx
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dokq)) {
            return false;
        }
        dokq dokqVar = (dokq) obj;
        if (!ffkj.e(this.d, dokqVar.d) || !ffkj.e(this.e, dokqVar.e) || this.a != dokqVar.a || !ffkj.e(this.b, dokqVar.b) || this.c != dokqVar.c || !ffkj.e(this.f, dokqVar.f)) {
            return false;
        }
        boolean z = dokqVar.g;
        return ffkj.e(this.h, dokqVar.h);
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        dmzz dmzzVar = this.a;
        return ((((((((((hashCode2 + (dmzzVar == null ? 0 : dmzzVar.hashCode())) * 31) + this.b.hashCode()) * 31) + dokn.a(this.c)) * 31) + this.f.hashCode()) * 31) + dokn.a(false)) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "Basic(suggestionPrefix=" + this.d + ", displayText=" + this.e + ", icon=" + this.a + ", styleData=" + this.b + ", isEmojiOnly=" + this.c + ", onClick=" + this.f + ", closeable=false, onClose=" + this.h + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ dokq(java.lang.String r11, java.lang.String r12, defpackage.dmzz r13, defpackage.dojx r14, boolean r15, int r16) {
        /*
            r10 = this;
            r0 = r16 & 8
            r1 = 0
            if (r0 == 0) goto La
            dojv r14 = new dojv
            r14.<init>(r1)
        La:
            r6 = r14
            r14 = r16 & 4
            r0 = r16 & 2
            if (r14 == 0) goto L13
            r5 = r1
            goto L14
        L13:
            r5 = r13
        L14:
            if (r0 == 0) goto L18
            r4 = r1
            goto L19
        L18:
            r4 = r12
        L19:
            r12 = r16 & 16
            if (r12 == 0) goto L1f
            r12 = 0
            goto L20
        L1f:
            r12 = 1
        L20:
            r7 = r12 & r15
            doko r8 = new doko
            r8.<init>()
            dokp r9 = new dokp
            r9.<init>()
            r2 = r10
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dokq.<init>(java.lang.String, java.lang.String, dmzz, dojx, boolean, int):void");
    }
}
