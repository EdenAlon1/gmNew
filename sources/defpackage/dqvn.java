package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dqvn implements ffke {
    final /* synthetic */ dqvo a;

    public dqvn(dqvo dqvoVar) {
        this.a = dqvoVar;
    }

    public final void a(String str, boolean z) {
        dqvo dqvoVar = this.a;
        ffqy.d(dqvoVar.bF(), null, null, new dqvm(dqvoVar, str, z, null), 3);
    }

    @Override // defpackage.ffke
    public final ffbv b() {
        return new ffkh(2, this.a, dqvo.class, "onEmojiSelected", "onEmojiSelected(Ljava/lang/String;Z)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dqvn) && (obj instanceof ffke)) {
            return ffkj.e(b(), ((ffke) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
