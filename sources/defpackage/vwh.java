package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.material.snackbar.Snackbar;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vwh implements ellh {
    final /* synthetic */ vvn a;

    public vwh(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        Function function = new Function() { // from class: vmc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = vvn.a;
                return Boolean.valueOf(((uav) obj).d().Z());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        Function function2 = new Function() { // from class: vmd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function3) {
                return Function$CC.$default$andThen(this, function3);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                enru enruVar = vvn.a;
                return Boolean.valueOf(((bcvr) ((ComposeMessageView) obj).H().s().a()).Z());
            }

            public final /* synthetic */ Function compose(Function function3) {
                return Function$CC.$default$compose(this, function3);
            }
        };
        vvn vvnVar = this.a;
        if (((Boolean) vvnVar.I(function, function2)).booleanValue()) {
            Snackbar q = Snackbar.q(vvnVar.u(), R.string.error_text_scheduled_send_with_draft_reply, 0);
            q.w(android.R.string.ok, new View.OnClickListener() { // from class: vme
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    enru enruVar = vvn.a;
                }
            });
            q.i();
        } else {
            vvnVar.aG();
        }
        return elli.a;
    }
}
