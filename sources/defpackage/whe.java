package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class whe implements wha {
    public final elbx a;
    public final aigz b;
    private final Context c;
    private final ffbr d;
    private final ajjc e;
    private final ffbr f;

    public whe(Context context, ffbr ffbrVar, ajjc ajjcVar, elbx elbxVar, aigz aigzVar, ffbr ffbrVar2) {
        context.getClass();
        ajjcVar.getClass();
        elbxVar.getClass();
        aigzVar.getClass();
        ffbrVar2.getClass();
        this.c = context;
        this.d = ffbrVar;
        this.e = ajjcVar;
        this.a = elbxVar;
        this.b = aigzVar;
        this.f = ffbrVar2;
    }

    @Override // defpackage.wha
    public final void a() {
        ((adtc) this.d.b()).i(this.c, false);
    }

    @Override // defpackage.wha
    public final void b() {
        Context context = this.c;
        ffbr ffbrVar = this.f;
        String string = context.getString(R.string.info_dialog_title);
        String string2 = this.c.getString(((wlu) ffbrVar.b()).a());
        string2.getClass();
        String string3 = this.c.getString(R.string.info_dialog_got_it);
        string3.getClass();
        doas doasVar = new doas(string3, new ffix() { // from class: whc
            @Override // defpackage.ffix
            public final Object invoke() {
                ffig.a(whe.this.a.b("MagicComposeFeedbackAndInfoHelperImplV2: Show Magic Compose Info"), null);
                return ffcu.a;
            }
        });
        String string4 = this.c.getString(R.string.info_dialog_learn_more);
        string4.getClass();
        this.e.c(new dmvk(string, string2, ffel.a, doasVar, new doas(string4, new ffix() { // from class: whd
            @Override // defpackage.ffix
            public final Object invoke() {
                Uri parse = Uri.parse("https://support.google.com/messages?p=magic_compose");
                parse.getClass();
                whe.this.b.h(new aile(parse));
                return ffcu.a;
            }
        }), new ffix() { // from class: dmvj
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }), true);
    }
}
