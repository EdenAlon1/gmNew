package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npq {
    public final engw a;
    public final lse b;
    public final nqo c;
    public final int d;
    public final boolean e;

    public npq(List list, lse lseVar, nqo nqoVar, int i, boolean z) {
        lti.b(true, "Audio transmuxing and audio track forcing are not allowed together.");
        this.a = engw.n(list);
        this.b = lseVar;
        this.c = nqoVar;
        this.d = i;
        this.e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean a() {
        for (int i = 0; i < this.a.size(); i++) {
            if (((nqn) this.a.get(i)).a()) {
                return true;
            }
        }
        return false;
    }
}
