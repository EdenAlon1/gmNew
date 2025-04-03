package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bjvh extends dtyx {
    public bjvh(String[] strArr) {
        super("messages LEFT JOIN message_replies_view ON (%REPLIES_VIEW_JOIN%)", strArr, null, null, "message_status = 3", "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bjvg b() {
        l();
        return new bjvg(this.a.a());
    }
}
