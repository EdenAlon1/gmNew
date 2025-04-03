package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzz extends dzaw {
    public dzay a;
    private String b;

    @Override // defpackage.dzaw
    public final dzaz a() {
        dzay dzayVar;
        String str = this.b;
        if (str != null && (dzayVar = this.a) != null) {
            return new dzaa(str, dzayVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" pushId");
        }
        if (this.a == null) {
            sb.append(" oneOfType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzaw
    public final void b(dzay dzayVar) {
        this.a = dzayVar;
    }

    @Override // defpackage.dzaw
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null pushId");
        }
        this.b = str;
    }
}
