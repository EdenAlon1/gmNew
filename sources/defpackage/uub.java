package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uub implements ejxk {
    final /* synthetic */ uuy a;

    public uub(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        csjy.p("Bugle", th, "Error loading data for file progress callback..");
    }

    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        enqu listIterator = ((enhk) obj).entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            if (!((cqpu) entry.getValue()).equals(this.a.aS.get(entry.getKey()))) {
                this.a.aS.put((MessageIdType) entry.getKey(), (cqpu) entry.getValue());
                uuy uuyVar = this.a;
                MessageIdType messageIdType = (MessageIdType) entry.getKey();
                Instant instant = Instant.MIN;
                if (uuyVar.aT.containsKey(messageIdType)) {
                    instant = (Instant) uuyVar.aT.get(messageIdType);
                }
                if (Duration.between(instant, uuyVar.s.f()).compareTo(uuy.c) <= 0) {
                    csjy.d("Bugle", "Throttling file progress update for messageId: %s. Not updating view.", messageIdType);
                } else {
                    uuyVar.aT.put(messageIdType, uuyVar.s.f());
                    ura uraVar = uuyVar.aB.c;
                    int F = uraVar.F(messageIdType);
                    if (F == -1) {
                        csjy.o("Bugle", "Trying to update file transfer progress for messageId %s with fragment not in view.", messageIdType);
                    } else {
                        uraVar.r(F, entry.getValue());
                    }
                }
            }
        }
    }
}
