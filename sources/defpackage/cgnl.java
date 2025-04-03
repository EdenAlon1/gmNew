package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final /* synthetic */ class cgnl extends ffju implements ffjm {
    public static final cgnl a = new cgnl();

    public cgnl() {
        super(2, eolu.class, "setBugleMddLibEvent", "setBugleMddLibEvent(Lcom/google/common/logging/BugleProtos$BugleMddLibEvent$Builder;)Lcom/google/common/logging/BugleProtos$BugleEvent$Builder;", 8);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        eolu eoluVar = (eolu) obj;
        eond eondVar = (eond) obj2;
        eoluVar.getClass();
        eondVar.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eong eongVar = (eong) eondVar.build();
        eolv eolvVar2 = eolv.a;
        eongVar.getClass();
        eolvVar.O = eongVar;
        eolvVar.c |= 512;
        return ffcu.a;
    }
}
