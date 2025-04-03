package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbk extends ffkk implements ffji {
    final /* synthetic */ fbo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbk(fbo fboVar) {
        super(1);
        this.a = fboVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jlm jlmVar = (jlm) obj;
        fbo fboVar = this.a;
        fbi fbiVar = fboVar.j;
        if (fbiVar == null) {
            fbi fbiVar2 = new fbi(fboVar.a, jlmVar);
            fay fayVar = new fay(jlmVar, fboVar.b, fboVar.c, fboVar.d, fboVar.e, fboVar.f, ffel.a);
            fayVar.e(fboVar.a().a);
            fbiVar2.d = fayVar;
            fboVar.j = fbiVar2;
        } else if (!ffkj.e(jlmVar, fbiVar.b)) {
            fbiVar.b = jlmVar;
            fay fayVar2 = fbiVar.d;
            if (fayVar2 != null) {
                fayVar2.g(jlmVar, fboVar.b, fboVar.c, fboVar.d, fboVar.e, fboVar.f, ffel.a);
            }
        }
        this.a.k();
        return true;
    }
}
