package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kfv {
    public final kho a;

    public kfv() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kfv) {
            return ffkj.e(this.a, ((kfv) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public kfv(byte[] bArr) {
        new ArrayList();
        this.a = new kho(new char[0]);
    }
}
