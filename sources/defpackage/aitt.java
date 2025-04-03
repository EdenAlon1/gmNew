package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aitt implements aefa, ejlr {
    private static final cskc c = cskc.g("BugleSuperSort", "PositiveButtonOnClickListener");
    public final ffbr a;
    public final ffbr b;
    private final ffbr d;
    private final ffbr e;
    private View f;

    public aitt(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.a = ffbrVar3;
        this.b = ffbrVar4;
    }

    @Override // defpackage.aefa
    public final void a(final ejlq ejlqVar, View view) {
        this.f = view;
        Context context = view.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.otp_deletion_dialog_view, (ViewGroup) null, false);
        ((TextView) inflate.findViewById(R.id.otp_deletion_dialog_body)).setText(R.string.otp_auto_deletion_opt_in_dialog_body_text);
        ehft ehftVar = new ehft(context);
        ehftVar.x(R.string.otp_auto_deletion_opt_in_dialog_title_text);
        ehftVar.t(R.string.otp_auto_deletion_opt_in_dialog_positive_button_text, new elbb((elbx) this.d.b(), "OTPAutoDeleteBanner#dialog#positiveListener", new DialogInterface.OnClickListener() { // from class: aits
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                aitt aittVar = aitt.this;
                ejlqVar.g(ejlp.b(((aisv) aittVar.a.b()).a(true)), aittVar);
                ((aiuv) aittVar.b.b()).b(new Supplier() { // from class: aius
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        eqjf eqjfVar = (eqjf) eqjr.a.createBuilder();
                        eqjj eqjjVar = (eqjj) eqjk.a.createBuilder();
                        eqjh eqjhVar = (eqjh) eqji.a.createBuilder();
                        eqjhVar.copyOnWrite();
                        eqji eqjiVar = (eqji) eqjhVar.instance;
                        eqjiVar.c = 1;
                        eqjiVar.b |= 1;
                        eqjjVar.copyOnWrite();
                        eqjk eqjkVar = (eqjk) eqjjVar.instance;
                        eqji eqjiVar2 = (eqji) eqjhVar.build();
                        eqjiVar2.getClass();
                        eqjkVar.c = eqjiVar2;
                        eqjkVar.b |= 1;
                        eqjk eqjkVar2 = (eqjk) eqjjVar.build();
                        eqjfVar.copyOnWrite();
                        eqjr eqjrVar = (eqjr) eqjfVar.instance;
                        eqjkVar2.getClass();
                        eqjrVar.c = eqjkVar2;
                        eqjrVar.b = 2;
                        return (eqjr) eqjfVar.build();
                    }
                });
            }
        }));
        ehftVar.o(R.string.otp_auto_deletion_opt_in_dialog_negative_button_text, null);
        ehftVar.z(inflate);
        ehftVar.a();
        ((aiuv) this.b.b()).c(2);
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        c.q("Opt-in OTP auto deletion successfully.");
        ((ejvp) this.e.b()).a(elfo.e(null), aefc.a);
        View view = this.f;
        view.getClass();
        ellj.g(new cvms(view.getResources().getString(R.string.otp_auto_deletion_opt_in_snackbar_message), "", new Runnable() { // from class: aitr
            @Override // java.lang.Runnable
            public final void run() {
            }
        }), view);
        this.f = null;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        c.s("Failed to opt-in otp auto deletion", th);
        this.f = null;
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
