package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bore extends dtyx {
    public bore(String[] strArr) {
        super("remote_user_id_to_registration_id JOIN remote_registrations_table ON (remote_registrations_table.tachyon_registration_id=remote_user_id_to_registration_id.tachyon_registration_id)", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bord b() {
        l();
        return new bord(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = borh.a;
        apply = function.apply(new borg());
        k(new borf((borg) apply));
    }
}
