package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhzl extends dfvb implements dfrl {
    private final Status b;

    public dhzl(DataHolder dataHolder) {
        super(dataHolder);
        this.b = new Status(dataHolder.f);
    }

    @Override // defpackage.dfrl
    public final Status a() {
        return this.b;
    }

    @Override // defpackage.dfvb
    protected final /* bridge */ /* synthetic */ Object f(int i, int i2) {
        return new dicv(this.a, i, i2);
    }

    @Override // defpackage.dfvb
    protected final String g() {
        return "path";
    }
}
