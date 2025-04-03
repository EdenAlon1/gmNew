package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fhpl implements fhpn {
    private final String a;
    private final String b;
    private final String c;

    public fhpl(String str) {
        String str2;
        if (str == null) {
            throw new IllegalArgumentException("MIME type may not be null");
        }
        this.a = str;
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            this.b = str.substring(0, indexOf);
            str2 = str.substring(indexOf + 1);
        } else {
            this.b = str;
            str2 = null;
        }
        this.c = str2;
    }

    @Override // defpackage.fhpo
    public String b() {
        return this.b;
    }

    @Override // defpackage.fhpo
    public String c() {
        return this.a;
    }

    @Override // defpackage.fhpo
    public String d() {
        return this.c;
    }
}
