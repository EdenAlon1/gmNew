package defpackage;

import android.os.StrictMode$OnThreadViolationListener;
import android.os.strictmode.Violation;
import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cawg implements StrictMode$OnThreadViolationListener {
    final /* synthetic */ cawh a;

    public cawg(cawh cawhVar) {
        this.a = cawhVar;
    }

    public final void onThreadViolation(Violation violation) {
        String str;
        boolean z;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace != null) {
            loop0: for (StackTraceElement stackTraceElement : stackTrace) {
                String stackTraceElement2 = stackTraceElement.toString();
                enin eninVar = new enin();
                eninVar.i(cawf.a);
                enqu listIterator = eninVar.g().listIterator();
                while (listIterator.hasNext()) {
                    str = (String) listIterator.next();
                    if (stackTraceElement2.contains(str)) {
                        z = true;
                        break loop0;
                    }
                }
            }
        }
        str = "";
        z = false;
        if (z) {
            ensk j = cawh.a.j();
            j.Y(ente.a, "strictmode_in_txn");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker", "strictmodeViolationCallback", 91, "Post29PolicyMaker.java")).t("exempted by %s", str);
            return;
        }
        ensk j2 = cawh.a.j();
        j2.Y(ente.a, "strictmode_in_txn");
        ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker", "strictmodeViolationCallback", 78, "Post29PolicyMaker.java")).t("violation %s", violation == null ? null : violation.getMessage());
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement3 : stackTrace) {
                ensk j3 = cawh.a.j();
                j3.Y(ente.a, "strictmode_in_txn");
                ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker", "strictmodeViolationCallback", 81, "Post29PolicyMaker.java")).t("   %s", stackTraceElement3);
            }
        }
        cazf cazfVar = (cazf) ((Stack) this.a.b.get()).peek();
        StackTraceElement[] stackTraceElementArr = cazfVar != null ? cazfVar.b : new StackTraceElement[0];
        if (stackTraceElementArr.length > 0) {
            ensk j4 = cawh.a.j();
            j4.Y(ente.a, "strictmode_in_txn");
            ((enrr) ((enrr) j4).h("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker", "logCurrentOutermostTransactionStackOnThisThread", 106, "Post29PolicyMaker.java")).q("transaction was acquired here: ");
            for (StackTraceElement stackTraceElement4 : stackTraceElementArr) {
                ensk j5 = cawh.a.j();
                j5.Y(ente.a, "strictmode_in_txn");
                ((enrr) ((enrr) j5).h("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker", "logCurrentOutermostTransactionStackOnThisThread", 108, "Post29PolicyMaker.java")).t("   %s", stackTraceElement4);
            }
        } else {
            ensk j6 = cawh.a.j();
            j6.Y(ente.a, "strictmode_in_txn");
            ((enrr) ((enrr) j6).h("com/google/android/apps/messaging/shared/datamodel/layer/Post29PolicyMaker", "logCurrentOutermostTransactionStackOnThisThread", 111, "Post29PolicyMaker.java")).q("unknown where transaction was acquired.  Running logging outside of transaction?");
        }
        axnw.d(new AssertionError("StrictMode violation while in a transaction: ".concat(String.valueOf(violation != null ? violation.getClass().getSimpleName() : null))));
    }
}
