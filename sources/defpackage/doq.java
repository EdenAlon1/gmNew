package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class doq extends ffkk implements ffjm {
    final /* synthetic */ imj a;
    final /* synthetic */ dpb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doq(imj imjVar, dpb dpbVar) {
        super(2);
        this.a = imjVar;
        this.b = dpbVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        long j = ((iak) obj2).a;
        imk.b(this.a, (iku) obj);
        ffwm ffwmVar = this.b.h;
        if (ffwmVar != null) {
            ffwmVar.b(new dnm(j));
        }
        return ffcu.a;
    }
}
