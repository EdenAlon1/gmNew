package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bywt extends dtvh {
    public bywt() {
        super("verified_sms_senders", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = byxc.a;
        apply = function.apply(new byxb());
        this.b = new byxa((byxb) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new byws(this.a.a(), this.b);
    }
}
