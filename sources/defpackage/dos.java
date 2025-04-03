package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dos extends ffkk implements ffji {
    final /* synthetic */ imj a;
    final /* synthetic */ ild b;
    final /* synthetic */ dpb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dos(imj imjVar, ild ildVar, dpb dpbVar) {
        super(1);
        this.a = imjVar;
        this.b = ildVar;
        this.c = dpbVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        imk.b(this.a, (iku) obj);
        float c = this.b.b().c();
        long a = kao.a(c, c);
        if (kan.a(a) <= 0.0f || kan.b(a) <= 0.0f) {
            String f = kan.f(a);
            Objects.toString(f);
            imn.c("maximumVelocity should be a positive value. You specified=".concat(f));
        }
        imj imjVar = this.a;
        long a2 = kao.a(imjVar.a.a(kan.a(a)), imjVar.b.a(kan.b(a)));
        this.a.b();
        ffwm ffwmVar = this.c.h;
        if (ffwmVar != null) {
            ffjn ffjnVar = dpj.a;
            ffwmVar.b(new dno(kao.a(Float.isNaN(kan.a(a2)) ? 0.0f : kan.a(a2), Float.isNaN(kan.b(a2)) ? 0.0f : kan.b(a2))));
        }
        return ffcu.a;
    }
}
