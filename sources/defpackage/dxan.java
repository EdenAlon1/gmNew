package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxan extends dxav {
    public emxc a = emux.a;
    private String b;

    @Override // defpackage.dxav
    public final dxaw a() {
        String str = this.b;
        if (str != null) {
            return new dxao(str, this.a);
        }
        throw new IllegalStateException("Missing required properties: url");
    }

    @Override // defpackage.dxav
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.b = str;
    }
}
