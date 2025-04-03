package defpackage;

import com.google.android.gms.wearable.Channel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dibo implements dhyy {
    private final dhyz a;

    public dibo(dhyz dhyzVar) {
        this.a = dhyzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((dibo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dhyy
    public final void m(Channel channel) {
        dibp.b(channel);
        ((diai) this.a).a.i(channel);
    }

    @Override // defpackage.dhyy
    public final void n(Channel channel) {
        dibp.b(channel);
    }

    @Override // defpackage.dhyy
    public final void o(Channel channel) {
        dibp.b(channel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dhyy
    public final void p(Channel channel) {
        dibp.b(channel);
        ((diai) this.a).a.l(channel);
    }
}
