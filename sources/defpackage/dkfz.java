package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkfz implements eeht {
    @Override // defpackage.eeht
    public final void a(eenj eenjVar) {
        if (((Boolean) djao.p().a.q.a()).booleanValue()) {
            String uuid = UUID.randomUUID().toString();
            eelm eelmVar = new eelm();
            eelmVar.a = new eeln(uuid);
            eenjVar.q(eelmVar);
        }
    }
}
