package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewu implements hgo {
    final /* synthetic */ hho a;
    final /* synthetic */ dwn b;

    public ewu(hho hhoVar, dwn dwnVar) {
        this.a = hhoVar;
        this.b = dwnVar;
    }

    @Override // defpackage.hgo
    public final void a() {
        dwp dwpVar = (dwp) this.a.a();
        if (dwpVar != null) {
            dwo dwoVar = new dwo(dwpVar);
            dwn dwnVar = this.b;
            if (dwnVar != null) {
                dwnVar.b(dwoVar);
            }
            this.a.b(null);
        }
    }
}
