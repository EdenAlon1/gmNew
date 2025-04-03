package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abjt implements ffxy {
    final /* synthetic */ abjx a;

    public abjt(abjx abjxVar) {
        this.a = abjxVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        cymp cympVar = (cymp) obj;
        boolean z = cympVar.d;
        abjx abjxVar = this.a;
        abjxVar.b = z;
        float f = cympVar.c;
        if (z) {
            abjxVar.d.f(new Float(f));
        }
        return ffcu.a;
    }
}
