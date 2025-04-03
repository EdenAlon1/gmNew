package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpzf extends dtyx {
    public bpzf(String[] strArr) {
        super("verified_sms_senders LEFT JOIN verified_sms_brands ON (verified_sms_brands.brand_id=verified_sms_senders.brand_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bpze b() {
        l();
        return new bpze(this.a.a());
    }
}
