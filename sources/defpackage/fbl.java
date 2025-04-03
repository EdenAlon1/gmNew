package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbl extends ffkk implements ffji {
    final /* synthetic */ fbo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbl(fbo fboVar) {
        super(1);
        this.a = fboVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        fbo fboVar = this.a;
        fbi fbiVar = fboVar.j;
        if (fbiVar == null) {
            return false;
        }
        ffji ffjiVar = fboVar.i;
        if (ffjiVar != null) {
            ffjiVar.invoke(fbiVar);
        }
        fbo fboVar2 = this.a;
        fbi fbiVar2 = fboVar2.j;
        if (fbiVar2 != null) {
            fbiVar2.c = booleanValue;
        }
        fboVar2.k();
        return true;
    }
}
