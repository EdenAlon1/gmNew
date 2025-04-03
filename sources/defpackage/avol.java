package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avol extends avon {
    private String a;
    private String b;

    @Override // defpackage.avon
    public final avoo a() {
        String str;
        String str2 = this.a;
        if (str2 != null && (str = this.b) != null) {
            return new avom(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" serviceId");
        }
        if (this.b == null) {
            sb.append(" version");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.avon
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null serviceId");
        }
        this.a = str;
    }

    @Override // defpackage.avon
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str;
    }
}
