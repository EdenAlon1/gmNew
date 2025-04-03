package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class swq extends ffkh implements ffjm {
    public swq(Object obj) {
        super(2, obj, swt.class, "unblockAction", "unblockAction(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", 0);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        String str = (String) obj;
        ffjm ffjmVar = (ffjm) obj2;
        str.getClass();
        ffjmVar.getClass();
        swt swtVar = (swt) this.g;
        ekzm b = swtVar.d.b("BlockedParticipantListItemUiAdapter#unblockAction");
        try {
            axol.k(swtVar.e, null, new swr(swtVar, str, ffjmVar, null), 3);
            ffig.a(b, null);
            return ffcu.a;
        } finally {
        }
    }
}
