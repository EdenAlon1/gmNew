package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class ulw extends ffkh implements ffji {
    public static final ulw a = new ulw();

    public ulw() {
        super(1, ult.class, "toStickerMedia", "toStickerMedia(Lcom/google/android/apps/messaging/shared/datamodel/data/message/part/MessagePartCoreData;)Lcom/google/android/libraries/compose/sticker/data/StickerMedia;", 1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        drek drekVar;
        String str;
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
        messagePartCoreData.getClass();
        eppr O = messagePartCoreData.O();
        if (O != null) {
            eprl eprlVar = O.e == 203 ? (eprl) O.f : eprl.a;
            if (eprlVar != null) {
                epri epriVar = eprlVar.c == 105 ? (epri) eprlVar.d : epri.a;
                if (epriVar != null && (str = epriVar.c) != null && !ffpc.J(str)) {
                    drekVar = dsch.a;
                    drek drekVar2 = drekVar;
                    return new dsci("", "", "", ffdx.b(ult.a(messagePartCoreData, drekVar2)), drekVar2);
                }
            }
        }
        drekVar = drej.a;
        drek drekVar22 = drekVar;
        return new dsci("", "", "", ffdx.b(ult.a(messagePartCoreData, drekVar22)), drekVar22);
    }
}
