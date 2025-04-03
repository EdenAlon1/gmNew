package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class uxc extends ffju implements ffjm {
    public static final uxc a = new uxc();

    public uxc() {
        super(2, eolu.class, "setBugleSelectedMessagesEvent", "setBugleSelectedMessagesEvent(Lcom/google/common/logging/BugleProtos$SelectedMessagesEvent$Builder;)Lcom/google/common/logging/BugleProtos$BugleEvent$Builder;", 8);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        eolu eoluVar = (eolu) obj;
        epiv epivVar = (epiv) obj2;
        eoluVar.getClass();
        epivVar.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        epiw epiwVar = (epiw) epivVar.build();
        eolv eolvVar2 = eolv.a;
        epiwVar.getClass();
        eolvVar.S = epiwVar;
        eolvVar.c |= 16384;
        return ffcu.a;
    }
}
