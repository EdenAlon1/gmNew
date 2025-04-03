package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyh extends ehzw {
    public String a;
    public String b;
    public enhk c;

    @Override // defpackage.ehzw
    public final void a(String str) {
        if (str == null) {
            throw new NullPointerException("Null subType");
        }
        this.b = str;
    }

    @Override // defpackage.ehzw
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.a = str;
    }
}
