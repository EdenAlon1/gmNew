package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abda extends ffkh implements ffji {
    public abda(Object obj) {
        super(1, obj, abdj.class, "onZoomEvent", "onZoomEvent(Lcom/google/android/apps/messaging/conversation2/screen/pinchtozoom/PinchToZoomEvent;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        abjo abjoVar = (abjo) obj;
        abjoVar.getClass();
        abdj abdjVar = (abdj) this.g;
        if (ffkj.e(abjoVar, abjn.a)) {
            abdjVar.f.b(true);
        } else if (abjoVar instanceof abjl) {
            abdjVar.e.d(((abjl) abjoVar).a);
        } else {
            if (!ffkj.e(abjoVar, abjm.a)) {
                throw new ffcd();
            }
            abdjVar.f.b(false);
        }
        return ffcu.a;
    }
}
