package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebpg extends ebpd {
    public eave a;
    public ebtd b;
    public eawd c;
    public View.OnClickListener d;

    @Override // defpackage.ebpd
    public final eawd a() {
        return this.c;
    }

    @Override // defpackage.ebpd
    public final ebpe b() {
        View.OnClickListener onClickListener;
        eave eaveVar = this.a;
        if (eaveVar != null && (onClickListener = this.d) != null) {
            return new ebph(eaveVar, this.b, this.c, onClickListener);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" accountConverter");
        }
        if (this.d == null) {
            sb.append(" onAddAccount");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ebpd
    public final ebtd d() {
        return this.b;
    }
}
