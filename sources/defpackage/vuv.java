package defpackage;

import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vuv implements wgx {
    final /* synthetic */ vvn a;

    public vuv(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.wgx
    public final String a() {
        return (String) this.a.I(new Function() { // from class: vut
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((uav) obj).d().c();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: vuu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bcvr) ((ComposeMessageView) obj).H().s().a()).c();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.wgx
    public final void b() {
        this.a.S(new Consumer() { // from class: vuq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((uav) obj).f(vuv.this.a.cC.ag());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: vur
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((ComposeMessageView) obj).H().F();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.a.T(new Consumer() { // from class: vus
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ugg uggVar = (ugg) obj;
                if (vuv.this.a.ch) {
                    uggVar.r(ugo.IME, false, false);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, null);
    }

    @Override // defpackage.wgx
    public final void c(String str) {
        this.a.aM(str);
    }
}
