package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ewqj implements evbk {
    private final ecda b = ecda.a(ewqy.a, new ecda("SyncDevicePhoneNumbers"));
    private final enip c = new enpx("https://www.googleapis.com/auth/myphonenumbers");

    @Override // defpackage.evbk
    public final ecda a() {
        return this.b;
    }

    @Override // defpackage.evbk
    public final Set b() {
        return this.c.isEmpty() ? ewqy.M.O : this.c;
    }

    public final String toString() {
        return this.b.a;
    }
}
