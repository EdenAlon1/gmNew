package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class est implements ffxy {
    final /* synthetic */ eva a;
    final /* synthetic */ jvw b;
    final /* synthetic */ fhi c;
    final /* synthetic */ juw d;

    public est(eva evaVar, jvw jvwVar, fhi fhiVar, juw juwVar) {
        this.a = evaVar;
        this.b = jvwVar;
        this.c = fhiVar;
        this.d = juwVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        if (((Boolean) obj).booleanValue() && this.a.p()) {
            jvw jvwVar = this.b;
            eva evaVar = this.a;
            fhi fhiVar = this.c;
            eub.f(jvwVar, evaVar, fhiVar.f(), this.d, fhiVar.b);
        } else {
            eub.d(this.a);
        }
        return ffcu.a;
    }
}
