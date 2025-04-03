package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class yfi extends ffju implements ffjm {
    public static final yfi a = new yfi();

    public yfi() {
        super(2, bsxy.class, "setText", "setText(Ljava/lang/String;)Lcom/google/android/apps/messaging/shared/datamodel/databasegen/tabledefinitions/DraftsTable$UpdateBuilder;", 8);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        bsxy bsxyVar = (bsxy) obj;
        bsxyVar.getClass();
        dtub.u(bsxyVar.a, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, (String) obj2);
        return ffcu.a;
    }
}
