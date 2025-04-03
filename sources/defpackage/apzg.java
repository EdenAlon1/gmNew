package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apzg implements apyb {
    private final dqzc a;
    private final String b;
    private final String c;

    public apzg(dqzc dqzcVar) {
        this.a = dqzcVar;
        this.b = dqzcVar.a;
        this.c = dqzcVar.b;
    }

    @Override // defpackage.apyb
    public final String a() {
        return this.b;
    }

    @Override // defpackage.apyb
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        apzg apzgVar = obj instanceof apzg ? (apzg) obj : null;
        return ffkj.e(apzgVar != null ? apzgVar.a.a : null, this.a.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DefaultEmotifyReaction(customSticker=" + this.a + ")";
    }
}
