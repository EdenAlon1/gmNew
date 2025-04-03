package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngm implements lra {
    public final List a;

    public ngm(List list) {
        this.a = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j = ((ngl) list.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (((ngl) list.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((ngl) list.get(i)).b;
                    i++;
                }
            }
        }
        lti.a(!z);
    }

    @Override // defpackage.lra
    public final /* synthetic */ lqc a() {
        return null;
    }

    @Override // defpackage.lra
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ngm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.a.toString());
    }

    @Override // defpackage.lra
    public final /* synthetic */ void b(lqy lqyVar) {
    }
}
