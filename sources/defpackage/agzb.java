package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agzb extends dtyx {
    public agzb(String[] strArr) {
        super("messages LEFT OUTER JOIN message_labels ON (message_labels.message_id=messages._id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final agza b() {
        l();
        return new agza(this.a.a());
    }
}
