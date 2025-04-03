package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bymy extends dtyx {
    public bymy(String[] strArr) {
        super("conversation_suggestions INNER JOIN messages ON (messages._id=conversation_suggestions.message_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bymx b() {
        l();
        return new bymx(this.a.a());
    }
}
