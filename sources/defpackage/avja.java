package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avja {
    public static final cskc a = cskc.g("Bugle", "ChatbotDirectoryHelper");
    public static final cfva b = cfvl.i(cfvl.b, "enable_chatbot_directory", false);
    public static final cfva c = cfvl.e(cfvl.b, "chatbot_directory_toolbar_color", 0);
    private final aviv d;
    private final errl e;
    private final avjf f;
    private final ffbr g;
    private final ctvb h;

    static {
        cfvl.e(cfvl.b, "chatbot_directory_new_pill_show_duration_hours", 240);
    }

    public avja(aviv avivVar, errl errlVar, avjf avjfVar, ffbr ffbrVar, ctvb ctvbVar) {
        this.d = avivVar;
        this.e = errlVar;
        this.f = avjfVar;
        this.g = ffbrVar;
        this.h = ctvbVar;
    }

    public final elfl a() {
        csjb c2 = a.c();
        cfva cfvaVar = b;
        c2.A("enable_chatbot_directory", cfvaVar.e());
        c2.A("availability_state", ((ckgv) this.g.b()).a());
        c2.r();
        return (((Boolean) cfvaVar.e()).booleanValue() && ((ckgv) this.g.b()).a() == eqwf.AVAILABLE) ? this.d.a().h(new emwl() { // from class: aviy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                cskc cskcVar = avja.a;
                if (optional.isEmpty()) {
                    return false;
                }
                csjb c3 = avja.a.c();
                c3.A("chatbot_directory_url", optional.get());
                c3.r();
                return true;
            }
        }, this.e) : elfo.e(false);
    }

    public final void b(Context context, String str) {
        emxf.m(!str.isEmpty(), "Chatbot directory URL is not set.");
        final Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        this.h.h().ifPresent(new Consumer() { // from class: aviz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                cskc cskcVar = avja.a;
                buildUpon.appendQueryParameter("ho", (String) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        buildUpon.appendQueryParameter("client_vendor", "Goog");
        afg afgVar = new afg();
        afgVar.e();
        afgVar.d(2);
        cfva cfvaVar = c;
        if (((Integer) cfvaVar.e()).intValue() != 0) {
            afe afeVar = new afe();
            afeVar.b(((Integer) cfvaVar.e()).intValue());
            afgVar.c(afeVar.a());
        }
        try {
            afgVar.a().a(context, buildUpon.build());
        } catch (ActivityNotFoundException e) {
            a.s("Couldn't find activity to launch custom tabs", e);
            this.f.d.c("Bugle.Rbm.ChatbotDirectory.OpenDirectoryFailure");
        }
        this.d.a.j(new emwl() { // from class: avir
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                aviw aviwVar;
                avip avipVar = (avip) obj;
                if ((avipVar.b & 1) != 0) {
                    avix avixVar = avipVar.c;
                    if (avixVar == null) {
                        avixVar = avix.a;
                    }
                    aviwVar = (aviw) avixVar.toBuilder();
                    aviwVar.copyOnWrite();
                    ((avix) aviwVar.instance).d = true;
                } else {
                    aviwVar = (aviw) avix.a.createBuilder();
                    aviwVar.copyOnWrite();
                    ((avix) aviwVar.instance).d = true;
                }
                avio avioVar = (avio) avipVar.toBuilder();
                avioVar.copyOnWrite();
                avip avipVar2 = (avip) avioVar.instance;
                avix avixVar2 = (avix) aviwVar.build();
                avixVar2.getClass();
                avipVar2.c = avixVar2;
                avipVar2.b |= 1;
                return (avip) avioVar.build();
            }
        }).h(new emwl() { // from class: avis
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a).k(axnw.b(), erpp.a);
    }
}
