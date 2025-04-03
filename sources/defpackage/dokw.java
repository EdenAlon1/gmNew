package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dokw implements dokx {
    public final dokv a;
    public final dojx b;
    private final String c;
    private final String d;
    private final ffix e;
    private final boolean f;
    private final ffix g;

    public dokw(String str, String str2, dokv dokvVar, dojx dojxVar, ffix ffixVar, ffix ffixVar2) {
        str.getClass();
        dojxVar.getClass();
        this.c = str;
        this.d = str2;
        this.a = dokvVar;
        this.b = dojxVar;
        this.e = ffixVar;
        this.f = false;
        this.g = ffixVar2;
    }

    public static /* synthetic */ dokw e(dokw dokwVar, ffix ffixVar) {
        return new dokw(dokwVar.c, dokwVar.d, dokwVar.a, dokwVar.b, ffixVar, dokwVar.g);
    }

    @Override // defpackage.dokm
    public final ffix a() {
        return this.e;
    }

    @Override // defpackage.dokx
    public final dojx b() {
        return this.b;
    }

    @Override // defpackage.dokx
    public final String c() {
        return this.d;
    }

    @Override // defpackage.dokx
    public final String d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dokw)) {
            return false;
        }
        dokw dokwVar = (dokw) obj;
        if (!ffkj.e(this.c, dokwVar.c) || !ffkj.e(this.d, dokwVar.d) || !ffkj.e(this.a, dokwVar.a) || !ffkj.e(this.b, dokwVar.b) || !ffkj.e(this.e, dokwVar.e)) {
            return false;
        }
        boolean z = dokwVar.f;
        return ffkj.e(this.g, dokwVar.g);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        return ((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + 1237) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "CustomIcon(suggestionPrefix=" + this.c + ", displayText=" + this.d + ", iconSource=" + this.a + ", styleData=" + this.b + ", onClick=" + this.e + ", closeable=false, onClose=" + this.g + ")";
    }

    public /* synthetic */ dokw(String str, String str2, dokv dokvVar, dojx dojxVar, int i) {
        this(str, (i & 2) != 0 ? null : str2, dokvVar, (i & 8) != 0 ? new dojw() : dojxVar, new ffix() { // from class: dokr
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, new ffix() { // from class: doks
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        });
    }
}
