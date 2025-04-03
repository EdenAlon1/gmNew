package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebcp extends ebej {
    public ebff a;
    public ebee b;
    public emxc c = emux.a;
    public ebeh d;

    @Override // defpackage.ebej
    public final ebek a() {
        ebee ebeeVar;
        ebeh ebehVar;
        ebff ebffVar = this.a;
        if (ebffVar != null && (ebeeVar = this.b) != null && (ebehVar = this.d) != null) {
            return new ebcq(ebffVar, ebeeVar, this.c, ebehVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" cardIcon");
        }
        if (this.b == null) {
            sb.append(" titleData");
        }
        if (this.d == null) {
            sb.append(" visualElementsInfo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
