package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class erw extends ffkk implements ffix {
    final /* synthetic */ eyh a;
    final /* synthetic */ jlm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erw(eyh eyhVar, jlm jlmVar) {
        super(0);
        this.a = eyhVar;
        this.b = jlmVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        jlm jlmVar;
        eyh eyhVar = this.a;
        if (eyhVar != null) {
            if (eyhVar.c.isEmpty()) {
                jlmVar = eyhVar.b;
            } else {
                evt evtVar = new evt(eyhVar.b);
                hss hssVar = eyhVar.c;
                int a = hssVar.a();
                for (int i = 0; i < a; i++) {
                    ((ffji) hssVar.get(i)).invoke(evtVar);
                }
                jlmVar = evtVar.b;
            }
            eyhVar.b = jlmVar;
            if (jlmVar != null) {
                return jlmVar;
            }
        }
        return this.b;
    }
}
