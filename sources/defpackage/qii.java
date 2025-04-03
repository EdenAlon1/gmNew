package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qii implements qih {
    public final List a;

    public qii(List list) {
        this.a = list;
    }

    @Override // defpackage.qih
    public final List b() {
        return this.a;
    }

    @Override // defpackage.qih
    public final boolean c() {
        if (this.a.isEmpty()) {
            return true;
        }
        return this.a.size() == 1 && ((qlx) this.a.get(0)).e();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }
}
