package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzoe extends dzrk {
    private String a;

    @Override // defpackage.dzrk
    public final dzrl a() {
        String str = this.a;
        if (str != null) {
            return new dzof(str);
        }
        throw new IllegalStateException("Missing required properties: url");
    }

    @Override // defpackage.dzrk
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.a = str;
    }
}
