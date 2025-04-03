package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dicv extends dfux implements dhzk {
    private final int c;

    public dicv(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.c = i2;
    }

    @Override // defpackage.dhzk
    public final int a() {
        return gM("event_type");
    }

    @Override // defpackage.dhzk
    public final dhzm b() {
        return new didb(this.a, this.b, this.c);
    }

    @Override // defpackage.dfvc
    public final /* synthetic */ Object d() {
        return new dicu(this);
    }

    public final String toString() {
        return "DataEventRef{ type=" + (a() == 1 ? "changed" : a() == 2 ? "deleted" : "unknown") + ", dataitem=" + b().toString() + " }";
    }
}
