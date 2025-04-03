package defpackage;

import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqmo {
    public static final EditText a(dqmn dqmnVar) {
        if (dqmnVar instanceof dsit) {
            dqnn n = ((dsit) dqmnVar).n();
            if (n == null) {
                return null;
            }
            return a(n);
        }
        if (dqmnVar instanceof dqmw) {
            return ((dqmw) dqmnVar).b;
        }
        if (dqmnVar instanceof dqmq) {
            return ((dqmq) dqmnVar).a;
        }
        return null;
    }
}
