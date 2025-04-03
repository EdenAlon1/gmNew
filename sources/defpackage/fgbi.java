package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgbi implements ffxy {
    final /* synthetic */ fflb a;

    public fgbi(fflb fflbVar) {
        this.a = fflbVar;
    }

    @Override // defpackage.ffxy
    public final Object fQ(Object obj, ffgu ffguVar) {
        fflb fflbVar = this.a;
        if (fflbVar.a != fgfg.a) {
            throw new IllegalArgumentException("Flow has more than one element");
        }
        fflbVar.a = obj;
        return ffcu.a;
    }
}
