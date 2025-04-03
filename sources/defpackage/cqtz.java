package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqtz extends cqul {
    private String a;

    @Override // defpackage.cqul
    public final cqum a() {
        String str = this.a;
        if (str != null) {
            return new cqua(str);
        }
        throw new IllegalStateException("Missing required properties: downloadId");
    }

    @Override // defpackage.cqul
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null downloadId");
        }
        this.a = str;
    }
}
