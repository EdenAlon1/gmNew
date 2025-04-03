package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbtm extends dtyx {
    public bbtm(String[] strArr) {
        super("message_reactions_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bbtl b() {
        l();
        return new bbtl(this.a.a());
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bbtp.a;
        apply = function.apply(new bbto());
        k(new bbtn((bbto) apply));
    }
}
