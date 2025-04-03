package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class twb extends ffju implements ffjm {
    public static final twb a = new twb();

    public twb() {
        super(2, eolu.class, "setBugleContactPicker", "setBugleContactPicker(Lcom/google/common/logging/bugle/BugleContactPicker$ContactPickerEvent$Builder;)Lcom/google/common/logging/BugleProtos$BugleEvent$Builder;", 8);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        eolu eoluVar = (eolu) obj;
        epub epubVar = (epub) obj2;
        eoluVar.getClass();
        epubVar.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        epuc epucVar = (epuc) epubVar.build();
        eolv eolvVar2 = eolv.a;
        epucVar.getClass();
        eolvVar.Y = epucVar;
        eolvVar.c |= 4194304;
        return ffcu.a;
    }
}
