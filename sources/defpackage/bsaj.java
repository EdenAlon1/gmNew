package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsaj extends duak {
    public bsaj() {
        super("conversation_suggestions");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsai b() {
        ah();
        return new bsai(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c() {
        int intValue = bsam.c().intValue();
        int intValue2 = bsam.c().intValue();
        if (intValue2 < 12000) {
            dtub.w("read", intValue2);
        }
        if (intValue >= 12000) {
            this.a.put("read", (Boolean) true);
        }
    }
}
