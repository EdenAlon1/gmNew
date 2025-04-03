package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class ezc extends ffkh implements ffji {
    final /* synthetic */ fai a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezc(fai faiVar) {
        super(1, ffki.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.a = faiVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        float[] fArr = ((icm) obj).a;
        ioc iocVar = (ioc) this.a.d.a();
        if (iocVar != null) {
            if (true != iocVar.t()) {
                iocVar = null;
            }
            if (iocVar != null) {
                iocVar.ej(fArr);
            }
        }
        return ffcu.a;
    }
}
