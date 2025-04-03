package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgq extends hik {
    private final hke a;

    public hgq(hke hkeVar, ffix ffixVar) {
        super(ffixVar);
        this.a = hkeVar;
    }

    @Override // defpackage.hik
    public final hil c(Object obj) {
        return new hil(this, obj, obj == null, this.a, true);
    }
}
