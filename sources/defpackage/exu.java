package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exu extends ffkk implements ffix {
    final /* synthetic */ jlk a;
    final /* synthetic */ jci b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exu(jlk jlkVar, jci jciVar) {
        super(0);
        this.a = jlkVar;
        this.b = jciVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        jlw jlwVar = (jlw) this.a.a;
        boolean z = jlwVar instanceof jlv;
        jci jciVar = this.b;
        if (z) {
            jlwVar.b();
            try {
                jciVar.a(((jlv) jlwVar).a);
            } catch (IllegalArgumentException unused) {
            }
        } else if (jlwVar instanceof jlu) {
            jlwVar.b();
        }
        return ffcu.a;
    }
}
