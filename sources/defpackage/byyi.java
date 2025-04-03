package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byyi extends duak {
    public byyi() {
        super("vmt");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byyh b() {
        ah();
        return new byyh(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(String str) {
        dtub.u(this.a, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, str);
    }

    public final void d(ardn ardnVar) {
        if (ardnVar == null) {
            this.a.putNull("vmt_status");
        } else {
            this.a.put("vmt_status", Integer.valueOf(ardnVar.a()));
        }
    }
}
