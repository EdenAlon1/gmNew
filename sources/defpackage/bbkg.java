package defpackage;

import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbkg implements dtqq {
    public static final Map a = ffew.h(new ffcf(c("_id"), d("_id")), new ffcf(c("conversation_id"), d("conversation_id")), new ffcf(c("participant_id"), d("participant_id")), new ffcf(c("is_normalized"), d("is_normalized")), new ffcf(c("rcs_group_join_status"), d("rcs_group_join_status")));

    private static final bbjl c(String str) {
        dtry[] a2 = bbjz.a();
        for (int i = 0; i < 6; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (bbjl) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final brvz d(String str) {
        dtry[] a2 = brwn.a();
        for (int i = 0; i < 6; i++) {
            dtry dtryVar = a2[i];
            String d = dtryVar.d();
            if (ffkj.e(d != null ? ffpc.D(d, '.', d) : null, str)) {
                dtryVar.getClass();
                return (brvz) dtryVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dtqq
    public final void a() {
        throw null;
    }

    @Override // defpackage.dtqq
    public final void b() {
        throw null;
    }
}
