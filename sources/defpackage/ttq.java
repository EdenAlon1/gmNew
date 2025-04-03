package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class ttq extends ffju implements ffjm {
    public static final ttq a = new ttq();

    public ttq() {
        super(2, eolu.class, "setBugleContact", "setBugleContact(Lcom/google/common/logging/BugleProtos$BugleContact$Builder;)Lcom/google/common/logging/BugleProtos$BugleEvent$Builder;", 8);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        eolu eoluVar = (eolu) obj;
        eokc eokcVar = (eokc) obj2;
        eoluVar.getClass();
        eokcVar.getClass();
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eokd eokdVar = (eokd) eokcVar.build();
        eolv eolvVar2 = eolv.a;
        eokdVar.getClass();
        eolvVar.D = eokdVar;
        eolvVar.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        return ffcu.a;
    }
}
