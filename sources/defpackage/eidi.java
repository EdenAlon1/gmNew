package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eidi extends eids {
    private String a;
    private String b;
    private String c;

    @Override // defpackage.eids
    public final eidt a() {
        String str;
        String str2;
        String str3 = this.a;
        if (str3 != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new eidj(str3, str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" namespace");
        }
        if (this.b == null) {
            sb.append(" name");
        }
        if (this.c == null) {
            sb.append(" value");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eids
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.b = str;
    }

    @Override // defpackage.eids
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null namespace");
        }
        this.a = str;
    }

    @Override // defpackage.eids
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null value");
        }
        this.c = str;
    }
}
