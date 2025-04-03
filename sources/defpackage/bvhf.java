package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvhf extends duak {
    public bvhf() {
        super("p2p_suggestions");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bvhe b() {
        ah();
        return new bvhe(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bvhn.a;
        apply = function.apply(new bvhm());
        af(new bvhg((bvhm) apply));
    }
}
