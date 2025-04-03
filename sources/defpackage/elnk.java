package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elnk extends elnm {
    public final List a;

    public elnk(List list) {
        if (list == null) {
            throw new NullPointerException("Null actions");
        }
        this.a = list;
    }

    @Override // defpackage.elnm
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elnm) {
            elnm elnmVar = (elnm) obj;
            if (this.a.equals(elnmVar.a())) {
                elnmVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "DescribeActionsResponse{actions=" + this.a.toString() + ", loading=false}";
    }

    @Override // defpackage.elnm
    public final void b() {
    }
}
