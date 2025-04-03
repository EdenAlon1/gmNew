package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxcq extends duak {
    public bxcq() {
        super("reminders");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bxcp b() {
        ah();
        return new bxcp(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(byzf byzfVar) {
        if (byzfVar == null) {
            this.a.putNull("status");
        } else {
            this.a.put("status", Integer.valueOf(byzfVar.ordinal()));
        }
    }

    public final void d(bxcs bxcsVar) {
        af(new bxcr(bxcsVar));
    }
}
