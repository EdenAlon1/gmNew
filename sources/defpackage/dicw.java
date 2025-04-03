package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dicw implements dhzn {
    private final String a;
    private final String b;

    public dicw(dhzn dhznVar) {
        this.a = dhznVar.b();
        this.b = dhznVar.a();
    }

    @Override // defpackage.dhzn
    public final String a() {
        return this.b;
    }

    @Override // defpackage.dhzn
    public final String b() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataItemAssetEntity[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.a == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(this.a);
        }
        sb.append(", key=");
        sb.append(this.b);
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.dfvc
    public final /* bridge */ /* synthetic */ Object d() {
        return this;
    }
}
