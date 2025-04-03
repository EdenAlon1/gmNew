package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnaw extends dtyx {
    public cnaw(String[] strArr) {
        super("message_reactions LEFT JOIN messages ON (messages._id=message_reactions.message_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cnau b() {
        l();
        return new cnau(this.a.a());
    }
}
