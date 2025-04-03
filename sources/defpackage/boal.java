package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class boal extends dtyx {
    public boal(String[] strArr) {
        super("messages LEFT JOIN participants ON (participants._id=messages.sender_id) LEFT JOIN parts ON (parts.message_id=messages._id) LEFT JOIN link_preview ON (link_preview.message_id=messages._id)", strArr, "messages._id", null, "(participants._id NOTNULL AND parts._id NOTNULL) AND (messages.message_status IN (100, 1, 2, 11) AND messages.is_hidden = 0)", "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boak b() {
        l();
        return new boak(this.a.a());
    }
}
