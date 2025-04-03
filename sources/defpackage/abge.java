package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abge implements dmfn {
    public final ffix a;
    public final ffix b;
    public final String c;
    public final abgh d;
    private final boolean e;

    public abge(ffix ffixVar, ffix ffixVar2, String str, abgh abghVar) {
        abghVar.getClass();
        this.a = ffixVar;
        this.e = true;
        this.b = ffixVar2;
        this.c = str;
        this.d = abghVar;
    }

    @Override // defpackage.dmfn
    public final dmfn a(ffix ffixVar) {
        return new abge(ffixVar, this.b, this.c, this.d);
    }

    @Override // defpackage.dmfn
    public final ffix b() {
        return this.a;
    }

    @Override // defpackage.dmfn
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abge)) {
            return false;
        }
        abge abgeVar = (abge) obj;
        if (!ffkj.e(this.a, abgeVar.a)) {
            return false;
        }
        boolean z = abgeVar.e;
        return ffkj.e(this.b, abgeVar.b) && ffkj.e(this.c, abgeVar.c) && this.d == abgeVar.d;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + 1231) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ComposeConfirmationUiData(onDismiss=" + this.a + ", includeScrim=true, onStartSetup=" + this.b + ", phoneNumber=" + this.c + ", composeType=" + this.d + ")";
    }

    public /* synthetic */ abge(ffix ffixVar, String str, abgh abghVar) {
        this(new ffix() { // from class: abgd
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, ffixVar, str, abghVar);
    }
}
