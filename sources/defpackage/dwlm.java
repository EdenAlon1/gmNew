package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwlm extends jrk {
    public final dwlh c;
    public final jsy d;
    public final int e;
    public final dwlj f;
    public final dwli g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwlm(dwlh dwlhVar, jsy jsyVar, dwlj dwljVar, dwli dwliVar) {
        super(dwls.a, dwljVar.a);
        jsyVar.getClass();
        this.c = dwlhVar;
        this.d = jsyVar;
        this.e = 0;
        this.f = dwljVar;
        this.g = dwliVar;
        this.h = "name=Google Sans&weight=" + dwliVar.a.i + "&italic=" + (jss.b(0, 1) ? 1 : 0);
    }

    @Override // defpackage.jsd
    public final jsy b() {
        return this.d;
    }

    @Override // defpackage.jsd
    public final void c() {
    }
}
