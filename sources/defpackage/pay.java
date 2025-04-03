package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pay extends pas {
    final paz a;

    public pay(paz pazVar) {
        this.a = pazVar;
    }

    @Override // defpackage.pas, defpackage.pak
    public final void b(par parVar) {
        paz pazVar = this.a;
        int i = pazVar.w - 1;
        pazVar.w = i;
        if (i == 0) {
            pazVar.x = false;
            pazVar.s();
        }
        parVar.I(this);
    }

    @Override // defpackage.pas, defpackage.pak
    public final void e(par parVar) {
        paz pazVar = this.a;
        if (pazVar.x) {
            return;
        }
        pazVar.B();
        this.a.x = true;
    }
}
