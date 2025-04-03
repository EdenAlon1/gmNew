package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afkc extends dtyx {
    public afkc(String[] strArr) {
        super("conversations LEFT OUTER JOIN conversation_labels ON (conversation_labels.conversation_id=conversations._id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final afkb b() {
        l();
        return new afkb(this.a.a());
    }
}
