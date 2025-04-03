package defpackage;

import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coin extends dtyx<coia, coil, coin, ScheduledSendTable.BindData, cohz> {
    public coin(String[] strArr) {
        super("scheduled_send", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final coil b() {
        l();
        return new coil(this.a.a());
    }

    public final void c(cohz... cohzVarArr) {
        int intValue = ScheduledSendTable.d().intValue();
        if (((Integer) ScheduledSendTable.b.getOrDefault(cohzVarArr[0].toString(), -1)).intValue() > intValue) {
            dtub.w("columnReference.toString()", intValue);
        }
        m(cohzVarArr);
    }

    public final void d(coit coitVar) {
        k(new cois(coitVar));
    }

    public final void e(Function function) {
        Object apply;
        String[] strArr = ScheduledSendTable.a;
        apply = function.apply(new coit());
        k(new cois((coit) apply));
    }
}
