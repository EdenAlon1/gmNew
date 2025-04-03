package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apzh implements apyb {
    private final String a;
    private final String b;

    public apzh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.apyb
    public final String a() {
        return this.a;
    }

    @Override // defpackage.apyb
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        apzh apzhVar = obj instanceof apzh ? (apzh) obj : null;
        return ffkj.e(apzhVar != null ? apzhVar.a : null, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DefaultEmotifyReactionV2(id=" + this.a + ", uri=" + this.b + ")";
    }
}
