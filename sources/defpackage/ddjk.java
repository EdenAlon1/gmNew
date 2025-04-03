package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddjk extends dtyx {
    public ddjk(String[] strArr) {
        super("messages INNER JOIN reminders ON (reminders.message_id=messages._id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ddji b() {
        l();
        return new ddji(this.a.a());
    }
}
