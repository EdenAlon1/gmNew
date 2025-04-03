package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmjr extends dtyx {
    public bmjr(String[] strArr) {
        super("messages INNER JOIN messages AS b", strArr, null, "%TIMESTAMP_COLUMN_VAL% %ORDER_DIRECTION%, messages._id %ORDER_DIRECTION%", "messages.conversation_id=%CONVERSATION_ID% AND %EXCLUDE_DRAFTS% AND messages.is_hidden <> 1  AND messages.message_status <> 16", "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bmjq b() {
        l();
        return new bmjq(this.a.a());
    }
}
