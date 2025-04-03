package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzit extends dzrg {
    private String a;
    private emxc b;
    private emxc c;
    private emxc d;
    private emxc e;

    public dzit() {
        emux emuxVar = emux.a;
        this.b = emuxVar;
        this.c = emuxVar;
        this.d = emuxVar;
        this.e = emuxVar;
    }

    @Override // defpackage.dzrg
    public final dzrh a() {
        String str = this.a;
        if (str != null) {
            return new dzoc(str, this.b, this.c, this.d, this.e);
        }
        throw new IllegalStateException("Missing required properties: rawText");
    }

    @Override // defpackage.dzrg
    public final void b(engw engwVar) {
        this.d = emxc.j(engwVar);
    }

    @Override // defpackage.dzrg
    public final void c(engw engwVar) {
        this.c = emxc.j(engwVar);
    }

    @Override // defpackage.dzrg
    public final void d(dzrq dzrqVar) {
        this.b = emxc.j(dzrqVar);
    }

    @Override // defpackage.dzrg
    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null rawText");
        }
        this.a = str;
    }

    @Override // defpackage.dzrg
    public final void f(boolean z) {
        this.e = emxc.j(Boolean.valueOf(z));
    }
}
