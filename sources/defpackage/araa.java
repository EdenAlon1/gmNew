package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class araa implements araf {
    private final azaj a;
    private final azaj b;

    public araa(azaj azajVar, azaj azajVar2) {
        azajVar.getClass();
        azajVar2.getClass();
        this.a = azajVar;
        this.b = azajVar2;
    }

    private static final boolean k(azaj azajVar, String str, boolean z) {
        String a = azajVar.a(str);
        return a != null ? Boolean.parseBoolean(a) : z;
    }

    private static final int l(azaj azajVar, String str, int i) {
        String a = azajVar.a(str);
        return a != null ? Integer.parseInt(a) : i;
    }

    @Override // defpackage.araf
    public final int a() {
        return l(this.b, "EMAIL_SMS_TO_MMS_THRESHOLD", -1);
    }

    @Override // defpackage.araf
    public final int b() {
        return l(this.b, "MAX_MESSAGE_SIZE", 307200);
    }

    @Override // defpackage.araf
    public final int c() {
        return l(this.b, "MAX_SUBJECT_LENGTH", 40);
    }

    @Override // defpackage.araf
    public final int d() {
        return l(this.b, "MAX_TEXT_LENGTH", -1);
    }

    @Override // defpackage.araf
    public final int e() {
        return l(this.a, "SMS_MAX_TEXT_PARTS", -1);
    }

    @Override // defpackage.araf
    public final int f() {
        return l(this.a, "SMS_TO_MMS_TEXT_LENGTH_THRESHOLD", -1);
    }

    @Override // defpackage.araf
    public final String g() {
        String a = this.b.a("EMAIL_GATEWAY");
        return a == null ? "" : a;
    }

    @Override // defpackage.araf
    public final boolean h() {
        return k(this.b, "GROUP_MMS_ENABLED", true);
    }

    @Override // defpackage.araf
    public final boolean i() {
        return k(this.b, "MMS_ENABLED", true);
    }

    @Override // defpackage.araf
    public final boolean j() {
        return k(this.a, "SIMPLE_CHARACTERS_ONLY", false);
    }
}
