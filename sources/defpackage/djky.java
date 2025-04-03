package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djky implements ffbr<djkx> {
    public djkx a;

    @Override // defpackage.ffbr, defpackage.ffbq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final djkx b() {
        djkx djkxVar = this.a;
        if (djkxVar != null) {
            return djkxVar;
        }
        throw new IllegalStateException("Registration context not initialized!");
    }

    public final void c() {
        this.a = null;
    }
}
