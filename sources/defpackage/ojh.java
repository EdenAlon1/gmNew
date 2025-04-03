package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ojh implements ffji {
    final /* synthetic */ oji a;
    private boolean b = true;

    public ojh(oji ojiVar) {
        this.a = ojiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ffji ffjiVar;
        odk odkVar = (odk) obj;
        odkVar.getClass();
        if (this.b) {
            this.b = false;
        } else if (odkVar.d.b instanceof ofw) {
            oji.m(this.a);
            oco ocoVar = this.a.a;
            ocoVar.l.remove(this);
            if (ocoVar.l.isEmpty() && (ffjiVar = (ffji) ocoVar.k.get()) != null) {
                ocoVar.g.e.a.remove(ffjiVar);
            }
        }
        return ffcu.a;
    }
}
