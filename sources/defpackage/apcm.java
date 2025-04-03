package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apcm implements bcyx {
    private final String a;
    private final String b;
    private final boolean c;

    public apcm(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // defpackage.bcyx
    public final String a() {
        return this.b;
    }

    @Override // defpackage.bcyx
    public final String b() {
        return this.a;
    }

    @Override // defpackage.bcyx
    public final boolean c() {
        return this.c;
    }

    public final String toString() {
        return "id: " + this.a + ", displayName: " + this.b + ", isPenpalBot: " + this.c;
    }
}
