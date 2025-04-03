package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class ajfq extends ffju implements ffjm {
    public static final ajfq a = new ajfq();

    public ajfq() {
        super(2, eolu.class, "setBardEvent", "setBardEvent(Lcom/google/common/logging/bugle/Bard$BardEvent$Builder;)Lcom/google/common/logging/BugleProtos$BugleEvent$Builder;", 8);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        eolu eoluVar = (eolu) obj;
        epox epoxVar = (epox) obj2;
        eoluVar.getClass();
        epoxVar.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        epoy epoyVar = (epoy) epoxVar.build();
        eolv eolvVar2 = eolv.a;
        epoyVar.getClass();
        eolvVar.ce = epoyVar;
        eolvVar.h |= 64;
        return ffcu.a;
    }
}
