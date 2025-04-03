package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxte extends duak {
    public bxte() {
        super("self_participants");
    }

    public final int a(int i) {
        String[] strArr = bxth.a;
        bxtg bxtgVar = new bxtg();
        bxtgVar.b(i);
        return ae(new bxtf(bxtgVar), "self_participants-buildAndUpdateForSubId");
    }

    @Override // defpackage.duak
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final bxtd b() {
        ah();
        return new bxtd(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void d(int i) {
        this.a.put("sim_slot_index", Integer.valueOf(i));
    }

    public final void e(int i) {
        this.a.put("sub_id", Integer.valueOf(i));
    }

    public final void f(int i) {
        this.a.put("subscription_color", Integer.valueOf(i));
    }

    public final void g(bxtg bxtgVar) {
        af(new bxtf(bxtgVar));
    }
}
