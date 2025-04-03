package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duga extends dugc {
    private String a;
    private emxc b = emux.a;

    @Override // defpackage.dugc
    public final dugd a() {
        String str = this.a;
        if (str != null) {
            return new dugb(str, this.b);
        }
        throw new IllegalStateException("Missing required properties: key");
    }

    @Override // defpackage.dugc
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.a = str;
    }

    @Override // defpackage.dugc
    public final void c(Long l) {
        this.b = emxc.j(l);
    }
}
