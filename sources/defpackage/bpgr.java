package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpgr extends dtyx {
    public bpgr(String[] strArr) {
        super("messages LEFT JOIN participants ON (participants._id=messages.sender_id) LEFT JOIN conversations ON (conversations._id=messages.conversation_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bpgq b() {
        l();
        return new bpgq(this.a.a());
    }
}
