package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edkx extends edml {
    public String a;
    public String b;
    public String c;

    @Override // defpackage.edml
    public final edmm a() {
        String str = this.a;
        if (str != null) {
            return new edmv(str, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: name");
    }
}
