package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahgh extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new ahgd(this);
    }

    public final void b(Function... functionArr) {
        Object apply;
        ahgh[] ahghVarArr = new ahgh[functionArr.length];
        for (int i = 0; i < functionArr.length; i++) {
            Function function = functionArr[i];
            String[] strArr = ahgi.a;
            apply = function.apply(new ahgh());
            ahghVarArr[i] = (ahgh) apply;
        }
        ar(ahghVarArr);
    }

    public final void c(long j) {
        aq(new dtwe("conversations._id", 7, Long.valueOf(j)));
    }

    public final void d(long j) {
        aq(new dtwe("conversations._id", 8, Long.valueOf(j)));
    }

    public final void e() {
        aq(new dtrx("conversations.participant_normalized_destination", 5));
    }

    public final void f(long j) {
        aq(new dtwe("conversations.sort_timestamp", 1, Long.valueOf(j)));
    }

    public final void g(long j) {
        aq(new dtwe("conversations.sort_timestamp", 7, Long.valueOf(j)));
    }

    public final void h(long j) {
        aq(new dtwe("conversations.sort_timestamp", 8, Long.valueOf(j)));
    }
}
