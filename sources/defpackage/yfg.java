package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class yfg extends ffkh implements ffji {
    public static final yfg a = new yfg();

    public yfg() {
        super(1, bswn.class, "getText", "getText()Ljava/lang/String;", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        bswn bswnVar = (bswn) obj;
        bswnVar.getClass();
        bswnVar.az(1, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        return bswnVar.b;
    }
}
