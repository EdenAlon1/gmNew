package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcuj implements ellh {
    final /* synthetic */ dcty a;

    public dcuj(dcty dctyVar) {
        this.a = dctyVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        boolean z = ((dcwe) ellfVar).a;
        dcty dctyVar = this.a;
        if (z) {
            if (dctyVar.aa) {
                dctyVar.G.setVisibility(8);
            } else {
                dctyVar.y.setVisibility(8);
            }
            dctyVar.z.setVisibility(8);
        } else {
            if (dctyVar.aa) {
                dctyVar.G.setVisibility(true == dctyVar.y() ? 0 : 8);
            } else {
                dctyVar.y.setVisibility(true == dctyVar.y() ? 0 : 8);
            }
            dctyVar.z.setVisibility(0);
        }
        return elli.a;
    }
}
