package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxz extends dkxu {
    public List a;

    public final List a() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dkxz)) {
            return false;
        }
        dkxz dkxzVar = (dkxz) obj;
        if (this.a.size() != dkxzVar.a().size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (!((dkxy) this.a.get(i)).equals(dkxzVar.a.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
